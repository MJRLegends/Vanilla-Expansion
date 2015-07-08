package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class GoldBlockItemSlab extends ItemSlab {
	public GoldBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.goldBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.goldBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "gold_block");
	}
}