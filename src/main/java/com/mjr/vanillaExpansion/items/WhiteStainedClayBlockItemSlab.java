package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class WhiteStainedClayBlockItemSlab extends ItemSlab {

	public WhiteStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.whiteStainedClayHalfSlab)),
				((BlockSlab) (VanillaExpansion.whiteStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "hardened_clay_stained_" + "white");
	}
}
