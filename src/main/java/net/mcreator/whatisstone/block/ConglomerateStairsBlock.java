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

public class ConglomerateStairsBlock extends StairBlock {
   public ConglomerateStairsBlock() {
      super(Blocks.STONE.defaultBlockState(),
              Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE_TILES).strength(1.3F, 6.0F).dynamicShape());
   }
}
