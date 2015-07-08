package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class GreenWoolBlockItemSlab extends ItemSlab {

	public GreenWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.greenWoolBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.greenWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "wool_colored_green");
	}

}