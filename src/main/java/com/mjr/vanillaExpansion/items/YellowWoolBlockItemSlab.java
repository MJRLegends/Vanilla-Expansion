package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class YellowWoolBlockItemSlab extends ItemSlab {

	public YellowWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.yellowWoolBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.yellowWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "wool_colored_yellow");
	}

}