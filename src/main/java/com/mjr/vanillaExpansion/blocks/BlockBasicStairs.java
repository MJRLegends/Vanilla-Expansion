package com.mjr.vanillaExpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class BlockBasicStairs extends BlockStairs {
	public BlockBasicStairs(Block block, int par3, String name) {
		super(block, par3);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		this.setLightOpacity(0);
		setBlockName(name);
	}
}
