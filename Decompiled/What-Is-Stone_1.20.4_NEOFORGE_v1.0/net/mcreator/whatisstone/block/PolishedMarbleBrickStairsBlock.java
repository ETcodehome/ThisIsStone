package net.mcreator.whatisstone.block;

import java.util.Collections;
import java.util.List;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.storage.loot.LootParams;

public class PolishedMarbleBrickStairsBlock extends StairBlock {
   public PolishedMarbleBrickStairsBlock() {
      super(() -> {
         return Blocks.AIR.defaultBlockState();
      }, Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CALCITE).strength(0.75F, 4.0F).dynamicShape());
   }

   public float getExplosionResistance() {
      return 4.0F;
   }

   public boolean isRandomlyTicking(BlockState state) {
      return false;
   }

   public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
      List<ItemStack> dropsOriginal = super.getDrops(state, builder);
      return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack(this, 1));
   }
}
