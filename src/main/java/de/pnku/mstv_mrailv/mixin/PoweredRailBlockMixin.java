package de.pnku.mstv_mrailv.mixin;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PoweredRailBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static de.pnku.mstv_mrailv.init.MrailvTags.*;

@Mixin(PoweredRailBlock.class)
public abstract class PoweredRailBlockMixin {

    @Redirect(method = "isSameRailWithPower", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Ljava/lang/Object;)Z"))
    private boolean redirectedIsSameRailWithPowerStateIs(BlockState state, Object block) {
        return state.is((Block) block) ||
               state.is(ALL_POWERED_RAIL) && ((Block) block).defaultBlockState().is(ALL_POWERED_RAIL) ||
               state.is(ALL_ACTIVATOR_RAIL) && ((Block) block).defaultBlockState().is(ALL_ACTIVATOR_RAIL);
    }

}
