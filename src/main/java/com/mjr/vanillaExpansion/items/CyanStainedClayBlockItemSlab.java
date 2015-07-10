package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class CyanStainedClayBlockItemSlab extends ItemSlab {

	public CyanStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.cyanStainedClayHalfSlab)),
				((BlockSlab) (VanillaExpansion.cyanStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "hardened_clay_stained_" + "cyan");
	}
}
