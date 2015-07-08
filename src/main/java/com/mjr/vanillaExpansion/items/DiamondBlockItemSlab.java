package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class DiamondBlockItemSlab extends ItemSlab {
	public DiamondBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.diamondBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.diamondBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "diamond_block");
	}

}