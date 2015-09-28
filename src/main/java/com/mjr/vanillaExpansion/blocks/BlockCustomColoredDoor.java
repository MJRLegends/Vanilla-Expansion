package com.mjr.vanillaExpansion.blocks;

import java.util.Random;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.items.Items_Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCustomColoredDoor extends BlockDoor {
	public static final String[] baseNames = new String[] { "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "silver", "cyan", "purple", "blue", "brown", "green", "red", "black" };

	public BlockCustomColoredDoor(String name, int meta) {
		super(Material.circuits);
		super.setHardness(-1f);
		super.setStepSound(soundTypeMetal);
		super.disableStats();
		super.setBlockName(name + "_" + baseNames[meta]);
		super.setBlockTextureName(Constants.TEXTURE_PREFIX + name + "_" + baseNames[meta]);
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		int i1 = this.func_150012_g(world, x, y, z);
		int j1 = i1 & 7;
		j1 ^= 4;

		if ((i1 & 8) == 0) {
			world.setBlockMetadataWithNotify(x, y, z, j1, 2);
			world.markBlockRangeForRenderUpdate(x, y, z, x, y, z);
		} else {
			world.setBlockMetadataWithNotify(x, y - 1, z, j1, 2);
			world.markBlockRangeForRenderUpdate(x, y - 1, z, x, y, z);
		}

		world.playAuxSFXAtEntity(player, 1003, x, y, z, 0);
		return true;
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[0]) ? Items_Main.coloredDoorItem1 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[1]) ? Items_Main.coloredDoorItem2 : this
				.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[2]) ? Items_Main.coloredDoorItem3 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[3]) ? Items_Main.coloredDoorItem4 : this
				.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[4]) ? Items_Main.coloredDoorItem5 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[5]) ? Items_Main.coloredDoorItem6 : this
				.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[6]) ? Items_Main.coloredDoorItem7 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[7]) ? Items_Main.coloredDoorItem8 : this
				.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[8]) ? Items_Main.coloredDoorItem9 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[9]) ? Items_Main.coloredDoorItem10 : this
				.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[10]) ? Items_Main.coloredDoorItem11 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[11]) ? Items_Main.coloredDoorItem12 : this
				.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[12]) ? Items_Main.coloredDoorItem13 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[13]) ? Items_Main.coloredDoorItem14 : this
				.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[14]) ? Items_Main.coloredDoorItem15 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[15]) ? Items_Main.coloredDoorItem16
				: Items_Main.coloredDoorItem1;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
		return this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[0]) ? Items_Main.coloredDoorItem1 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[1]) ? Items_Main.coloredDoorItem2 : this
				.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[2]) ? Items_Main.coloredDoorItem3 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[3]) ? Items_Main.coloredDoorItem4 : this
				.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[4]) ? Items_Main.coloredDoorItem5 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[5]) ? Items_Main.coloredDoorItem6 : this
				.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[6]) ? Items_Main.coloredDoorItem7 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[7]) ? Items_Main.coloredDoorItem8 : this
				.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[8]) ? Items_Main.coloredDoorItem9 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[9]) ? Items_Main.coloredDoorItem10 : this
				.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[10]) ? Items_Main.coloredDoorItem11 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[11]) ? Items_Main.coloredDoorItem12 : this
				.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[12]) ? Items_Main.coloredDoorItem13 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[13]) ? Items_Main.coloredDoorItem14 : this
				.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[14]) ? Items_Main.coloredDoorItem15 : this.getUnlocalizedName().equalsIgnoreCase("tile.coloredDoor_" + baseNames[15]) ? Items_Main.coloredDoorItem16
				: Items_Main.coloredDoorItem1;
	}

	@Override
	public int getMobilityFlag() {
		return 2;
	}
}