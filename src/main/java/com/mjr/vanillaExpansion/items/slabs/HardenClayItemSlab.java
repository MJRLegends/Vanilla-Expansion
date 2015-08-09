package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class HardenClayItemSlab extends ItemSlab {

	public HardenClayItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.hardenClayHalfSlab)), ((BlockSlab) (Blocks_Main.hardenClayDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);

		setUnlocalizedName("minecraft:" + "hardenClay");
	}
}
