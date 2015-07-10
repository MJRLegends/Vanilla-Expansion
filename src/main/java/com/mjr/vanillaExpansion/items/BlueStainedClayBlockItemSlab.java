package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class BlueStainedClayBlockItemSlab extends ItemSlab {

	public BlueStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.blueStainedClayHalfSlab)),
				((BlockSlab) (VanillaExpansion.blueStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "hardened_clay_stained_" + "blue");
	}
}
