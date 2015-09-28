package com.mjr.vanillaExpansion.blocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockColoredFence extends BlockFence
{
	public static final String[] baseNames = new String[] {"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"};

	public BlockColoredFence(Material material, String textureName, int meta) {
		super(Constants.TEXTURE_PREFIX + "coloredWoodPlanks" + "_" + baseNames[meta] , material);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypePiston);
    	this.setBlockName("coloredWoodPlankFences" + "_" + baseNames[meta]);
		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
	}
}
