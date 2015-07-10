package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

import com.mjr.vanillaExpansion.VanillaExpansion;

public class GlowstoneBlockItemSlab extends ItemSlab {
	public GlowstoneBlockItemSlab(Block block) {
		super(block, ((BlockSlab) (VanillaExpansion.glowstoneBlockHalfSlab)),
				((BlockSlab) (VanillaExpansion.glowstoneBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName("minecraft:" + "glowstone");
	}
}
