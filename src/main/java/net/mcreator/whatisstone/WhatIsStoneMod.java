package net.mcreator.whatisstone;

import net.mcreator.whatisstone.init.WhatIsStoneModBlocks;
import net.mcreator.whatisstone.init.WhatIsStoneModFeatures;
import net.mcreator.whatisstone.init.WhatIsStoneModItems;
import net.mcreator.whatisstone.init.WhatIsStoneModTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(WhatIsStoneMod.MODID)
public class WhatIsStoneMod {
   public static final String MODID = "what_is_stone";
   public WhatIsStoneMod(IEventBus modEventBus) {

      WhatIsStoneModBlocks.REGISTRY.register(modEventBus);
      WhatIsStoneModFeatures.REGISTRY.register(modEventBus);
      WhatIsStoneModItems.REGISTRY.register(modEventBus);
      WhatIsStoneModTabs.REGISTRY.register(modEventBus);

   }

}