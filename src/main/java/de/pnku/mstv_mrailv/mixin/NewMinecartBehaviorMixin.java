package de.pnku.mstv_mrailv.mixin;

import net.minecraft.world.entity.vehicle.minecart.AbstractMinecart;
import net.minecraft.world.entity.vehicle.minecart.MinecartBehavior;
import net.minecraft.world.entity.vehicle.minecart.NewMinecartBehavior;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static de.pnku.mstv_mrailv.init.MrailvTags.*;

@Mixin(NewMinecartBehavior.class)
public abstract class NewMinecartBehaviorMixin extends MinecartBehavior {
    protected NewMinecartBehaviorMixin(AbstractMinecart abstractMinecart) {
        super(abstractMinecart);
    }

    @Redirect(method = "moveAlongTrack", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Ljava/lang/Object;)Z"))
    private boolean redirectedMoveAlongTrackStateIs(BlockState blockState, Object block) {
        return blockState.is(ACTIVATOR_RAIL_VARIANTS) || blockState.is((Block) block);
    }

    @Redirect(method = "calculateHaltTrackSpeed", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Ljava/lang/Object;)Z"))
    private boolean redirectedCalculateHaltTrackSpeedStateIs(BlockState blockState, Object block) {
        return blockState.is(ALL_POWERED_RAIL) || blockState.is((Block) block);
    }

    @Redirect(method = "calculateBoostTrackSpeed", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Ljava/lang/Object;)Z"))
    private boolean redirectedCalculateBoostTrackSpeedStateIs(BlockState blockState, Object block) {
        return blockState.is(ALL_POWERED_RAIL) || blockState.is((Block) block);
    }
}
