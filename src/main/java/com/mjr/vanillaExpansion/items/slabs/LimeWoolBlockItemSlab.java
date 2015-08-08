package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class LimeWoolBlockItemSlab extends ItemSlab {

	public LimeWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.limeWoolBlockHalfSlab)),
				((BlockSlab) (Blocks_Main.limeWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "wool_colored_lime");
	}

}