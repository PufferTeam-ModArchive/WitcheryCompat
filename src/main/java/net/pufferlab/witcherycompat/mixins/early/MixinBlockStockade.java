package net.pufferlab.witcherycompat.mixins.early;

import net.minecraft.block.Block;
import net.minecraft.world.IBlockAccess;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import com.emoniph.witchery.blocks.BlockStockade;

@Mixin(value = BlockStockade.class, remap = false, priority = 0)
public class MixinBlockStockade {

    @Overwrite
    public boolean canConnectFenceTo(IBlockAccess p_149826_1_, int p_149826_2_, int p_149826_3_, int p_149826_4_) {
        Block block = p_149826_1_.getBlock(p_149826_2_, p_149826_3_, p_149826_4_);
        return block instanceof BlockStockade;
    }
}
