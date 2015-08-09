package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class YellowStainedClayBlockItemSlab extends ItemSlab {

	public YellowStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.yellowStainedClayHalfSlab)), ((BlockSlab) (Blocks_Main.yellowStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);

		setUnlocalizedName("minecraft:" + "hardened_clay_stained_yellow");
	}
}
