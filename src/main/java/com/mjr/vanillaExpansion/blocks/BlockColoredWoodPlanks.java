package com.mjr.vanillaExpansion.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockColoredWoodPlanks extends Block {
	@SideOnly(Side.CLIENT)
	private IIcon[] field_150033_a;

	public BlockColoredWoodPlanks(String name) {
		super(Material.wood);
		this.setBlockName(name);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + name);
		this.setStepSound(soundTypeWood);
		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
	}

	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return this.field_150033_a[meta];
	}

	/**
	 * Determines the damage on the item the block drops. Used in cloth and
	 * wood.
	 */
	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	/**
	 * returns a list of blocks with the same ID, but different meta (eg: wood
	 * returns 4 blocks)
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs,
			List par3List) {
		for (int var4 = 0; var4 < this.field_150033_a.length; ++var4) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}

	/**
	 * Returns which pass should this block be rendered on. 0 for solids and 1
	 * for alpha
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass() {
		return 1;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		super.registerBlockIcons(par1IconRegister);
		this.field_150033_a = new IIcon[16];
		for (int i = 0; i < this.field_150033_a.length; ++i) {
			this.field_150033_a[i] = par1IconRegister.registerIcon(this
					.getTextureName()
					+ "_"
					+ ItemDye.field_150921_b[(ItemDye.field_150921_b.length - 1) - (i % 16)]);
		}
	}
}
