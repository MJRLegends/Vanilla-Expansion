package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class NetherrackBlockItemSlab extends ItemSlab {
	public NetherrackBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.netherrackBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.netherrackBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "netherrack");
	}

}