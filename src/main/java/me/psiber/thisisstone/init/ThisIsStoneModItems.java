package me.psiber.thisisstone.init;

import me.psiber.thisisstone.item.ChunkOfAnthraciteItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ThisIsStoneModItems {
   public static final DeferredRegister<Item> REGISTRY;

   public static final DeferredHolder<Item, Item> CHUNK_OF_ANTHRACITE;


   public static void register(IEventBus bus) {
      REGISTRY.register(bus);
   }

   private static DeferredHolder<Item, Item> deferredRegister(DeferredHolder<Block, Block> block) {
      return REGISTRY.register(block.getId().getPath(), () -> {
         return new BlockItem((Block)block.get(), new Item.Properties());
      });
   }

   static {

      REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, "this_is_stone");

      for (DeferredHolder<Block, ? extends Block> deferredBlock : ThisIsStoneModBlocks.REGISTRY.getEntries()) {
         deferredRegister((DeferredHolder<Block, Block>) deferredBlock);
      }

      CHUNK_OF_ANTHRACITE = REGISTRY.register("chunk_of_anthracite", () -> {
         return new ChunkOfAnthraciteItem();
      });

   }
}
