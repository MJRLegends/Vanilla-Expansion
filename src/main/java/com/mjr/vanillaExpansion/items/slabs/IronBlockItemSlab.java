package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class IronBlockItemSlab extends ItemSlab {

	public IronBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.ironBlockHalfSlab)), ((BlockSlab) (Blocks_Main.ironBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);

		setUnlocalizedName("minecraft:" + "iron_block");
	}

}