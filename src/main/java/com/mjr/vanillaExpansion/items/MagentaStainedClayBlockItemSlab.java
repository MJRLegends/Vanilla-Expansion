package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class MagentaStainedClayBlockItemSlab extends ItemSlab {

	public MagentaStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.magentaStainedClayHalfSlab)),
				((BlockSlab) (VanillaExpansion.magentaStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "hardened_clay_stained_magenta");
	}
}
