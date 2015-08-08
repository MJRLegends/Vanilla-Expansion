package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class RedstoneBlockItemSlab extends ItemSlab {

	public RedstoneBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.redstoneBlockHalfSlab)), ((BlockSlab) (Blocks_Main.redstoneBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "redstone_block");
	}
}