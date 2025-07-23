package net.pufferlab.witcherycompat.mixins.early;

import org.spongepowered.asm.mixin.Mixin;

import com.emoniph.witchery.blocks.BlockWitchWoodStairs;

@Mixin(value = BlockWitchWoodStairs.class, remap = false, priority = 0)
public class MixinBlockWitchWoodStairs {

    public boolean getUseNeighborBrightness() {
        return true;
    }
}
