package net.mcreator.whatisstone.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ChunkOfAnthraciteItem extends Item {
   public ChunkOfAnthraciteItem() {
      super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON));
   }
}
