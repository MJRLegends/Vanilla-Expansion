package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class LightBlueStainedClayBlockItemSlab extends ItemSlab {

	public LightBlueStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.lightBlueStainedClayHalfSlab)),
				((BlockSlab) (VanillaExpansion.lightBlueStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "hardened_clay_stained_light_blue");
	}
}
