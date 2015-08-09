package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class LightGrayWoolBlockItemSlab extends ItemSlab {

	public LightGrayWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.lightGrayWoolBlockHalfSlab)), ((BlockSlab) (Blocks_Main.lightGrayWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);

		setUnlocalizedName("minecraft:" + "wool_colored_silver");
	}

}