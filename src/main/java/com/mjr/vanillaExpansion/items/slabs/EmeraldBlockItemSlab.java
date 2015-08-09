package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class EmeraldBlockItemSlab extends ItemSlab {
	public EmeraldBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.emeraldBlockHalfSlab)), ((BlockSlab) (Blocks_Main.emeraldBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);

		setUnlocalizedName("minecraft:" + "emerald_block");
	}
}
