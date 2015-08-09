package com.mjr.vanillaExpansion.items.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class GlowstoneBlockItemSlab extends ItemSlab {
	public GlowstoneBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (Blocks_Main.glowstoneBlockHalfSlab)),
				((BlockSlab) (Blocks_Main.glowstoneBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true); 		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		setUnlocalizedName("minecraft:" + "glowstone");
	}
}
