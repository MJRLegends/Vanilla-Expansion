package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class BlackWoolBlockItemSlab extends ItemSlab {

	public BlackWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.blackWoolBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.blackWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "wool_colored_black");
	}

}