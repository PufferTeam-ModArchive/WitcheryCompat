package net.pufferlab.witcherycompat.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.pufferlab.witcherycompat.blocks.BlockStockadeModded;

public class ItemBlockStockadeModded extends ItemBlock {

    public ItemBlockStockadeModded(Block block) {
        super(block);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "tile.witcherycompat." + BlockStockadeModded.woodNames[stack.getItemDamage()] + "_stockade";
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }
}
