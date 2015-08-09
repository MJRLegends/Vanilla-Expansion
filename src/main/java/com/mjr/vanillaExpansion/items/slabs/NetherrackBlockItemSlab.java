package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class NetherrackBlockItemSlab extends ItemSlab {
	public NetherrackBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.netherrackBlockHalfSlab)), ((BlockSlab) (Blocks_Main.netherrackBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);

		setUnlocalizedName("minecraft:" + "netherrack");
	}

}