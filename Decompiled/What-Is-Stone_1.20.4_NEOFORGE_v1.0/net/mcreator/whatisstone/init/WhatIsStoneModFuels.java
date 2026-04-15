package net.mcreator.whatisstone.init;

import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod.EventBusSubscriber;
import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;

@EventBusSubscriber
public class WhatIsStoneModFuels {
   @SubscribeEvent
   public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
      ItemStack itemstack = event.getItemStack();
      if (itemstack.getItem() == WhatIsStoneModItems.CHUNK_OF_ANTHRACITE.get()) {
         event.setBurnTime(400);
      }

   }
}
