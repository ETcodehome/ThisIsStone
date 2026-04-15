package net.mcreator.whatisstone.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class WhatIsStoneModTabs {
   public static final DeferredRegister<CreativeModeTab> REGISTRY =
           DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "what_is_stone");

   public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WHAT_IS_STONE =
           REGISTRY.register("what_is_stone", () -> CreativeModeTab.builder()
                   .title(Component.translatable("item_group.what_is_stone.what_is_stone"))
                   // Use a lambda for the icon so it isn't called until the tab is rendered
                   .icon(() -> new ItemStack(WhatIsStoneModBlocks.GNEISS.get()))
                   .displayItems((parameters, tabData) -> {
                      // AUTOMATICALLY add every block and item from your mod
                      WhatIsStoneModBlocks.REGISTRY.getEntries().forEach(block ->
                              tabData.accept(block.get()));

                      WhatIsStoneModItems.REGISTRY.getEntries().forEach(item ->
                              tabData.accept(item.get()));
                   })
                   .build()
           );
}