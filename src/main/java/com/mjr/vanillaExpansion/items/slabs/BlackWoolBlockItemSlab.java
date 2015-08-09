package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class BlackWoolBlockItemSlab extends ItemSlab {

	public BlackWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.blackWoolBlockHalfSlab)), ((BlockSlab) (Blocks_Main.blackWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);

		setUnlocalizedName("minecraft:" + "wool_colored_black");
	}

}