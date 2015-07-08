package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class RedstoneBlockItemSlab extends ItemSlab {

	public RedstoneBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.redstoneBlockHalfSlab)), ((BlockSlab) (VanillaExpansion.redstoneBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "redstone_block");
	}
}