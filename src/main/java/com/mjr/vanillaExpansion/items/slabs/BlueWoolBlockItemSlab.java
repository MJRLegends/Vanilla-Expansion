package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class BlueWoolBlockItemSlab extends ItemSlab {

	public BlueWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.blueWoolBlockHalfSlab)),
				((BlockSlab) (Blocks_Main.blueWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "wool_colored_blue");
	}

}