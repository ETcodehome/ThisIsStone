package me.psiber.thisisstone.block;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.storage.loot.LootParams;

import java.util.Collections;
import java.util.List;

public class GenericStoneBlock extends Block {

    public static final Block tagSourceBlock = Blocks.STONE;

    public GenericStoneBlock(float destroyTime, float explosionResistance, SoundType sounds) {
        super(createProperties(destroyTime, explosionResistance, sounds));
    }

    private static BlockBehaviour.Properties createProperties(float destroyTime, float explosionResistance, SoundType sounds) {
        BlockBehaviour.Properties props = BlockBehaviour.Properties.of()
                .sound(sounds)
                .destroyTime(destroyTime)
                .explosionResistance(explosionResistance)
                .lightLevel(state -> 0)
                .requiresCorrectToolForDrops();

        return props;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack(this, 1));
    }
}