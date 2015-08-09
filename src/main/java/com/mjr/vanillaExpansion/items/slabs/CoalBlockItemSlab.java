package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class CoalBlockItemSlab extends ItemSlab {

	public CoalBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.coalBlockHalfSlab)), ((BlockSlab) (Blocks_Main.coalBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);

		setUnlocalizedName("minecraft:" + "coal_block");
	}

}