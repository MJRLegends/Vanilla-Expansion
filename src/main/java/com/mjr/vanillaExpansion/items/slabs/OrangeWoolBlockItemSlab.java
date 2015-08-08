package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class OrangeWoolBlockItemSlab extends ItemSlab {

	public OrangeWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.orangeWoolBlockHalfSlab)),
				((BlockSlab) (Blocks_Main.orangeWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "wool_colored_orange");
	}

}