package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class MagentaStainedClayBlockItemSlab extends ItemSlab {

	public MagentaStainedClayBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.magentaStainedClayHalfSlab)), ((BlockSlab) (Blocks_Main.magentaStainedClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);

		setUnlocalizedName("minecraft:" + "hardened_clay_stained_magenta");
	}
}
