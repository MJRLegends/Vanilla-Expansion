package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class YellowWoolBlockItemSlab extends ItemSlab {

	public YellowWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.yellowWoolBlockHalfSlab)), ((BlockSlab) (Blocks_Main.yellowWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);

		setUnlocalizedName("minecraft:" + "wool_colored_yellow");
	}

}