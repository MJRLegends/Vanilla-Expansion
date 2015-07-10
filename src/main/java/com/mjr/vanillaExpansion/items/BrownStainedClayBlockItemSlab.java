package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class BrownStainedClayBlockItemSlab extends ItemSlab {

	public BrownStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.brownStainedClayHalfSlab)),
				((BlockSlab) (VanillaExpansion.brownStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "hardened_clay_stained_" + "brown");
	}
}
