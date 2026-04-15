package me.psiber.thisisstone.block;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.storage.loot.LootParams;

import java.util.List;

public class GenericSlabBlock extends SlabBlock {

    public GenericSlabBlock(float destroyTime, float explosionResistance, SoundType sounds) {
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
        // Returns a list containing one stack of this block, bypassing JSON lookup
        return List.of(new ItemStack(this));
    }
}
