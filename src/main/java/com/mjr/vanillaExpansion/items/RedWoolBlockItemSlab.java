package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class RedWoolBlockItemSlab extends ItemSlab {

	public RedWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.redWoolBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.redWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "wool_colored_red");
	}

}