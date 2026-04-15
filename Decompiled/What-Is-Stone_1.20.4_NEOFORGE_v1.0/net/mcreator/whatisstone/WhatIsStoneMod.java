package net.mcreator.whatisstone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.mcreator.whatisstone.init.WhatIsStoneModBlocks;
import net.mcreator.whatisstone.init.WhatIsStoneModFeatures;
import net.mcreator.whatisstone.init.WhatIsStoneModItems;
import net.mcreator.whatisstone.init.WhatIsStoneModTabs;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Tuple;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.neoforge.event.TickEvent.Phase;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlerEvent;
import net.neoforged.neoforge.network.handling.IPlayPayloadHandler;
import net.neoforged.neoforge.network.registration.IPayloadRegistrar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("what_is_stone")
public class WhatIsStoneMod {
   public static final Logger LOGGER = LogManager.getLogger(WhatIsStoneMod.class);
   public static final String MODID = "what_is_stone";
   private static boolean networkingRegistered = false;
   private static final Map<ResourceLocation, NetworkMessage<?>> MESSAGES = new HashMap();
   private static final Collection<Tuple<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue();

   public WhatIsStoneMod(IEventBus modEventBus) {
      NeoForge.EVENT_BUS.register(this);
      modEventBus.addListener(this::registerNetworking);
      WhatIsStoneModBlocks.REGISTRY.register(modEventBus);
      WhatIsStoneModItems.register(modEventBus);
      WhatIsStoneModTabs.REGISTRY.register(modEventBus);
      WhatIsStoneModFeatures.REGISTRY.register(modEventBus);
   }

   public static <T extends CustomPacketPayload> void addNetworkMessage(ResourceLocation id, FriendlyByteBuf.Reader<T> reader, IPlayPayloadHandler<T> handler) {
      if (networkingRegistered) {
         throw new IllegalStateException("Cannot register new network messages after networking has been registered");
      } else {
         MESSAGES.put(id, new NetworkMessage(reader, handler));
      }
   }

   private void registerNetworking(RegisterPayloadHandlerEvent event) {
      IPayloadRegistrar registrar = event.registrar("what_is_stone");
      MESSAGES.forEach((id, networkMessage) -> {
         registrar.play(id, networkMessage.reader(), networkMessage.handler());
      });
      networkingRegistered = true;
   }

   public static void queueServerWork(int tick, Runnable action) {
      if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER) {
         workQueue.add(new Tuple(action, tick));
      }

   }

   @SubscribeEvent
   public void tick(TickEvent.ServerTickEvent event) {
      if (event.phase == Phase.END) {
         List<Tuple<Runnable, Integer>> actions = new ArrayList();
         workQueue.forEach((work) -> {
            work.setB((Integer)work.getB() - 1);
            if ((Integer)work.getB() == 0) {
               actions.add(work);
            }

         });
         actions.forEach((e) -> {
            ((Runnable)e.getA()).run();
         });
         workQueue.removeAll(actions);
      }

   }

   private static record NetworkMessage<T extends CustomPacketPayload>(FriendlyByteBuf.Reader<T> reader, IPlayPayloadHandler<T> handler) {
      private NetworkMessage(FriendlyByteBuf.Reader<T> reader, IPlayPayloadHandler<T> handler) {
         this.reader = reader;
         this.handler = handler;
      }

      public FriendlyByteBuf.Reader<T> reader() {
         return this.reader;
      }

      public IPlayPayloadHandler<T> handler() {
         return this.handler;
      }
   }
}
