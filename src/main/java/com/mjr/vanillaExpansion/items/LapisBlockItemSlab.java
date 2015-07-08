package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class LapisBlockItemSlab extends ItemSlab {
	public LapisBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.lapisBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.lapisBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "lapis_block");
	}
}