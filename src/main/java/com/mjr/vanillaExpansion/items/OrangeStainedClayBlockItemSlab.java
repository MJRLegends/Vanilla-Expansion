package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class OrangeStainedClayBlockItemSlab extends ItemSlab {

	public OrangeStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.orangeStainedClayHalfSlab)),
				((BlockSlab) (VanillaExpansion.orangeStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "hardened_clay_stained_orange");
	}
}
