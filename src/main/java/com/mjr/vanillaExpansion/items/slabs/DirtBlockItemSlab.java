package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class DirtBlockItemSlab extends ItemSlab {

	public DirtBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.dirtBlockHalfSlab)),
				((BlockSlab) (Blocks_Main.dirtBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "dirt");
	}

}