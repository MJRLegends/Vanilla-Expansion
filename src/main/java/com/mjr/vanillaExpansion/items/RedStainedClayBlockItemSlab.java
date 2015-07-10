package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class RedStainedClayBlockItemSlab extends ItemSlab {

	public RedStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.redStainedClayHalfSlab)),
				((BlockSlab) (VanillaExpansion.redStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "hardened_clay_stained_" + "red");
	}
}
