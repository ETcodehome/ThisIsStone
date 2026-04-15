package net.mcreator.whatisstone.block;

import java.util.Collections;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.storage.loot.LootParams;

public class PolishedPeridotiteStairsBlock extends StairBlock {
   public PolishedPeridotiteStairsBlock() {
      super(() -> {
         return Blocks.AIR.defaultBlockState();
      }, Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(1.8F, 8.0F).requiresCorrectToolForDrops().dynamicShape());
   }

   public float getExplosionResistance() {
      return 8.0F;
   }

   public boolean isRandomlyTicking(BlockState state) {
      return false;
   }

   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
      Item var6 = player.getInventory().getSelected().getItem();
      if (var6 instanceof PickaxeItem tieredItem) {
         return tieredItem.getTier().getLevel() >= 0;
      } else {
         return false;
      }
   }

   public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
      List<ItemStack> dropsOriginal = super.getDrops(state, builder);
      return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack(this, 1));
   }
}
