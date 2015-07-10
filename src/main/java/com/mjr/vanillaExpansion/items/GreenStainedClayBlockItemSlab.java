package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class GreenStainedClayBlockItemSlab extends ItemSlab {

	public GreenStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.greenStainedClayHalfSlab)),
				((BlockSlab) (VanillaExpansion.greenStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "hardened_clay_stained_" + "green");
	}
}
