package net.pufferlab.witcherycompat.mixins.early;

import org.spongepowered.asm.mixin.Mixin;

import com.emoniph.witchery.blocks.BlockWitchWoodSlab;

@Mixin(value = BlockWitchWoodSlab.class, remap = false, priority = 0)
public class MixinBlockWitchWoodSlab {

    public boolean getUseNeighborBrightness() {
        return true;
    }
}
