package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class PackedIcestoneBlockItemSlab  extends ItemSlab {
	public PackedIcestoneBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.packedIceBlockHalfSlab)),
				((BlockSlab) (Blocks_Main.packedIceBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "ice_packed");
	}
}
