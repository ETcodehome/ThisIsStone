package me.psiber.thisisstone.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class ChunkOfAnthraciteItem extends Item {
   public ChunkOfAnthraciteItem() {
      super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON));
   }

   @Override
   public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
      return 400;
   }

}
