package me.psiber.thisisstone.mixin;

import me.psiber.thisisstone.block.GenericStoneBlock;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// Targets the internal base class of all BlockStates
// can verify behavior using in game command
// /execute if block 262 89 95 #c:ore_bearing_ground/stone run say Tag Found!

@Mixin(net.minecraft.core.Holder.Reference.class)
public abstract class BlockStateTagMixin<T> {
    @Shadow public abstract T value();

    @Inject(method = "is(Lnet/minecraft/tags/TagKey;)Z", at = @At("HEAD"), cancellable = true)
    private void mirrorTags(TagKey<T> tag, CallbackInfoReturnable<Boolean> cir) {
        if (this.value() instanceof GenericStoneBlock regenBlock) {
            if (Blocks.STONE.builtInRegistryHolder().is((TagKey<Block>) tag)) {
                cir.setReturnValue(true);
            }
        }
    }
}