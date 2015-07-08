package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class IronBlockItemSlab extends ItemSlab {

	public IronBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.ironBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.ironBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "iron_block");
	}

}