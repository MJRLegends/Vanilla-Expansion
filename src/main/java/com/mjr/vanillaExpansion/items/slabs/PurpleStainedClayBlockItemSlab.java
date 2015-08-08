package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class PurpleStainedClayBlockItemSlab extends ItemSlab {

	public PurpleStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.purpleStainedClayHalfSlab)),
				((BlockSlab) (Blocks_Main.purpleStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "hardened_clay_stained_" + "purple");
	}
}
