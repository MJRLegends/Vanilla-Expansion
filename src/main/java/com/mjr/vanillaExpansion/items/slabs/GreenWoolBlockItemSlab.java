package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class GreenWoolBlockItemSlab extends ItemSlab {

	public GreenWoolBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.greenWoolBlockHalfSlab)),
				((BlockSlab) (Blocks_Main.greenWoolBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true); 		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		setUnlocalizedName("minecraft:" + "wool_colored_green");
	}

}