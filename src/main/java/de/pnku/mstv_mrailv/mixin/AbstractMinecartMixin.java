package de.pnku.mstv_mrailv.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static de.pnku.mstv_mrailv.init.MrailvTags.ALL_ACTIVATOR_RAIL;
import static de.pnku.mstv_mrailv.init.MrailvTags.ALL_POWERED_RAIL;

@Mixin(AbstractMinecart.class)
public abstract class AbstractMinecartMixin {

    @WrapOperation(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Lnet/minecraft/world/level/block/Block;)Z"))
    protected boolean wrappedTickAtStateIs(BlockState blockState, Block block, Operation<Boolean> original) {
        if (block.defaultBlockState().getBlock() == Blocks.ACTIVATOR_RAIL) {
            return blockState.is(ALL_ACTIVATOR_RAIL);
        } return original.call(blockState, block);
    }

    @WrapOperation(method = "moveAlongTrack", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Lnet/minecraft/world/level/block/Block;)Z"))
    protected boolean wrappedMoveAlongTrackAtStateIs(BlockState blockState, Block block, Operation<Boolean> original) {
        if (block.defaultBlockState().getBlock() == Blocks.POWERED_RAIL) {
            return blockState.is(ALL_POWERED_RAIL);
        } return  original.call(blockState, block);
    }
}
