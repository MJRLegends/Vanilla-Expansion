package com.mjr.vanillaExpansion.blocks;

import com.mjr.vanillaExpansion.VanillaExpansion;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class BasicStairs extends BlockStairs {
	public BasicStairs(Block block, int par3, String name) {
		super(block, par3);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		this.setLightOpacity(0);
		setBlockName(name);
	}
}
