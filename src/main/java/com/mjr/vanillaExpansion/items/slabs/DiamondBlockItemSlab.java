package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class DiamondBlockItemSlab extends ItemSlab {
	public DiamondBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.diamondBlockHalfSlab)),
				((BlockSlab) (Blocks_Main.diamondBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "diamond_block");
	}

}