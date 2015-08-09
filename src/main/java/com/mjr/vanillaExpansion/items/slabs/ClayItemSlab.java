package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class ClayItemSlab extends ItemSlab {

	public ClayItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.clayHalfSlab)), ((BlockSlab) (Blocks_Main.clayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);

		setUnlocalizedName("minecraft:" + "clay");
	}
}
