package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class LapisBlockItemSlab extends ItemSlab {
	public LapisBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.lapisBlockHalfSlab)),
				((BlockSlab) (Blocks_Main.lapisBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true); 		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		setUnlocalizedName("minecraft:" + "lapis_block");
	}
}