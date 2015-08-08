package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class PurpleWoolBlockItemSlab extends ItemSlab {

	public PurpleWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.purpleWoolBlockHalfSlab)),
				((BlockSlab) (Blocks_Main.purpleWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "wool_colored_purple");
	}

}