package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class CoalBlockItemSlab extends ItemSlab {

	public CoalBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.coalBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.coalBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "coal_block");
	}

}