package com.mjr.vanillaExpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class BasicStairs extends BlockStairs {
	public BasicStairs(Block block, int par3, String name) {
		super(block, par3);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setLightOpacity(0);
		setBlockName(name);
	}
}
