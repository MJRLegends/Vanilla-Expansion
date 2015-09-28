package com.mjr.vanillaExpansion.blocks;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockCustomTrapDoor extends BlockTrapDoor{

	protected BlockCustomTrapDoor(Material material, String name, float hardness) {
		super(material);
		this.setBlockName(name);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + name);
		this.setStepSound(soundTypeWood);
		this.setHardness(hardness);
		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
	}
}
