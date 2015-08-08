package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class LightBlueWoolBlockItemSlab extends ItemSlab {

	public LightBlueWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.lightBlueWoolBlockHalfSlab)),
				((BlockSlab) (Blocks_Main.lightBlueWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "wool_colored_light_blue");
	}

}