package me.psiber.thisisstone.init;

import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;

//@EventBusSubscriber(bus = EventBusSubscriber.Bus.GAME) // Specify the Game bus
public class ThisIsStoneModFuels {
   @SubscribeEvent
   public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
      ItemStack itemstack = event.getItemStack();

      // Use the Item holder directly and check if it's bound before calling .get()
      if (ThisIsStoneModItems.CHUNK_OF_ANTHRACITE.isBound() &&
              itemstack.is(ThisIsStoneModItems.CHUNK_OF_ANTHRACITE.get())) {
         event.setBurnTime(400);
      }
   }
}