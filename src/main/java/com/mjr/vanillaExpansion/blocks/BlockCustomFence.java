package com.mjr.vanillaExpansion.blocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCustomFence extends BlockFence {
	public BlockCustomFence(Material material, String name, String textureName) {
		super(textureName, material);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypePiston);
		this.setBlockName(name);
		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
	}
}
