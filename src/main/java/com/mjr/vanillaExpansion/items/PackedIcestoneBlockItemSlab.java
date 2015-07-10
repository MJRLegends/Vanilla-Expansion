package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class PackedIcestoneBlockItemSlab  extends ItemSlab {
	public PackedIcestoneBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.packedIceBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.packedIceBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "ice_packed");
	}
}
