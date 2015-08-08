package com.mjr.vanillaExpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.items.slabs.BlackStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.BlackWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.BlueStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.BlueWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.BrownStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.BrownWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.ClayItemSlab;
import com.mjr.vanillaExpansion.items.slabs.CoalBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.CyanStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.CyanWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.DiamondBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.DirtBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.EmeraldBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.GlowstoneBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.GoldBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.GrayStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.GrayWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.GreenStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.GreenWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.HardenClayItemSlab;
import com.mjr.vanillaExpansion.items.slabs.IceBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.IronBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.LapisBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.LightBlueStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.LightBlueWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.LightGrayStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.LightGrayWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.LimeStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.LimeWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.MagentaStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.MagentaWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.NetherrackBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.OrangeStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.OrangeWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.PackedIcestoneBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.PinkStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.PinkWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.PurpleStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.PurpleWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.RedSandItemSlab;
import com.mjr.vanillaExpansion.items.slabs.RedStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.RedWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.RedstoneBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.SandItemSlab;
import com.mjr.vanillaExpansion.items.slabs.WhiteStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.WhiteWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.YellowStainedClayBlockItemSlab;
import com.mjr.vanillaExpansion.items.slabs.YellowWoolBlockItemSlab;

import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks_Main {

	public static Block sandHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "sandhalfslab", "sand");
	public static Block sandDoubleSlab = new BasicSlab(true, null, "sandfullslab", "sand");

	public static Block redSandHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "redSandhalfslab", "red_sand");
	public static Block redSandDoubleSlab = new BasicSlab(true, null, "redSandfullslab", "red_sand");

	public static Block goldBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "goldBlockhalfslab", "gold_block");
	public static Block goldBlockDoubleSlab = new BasicSlab(true, null, "goldBlockfullslab", "gold_block");

	public static Block diamondBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "diamondBlockhalfslab", "diamond_block");
	public static Block diamondBlockDoubleSlab = new BasicSlab(true, null, "diamondBlockfullslab", "diamond_block");

	public static Block ironBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "ironBlockhalfslab", "iron_block");
	public static Block ironBlockDoubleSlab = new BasicSlab(true, null, "ironBlockfullslab", "iron_block");

	public static Block coalBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "coalBlockhalfslab", "coal_block");
	public static Block coalBlockDoubleSlab = new BasicSlab(true, null, "coalBlockfullslab", "coal_block");

	public static Block lapisBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "lapisBlockhalfslab", "lapis_block");
	public static Block lapisBlockDoubleSlab = new BasicSlab(true, null, "lapisBlockfullslab", "lapis_block");

	public static Block emeraldBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "emeraldBlockhalfSlab", "emerald_block");
	public static Block emeraldBlockDoubleSlab = new BasicSlab(true, null, "emeraldBlockfullslab", "emerald_block");

	public static Block netherrackBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "netherrackBlockhalfslab", "netherrack");
	public static Block netherrackBlockDoubleSlab = new BasicSlab(true, null, "netherrackBlockfullslab", "netherrack");

	public static Block redstoneBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "redstoneBlockhalfslab", "redstone_block");
	public static Block redstoneBlockDoubleSlab = new BasicSlab(true, null, "redstoneBlockfullslab", "redstone_block");

	public static Block glowstoneBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "glowstoneBlockhalfSlab", "glowstone");
	public static Block glowstoneBlockDoubleSlab = new BasicSlab(true, null, "glowstoneBlockfullslab", "glowstone");

	public static Block packedIceBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "packedIceBlockhalfslab", "ice_packed");
	public static Block packedIceBlockDoubleSlab = new BasicSlab(true, null, "packedIceBlockfullslab", "ice_packed");

	public static Block iceBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "iceBlockhalfslab", "ice");
	public static Block iceBlockDoubleSlab = new BasicSlab(true, null, "iceBlockfullslab", "ice");

	public static Block whiteWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "whiteWoolBlockhalfslab", "wool_colored_white");
	public static Block whiteWoolBlockDoubleSlab = new BasicSlab(true, null, "whiteWoolBlockfullslab", "wool_colored_white");

	public static Block orangeWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "orangeWoolBlockhalfslab", "wool_colored_orange");
	public static Block orangeWoolBlockDoubleSlab = new BasicSlab(true, null, "orangeWoolBlockfullslab", "wool_colored_orange");

	public static Block magentaWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "magentaWoolBlockhalfslab", "wool_colored_magenta");
	public static Block magentaWoolBlockDoubleSlab = new BasicSlab(true, null, "magentaWoolBlockfullslab", "wool_colored_magenta");

	public static Block lightBlueWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "lightBlueWoolBlockhalfslab", "wool_colored_light_blue");
	public static Block lightBlueWoolBlockDoubleSlab = new BasicSlab(true, null, "lightBlueWoolBlockfullslab", "wool_colored_light_blue");

	public static Block yellowWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "yellowWoolBlockhalfslab", "wool_colored_yellow");
	public static Block yellowWoolBlockDoubleSlab = new BasicSlab(true, null, "yellowWoolBlockfullslab", "wool_colored_yellow");

	public static Block limeWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "limeWoolBlockhalfslab", "wool_colored_lime");
	public static Block limeWoolBlockDoubleSlab = new BasicSlab(true, null, "limeWoolBlockfullslab", "wool_colored_lime");

	public static Block pinkWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "pinkWoolBlockhalfslab", "wool_colored_pink");
	public static Block pinkWoolBlockDoubleSlab = new BasicSlab(true, null, "pinkWoolBlockfullslab", "wool_colored_pink");

	public static Block grayWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "grayWoolBlockhalfslab", "wool_colored_gray");
	public static Block grayWoolBlockDoubleSlab = new BasicSlab(true, null, "grayWoolBlockfullslab", "wool_colored_gray");

	public static Block lightGrayWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "lightGrayWoolBlockhalfslab", "wool_colored_silver");
	public static Block lightGrayWoolBlockDoubleSlab = new BasicSlab(true, null, "lightGrayWoolBlockfullslab", "wool_colored_silver");

	public static Block cyanWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "cyanWoolBlockhalfslab", "wool_colored_cyan");
	public static Block cyanWoolBlockDoubleSlab = new BasicSlab(true, null, "cyanWoolBlockfullslab", "wool_colored_cyan");

	public static Block purpleWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "purpleWoolBlockhalfslab", "wool_colored_purple");
	public static Block purpleWoolBlockDoubleSlab = new BasicSlab(true, null, "purpleWoolBlockfullslab", "wool_colored_purple");

	public static Block blueWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "blueWoolBlockhalfslab", "wool_colored_blue");
	public static Block blueWoolBlockDoubleSlab = new BasicSlab(true, null, "blueWoolBlockfullslab", "wool_colored_blue");

	public static Block brownWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "brownWoolBlockhalfslab", "wool_colored_brown");
	public static Block brownWoolBlockDoubleSlab = new BasicSlab(true, null, "brownWoolBlockfullslab", "wool_colored_brown");

	public static Block greenWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "greenWoolBlockhalfslab", "wool_colored_green");
	public static Block greenWoolBlockDoubleSlab = new BasicSlab(true, null, "greenWoolBlockfullslab", "wool_colored_green");

	public static Block redWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "redWoolBlockhalfslab", "wool_colored_red");
	public static Block redWoolBlockDoubleSlab = new BasicSlab(true, null, "redWoolBlockfullslab", "wool_colored_red");

	public static Block blackWoolBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "blackWoolBlockhalfslab", "wool_colored_black");
	public static Block blackWoolBlockDoubleSlab = new BasicSlab(true, null, "blackWoolBlockfullslab", "wool_colored_black");

	public static Block dirtBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "dirtBlockhalfslab", "dirt");
	public static Block dirtBlockDoubleSlab = new BasicSlab(true, null, "dirtBlockfullslab", "dirt");

	public static Block clayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "claykhalfslab", "clay");
	public static Block clayDoubleSlab = new BasicSlab(true, null, "clayfullslab", "clay");

	public static Block hardenClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "hardenClayHalfSlab", "hardened_clay");
	public static Block hardenClayDoubleSlab = new BasicSlab(true, null, "hardenClayfullslab", "hardened_clay");

	public static Block whiteStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "whiteStainedClayHalfSlab", "hardened_clay_stained_white");
	public static Block whiteStainedClayDoubleSlab = new BasicSlab(true, null, "whiteStainedClayfullslab", "hardened_clay_stained_white");

	public static Block orangeStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "orangeStainedClayHalfSlab", "hardened_clay_stained_orange");
	public static Block orangeStainedClayDoubleSlab = new BasicSlab(true, null, "orangeStainedClayfullslab", "hardened_clay_stained_orange");

	public static Block magentaStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "magentaStainedClayHalfSlab", "hardened_clay_stained_magenta");
	public static Block magentaStainedClayDoubleSlab = new BasicSlab(true, null, "magentaStainedClayfullslab", "hardened_clay_stained_magenta");

	public static Block lightBlueStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "lightBlueStainedClayHalfSlab",
			"hardened_clay_stained_light_blue");
	public static Block lightBlueStainedClayDoubleSlab = new BasicSlab(true, null, "lightBlueStainedClayfullslab", "hardened_clay_stained_light_blue");

	public static Block yellowStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "yellowStainedClayHalfSlab", "hardened_clay_stained_yellow");
	public static Block yellowStainedClayDoubleSlab = new BasicSlab(true, null, "yellowStainedClayfullslab", "hardened_clay_stained_yellow");

	public static Block limeStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "limeStainedClayHalfSlab", "hardened_clay_stained_lime");
	public static Block limeStainedClayDoubleSlab = new BasicSlab(true, null, "limeStainedClayfullslab", "hardened_clay_stained_lime");

	public static Block pinkStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "pinkStainedClayHalfSlab", "hardened_clay_stained_pink");
	public static Block pinkStainedClayDoubleSlab = new BasicSlab(true, null, "dpinkStainedClayfullslab", "hardened_clay_stained_pink");

	public static Block grayStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "grayStainedClayHalfSlab", "hardened_clay_stained_gray");
	public static Block grayStainedClayDoubleSlab = new BasicSlab(true, null, "grayStainedClayfullslab", "hardened_clay_stained_gray");

	public static Block lightGrayStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "lightGrayStainedClayHalfSlab",
			"hardened_clay_stained_silver");
	public static Block lightGrayStainedClayDoubleSlab = new BasicSlab(true, null, "lightGrayStainedClayfullslab", "hardened_clay_stained_silver");

	public static Block cyanStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "cyanStainedClayHalfSlab", "hardened_clay_stained_cyan");
	public static Block cyanStainedClayDoubleSlab = new BasicSlab(true, null, "cyanStainedClayfullslab", "hardened_clay_stained_cyan");

	public static Block purpleStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "purpleStainedClayHalfSlab", "hardened_clay_stained_purple");
	public static Block purpleStainedClayDoubleSlab = new BasicSlab(true, null, "purpleStainedClayfullslab", "hardened_clay_stained_purple");

	public static Block blueStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "blueStainedClayHalfSlab", "hardened_clay_stained_blue");
	public static Block blueStainedClayDoubleSlab = new BasicSlab(true, null, "blueStainedClayfullslab", "hardened_clay_stained_blue");

	public static Block brownStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "brownStainedClayHalfSlab", "hardened_clay_stained_brown");
	public static Block brownStainedClayDoubleSlab = new BasicSlab(true, null, "brownStainedClayfullslab", "hardened_clay_stained_brown");

	public static Block greenStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "greenStainedClayHalfSlab", "hardened_clay_stained_green");
	public static Block greenStainedClayDoubleSlab = new BasicSlab(true, null, "greenStainedClayfullslab", "hardened_clay_stained_green");

	public static Block redStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "redStainedClayHalfSlab", "hardened_clay_stained_red");
	public static Block redStainedClayDoubleSlab = new BasicSlab(true, null, "redStainedClayfullslab", "hardened_clay_stained_red");

	public static Block blackStainedClayHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "blackStainedClayHalfSlab", "hardened_clay_stained_black");
	public static Block blackStainedClayDoubleSlab = new BasicSlab(true, null, "blackStainedClayfullslab", "hardened_clay_stained_black");

	public static Block sandStairs = new BasicStairs(Blocks.sand, 0, "sandStairs");
	public static Block redSandStairs = new BasicStairs(Blocks.sand, 1, "redSandStairs");
	public static Block goldBlockStairs = new BasicStairs(Blocks.gold_block, 0, "goldBlockStairs");
	public static Block diamondBlockStairs = new BasicStairs(Blocks.diamond_block, 0, "diamondBlockStairs");
	public static Block ironBlockStairs = new BasicStairs(Blocks.iron_block, 0, "ironBlockStairs");
	public static Block coalBlockStairs = new BasicStairs(Blocks.coal_block, 0, "coalBlockStairs");
	public static Block lapisBlockStairs = new BasicStairs(Blocks.lapis_block, 0, "lapisBlockStairs");
	public static Block emeraldBlockStairs = new BasicStairs(Blocks.emerald_block, 0, "emeraldBlockStairs");
	public static Block netherrackBlockStairs = new BasicStairs(Blocks.netherrack, 0, "netherrackBlockStairs");
	public static Block redstoneBlockStairs = new BasicStairs(Blocks.redstone_block, 0, "redstoneBlockStairs");

	public static Block glowstoneBlockStairs = new BasicStairs(Blocks.glowstone, 0, "glowstoneBlockStairs");
	public static Block packedIceBlockStairs = new BasicStairs(Blocks.packed_ice, 0, "packedIceBlockStairs");
	public static Block iceBlockStairs = new BasicStairs(Blocks.ice, 0, "iceBlockStairs");

	public static Block whiteWoolBlockStairs = new BasicStairs(Blocks.wool, 0, "whiteWoolBlockStairs");
	public static Block orangeWoolBlockStairs = new BasicStairs(Blocks.wool, 1, "orangeWoolBlockStairs");
	public static Block magentaWoolBlockStairs = new BasicStairs(Blocks.wool, 2, "magentaWoolBlockStairs");
	public static Block lightBlueWoolBlockStairs = new BasicStairs(Blocks.wool, 3, "lightBlueWoolBlockStairs");
	public static Block yellowWoolBlockStairs = new BasicStairs(Blocks.wool, 4, "yellowWoolBlockStairs");
	public static Block limeWoolBlockStairs = new BasicStairs(Blocks.wool, 5, "limeWoolBlockStairs");
	public static Block pinkWoolBlockStairs = new BasicStairs(Blocks.wool, 6, "pinkWoolBlockStairs");
	public static Block grayWoolBlockStairs = new BasicStairs(Blocks.wool, 7, "grayWoolBlockStairs");
	public static Block lightGrayWoolBlockStairs = new BasicStairs(Blocks.wool, 8, "lightGrayWoolBlockStairs");
	public static Block cyanWoolBlockStairs = new BasicStairs(Blocks.wool, 8, "cyanWoolBlockStairs");
	public static Block purpleWoolBlockStairs = new BasicStairs(Blocks.wool, 10, "purpleWoolBlockStairs");
	public static Block blueWoolBlockStairs = new BasicStairs(Blocks.wool, 11, "blueWoolBlockStairs");
	public static Block brownWoolBlockStairs = new BasicStairs(Blocks.wool, 12, "brownWoolBlockStairs");
	public static Block greenWoolBlockStairs = new BasicStairs(Blocks.wool, 13, "greenWoolBlockStairs");
	public static Block redWoolBlockStairs = new BasicStairs(Blocks.wool, 14, "redWoolBlockStairs");
	public static Block blackWoolBlockStairs = new BasicStairs(Blocks.wool, 15, "blackWoolBlockStairs");

	public static Block dirtStairs = new BasicStairs(Blocks.dirt, 0, "dirtStairs");

	public static Block clayStairs = new BasicStairs(Blocks.clay, 0, "clayStairs");
	public static Block hardenClayStairs = new BasicStairs(Blocks.hardened_clay, 0, "hardenClayStairs");
	public static Block whiteStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 0, "whiteStainedClayStairs");
	public static Block orangeStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 1, "orangeStainedClayStairs");
	public static Block magentaStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 2, "magentaStainedClayStairs");
	public static Block lightBlueStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 3, "lightBlueStainedClayStairs");
	public static Block yellowStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 4, "yellowStainedClayStairs");
	public static Block limeStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 5, "limeStainedClayStairs");
	public static Block pinkStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 6, "pinkStainedClayStairs");
	public static Block grayStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 7, "grayStainedClayStairs");
	public static Block lightGrayStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 8, "lightGrayStainedClayStairs");
	public static Block cyanStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 9, "cyanStainedClayStairs");
	public static Block purpleStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 10, "purpleStainedClayStairs");
	public static Block blueStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 11, "blueStainedClayStairs");
	public static Block brownStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 12, "brownStainedClayStairs");
	public static Block greenStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 13, "greenStainedClayStairs");
	public static Block redStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 14, "redStainedClayStairs");
	public static Block blackStainedClayStairs = new BasicStairs(Blocks.stained_hardened_clay, 15, "BlackStainedClayStairs");

	public static Block goldDoor = new BlockCustomDoor().setBlockName("goldDoor").setBlockTextureName(Constants.TEXTURE_PREFIX + "goldDoor");
	public static Block diamondDoor = new BlockCustomDoor().setBlockName("diamondDoor").setBlockTextureName(Constants.TEXTURE_PREFIX + "diamondDoor");
	
	public static Block darkOakDoor = new BlockCustomDoor().setBlockName("darkOakDoor").setBlockTextureName(Constants.TEXTURE_PREFIX + "door_dark_oak");
	public static Block spruceDoor = new BlockCustomDoor().setBlockName("spruceDoor").setBlockTextureName(Constants.TEXTURE_PREFIX + "door_spruce");
	public static Block jungleDoor = new BlockCustomDoor().setBlockName("jungleDoor").setBlockTextureName(Constants.TEXTURE_PREFIX + "door_jungle");
	public static Block acaciaDoor = new BlockCustomDoor().setBlockName("acaciaDoor").setBlockTextureName(Constants.TEXTURE_PREFIX + "door_acacia");
	public static Block birchDoor = new BlockCustomDoor().setBlockName("birchDoor").setBlockTextureName(Constants.TEXTURE_PREFIX + "door_birch");
	
	public static void init() {
		registerBlocks();
		registerSlabsAndStairs();
	}
	
	private static void registerBlocks() {
		GameRegistry.registerBlock(goldDoor, "goldDoor");
		GameRegistry.registerBlock(diamondDoor, "diamondDoor");
		
		GameRegistry.registerBlock(darkOakDoor, "darkOakDoor");
		GameRegistry.registerBlock(spruceDoor, "spruceDoor");
		GameRegistry.registerBlock(jungleDoor, "jungleDoor");
		GameRegistry.registerBlock(acaciaDoor, "acaciaDoor");
		GameRegistry.registerBlock(birchDoor, "birchDoor");
	}

	private static void registerSlabsAndStairs() {
		GameRegistry.registerBlock(sandHalfSlab, SandItemSlab.class, "sandhalfslab");
		GameRegistry.registerBlock(sandDoubleSlab, SandItemSlab.class, "sandfullslab");

		GameRegistry.registerBlock(redSandHalfSlab, RedSandItemSlab.class, "redSandhalfslab");
		GameRegistry.registerBlock(redSandDoubleSlab, RedSandItemSlab.class, "redSandfullslab");

		GameRegistry.registerBlock(goldBlockHalfSlab, GoldBlockItemSlab.class, "goldBlockhalfslab");
		GameRegistry.registerBlock(goldBlockDoubleSlab, GoldBlockItemSlab.class, "goldBlockfullslab");

		GameRegistry.registerBlock(diamondBlockHalfSlab, DiamondBlockItemSlab.class, "diamondhalfslab");
		GameRegistry.registerBlock(diamondBlockDoubleSlab, DiamondBlockItemSlab.class, "diamondfullslab");

		GameRegistry.registerBlock(ironBlockHalfSlab, IronBlockItemSlab.class, "ironhalfslab");
		GameRegistry.registerBlock(ironBlockDoubleSlab, IronBlockItemSlab.class, "ironfullslab");

		GameRegistry.registerBlock(coalBlockHalfSlab, CoalBlockItemSlab.class, "coalhalfslab");
		GameRegistry.registerBlock(coalBlockDoubleSlab, CoalBlockItemSlab.class, "coalfullslab");

		GameRegistry.registerBlock(lapisBlockHalfSlab, LapisBlockItemSlab.class, "lapishalfslab");
		GameRegistry.registerBlock(lapisBlockDoubleSlab, LapisBlockItemSlab.class, "lapisfullslab");

		GameRegistry.registerBlock(emeraldBlockHalfSlab, EmeraldBlockItemSlab.class, "emeraldhalfslab");
		GameRegistry.registerBlock(emeraldBlockDoubleSlab, EmeraldBlockItemSlab.class, "emeraldfullslab");

		GameRegistry.registerBlock(netherrackBlockHalfSlab, NetherrackBlockItemSlab.class, "netherrackhalfslab");
		GameRegistry.registerBlock(netherrackBlockDoubleSlab, NetherrackBlockItemSlab.class, "netherrackfullslab");

		GameRegistry.registerBlock(redstoneBlockHalfSlab, RedstoneBlockItemSlab.class, "redstonehalfslab");
		GameRegistry.registerBlock(redstoneBlockDoubleSlab, RedstoneBlockItemSlab.class, "redstonefullslab");

		GameRegistry.registerBlock(glowstoneBlockHalfSlab, GlowstoneBlockItemSlab.class, "glowstoneBlockhalfSlab");
		GameRegistry.registerBlock(glowstoneBlockDoubleSlab, GlowstoneBlockItemSlab.class, "glowstonefullslab");

		GameRegistry.registerBlock(packedIceBlockHalfSlab, PackedIcestoneBlockItemSlab.class, "packedIcehalfslab");
		GameRegistry.registerBlock(packedIceBlockDoubleSlab, PackedIcestoneBlockItemSlab.class, "packedIcefullslab");

		GameRegistry.registerBlock(iceBlockHalfSlab, IceBlockItemSlab.class, "icehalfslab");
		GameRegistry.registerBlock(iceBlockDoubleSlab, IceBlockItemSlab.class, "icefullslab");

		GameRegistry.registerBlock(whiteWoolBlockHalfSlab, WhiteWoolBlockItemSlab.class, "whiteWoolhalfslab");
		GameRegistry.registerBlock(whiteWoolBlockDoubleSlab, WhiteWoolBlockItemSlab.class, "whiteWoolfullslab");

		GameRegistry.registerBlock(orangeWoolBlockHalfSlab, OrangeWoolBlockItemSlab.class, "orangeWoolhalfslab");
		GameRegistry.registerBlock(orangeWoolBlockDoubleSlab, OrangeWoolBlockItemSlab.class, "orangeWoolfullslab");

		GameRegistry.registerBlock(magentaWoolBlockHalfSlab, MagentaWoolBlockItemSlab.class, "magentaWoolhalfslab");
		GameRegistry.registerBlock(magentaWoolBlockDoubleSlab, MagentaWoolBlockItemSlab.class, "magentaWoolfullslab");

		GameRegistry.registerBlock(lightBlueWoolBlockHalfSlab, LightBlueWoolBlockItemSlab.class, "lightBlueWoolhalfslab");
		GameRegistry.registerBlock(lightBlueWoolBlockDoubleSlab, LightBlueWoolBlockItemSlab.class, "lightBlueWoolfullslab");

		GameRegistry.registerBlock(yellowWoolBlockHalfSlab, YellowWoolBlockItemSlab.class, "yellowWoolhalfslab");
		GameRegistry.registerBlock(yellowWoolBlockDoubleSlab, YellowWoolBlockItemSlab.class, "yellowWoolfullslab");

		GameRegistry.registerBlock(limeWoolBlockHalfSlab, LimeWoolBlockItemSlab.class, "limeWoolhalfslab");
		GameRegistry.registerBlock(limeWoolBlockDoubleSlab, LimeWoolBlockItemSlab.class, "limeWoolfullslab");

		GameRegistry.registerBlock(pinkWoolBlockHalfSlab, PinkWoolBlockItemSlab.class, "pinkWoolhalfslab");
		GameRegistry.registerBlock(pinkWoolBlockDoubleSlab, PinkWoolBlockItemSlab.class, "pinkWoolfullslab");

		GameRegistry.registerBlock(grayWoolBlockHalfSlab, GrayWoolBlockItemSlab.class, "grayWoolhalfslab");
		GameRegistry.registerBlock(grayWoolBlockDoubleSlab, GrayWoolBlockItemSlab.class, "grayWoolfullslab");

		GameRegistry.registerBlock(lightGrayWoolBlockHalfSlab, LightGrayWoolBlockItemSlab.class, "lightGrayWoolhalfslab");
		GameRegistry.registerBlock(lightGrayWoolBlockDoubleSlab, LightGrayWoolBlockItemSlab.class, "lightGrayWoolfullslab");

		GameRegistry.registerBlock(cyanWoolBlockHalfSlab, CyanWoolBlockItemSlab.class, "cyanWoolhalfslab");
		GameRegistry.registerBlock(cyanWoolBlockDoubleSlab, CyanWoolBlockItemSlab.class, "cyanWoolfullslab");

		GameRegistry.registerBlock(purpleWoolBlockHalfSlab, PurpleWoolBlockItemSlab.class, "purpleWoolhalfslab");
		GameRegistry.registerBlock(purpleWoolBlockDoubleSlab, PurpleWoolBlockItemSlab.class, "purpleWoolfullslab");

		GameRegistry.registerBlock(blueWoolBlockHalfSlab, BlueWoolBlockItemSlab.class, "blueWoolhalfslab");
		GameRegistry.registerBlock(blueWoolBlockDoubleSlab, BlueWoolBlockItemSlab.class, "blueWoolfullslab");

		GameRegistry.registerBlock(brownWoolBlockHalfSlab, BrownWoolBlockItemSlab.class, "brownWoolhalfslab");
		GameRegistry.registerBlock(brownWoolBlockDoubleSlab, BrownWoolBlockItemSlab.class, "brownWoolfullslab");

		GameRegistry.registerBlock(greenWoolBlockHalfSlab, GreenWoolBlockItemSlab.class, "greenWoolhalfslab");
		GameRegistry.registerBlock(greenWoolBlockDoubleSlab, GreenWoolBlockItemSlab.class, "greenWoolfullslab");

		GameRegistry.registerBlock(redWoolBlockHalfSlab, RedWoolBlockItemSlab.class, "redWoolhalfslab");
		GameRegistry.registerBlock(redWoolBlockDoubleSlab, RedWoolBlockItemSlab.class, "redWoolfullslab");

		GameRegistry.registerBlock(blackWoolBlockHalfSlab, BlackWoolBlockItemSlab.class, "blackWoolhalfslab");
		GameRegistry.registerBlock(blackWoolBlockDoubleSlab, BlackWoolBlockItemSlab.class, "blackWoolfullslab");

		GameRegistry.registerBlock(dirtBlockHalfSlab, DirtBlockItemSlab.class, "dirthalfslab");
		GameRegistry.registerBlock(dirtBlockDoubleSlab, DirtBlockItemSlab.class, "dirtfullslab");

		GameRegistry.registerBlock(clayHalfSlab, ClayItemSlab.class, "clayHalfSlab");
		GameRegistry.registerBlock(clayDoubleSlab, ClayItemSlab.class, "clayDoubleSlab");

		GameRegistry.registerBlock(hardenClayHalfSlab, HardenClayItemSlab.class, "hardenClayHalfSlab");
		GameRegistry.registerBlock(hardenClayDoubleSlab, HardenClayItemSlab.class, "hardenClayDoubleSlab");

		GameRegistry.registerBlock(whiteStainedClayHalfSlab, WhiteStainedClayBlockItemSlab.class, "whiteStainedClayHalfSlab");
		GameRegistry.registerBlock(whiteStainedClayDoubleSlab, WhiteStainedClayBlockItemSlab.class, "whiteStainedClayDoubleSlab");

		GameRegistry.registerBlock(orangeStainedClayHalfSlab, OrangeStainedClayBlockItemSlab.class, "orangeStainedClayHalfSlab");
		GameRegistry.registerBlock(orangeStainedClayDoubleSlab, OrangeStainedClayBlockItemSlab.class, "orangeStainedClayDoubleSlab");

		GameRegistry.registerBlock(magentaStainedClayHalfSlab, MagentaStainedClayBlockItemSlab.class, "magentaStainedClayHalfSlab");
		GameRegistry.registerBlock(magentaStainedClayDoubleSlab, MagentaStainedClayBlockItemSlab.class, "magentaStainedClayDoubleSlab");

		GameRegistry.registerBlock(lightBlueStainedClayHalfSlab, LightBlueStainedClayBlockItemSlab.class, "lightBlueStainedClayHalfSlab");
		GameRegistry.registerBlock(lightBlueStainedClayDoubleSlab, LightBlueStainedClayBlockItemSlab.class, "lightBlueStainedClayDoubleSlab");

		GameRegistry.registerBlock(yellowStainedClayHalfSlab, YellowStainedClayBlockItemSlab.class, "yellowStainedClayHalfSlab");
		GameRegistry.registerBlock(yellowStainedClayDoubleSlab, YellowStainedClayBlockItemSlab.class, "yellowStainedClayDoubleSlab");

		GameRegistry.registerBlock(limeStainedClayHalfSlab, LimeStainedClayBlockItemSlab.class, "limeStainedClayHalfSlab");
		GameRegistry.registerBlock(limeStainedClayDoubleSlab, PinkStainedClayBlockItemSlab.class, "limeStainedClayDoubleSlab");

		GameRegistry.registerBlock(pinkStainedClayHalfSlab, PinkStainedClayBlockItemSlab.class, "pinkStainedClayHalfSlab");
		GameRegistry.registerBlock(pinkStainedClayDoubleSlab, PinkStainedClayBlockItemSlab.class, "pinkStainedClayDoubleSlab");

		GameRegistry.registerBlock(grayStainedClayHalfSlab, GrayStainedClayBlockItemSlab.class, "grayStainedClayHalfSlab");
		GameRegistry.registerBlock(grayStainedClayDoubleSlab, GrayStainedClayBlockItemSlab.class, "grayStainedClayDoubleSlab");

		GameRegistry.registerBlock(lightGrayStainedClayHalfSlab, LightGrayStainedClayBlockItemSlab.class, "lightGrayStainedClayHalfSlab");
		GameRegistry.registerBlock(lightGrayStainedClayDoubleSlab, LightGrayStainedClayBlockItemSlab.class, "lightGrayStainedClayDoubleSlab");

		GameRegistry.registerBlock(cyanStainedClayHalfSlab, CyanStainedClayBlockItemSlab.class, "cyanStainedClayHalfSlab");
		GameRegistry.registerBlock(cyanStainedClayDoubleSlab, CyanStainedClayBlockItemSlab.class, "cyanStainedClayDoubleSlab");

		GameRegistry.registerBlock(purpleStainedClayHalfSlab, PurpleStainedClayBlockItemSlab.class, "purpleStainedClayHalfSlab");
		GameRegistry.registerBlock(purpleStainedClayDoubleSlab, PurpleStainedClayBlockItemSlab.class, "purpleStainedClayDoubleSlab");

		GameRegistry.registerBlock(blueStainedClayHalfSlab, BlueStainedClayBlockItemSlab.class, "blueStainedClayHalfSlab");
		GameRegistry.registerBlock(blueStainedClayDoubleSlab, BlueStainedClayBlockItemSlab.class, "blueStainedClayDoubleSlab");

		GameRegistry.registerBlock(brownStainedClayHalfSlab, BrownStainedClayBlockItemSlab.class, "brownStainedClayHalfSlab");
		GameRegistry.registerBlock(brownStainedClayDoubleSlab, BrownStainedClayBlockItemSlab.class, "brownStainedClayDoubleSlab");

		GameRegistry.registerBlock(greenStainedClayHalfSlab, GreenStainedClayBlockItemSlab.class, "greenStainedClayHalfSlab");
		GameRegistry.registerBlock(greenStainedClayDoubleSlab, GreenStainedClayBlockItemSlab.class, "greenStainedClayDoubleSlab");

		GameRegistry.registerBlock(redStainedClayHalfSlab, RedStainedClayBlockItemSlab.class, "redStainedClayHalfSlab");
		GameRegistry.registerBlock(redStainedClayDoubleSlab, RedStainedClayBlockItemSlab.class, "redStainedClayDoubleSlab");

		GameRegistry.registerBlock(blackStainedClayHalfSlab, BlackStainedClayBlockItemSlab.class, "blackStainedClayHalfSlab");
		GameRegistry.registerBlock(blackStainedClayDoubleSlab, BlackStainedClayBlockItemSlab.class, "blackStainedClayDoubleSlab");

		GameRegistry.registerBlock(sandStairs, "sandStairs");
		GameRegistry.registerBlock(redSandStairs, "redSandStairs");
		GameRegistry.registerBlock(goldBlockStairs, "goldBlockStairs");
		GameRegistry.registerBlock(diamondBlockStairs, "diamondBlockStairs");
		GameRegistry.registerBlock(ironBlockStairs, "ironBlockStairs");
		GameRegistry.registerBlock(coalBlockStairs, "coalBlockStairs");
		GameRegistry.registerBlock(lapisBlockStairs, "lapisBlockStairs");
		GameRegistry.registerBlock(emeraldBlockStairs, "emeraldBlockStairs");
		GameRegistry.registerBlock(netherrackBlockStairs, "netherrackBlockStairs");
		GameRegistry.registerBlock(redstoneBlockStairs, "redstoneBlockStairs");

		GameRegistry.registerBlock(glowstoneBlockStairs, "glowstoneBlockStairs");
		GameRegistry.registerBlock(packedIceBlockStairs, "packedIceBlockStairs");
		GameRegistry.registerBlock(iceBlockStairs, "iceBlockStairs");

		GameRegistry.registerBlock(whiteWoolBlockStairs, "whiteWoolBlockStairs");
		GameRegistry.registerBlock(orangeWoolBlockStairs, "orangeWoolBlockStairs");
		GameRegistry.registerBlock(magentaWoolBlockStairs, "magentaWoolBlockStairs");
		GameRegistry.registerBlock(lightBlueWoolBlockStairs, "lightBlueWoolBlockStairs");
		GameRegistry.registerBlock(yellowWoolBlockStairs, "yellowWoolBlockStairs");
		GameRegistry.registerBlock(limeWoolBlockStairs, "limeWoolBlockStairs");
		GameRegistry.registerBlock(pinkWoolBlockStairs, "pinkWoolBlockStairs");
		GameRegistry.registerBlock(grayWoolBlockStairs, "grayWoolBlockStairs");
		GameRegistry.registerBlock(lightGrayWoolBlockStairs, "lightGrayWoolBlockStairs");
		GameRegistry.registerBlock(cyanWoolBlockStairs, "cyanWoolBlockStairs");
		GameRegistry.registerBlock(purpleWoolBlockStairs, "purpleWoolBlockStairs");
		GameRegistry.registerBlock(blueWoolBlockStairs, "blueWoolBlockStairs");
		GameRegistry.registerBlock(brownWoolBlockStairs, "brownWoolBlockStairs");
		GameRegistry.registerBlock(greenWoolBlockStairs, "greenWoolBlockStairs");
		GameRegistry.registerBlock(redWoolBlockStairs, "redWoolBlockStairs");
		GameRegistry.registerBlock(blackWoolBlockStairs, "blackWoolBlockStairs");

		GameRegistry.registerBlock(dirtStairs, "dirtStairs");

		GameRegistry.registerBlock(clayStairs, "clayStairs");
		GameRegistry.registerBlock(hardenClayStairs, "hardenClayStairs");
		GameRegistry.registerBlock(whiteStainedClayStairs, "whiteStainedClayStairs");
		GameRegistry.registerBlock(orangeStainedClayStairs, "orangeStainedClayStairs");
		GameRegistry.registerBlock(magentaStainedClayStairs, "magentaStainedClayStairs");
		GameRegistry.registerBlock(lightBlueStainedClayStairs, "lightBlueStainedClayStairs");
		GameRegistry.registerBlock(yellowStainedClayStairs, "yellowStainedClayStairs");
		GameRegistry.registerBlock(limeStainedClayStairs, "limeStainedClayStairs");
		GameRegistry.registerBlock(pinkStainedClayStairs, "pinkStainedClayStairs");
		GameRegistry.registerBlock(grayStainedClayStairs, "grayStainedClayStairs");
		GameRegistry.registerBlock(lightGrayStainedClayStairs, "lightGrayStainedClayStairs");
		GameRegistry.registerBlock(cyanStainedClayStairs, "cyanStainedClayStairs");
		GameRegistry.registerBlock(purpleStainedClayStairs, "purpleStainedClayStairs");
		GameRegistry.registerBlock(blueStainedClayStairs, "blueStainedClayStairs");
		GameRegistry.registerBlock(brownStainedClayStairs, "brownStainedClayStairs");
		GameRegistry.registerBlock(greenStainedClayStairs, "greenStainedClayStairs");
		GameRegistry.registerBlock(redStainedClayStairs, "redStainedClayStairs");
		GameRegistry.registerBlock(blackStainedClayStairs, "blackStainedClayStairs");
	}

}
