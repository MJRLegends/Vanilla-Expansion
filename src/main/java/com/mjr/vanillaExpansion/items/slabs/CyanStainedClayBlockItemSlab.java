package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class CyanStainedClayBlockItemSlab extends ItemSlab {

	public CyanStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.cyanStainedClayHalfSlab)), ((BlockSlab) (Blocks_Main.cyanStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);

		setUnlocalizedName("minecraft:" + "hardened_clay_stained_" + "cyan");
	}
}
