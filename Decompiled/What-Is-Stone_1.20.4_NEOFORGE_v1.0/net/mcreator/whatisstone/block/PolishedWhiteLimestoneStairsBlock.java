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

public class PolishedWhiteLimestoneStairsBlock extends StairBlock {
   public PolishedWhiteLimestoneStairsBlock() {
      super(() -> {
         return Blocks.AIR.defaultBlockState();
      }, Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(0.9F, 5.0F).dynamicShape());
   }

   public float getExplosionResistance() {
      return 5.0F;
   }

   public boolean isRandomlyTicking(BlockState state) {
      return false;
   }

   public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
      List<ItemStack> dropsOriginal = super.getDrops(state, builder);
      return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack(this, 1));
   }
}
