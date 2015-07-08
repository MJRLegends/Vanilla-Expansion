package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class DirtBlockItemSlab extends ItemSlab {

	public DirtBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.dirtBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.dirtBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "dirt");
	}

}