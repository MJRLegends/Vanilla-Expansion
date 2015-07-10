package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class HardenClayItemSlab extends ItemSlab {

	public HardenClayItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.hardenClayHalfSlab)),
				((BlockSlab) (VanillaExpansion.hardenClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "hardenClay");
	}
}
