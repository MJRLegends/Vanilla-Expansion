package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class YellowStainedClayBlockItemSlab extends ItemSlab {

	public YellowStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.yellowStainedClayHalfSlab)),
				((BlockSlab) (VanillaExpansion.yellowStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "hardened_clay_stained_yellow");
	}
}
