package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class PinkWoolBlockItemSlab extends ItemSlab {

	public PinkWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.pinkWoolBlockHalfSlab)),
				((BlockSlab) (Blocks_Main.pinkWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "wool_colored_pink");
	}

}