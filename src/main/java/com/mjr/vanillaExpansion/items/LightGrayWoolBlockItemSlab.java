package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class LightGrayWoolBlockItemSlab extends ItemSlab {

	public LightGrayWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.lightGrayWoolBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.lightGrayWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "wool_colored_silver");
	}

}