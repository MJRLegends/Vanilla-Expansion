package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class SandItemSlab extends ItemSlab {

	public SandItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.sandHalfSlab)),
				((BlockSlab) (VanillaExpansion.sandDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "sand");
	}

}