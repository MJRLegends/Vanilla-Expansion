package com.mjr.vanillaExpansion.blocks;

import java.util.Random;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.mjr.vanillaExpansion.items.Items_Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCustomDoor extends BlockDoor {
	public BlockCustomDoor() {
		super(Material.circuits);
		super.setHardness(-1f);
		super.setStepSound(soundTypeMetal);
		super.disableStats();
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		if (this.getUnlocalizedName().equalsIgnoreCase("tile.goldDoor") || this.getUnlocalizedName().equalsIgnoreCase("tile.diamondDoor"))
			return false;
		else {
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
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return this.getUnlocalizedName().equalsIgnoreCase("tile.goldDoor") ? Items_Main.goldDoorItem : this.getUnlocalizedName().equalsIgnoreCase(
				"tile.diamondDoor") ? Items_Main.diamondDoorItem : this.getUnlocalizedName().equalsIgnoreCase("tile.darkOakDoor") ? Items_Main.darkOakDoorItem
				: this.getUnlocalizedName().equalsIgnoreCase("tile.spruceDoor") ? Items_Main.spruceDoorItem : this.getUnlocalizedName().equalsIgnoreCase(
						"tile.jungleDoor") ? Items_Main.jungleDoorItem
						: this.getUnlocalizedName().equalsIgnoreCase("tile.acaciaDoor") ? Items_Main.acaciaDoorItem : Items_Main.birchDoorItem;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
		return this.getUnlocalizedName().equalsIgnoreCase("tile.goldDoor") ? Items_Main.goldDoorItem : this.getUnlocalizedName().equalsIgnoreCase(
				"tile.diamondDoor") ? Items_Main.diamondDoorItem : this.getUnlocalizedName().equalsIgnoreCase("tile.darkOakDoor") ? Items_Main.darkOakDoorItem
				: this.getUnlocalizedName().equalsIgnoreCase("tile.spruceDoor") ? Items_Main.spruceDoorItem : this.getUnlocalizedName().equalsIgnoreCase(
						"tile.jungleDoor") ? Items_Main.jungleDoorItem
						: this.getUnlocalizedName().equalsIgnoreCase("tile.acaciaDoor") ? Items_Main.acaciaDoorItem : Items_Main.birchDoorItem;
	}

	@Override
	public int getMobilityFlag() {
		return 2;
	}
}