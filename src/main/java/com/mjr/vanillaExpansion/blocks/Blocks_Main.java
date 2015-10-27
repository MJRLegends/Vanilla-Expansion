package com.mjr.vanillaExpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlockWithMetadata;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.items.ItemMeta;
import com.mjr.vanillaExpansion.items.Items_Main;
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

	public static Block sandHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "sandHalfSlab", "sand");
	public static Block sandDoubleSlab = new BlockBasicSlab(true, null, "sandFullSlab", "sand");

	public static Block redSandHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "redSandHalfSlab", "red_sand");
	public static Block redSandDoubleSlab = new BlockBasicSlab(true, null, "redSandFullSlab", "red_sand");

	public static Block goldBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "goldBlockHalfSlab", "gold_block");
	public static Block goldBlockDoubleSlab = new BlockBasicSlab(true, null, "goldBlockFullSlab", "gold_block");

	public static Block diamondBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "diamondBlockHalfSlab", "diamond_block");
	public static Block diamondBlockDoubleSlab = new BlockBasicSlab(true, null, "diamondBlockFullSlab", "diamond_block");

	public static Block ironBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "ironBlockHalfSlab", "iron_block");
	public static Block ironBlockDoubleSlab = new BlockBasicSlab(true, null, "ironBlockFullSlab", "iron_block");

	public static Block coalBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "coalBlockHalfSlab", "coal_block");
	public static Block coalBlockDoubleSlab = new BlockBasicSlab(true, null, "coalBlockFullSlab", "coal_block");

	public static Block lapisBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "lapisBlockHalfSlab", "lapis_block");
	public static Block lapisBlockDoubleSlab = new BlockBasicSlab(true, null, "lapisBlockFullSlab", "lapis_block");

	public static Block emeraldBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "emeraldBlockHalfSlab", "emerald_block");
	public static Block emeraldBlockDoubleSlab = new BlockBasicSlab(true, null, "emeraldBlockFullSlab", "emerald_block");

	public static Block netherrackBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "netherrackBlockHalfSlab", "netherrack");
	public static Block netherrackBlockDoubleSlab = new BlockBasicSlab(true, null, "netherrackBlockFullSlab", "netherrack");

	public static Block redstoneBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "redstoneBlockHalfSlab", "redstone_block");
	public static Block redstoneBlockDoubleSlab = new BlockBasicSlab(true, null, "redstoneBlockFullSlab", "redstone_block");

	public static Block glowstoneBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "glowstoneBlockHalfSlab", "glowstone");
	public static Block glowstoneBlockDoubleSlab = new BlockBasicSlab(true, null, "glowstoneBlockFullSlab", "glowstone");

	public static Block packedIceBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "packedIceBlockHalfSlab", "ice_packed");
	public static Block packedIceBlockDoubleSlab = new BlockBasicSlab(true, null, "packedIceBlockFullSlab", "ice_packed");

	public static Block iceBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "iceBlockHalfSlab", "ice");
	public static Block iceBlockDoubleSlab = new BlockBasicSlab(true, null, "iceBlockFullSlab", "ice");

	public static Block whiteWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "whiteWoolBlockHalfSlab", "wool_colored_white");
	public static Block whiteWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "whiteWoolBlockFullSlab", "wool_colored_white");

	public static Block orangeWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "orangeWoolBlockHalfSlab", "wool_colored_orange");
	public static Block orangeWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "orangeWoolBlockFullSlab", "wool_colored_orange");

	public static Block magentaWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "magentaWoolBlockHalfSlab", "wool_colored_magenta");
	public static Block magentaWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "magentaWoolBlockFullSlab", "wool_colored_magenta");

	public static Block lightBlueWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "lightBlueWoolBlockHalfSlab", "wool_colored_light_blue");
	public static Block lightBlueWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "lightBlueWoolBlockFullSlab", "wool_colored_light_blue");

	public static Block yellowWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "yellowWoolBlockHalfSlab", "wool_colored_yellow");
	public static Block yellowWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "yellowWoolBlockFullSlab", "wool_colored_yellow");

	public static Block limeWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "limeWoolBlockHalfSlab", "wool_colored_lime");
	public static Block limeWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "limeWoolBlockFullSlab", "wool_colored_lime");

	public static Block pinkWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "pinkWoolBlockHalfSlab", "wool_colored_pink");
	public static Block pinkWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "pinkWoolBlockFullSlab", "wool_colored_pink");

	public static Block grayWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "grayWoolBlockHalfSlab", "wool_colored_gray");
	public static Block grayWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "grayWoolBlockFullSlab", "wool_colored_gray");

	public static Block lightGrayWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "lightGrayWoolBlockHalfSlab", "wool_colored_silver");
	public static Block lightGrayWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "lightGrayWoolBlockFullSlab", "wool_colored_silver");

	public static Block cyanWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "cyanWoolBlockHalfSlab", "wool_colored_cyan");
	public static Block cyanWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "cyanWoolBlockFullSlab", "wool_colored_cyan");

	public static Block purpleWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "purpleWoolBlockHalfSlab", "wool_colored_purple");
	public static Block purpleWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "purpleWoolBlockFullSlab", "wool_colored_purple");

	public static Block blueWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "blueWoolBlockHalfSlab", "wool_colored_blue");
	public static Block blueWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "blueWoolBlockFullSlab", "wool_colored_blue");

	public static Block brownWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "brownWoolBlockHalfSlab", "wool_colored_brown");
	public static Block brownWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "brownWoolBlockFullSlab", "wool_colored_brown");

	public static Block greenWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "greenWoolBlockHalfSlab", "wool_colored_green");
	public static Block greenWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "greenWoolBlockFullSlab", "wool_colored_green");

	public static Block redWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "redWoolBlockHalfSlab", "wool_colored_red");
	public static Block redWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "redWoolBlockFullSlab", "wool_colored_red");

	public static Block blackWoolBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "blackWoolBlockHalfSlab", "wool_colored_black");
	public static Block blackWoolBlockDoubleSlab = new BlockBasicSlab(true, null, "blackWoolBlockFullSlab", "wool_colored_black");

	public static Block dirtBlockHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "dirtBlockHalfSlab", "dirt");
	public static Block dirtBlockDoubleSlab = new BlockBasicSlab(true, null, "dirtBlockFullSlab", "dirt");

	public static Block clayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "clayHalfSlab", "clay");
	public static Block clayDoubleSlab = new BlockBasicSlab(true, null, "clayFullSlab", "clay");

	public static Block hardenClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "hardenClayHalfSlab", "hardened_clay");
	public static Block hardenClayDoubleSlab = new BlockBasicSlab(true, null, "hardenClayFullSlab", "hardened_clay");

	public static Block whiteStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "whiteStainedClayHalfSlab", "hardened_clay_stained_white");
	public static Block whiteStainedClayDoubleSlab = new BlockBasicSlab(true, null, "whiteStainedClayFullSlab", "hardened_clay_stained_white");

	public static Block orangeStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "orangeStainedClayHalfSlab", "hardened_clay_stained_orange");
	public static Block orangeStainedClayDoubleSlab = new BlockBasicSlab(true, null, "orangeStainedClayFullSlab", "hardened_clay_stained_orange");

	public static Block magentaStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "magentaStainedClayHalfSlab", "hardened_clay_stained_magenta");
	public static Block magentaStainedClayDoubleSlab = new BlockBasicSlab(true, null, "magentaStainedClayFullSlab", "hardened_clay_stained_magenta");

	public static Block lightBlueStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "lightBlueStainedClayHalfSlab",
			"hardened_clay_stained_light_blue");
	public static Block lightBlueStainedClayDoubleSlab = new BlockBasicSlab(true, null, "lightBlueStainedClayFullSlab", "hardened_clay_stained_light_blue");

	public static Block yellowStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "yellowStainedClayHalfSlab", "hardened_clay_stained_yellow");
	public static Block yellowStainedClayDoubleSlab = new BlockBasicSlab(true, null, "yellowStainedClayFullSlab", "hardened_clay_stained_yellow");

	public static Block limeStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "limeStainedClayHalfSlab", "hardened_clay_stained_lime");
	public static Block limeStainedClayDoubleSlab = new BlockBasicSlab(true, null, "limeStainedClayFullSlab", "hardened_clay_stained_lime");

	public static Block pinkStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "pinkStainedClayHalfSlab", "hardened_clay_stained_pink");
	public static Block pinkStainedClayDoubleSlab = new BlockBasicSlab(true, null, "dpinkStainedClayFullSlab", "hardened_clay_stained_pink");

	public static Block grayStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "grayStainedClayHalfSlab", "hardened_clay_stained_gray");
	public static Block grayStainedClayDoubleSlab = new BlockBasicSlab(true, null, "grayStainedClayFullSlab", "hardened_clay_stained_gray");

	public static Block lightGrayStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "lightGrayStainedClayHalfSlab",
			"hardened_clay_stained_silver");
	public static Block lightGrayStainedClayDoubleSlab = new BlockBasicSlab(true, null, "lightGrayStainedClayFullSlab", "hardened_clay_stained_silver");

	public static Block cyanStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "cyanStainedClayHalfSlab", "hardened_clay_stained_cyan");
	public static Block cyanStainedClayDoubleSlab = new BlockBasicSlab(true, null, "cyanStainedClayFullSlab", "hardened_clay_stained_cyan");

	public static Block purpleStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "purpleStainedClayHalfSlab", "hardened_clay_stained_purple");
	public static Block purpleStainedClayDoubleSlab = new BlockBasicSlab(true, null, "purpleStainedClayFullSlab", "hardened_clay_stained_purple");

	public static Block blueStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "blueStainedClayHalfSlab", "hardened_clay_stained_blue");
	public static Block blueStainedClayDoubleSlab = new BlockBasicSlab(true, null, "blueStainedClayFullSlab", "hardened_clay_stained_blue");

	public static Block brownStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "brownStainedClayHalfSlab", "hardened_clay_stained_brown");
	public static Block brownStainedClayDoubleSlab = new BlockBasicSlab(true, null, "brownStainedClayFullSlab", "hardened_clay_stained_brown");

	public static Block greenStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "greenStainedClayHalfSlab", "hardened_clay_stained_green");
	public static Block greenStainedClayDoubleSlab = new BlockBasicSlab(true, null, "greenStainedClayFullSlab", "hardened_clay_stained_green");

	public static Block redStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "redStainedClayHalfSlab", "hardened_clay_stained_red");
	public static Block redStainedClayDoubleSlab = new BlockBasicSlab(true, null, "redStainedClayFullSlab", "hardened_clay_stained_red");

	public static Block blackStainedClayHalfSlab = new BlockBasicSlab(false, CreativeTabs.tabBlock, "blackStainedClayHalfSlab", "hardened_clay_stained_black");
	public static Block blackStainedClayDoubleSlab = new BlockBasicSlab(true, null, "blackStainedClayFullSlab", "hardened_clay_stained_black");

	public static Block sandStairs = new BlockBasicStairs(Blocks.sand, 0, "sandStairs");
	public static Block redSandStairs = new BlockBasicStairs(Blocks.sand, 1, "redSandStairs");
	public static Block goldBlockStairs = new BlockBasicStairs(Blocks.gold_block, 0, "goldBlockStairs");
	public static Block diamondBlockStairs = new BlockBasicStairs(Blocks.diamond_block, 0, "diamondBlockStairs");
	public static Block ironBlockStairs = new BlockBasicStairs(Blocks.iron_block, 0, "ironBlockStairs");
	public static Block coalBlockStairs = new BlockBasicStairs(Blocks.coal_block, 0, "coalBlockStairs");
	public static Block lapisBlockStairs = new BlockBasicStairs(Blocks.lapis_block, 0, "lapisBlockStairs");
	public static Block emeraldBlockStairs = new BlockBasicStairs(Blocks.emerald_block, 0, "emeraldBlockStairs");
	public static Block netherrackBlockStairs = new BlockBasicStairs(Blocks.netherrack, 0, "netherrackBlockStairs");
	public static Block redstoneBlockStairs = new BlockBasicStairs(Blocks.redstone_block, 0, "redstoneBlockStairs");

	public static Block glowstoneBlockStairs = new BlockBasicStairs(Blocks.glowstone, 0, "glowstoneBlockStairs");
	public static Block packedIceBlockStairs = new BlockBasicStairs(Blocks.packed_ice, 0, "packedIceBlockStairs");
	public static Block iceBlockStairs = new BlockBasicStairs(Blocks.ice, 0, "iceBlockStairs");

	public static Block whiteWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 0, "whiteWoolBlockStairs");
	public static Block orangeWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 1, "orangeWoolBlockStairs");
	public static Block magentaWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 2, "magentaWoolBlockStairs");
	public static Block lightBlueWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 3, "lightBlueWoolBlockStairs");
	public static Block yellowWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 4, "yellowWoolBlockStairs");
	public static Block limeWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 5, "limeWoolBlockStairs");
	public static Block pinkWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 6, "pinkWoolBlockStairs");
	public static Block grayWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 7, "grayWoolBlockStairs");
	public static Block lightGrayWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 8, "lightGrayWoolBlockStairs");
	public static Block cyanWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 8, "cyanWoolBlockStairs");
	public static Block purpleWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 10, "purpleWoolBlockStairs");
	public static Block blueWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 11, "blueWoolBlockStairs");
	public static Block brownWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 12, "brownWoolBlockStairs");
	public static Block greenWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 13, "greenWoolBlockStairs");
	public static Block redWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 14, "redWoolBlockStairs");
	public static Block blackWoolBlockStairs = new BlockBasicStairs(Blocks.wool, 15, "blackWoolBlockStairs");

	public static Block dirtStairs = new BlockBasicStairs(Blocks.dirt, 0, "dirtStairs");

	public static Block clayStairs = new BlockBasicStairs(Blocks.clay, 0, "clayStairs");
	public static Block hardenClayStairs = new BlockBasicStairs(Blocks.hardened_clay, 0, "hardenClayStairs");
	public static Block whiteStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 0, "whiteStainedClayStairs");
	public static Block orangeStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 1, "orangeStainedClayStairs");
	public static Block magentaStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 2, "magentaStainedClayStairs");
	public static Block lightBlueStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 3, "lightBlueStainedClayStairs");
	public static Block yellowStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 4, "yellowStainedClayStairs");
	public static Block limeStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 5, "limeStainedClayStairs");
	public static Block pinkStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 6, "pinkStainedClayStairs");
	public static Block grayStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 7, "grayStainedClayStairs");
	public static Block lightGrayStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 8, "lightGrayStainedClayStairs");
	public static Block cyanStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 9, "cyanStainedClayStairs");
	public static Block purpleStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 10, "purpleStainedClayStairs");
	public static Block blueStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 11, "blueStainedClayStairs");
	public static Block brownStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 12, "brownStainedClayStairs");
	public static Block greenStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 13, "greenStainedClayStairs");
	public static Block redStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 14, "redStainedClayStairs");
	public static Block blackStainedClayStairs = new BlockBasicStairs(Blocks.stained_hardened_clay, 15, "blackStainedClayStairs");

	public static Block goldDoor = new BlockCustomDoor("goldDoor", "goldDoor");
	public static Block diamondDoor = new BlockCustomDoor("diamondDoor", "diamondDoor");

	public static Block darkOakDoor = new BlockCustomDoor("darkOakDoor", "door_dark_oak");
	public static Block spruceDoor = new BlockCustomDoor("spruceDoor", "door_spruce");
	public static Block jungleDoor = new BlockCustomDoor("jungleDoor", "door_jungle");
	public static Block acaciaDoor = new BlockCustomDoor("acaciaDoor", "door_acacia");
	public static Block birchDoor = new BlockCustomDoor("birchDoor", "door_birch");

	public static Block bananaSapling = new BlockSapling("bananaSapling");
	public static Block bananaLeaf = new BlockLeaf("bananaLeaf", "Banana", Items_Main.banana, bananaSapling);
	public static Block bananaLog = new BlockLog("bananaLog");

	public static Block lemonSapling = new BlockSapling("lemonSapling");
	public static Block lemonLeaf = new BlockLeaf("lemonLeaf", "Lemon", Items_Main.lemon, lemonSapling);
	public static Block lemonLog = new BlockLog("lemonLog");

	public static Block mangoSapling = new BlockSapling("mangoSapling");
	public static Block mangoLeaf = new BlockLeaf("mangoLeaf", "Mango", Items_Main.mango, mangoSapling);
	public static Block mangoLog = new BlockLog("mangoLog");

	public static Block cherrySapling = new BlockSapling("cherrySapling");
	public static Block cherryLeaf = new BlockLeaf("cherryLeaf", "Cherry", Items_Main.cherry, cherrySapling);
	public static Block cherryLog = new BlockLog("cherryLog");
	
