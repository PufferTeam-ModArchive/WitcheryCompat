package net.pufferlab.witcherycompat.mixins.early.stockade;

import com.emoniph.witchery.Witchery;
import com.emoniph.witchery.util.MultiItemBlock;
import com.emoniph.witchery.blocks.BlockStockade;
import com.emoniph.witchery.blocks.BlockBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

@Mixin(value = BlockStockade.class, remap = false, priority = 0)
public class MixinBlockStockade {
	@Overwrite
	public boolean canConnectFenceTo(IBlockAccess p_149826_1_, int p_149826_2_, int p_149826_3_, int p_149826_4_) {
		Block block = p_149826_1_.getBlock(p_149826_2_, p_149826_3_, p_149826_4_);
		return block instanceof BlockStockade;
	}
}
