package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class BlackStainedClayBlockItemSlab extends ItemSlab {

	public BlackStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.blackStainedClayHalfSlab)),
				((BlockSlab) (VanillaExpansion.blackStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "hardened_clay_stained_" + "black");
	}
}
