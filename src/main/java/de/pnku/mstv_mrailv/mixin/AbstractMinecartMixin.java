package de.pnku.mstv_mrailv.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.entity.vehicle.minecart.AbstractMinecart;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static de.pnku.mstv_mrailv.init.MrailvTags.ALL_POWERED_RAIL;

@Mixin(AbstractMinecart.class)
public abstract class AbstractMinecartMixin {

    @WrapOperation(method = "getRedstoneDirection", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Lnet/minecraft/world/level/block/Block;)Z", ordinal = 0))
    protected boolean wrappedGetRedstoneDirectionAtStateIs(BlockState blockState, Block block, Operation<Boolean> original) {
        if (block.defaultBlockState().getBlock() == Blocks.POWERED_RAIL) {
            return blockState.is(ALL_POWERED_RAIL);
        } return  original.call(blockState, block);
    }
}
