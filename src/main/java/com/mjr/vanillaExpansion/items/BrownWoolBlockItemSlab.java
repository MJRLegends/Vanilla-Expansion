package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class BrownWoolBlockItemSlab extends ItemSlab {

	public BrownWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.brownWoolBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.brownWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "wool_colored_brown");
	}

}