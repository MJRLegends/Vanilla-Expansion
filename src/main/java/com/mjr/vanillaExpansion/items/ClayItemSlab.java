package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class ClayItemSlab extends ItemSlab {

	public ClayItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.clayHalfSlab)),
				((BlockSlab) (VanillaExpansion.clayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "clay");
	}
}
