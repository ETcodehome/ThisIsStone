package me.psiber.thisisstone;

import me.psiber.thisisstone.init.ThisIsStoneModBlocks;
import me.psiber.thisisstone.init.ThisIsStoneModFeatures;
import me.psiber.thisisstone.init.ThisIsStoneModItems;
import me.psiber.thisisstone.init.ThisIsStoneModTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ThisIsStoneMod.MODID)
public class ThisIsStoneMod {
   public static final String MODID = "this_is_stone";
   public ThisIsStoneMod(IEventBus modEventBus) {

      ThisIsStoneModBlocks.REGISTRY.register(modEventBus);
      ThisIsStoneModFeatures.REGISTRY.register(modEventBus);
      ThisIsStoneModItems.REGISTRY.register(modEventBus);
      ThisIsStoneModTabs.REGISTRY.register(modEventBus);

   }

}