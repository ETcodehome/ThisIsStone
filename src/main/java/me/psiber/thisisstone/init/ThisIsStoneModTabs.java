package me.psiber.thisisstone.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ThisIsStoneModTabs {
   public static final DeferredRegister<CreativeModeTab> REGISTRY =
           DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "this_is_stone");

   public static final DeferredHolder<CreativeModeTab, CreativeModeTab> this_is_stone =
           REGISTRY.register("this_is_stone", () -> CreativeModeTab.builder()
                   .title(Component.translatable("item_group.this_is_stone.this_is_stone"))
                   // Use a lambda for the icon so it isn't called until the tab is rendered
                   .icon(() -> new ItemStack(getBlockByName("gneiss")))
                   .displayItems((parameters, tabData) -> {
                      // AUTOMATICALLY add every block and item from your mod
                      ThisIsStoneModBlocks.REGISTRY.getEntries().forEach(block ->
                              tabData.accept(block.get()));

                      ThisIsStoneModItems.REGISTRY.getEntries().forEach(item ->
                              tabData.accept(item.get()));
                   })
                   .build()
           );

   public static final DeferredBlock<Block> getBlockByName(String name) {
       return ThisIsStoneModBlocks.REGISTRY.getEntries().stream()
                .filter(holder -> holder.getId().getPath().equals(name))
                .findFirst()
                .map(holder -> (DeferredBlock<Block>) holder)
                .orElse(null); // Or throw an exception if you expect it to always exist
   }
}