package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class BlueStainedClayBlockItemSlab extends ItemSlab {

	public BlueStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.blueStainedClayHalfSlab)),
				((BlockSlab) (Blocks_Main.blueStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "hardened_clay_stained_" + "blue");
	}
}
