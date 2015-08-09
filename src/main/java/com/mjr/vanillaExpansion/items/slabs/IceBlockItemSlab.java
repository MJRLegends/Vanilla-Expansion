package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class IceBlockItemSlab extends ItemSlab {
	public IceBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.iceBlockHalfSlab)),
				((BlockSlab) (Blocks_Main.iceBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true); 		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		setUnlocalizedName("minecraft:" + "ice");
	}
}
