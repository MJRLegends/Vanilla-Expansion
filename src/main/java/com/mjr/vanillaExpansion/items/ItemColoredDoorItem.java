package com.mjr.vanillaExpansion.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

public class ItemColoredDoorItem extends Item {
	
	public static final String[] baseNames = new String[] {"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "light_blue", "magenta", "orange", "white"};

	private String doorType;

	public ItemColoredDoorItem(String type) {
		this.setHasSubtypes(true);
		this.doorType = type;
		this.setMaxDamage(0);
		this.maxStackSize = 16;
		this.setCreativeTab(CreativeTabs.tabRedstone);
		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		switch(doorType){
			case "coloredDoorItem1":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[0]);
				super.setUnlocalizedName("door_colored_" + baseNames[0]);
				break;
			case "coloredDoorItem2":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[1]);
				super.setUnlocalizedName("door_colored_" + baseNames[1]);
				break;
			case "coloredDoorItem3":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[2]);
				super.setUnlocalizedName("door_colored_" + baseNames[2]);
				break;
			case "coloredDoorItem4":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[3]);
				super.setUnlocalizedName("door_colored_" + baseNames[3]);
				break;
			case "coloredDoorItem5":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[4]);
				super.setUnlocalizedName("door_colored_" + baseNames[4]);
				break;
			case "coloredDoorItem6":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[5]);
				super.setUnlocalizedName("door_colored_" + baseNames[5]);
				break;
			case "coloredDoorItem7":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[6]);
				super.setUnlocalizedName("door_colored_" + baseNames[6]);
				break;
			case "coloredDoorItem8":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[7]);
				super.setUnlocalizedName("door_colored_" + baseNames[7]);
				break;
			case "coloredDoorItem9":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[8]);
				super.setUnlocalizedName("door_colored_" + baseNames[8]);
				break;
			case "coloredDoorItem10":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[9]);
				super.setUnlocalizedName("door_colored_" + baseNames[9]);
				break;
			case "coloredDoorItem11":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[10]);
				super.setUnlocalizedName("door_colored_" + baseNames[10]);
				break;
			case "coloredDoorItem12":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[11]);
				super.setUnlocalizedName("door_colored_" + baseNames[11]);
				break;
			case "coloredDoorItem13":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[12]);
				super.setUnlocalizedName("door_colored_" + baseNames[12]);
				break;
			case "coloredDoorItem14":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[13]);
				super.setUnlocalizedName("door_colored_" + baseNames[13]);
				break;
			case "coloredDoorItem15":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[14]);
				super.setUnlocalizedName("door_colored_" + baseNames[14]);
				break;
			case "coloredDoorItem16":
				super.setTextureName(Constants.TEXTURE_PREFIX + "door_colored_" + baseNames[15]);
				super.setUnlocalizedName("door_colored_" + baseNames[15]);
				break;
		}
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float p_77648_8_, float p_77648_9_,
			float p_77648_10_) {
		if (side != 1) {
			return false;
		} else {
			++y;
			Block block = null;

			switch(doorType){
				case "coloredDoorItem1":
					block = Blocks_Main.coloredDoors1;
					break;
				case "coloredDoorItem2":
					block = Blocks_Main.coloredDoors2;
					break;
				case "coloredDoorItem3":
					block = Blocks_Main.coloredDoors3;
					break;
				case "coloredDoorItem4":
					block = Blocks_Main.coloredDoors4;
					break;
				case "coloredDoorItem5":
					block = Blocks_Main.coloredDoors5;
					break;
				case "coloredDoorItem6":
					block = Blocks_Main.coloredDoors6;
					break;
				case "coloredDoorItem7":
					block = Blocks_Main.coloredDoors7;
					break;
				case "coloredDoorItem8":
					block = Blocks_Main.coloredDoors8;
					break;
				case "coloredDoorItem9":
					block = Blocks_Main.coloredDoors9;
					break;
				case "coloredDoorItem10":
					block = Blocks_Main.coloredDoors10;
					break;
				case "coloredDoorItem11":
					block = Blocks_Main.coloredDoors11;
					break;
				case "coloredDoorItem12":
					block = Blocks_Main.coloredDoors12;
					break;
				case "coloredDoorItem13":
					block = Blocks_Main.coloredDoors13;
					break;
				case "coloredDoorItem14":
					block = Blocks_Main.coloredDoors14;
					break;
				case "coloredDoorItem15":
					block = Blocks_Main.coloredDoors15;
					break;
				case "coloredDoorItem16":
					block = Blocks_Main.coloredDoors16;
					break;
			}

			if (player.canPlayerEdit(z, y, z, side, stack) && player.canPlayerEdit(x, y + 1, z, side, stack)) {
				if (!block.canPlaceBlockAt(world, x, y, z)) {
					return false;
				} else {
					int i1 = MathHelper.floor_double((player.rotationYaw + 180.0F) * 4.0F / 360.0F - 0.5D) & 3;
					placeDoorBlock(world, x, y, z, i1, block);
					--stack.stackSize;
					return true;
				}
			} else {
				return false;
			}
		}
	}

	public static void placeDoorBlock(World world, int x, int y, int z, int side, Block block) {
		byte b0 = 0;
		byte b1 = 0;

		if (side == 0) {
			b1 = 1;
		}

		if (side == 1) {
			b0 = -1;
		}

		if (side == 2) {
			b1 = -1;
		}

		if (side == 3) {
			b0 = 1;
		}

		int i1 = (world.getBlock(x - b0, y, z - b1).isNormalCube() ? 1 : 0) + (world.getBlock(x - b0, y + 1, z - b1).isNormalCube() ? 1 : 0);
		int j1 = (world.getBlock(x + b0, y, z + b1).isNormalCube() ? 1 : 0) + (world.getBlock(x + b0, y + 1, z + b1).isNormalCube() ? 1 : 0);
		boolean flag = world.getBlock(x - b0, y, z - b1) == block || world.getBlock(x - b0, y + 1, z - b1) == block;
		boolean flag1 = world.getBlock(x + b0, y, z + b1) == block || world.getBlock(x + b0, y + 1, z + b1) == block;
		boolean flag2 = false;

		if (flag && !flag1) {
			flag2 = true;
		} else if (j1 > i1) {
			flag2 = true;
		}

		world.setBlock(x, y, z, block, side, 2);
		world.setBlock(x, y + 1, z, block, 8 | (flag2 ? 1 : 0), 2);
		world.notifyBlocksOfNeighborChange(x, y, z, block);
		world.notifyBlocksOfNeighborChange(x, y + 1, z, block);
	}

}