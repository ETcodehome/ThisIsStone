package net.mcreator.whatisstone.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class AnthraciteBlock extends Block {
   public AnthraciteBlock() {
      super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.4F, 6.0F).requiresCorrectToolForDrops());
   }
}
