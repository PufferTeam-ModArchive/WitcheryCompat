package net.pufferlab.witcherycompat.blocks;

import java.util.List;

import com.emoniph.witchery.blocks.BlockStockade;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import static net.minecraft.block.Block.soundTypeWood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockStockadeModded extends BlockStockade {

    public static String[] woodNames;
    String modName;

    @SideOnly(Side.CLIENT)
    private IIcon[] tree;

    @SideOnly(Side.CLIENT)
    private IIcon[] tree_top;

    private boolean tipTexturing;

    public BlockStockadeModded(String[] names, String mod) {
        super(false);

        this.setStepSound(Block.soundTypeWood);
        modName = mod;
        woodNames = names;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (meta < 0 || meta >= woodNames.length)
            meta = 0;
        return (side == 1 || side == 0 || this.tipTexturing) ? this.tree_top[meta] : this.tree[meta];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item block, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (int i = 0; i < woodNames.length; i++)
            list.add(new ItemStack(this, 1, i));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.tree = new IIcon[woodNames.length];
        this.tree_top = new IIcon[woodNames.length];
        for (int i = 0; i < this.tree.length; i++) {
            if (modName.equals("biomesoplenty")) {
                this.tree[i] = iconRegister.registerIcon("biomesoplenty:log_" + woodNames[i] + "_side");
                this.tree_top[i] = iconRegister.registerIcon("biomesoplenty:log_" + woodNames[i] + "_heart");
            }

        }
    }

    public void setTipTexture(boolean b) {
        this.tipTexturing = b;
    }
}
