package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class EmeraldBlockItemSlab extends ItemSlab {
	public EmeraldBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.emeraldBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.emeraldBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "emerald_block");
	}
}
