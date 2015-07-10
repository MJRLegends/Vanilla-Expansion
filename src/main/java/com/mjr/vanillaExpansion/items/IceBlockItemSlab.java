package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class IceBlockItemSlab extends ItemSlab {
	public IceBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.iceBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.iceBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "ice");
	}
}