//	public static Block darkOakTrapDoor = new BlockCustomTrapDoor(Material.wood, "darkOakTrapDoor", 5);
//	public static Block spruceTrapDoor = new BlockCustomTrapDoor(Material.wood, "spruceTrapDoor", 5);
//	public static Block jungleTrapDoor = new BlockCustomTrapDoor(Material.wood, "jungleTrapDoor", 5);
//	public static Block acaciaTrapDoor = new BlockCustomTrapDoor(Material.wood, "acaciaTrapDoor", 5);
//	public static Block birchTrapDoor = new BlockCustomTrapDoor(Material.wood, "birchTrapDoor", 5);
//
//	public static Block goldTrapDoor = new BlockCustomTrapDoor(Material.iron, "goldTrapDoor", 5);
//	public static Block diamondTrapDoor = new BlockCustomTrapDoor(Material.iron, "diamondTrapDoor", 5);
	
	public static Block darkOakFence = new BlockCustomFence(Material.wood, "darkOakFence", "planks_dark_oak");
	public static Block spruceFence = new BlockCustomFence(Material.wood, "spruceFence", "planks_spruce");
	public static Block jungleFence = new BlockCustomFence(Material.wood, "jungleFence", "planks_jungle");
	public static Block acaciaFence = new BlockCustomFence(Material.wood, "acaciaFence", "planks_acacia");
	public static Block birchFence = new BlockCustomFence(Material.wood, "birchFence", "planks_birch");

	public static Block goldFence = new BlockCustomFence(Material.iron, "goldFence", "gold_block");
	public static Block diamondFence = new BlockCustomFence(Material.iron, "diamondFence", "diamond_block");
	
	//public static Block coloredTrapDoors = new BlockColoredTrapDoors(Material.clay, "coloredTrapDoor", 5);
	public static Block coloredStoneBricks = new BlockColoredStoneBricks("coloredStoneBricks");
	public static Block coloredWoodPlanks = new BlockColoredWoodPlanks("coloredWoodPlanks");
	
	public static Block coloredDoors1 = new BlockCustomColoredDoor("coloredDoor", 0);
	public static Block coloredDoors2 = new BlockCustomColoredDoor("coloredDoor", 1);
	public static Block coloredDoors3 = new BlockCustomColoredDoor("coloredDoor", 2);
	public static Block coloredDoors4 = new BlockCustomColoredDoor("coloredDoor", 3);
	public static Block coloredDoors5 = new BlockCustomColoredDoor("coloredDoor", 4);
	public static Block coloredDoors6 = new BlockCustomColoredDoor("coloredDoor", 5);
	public static Block coloredDoors7 = new BlockCustomColoredDoor("coloredDoor", 6);
	public static Block coloredDoors8 = new BlockCustomColoredDoor("coloredDoor", 7);
	public static Block coloredDoors9 = new BlockCustomColoredDoor("coloredDoor", 8);
	public static Block coloredDoors10 = new BlockCustomColoredDoor("coloredDoor", 9);
	public static Block coloredDoors11 = new BlockCustomColoredDoor("coloredDoor", 10);
	public static Block coloredDoors12 = new BlockCustomColoredDoor("coloredDoor", 11);
	public static Block coloredDoors13 = new BlockCustomColoredDoor("coloredDoor", 12);
	public static Block coloredDoors14 = new BlockCustomColoredDoor("coloredDoor", 13);
	public static Block coloredDoors15 = new BlockCustomColoredDoor("coloredDoor", 14);
	public static Block coloredDoors16 = new BlockCustomColoredDoor("coloredDoor", 15);
	
	public static Block coloredFences1 = new BlockColoredFence(Material.wood, "coloredFences", 0);
	public static Block coloredFences2 = new BlockColoredFence(Material.wood, "coloredFences", 1);
	public static Block coloredFences3 = new BlockColoredFence(Material.wood, "coloredFences", 2);
	public static Block coloredFences4 = new BlockColoredFence(Material.wood, "coloredFences", 3);
	public static Block coloredFences5 = new BlockColoredFence(Material.wood, "coloredFences", 4);
	public static Block coloredFences6 = new BlockColoredFence(Material.wood, "coloredFences", 5);
	public static Block coloredFences7 = new BlockColoredFence(Material.wood, "coloredFences", 6);
	public static Block coloredFences8 = new BlockColoredFence(Material.wood, "coloredFences", 7);
	public static Block coloredFences9 = new BlockColoredFence(Material.wood, "coloredFences", 8);
	public static Block coloredFences10 = new BlockColoredFence(Material.wood, "coloredFences", 9);
	public static Block coloredFences11 = new BlockColoredFence(Material.wood, "coloredFences", 10);
	public static Block coloredFences12 = new BlockColoredFence(Material.wood, "coloredFences", 11);
	public static Block coloredFences13 = new BlockColoredFence(Material.wood, "coloredFences", 12);
	public static Block coloredFences14 = new BlockColoredFence(Material.wood, "coloredFences", 13);
	public static Block coloredFences15 = new BlockColoredFence(Material.wood, "coloredFences", 14);
	public static Block coloredFences16 = new BlockColoredFence(Material.wood, "coloredFences", 15);
	
	public static Block coloredWoodPlanksButtons1 = new BlockColoredWoodPlanksButtons(0, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons2 = new BlockColoredWoodPlanksButtons(1, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons3 = new BlockColoredWoodPlanksButtons(2, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons4 = new BlockColoredWoodPlanksButtons(3, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons5 = new BlockColoredWoodPlanksButtons(4, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons6 = new BlockColoredWoodPlanksButtons(5, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons7 = new BlockColoredWoodPlanksButtons(6, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons8 = new BlockColoredWoodPlanksButtons(7, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons9 = new BlockColoredWoodPlanksButtons(8, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons10 = new BlockColoredWoodPlanksButtons(9, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons11 = new BlockColoredWoodPlanksButtons(10, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons12 = new BlockColoredWoodPlanksButtons(11, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons13 = new BlockColoredWoodPlanksButtons(12, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons14 = new BlockColoredWoodPlanksButtons(13, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons15 = new BlockColoredWoodPlanksButtons(14, "coloredWoodPlankButton");
	public static Block coloredWoodPlanksButtons16 = new BlockColoredWoodPlanksButtons(15, "coloredWoodPlankButton");
	
	public static Block coloredStoneButtons1 = new BlockColoredStoneButtons(0, "coloredStoneButton");
	public static Block coloredStoneButtons2 = new BlockColoredStoneButtons(1, "coloredStoneButton");
	public static Block coloredStoneButtons3 = new BlockColoredStoneButtons(2, "coloredStoneButton");
	public static Block coloredStoneButtons4 = new BlockColoredStoneButtons(3, "coloredStoneButton");
	public static Block coloredStoneButtons5 = new BlockColoredStoneButtons(4, "coloredStoneButton");
	public static Block coloredStoneButtons6 = new BlockColoredStoneButtons(5, "coloredStoneButton");
	public static Block coloredStoneButtons7 = new BlockColoredStoneButtons(6, "coloredStoneButton");
	public static Block coloredStoneButtons8 = new BlockColoredStoneButtons(7, "coloredStoneButton");
	public static Block coloredStoneButtons9 = new BlockColoredStoneButtons(8, "coloredStoneButton");
	public static Block coloredStoneButtons10 = new BlockColoredStoneButtons(9, "coloredStoneButton");
	public static Block coloredStoneButtons11 = new BlockColoredStoneButtons(10, "coloredStoneButton");
	public static Block coloredStoneButtons12 = new BlockColoredStoneButtons(11, "coloredStoneButton");
	public static Block coloredStoneButtons13 = new BlockColoredStoneButtons(12, "coloredStoneButton");
	public static Block coloredStoneButtons14 = new BlockColoredStoneButtons(13, "coloredStoneButton");
	public static Block coloredStoneButtons15 = new BlockColoredStoneButtons(14, "coloredStoneButton");
	public static Block coloredStoneButtons16 = new BlockColoredStoneButtons(15, "coloredStoneButton");
	
	public static void init() {
		registerBlocks();
		registerSlabsAndStairs();
	}

	private static void registerBlocks() {
		GameRegistry.registerBlock(goldDoor, "goldDoor");
		//GameRegistry.registerBlock(diamondDoor, "diamondDoor");

		GameRegistry.registerBlock(darkOakDoor, "darkOakDoor");
		GameRegistry.registerBlock(spruceDoor, "spruceDoor");
		GameRegistry.registerBlock(jungleDoor, "jungleDoor");
		GameRegistry.registerBlock(acaciaDoor, "acaciaDoor");
		GameRegistry.registerBlock(birchDoor, "birchDoor");

		GameRegistry.registerBlock(bananaLeaf, "bananaLeaf");
		GameRegistry.registerBlock(bananaLog, "bananaLog");
		GameRegistry.registerBlock(bananaSapling, "bananaSapling");

		GameRegistry.registerBlock(lemonLeaf, "lemonLeaf");
		GameRegistry.registerBlock(lemonLog, "lemonLog");
		GameRegistry.registerBlock(lemonSapling, "lemonSapling");

		GameRegistry.registerBlock(mangoLeaf, "mangoLeaf");
		GameRegistry.registerBlock(mangoLog, "mangoLog");
		GameRegistry.registerBlock(mangoSapling, "mangoSapling");

		GameRegistry.registerBlock(cherryLeaf, "cherryLeaf");
		GameRegistry.registerBlock(cherryLog, "cherryLog");
		GameRegistry.registerBlock(cherrySapling, "cherrySapling");
				
//		GameRegistry.registerBlock(darkOakTrapDoor, "darkOakTrapDoor");
//		GameRegistry.registerBlock(spruceTrapDoor, "spruceTrapDoor");
//		GameRegistry.registerBlock(jungleTrapDoor, "jungleTrapDoor");
//		GameRegistry.registerBlock(acaciaTrapDoor, "acaciaTrapDoor");
//		GameRegistry.registerBlock(birchTrapDoor, "birchTrapDoor");
//
//		GameRegistry.registerBlock(goldTrapDoor, "goldTrapDoor");
//		GameRegistry.registerBlock(diamondTrapDoor, "diamondTrapDoor");
		
		GameRegistry.registerBlock(darkOakFence, "darkOakFence");
		GameRegistry.registerBlock(spruceFence, "spruceFence");
		GameRegistry.registerBlock(jungleFence, "jungleFence");
		GameRegistry.registerBlock(acaciaFence, "acaciaFence");
		GameRegistry.registerBlock(birchFence, "birchFence");

		GameRegistry.registerBlock(goldFence, "goldFence");
		GameRegistry.registerBlock(diamondFence, "diamondFence");
		
		//GameRegistry.registerBlock(coloredTrapDoors, ItemMeta.class, coloredTrapDoors.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneBricks, ItemMeta.class, coloredStoneBricks.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanks, ItemMeta.class, coloredWoodPlanks.getUnlocalizedName());
		
		GameRegistry.registerBlock(coloredDoors1, coloredDoors1.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors2, coloredDoors2.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors3, coloredDoors3.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors4, coloredDoors4.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors5, coloredDoors5.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors6, coloredDoors6.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors7, coloredDoors7.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors8, coloredDoors8.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors9, coloredDoors9.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors10, coloredDoors10.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors11, coloredDoors11.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors12, coloredDoors12.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors13, coloredDoors13.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors14, coloredDoors14.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors15, coloredDoors15.getUnlocalizedName());
		GameRegistry.registerBlock(coloredDoors16, coloredDoors16.getUnlocalizedName());

		GameRegistry.registerBlock(coloredFences1, coloredFences1.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences2, coloredFences2.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences3, coloredFences3.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences4, coloredFences4.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences5, coloredFences5.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences6, coloredFences6.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences7, coloredFences7.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences8, coloredFences8.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences9, coloredFences9.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences10, coloredFences10.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences11, coloredFences11.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences12, coloredFences12.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences13, coloredFences13.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences14, coloredFences14.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences15, coloredFences15.getUnlocalizedName());
		GameRegistry.registerBlock(coloredFences16, coloredFences16.getUnlocalizedName());
		
		GameRegistry.registerBlock(coloredWoodPlanksButtons1, coloredWoodPlanksButtons1.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons2, coloredWoodPlanksButtons2.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons3, coloredWoodPlanksButtons3.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons4, coloredWoodPlanksButtons4.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons5, coloredWoodPlanksButtons5.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons6, coloredWoodPlanksButtons6.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons7, coloredWoodPlanksButtons7.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons8, coloredWoodPlanksButtons8.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons9, coloredWoodPlanksButtons9.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons10, coloredWoodPlanksButtons10.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons11, coloredWoodPlanksButtons11.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons12, coloredWoodPlanksButtons12.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons13, coloredWoodPlanksButtons13.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons14, coloredWoodPlanksButtons14.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons15, coloredWoodPlanksButtons15.getUnlocalizedName());
		GameRegistry.registerBlock(coloredWoodPlanksButtons16, coloredWoodPlanksButtons16.getUnlocalizedName());
		
		GameRegistry.registerBlock(coloredStoneButtons1, coloredStoneButtons1.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons2, coloredStoneButtons2.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons3, coloredStoneButtons3.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons4, coloredStoneButtons4.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons5, coloredStoneButtons5.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons6, coloredStoneButtons6.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons7, coloredStoneButtons7.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons8, coloredStoneButtons8.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons9, coloredStoneButtons9.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons10, coloredStoneButtons10.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons11, coloredStoneButtons11.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons12, coloredStoneButtons12.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons13, coloredStoneButtons13.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons14, coloredStoneButtons14.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons15, coloredStoneButtons15.getUnlocalizedName());
		GameRegistry.registerBlock(coloredStoneButtons16, coloredStoneButtons16.getUnlocalizedName());
	}

	private static void registerSlabsAndStairs() {
		GameRegistry.registerBlock(sandHalfSlab, SandItemSlab.class, "sandHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(sandDoubleSlab, SandItemSlab.class, "sandFullSlab");

		GameRegistry.registerBlock(redSandHalfSlab, RedSandItemSlab.class, "redSandHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(redSandDoubleSlab, RedSandItemSlab.class, "redSandFullSlab");

		GameRegistry.registerBlock(goldBlockHalfSlab, GoldBlockItemSlab.class, "goldBlockHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(goldBlockDoubleSlab, GoldBlockItemSlab.class, "goldBlockFullSlab");

		GameRegistry.registerBlock(diamondBlockHalfSlab, DiamondBlockItemSlab.class, "diamondHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(diamondBlockDoubleSlab, DiamondBlockItemSlab.class, "diamondFullSlab");

		GameRegistry.registerBlock(ironBlockHalfSlab, IronBlockItemSlab.class, "ironHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(ironBlockDoubleSlab, IronBlockItemSlab.class, "ironFullSlab");

		GameRegistry.registerBlock(coalBlockHalfSlab, CoalBlockItemSlab.class, "coalHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(coalBlockDoubleSlab, CoalBlockItemSlab.class, "coalFullSlab");

		GameRegistry.registerBlock(lapisBlockHalfSlab, LapisBlockItemSlab.class, "lapisHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(lapisBlockDoubleSlab, LapisBlockItemSlab.class, "lapisFullSlab");

		GameRegistry.registerBlock(emeraldBlockHalfSlab, EmeraldBlockItemSlab.class, "emeraldHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(emeraldBlockDoubleSlab, EmeraldBlockItemSlab.class, "emeraldFullSlab");

		GameRegistry.registerBlock(netherrackBlockHalfSlab, NetherrackBlockItemSlab.class, "netherrackHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(netherrackBlockDoubleSlab, NetherrackBlockItemSlab.class, "netherrackFullSlab");

		GameRegistry.registerBlock(redstoneBlockHalfSlab, RedstoneBlockItemSlab.class, "redstoneHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(redstoneBlockDoubleSlab, RedstoneBlockItemSlab.class, "redstoneFullSlab");

		GameRegistry.registerBlock(glowstoneBlockHalfSlab, GlowstoneBlockItemSlab.class, "glowstoneBlockHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(glowstoneBlockDoubleSlab, GlowstoneBlockItemSlab.class, "glowstoneFullSlab");

		GameRegistry.registerBlock(packedIceBlockHalfSlab, PackedIcestoneBlockItemSlab.class, "packedIceHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(packedIceBlockDoubleSlab, PackedIcestoneBlockItemSlab.class, "packedIceFullSlab");

		GameRegistry.registerBlock(iceBlockHalfSlab, IceBlockItemSlab.class, "iceHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(iceBlockDoubleSlab, IceBlockItemSlab.class, "iceFullSlab");

		GameRegistry.registerBlock(whiteWoolBlockHalfSlab, WhiteWoolBlockItemSlab.class, "whiteWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(whiteWoolBlockDoubleSlab, WhiteWoolBlockItemSlab.class, "whiteWoolFullSlab");

		GameRegistry.registerBlock(orangeWoolBlockHalfSlab, OrangeWoolBlockItemSlab.class, "orangeWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(orangeWoolBlockDoubleSlab, OrangeWoolBlockItemSlab.class, "orangeWoolFullSlab");

		GameRegistry.registerBlock(magentaWoolBlockHalfSlab, MagentaWoolBlockItemSlab.class, "magentaWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(magentaWoolBlockDoubleSlab, MagentaWoolBlockItemSlab.class, "magentaWoolFullSlab");

		GameRegistry.registerBlock(lightBlueWoolBlockHalfSlab, LightBlueWoolBlockItemSlab.class, "lightBlueWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(lightBlueWoolBlockDoubleSlab, LightBlueWoolBlockItemSlab.class, "lightBlueWoolFullSlab");

		GameRegistry.registerBlock(yellowWoolBlockHalfSlab, YellowWoolBlockItemSlab.class, "yellowWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(yellowWoolBlockDoubleSlab, YellowWoolBlockItemSlab.class, "yellowWoolFullSlab");

		GameRegistry.registerBlock(limeWoolBlockHalfSlab, LimeWoolBlockItemSlab.class, "limeWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(limeWoolBlockDoubleSlab, LimeWoolBlockItemSlab.class, "limeWoolFullSlab");

		GameRegistry.registerBlock(pinkWoolBlockHalfSlab, PinkWoolBlockItemSlab.class, "pinkWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(pinkWoolBlockDoubleSlab, PinkWoolBlockItemSlab.class, "pinkWoolFullSlab");

		GameRegistry.registerBlock(grayWoolBlockHalfSlab, GrayWoolBlockItemSlab.class, "grayWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(grayWoolBlockDoubleSlab, GrayWoolBlockItemSlab.class, "grayWoolFullSlab");

		GameRegistry.registerBlock(lightGrayWoolBlockHalfSlab, LightGrayWoolBlockItemSlab.class, "lightGrayWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(lightGrayWoolBlockDoubleSlab, LightGrayWoolBlockItemSlab.class, "lightGrayWoolFullSlab");

		GameRegistry.registerBlock(cyanWoolBlockHalfSlab, CyanWoolBlockItemSlab.class, "cyanWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(cyanWoolBlockDoubleSlab, CyanWoolBlockItemSlab.class, "cyanWoolFullSlab");

		GameRegistry.registerBlock(purpleWoolBlockHalfSlab, PurpleWoolBlockItemSlab.class, "purpleWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(purpleWoolBlockDoubleSlab, PurpleWoolBlockItemSlab.class, "purpleWoolFullSlab");

		GameRegistry.registerBlock(blueWoolBlockHalfSlab, BlueWoolBlockItemSlab.class, "blueWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(blueWoolBlockDoubleSlab, BlueWoolBlockItemSlab.class, "blueWoolFullSlab");

		GameRegistry.registerBlock(brownWoolBlockHalfSlab, BrownWoolBlockItemSlab.class, "brownWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(brownWoolBlockDoubleSlab, BrownWoolBlockItemSlab.class, "brownWoolFullSlab");

		GameRegistry.registerBlock(greenWoolBlockHalfSlab, GreenWoolBlockItemSlab.class, "greenWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(greenWoolBlockDoubleSlab, GreenWoolBlockItemSlab.class, "greenWoolFullSlab");

		GameRegistry.registerBlock(redWoolBlockHalfSlab, RedWoolBlockItemSlab.class, "redWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(redWoolBlockDoubleSlab, RedWoolBlockItemSlab.class, "redWoolFullSlab");

		GameRegistry.registerBlock(blackWoolBlockHalfSlab, BlackWoolBlockItemSlab.class, "blackWoolHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(blackWoolBlockDoubleSlab, BlackWoolBlockItemSlab.class, "blackWoolFullSlab");

		GameRegistry.registerBlock(dirtBlockHalfSlab, DirtBlockItemSlab.class, "dirtHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(dirtBlockDoubleSlab, DirtBlockItemSlab.class, "dirtFullSlab");

		GameRegistry.registerBlock(clayHalfSlab, ClayItemSlab.class, "clayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(clayDoubleSlab, ClayItemSlab.class, "clayDoubleSlab");

		GameRegistry.registerBlock(hardenClayHalfSlab, HardenClayItemSlab.class, "hardenClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(hardenClayDoubleSlab, HardenClayItemSlab.class, "hardenClayDoubleSlab");

		GameRegistry.registerBlock(whiteStainedClayHalfSlab, WhiteStainedClayBlockItemSlab.class, "whiteStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(whiteStainedClayDoubleSlab, WhiteStainedClayBlockItemSlab.class, "whiteStainedClayDoubleSlab");

		GameRegistry.registerBlock(orangeStainedClayHalfSlab, OrangeStainedClayBlockItemSlab.class, "orangeStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(orangeStainedClayDoubleSlab, OrangeStainedClayBlockItemSlab.class, "orangeStainedClayDoubleSlab");

		GameRegistry.registerBlock(magentaStainedClayHalfSlab, MagentaStainedClayBlockItemSlab.class, "magentaStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(magentaStainedClayDoubleSlab, MagentaStainedClayBlockItemSlab.class, "magentaStainedClayDoubleSlab");

		GameRegistry.registerBlock(lightBlueStainedClayHalfSlab, LightBlueStainedClayBlockItemSlab.class, "lightBlueStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(lightBlueStainedClayDoubleSlab, LightBlueStainedClayBlockItemSlab.class, "lightBlueStainedClayDoubleSlab");

		GameRegistry.registerBlock(yellowStainedClayHalfSlab, YellowStainedClayBlockItemSlab.class, "yellowStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(yellowStainedClayDoubleSlab, YellowStainedClayBlockItemSlab.class, "yellowStainedClayDoubleSlab");

		GameRegistry.registerBlock(limeStainedClayHalfSlab, LimeStainedClayBlockItemSlab.class, "limeStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(limeStainedClayDoubleSlab, PinkStainedClayBlockItemSlab.class, "limeStainedClayDoubleSlab");

		GameRegistry.registerBlock(pinkStainedClayHalfSlab, PinkStainedClayBlockItemSlab.class, "pinkStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(pinkStainedClayDoubleSlab, PinkStainedClayBlockItemSlab.class, "pinkStainedClayDoubleSlab");

		GameRegistry.registerBlock(grayStainedClayHalfSlab, GrayStainedClayBlockItemSlab.class, "grayStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(grayStainedClayDoubleSlab, GrayStainedClayBlockItemSlab.class, "grayStainedClayDoubleSlab");

		GameRegistry.registerBlock(lightGrayStainedClayHalfSlab, LightGrayStainedClayBlockItemSlab.class, "lightGrayStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(lightGrayStainedClayDoubleSlab, LightGrayStainedClayBlockItemSlab.class, "lightGrayStainedClayDoubleSlab");

		GameRegistry.registerBlock(cyanStainedClayHalfSlab, CyanStainedClayBlockItemSlab.class, "cyanStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(cyanStainedClayDoubleSlab, CyanStainedClayBlockItemSlab.class, "cyanStainedClayDoubleSlab");

		GameRegistry.registerBlock(purpleStainedClayHalfSlab, PurpleStainedClayBlockItemSlab.class, "purpleStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(purpleStainedClayDoubleSlab, PurpleStainedClayBlockItemSlab.class, "purpleStainedClayDoubleSlab");

		GameRegistry.registerBlock(blueStainedClayHalfSlab, BlueStainedClayBlockItemSlab.class, "blueStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(blueStainedClayDoubleSlab, BlueStainedClayBlockItemSlab.class, "blueStainedClayDoubleSlab");

		GameRegistry.registerBlock(brownStainedClayHalfSlab, BrownStainedClayBlockItemSlab.class, "brownStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(brownStainedClayDoubleSlab, BrownStainedClayBlockItemSlab.class, "brownStainedClayDoubleSlab");

		GameRegistry.registerBlock(greenStainedClayHalfSlab, GreenStainedClayBlockItemSlab.class, "greenStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(greenStainedClayDoubleSlab, GreenStainedClayBlockItemSlab.class, "greenStainedClayDoubleSlab");

		GameRegistry.registerBlock(redStainedClayHalfSlab, RedStainedClayBlockItemSlab.class, "redStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		GameRegistry.registerBlock(redStainedClayDoubleSlab, RedStainedClayBlockItemSlab.class, "redStainedClayDoubleSlab");

		GameRegistry.registerBlock(blackStainedClayHalfSlab, BlackStainedClayBlockItemSlab.class, "blackStainedClayHalfSlab").setCreativeTab(VanillaExpansion.vanillaExpansionTab);
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
