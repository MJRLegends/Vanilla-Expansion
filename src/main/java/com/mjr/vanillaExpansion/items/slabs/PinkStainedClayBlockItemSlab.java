package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class PinkStainedClayBlockItemSlab extends ItemSlab {

	public PinkStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.pinkStainedClayHalfSlab)),
				((BlockSlab) (Blocks_Main.pinkStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true); 		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		setUnlocalizedName("minecraft:" + "hardened_clay_stained_" + "pink");
	}
}
