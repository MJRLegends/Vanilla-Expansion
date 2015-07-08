package com.mjr.vanillaExpansion;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

import com.mjr.vanillaExpansion.blocks.BasicSlab;
import com.mjr.vanillaExpansion.blocks.BasicStairs;
import com.mjr.vanillaExpansion.items.BlackWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.BlueWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.BrownWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.CoalBlockItemSlab;
import com.mjr.vanillaExpansion.items.CyanWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.DiamondBlockItemSlab;
import com.mjr.vanillaExpansion.items.DirtBlockItemSlab;
import com.mjr.vanillaExpansion.items.GoldBlockItemSlab;
import com.mjr.vanillaExpansion.items.GrayWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.GreenWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.IronBlockItemSlab;
import com.mjr.vanillaExpansion.items.LapisBlockItemSlab;
import com.mjr.vanillaExpansion.items.LightBlueWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.LightGrayWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.LimeWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.MagentaWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.NetherrackBlockItemSlab;
import com.mjr.vanillaExpansion.items.OrangeWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.PinkWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.PurpleWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.RedSandItemSlab;
import com.mjr.vanillaExpansion.items.RedWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.RedstoneBlockItemSlab;
import com.mjr.vanillaExpansion.items.SandItemSlab;
import com.mjr.vanillaExpansion.items.WhiteWoolBlockItemSlab;
import com.mjr.vanillaExpansion.items.YellowWoolBlockItemSlab;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Constants.modID, name = Constants.modName, version = Constants.modVersion)
public class VanillaExpansion {
	@SidedProxy(clientSide = "com.mjr.vanillaExpansion.ClientProxy", serverSide = "com.mjr.vanillaExpansion.CommonProxy")
	public static CommonProxy proxy;

	@Instance(Constants.modID)
	public static VanillaExpansion instance;
	
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

	public static Block netherrackBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "netherrackBlockhalfslab", "netherrack");
	public static Block netherrackBlockDoubleSlab = new BasicSlab(true, null, "netherrackBlockfullslab", "netherrack");

	public static Block redstoneBlockHalfSlab = new BasicSlab(false, CreativeTabs.tabBlock, "redstoneBlockhalfslab", "redstone_block");
	public static Block redstoneBlockDoubleSlab = new BasicSlab(true, null, "redstoneBlockfullslab", "redstone_block");

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

	public static Block sandStairs = new BasicStairs(Blocks.sand, 0, "sandStairs");
	public static Block redSandStairs = new BasicStairs(Blocks.sand, 1, "redSandStairs");
	public static Block goldBlockStairs = new BasicStairs(Blocks.gold_block, 0, "goldBlockStairs");
	public static Block diamondBlockStairs = new BasicStairs(Blocks.diamond_block, 0, "diamondBlockStairs");
	public static Block ironBlockStairs = new BasicStairs(Blocks.iron_block, 0, "ironBlockStairs");
	public static Block coalBlockStairs = new BasicStairs(Blocks.coal_block, 0, "coalBlockStairs");
	public static Block lapisBlockStairs = new BasicStairs(Blocks.lapis_block, 0, "lapisBlockStairs");
	public static Block netherrackBlockStairs = new BasicStairs(Blocks.netherrack, 0, "netherrackBlockStairs");
	public static Block redstoneBlockStairs = new BasicStairs(Blocks.redstone_block, 0, "redstoneBlockStairs");

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

	// Glass
	// Clay
	// Ice

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		this.proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerBlock(VanillaExpansion.sandHalfSlab, SandItemSlab.class, "sandhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.sandDoubleSlab, SandItemSlab.class, "sandfullslab");

		GameRegistry.registerBlock(VanillaExpansion.redSandHalfSlab, RedSandItemSlab.class, "redSandhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.redSandDoubleSlab, RedSandItemSlab.class, "redSandfullslab");

		GameRegistry.registerBlock(VanillaExpansion.goldBlockHalfSlab, GoldBlockItemSlab.class, "goldBlockhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.goldBlockDoubleSlab, GoldBlockItemSlab.class, "goldBlockfullslab");

		GameRegistry.registerBlock(VanillaExpansion.diamondBlockHalfSlab, DiamondBlockItemSlab.class, "diamondhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.diamondBlockDoubleSlab, DiamondBlockItemSlab.class, "diamondfullslab");

		GameRegistry.registerBlock(VanillaExpansion.ironBlockHalfSlab, IronBlockItemSlab.class, "ironhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.ironBlockDoubleSlab, IronBlockItemSlab.class, "ironfullslab");

		GameRegistry.registerBlock(VanillaExpansion.coalBlockHalfSlab, CoalBlockItemSlab.class, "coalhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.coalBlockDoubleSlab, CoalBlockItemSlab.class, "coalfullslab");

		GameRegistry.registerBlock(VanillaExpansion.lapisBlockHalfSlab, LapisBlockItemSlab.class, "lapishalfslab");
		GameRegistry.registerBlock(VanillaExpansion.lapisBlockDoubleSlab, LapisBlockItemSlab.class, "lapisfullslab");

		GameRegistry.registerBlock(VanillaExpansion.netherrackBlockHalfSlab, NetherrackBlockItemSlab.class, "netherrackhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.netherrackBlockDoubleSlab, NetherrackBlockItemSlab.class, "netherrackfullslab");

		GameRegistry.registerBlock(VanillaExpansion.redstoneBlockHalfSlab, RedstoneBlockItemSlab.class, "redstonehalfslab");
		GameRegistry.registerBlock(VanillaExpansion.redstoneBlockDoubleSlab, RedstoneBlockItemSlab.class, "redstonefullslab");
		
		GameRegistry.registerBlock(VanillaExpansion.whiteWoolBlockHalfSlab, WhiteWoolBlockItemSlab.class, "whiteWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.whiteWoolBlockDoubleSlab, WhiteWoolBlockItemSlab.class, "whiteWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.orangeWoolBlockHalfSlab, OrangeWoolBlockItemSlab.class, "orangeWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.orangeWoolBlockDoubleSlab, OrangeWoolBlockItemSlab.class, "orangeWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.magentaWoolBlockHalfSlab, MagentaWoolBlockItemSlab.class, "magentaWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.magentaWoolBlockDoubleSlab, MagentaWoolBlockItemSlab.class, "magentaWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.lightBlueWoolBlockHalfSlab, LightBlueWoolBlockItemSlab.class, "lightBlueWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.lightBlueWoolBlockDoubleSlab, LightBlueWoolBlockItemSlab.class, "lightBlueWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.yellowWoolBlockHalfSlab, YellowWoolBlockItemSlab.class, "yellowWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.yellowWoolBlockDoubleSlab, YellowWoolBlockItemSlab.class, "yellowWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.limeWoolBlockHalfSlab, LimeWoolBlockItemSlab.class, "limeWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.limeWoolBlockDoubleSlab, LimeWoolBlockItemSlab.class, "limeWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.pinkWoolBlockHalfSlab, PinkWoolBlockItemSlab.class, "pinkWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.pinkWoolBlockDoubleSlab, PinkWoolBlockItemSlab.class, "pinkWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.grayWoolBlockHalfSlab, GrayWoolBlockItemSlab.class, "grayWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.grayWoolBlockDoubleSlab, GrayWoolBlockItemSlab.class, "grayWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.lightGrayWoolBlockHalfSlab, LightGrayWoolBlockItemSlab.class, "lightGrayWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.lightGrayWoolBlockDoubleSlab, LightGrayWoolBlockItemSlab.class, "lightGrayWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.cyanWoolBlockHalfSlab, CyanWoolBlockItemSlab.class, "cyanWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.cyanWoolBlockDoubleSlab, CyanWoolBlockItemSlab.class, "cyanWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.purpleWoolBlockHalfSlab, PurpleWoolBlockItemSlab.class, "purpleWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.purpleWoolBlockDoubleSlab, PurpleWoolBlockItemSlab.class, "purpleWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.blueWoolBlockHalfSlab, BlueWoolBlockItemSlab.class, "blueWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.blueWoolBlockDoubleSlab, BlueWoolBlockItemSlab.class, "blueWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.brownWoolBlockHalfSlab, BrownWoolBlockItemSlab.class, "brownWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.brownWoolBlockDoubleSlab, BrownWoolBlockItemSlab.class, "brownWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.greenWoolBlockHalfSlab, GreenWoolBlockItemSlab.class, "greenWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.greenWoolBlockDoubleSlab, GreenWoolBlockItemSlab.class, "greenWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.redWoolBlockHalfSlab, RedWoolBlockItemSlab.class, "redWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.redWoolBlockDoubleSlab, RedWoolBlockItemSlab.class, "redWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.blackWoolBlockHalfSlab, BlackWoolBlockItemSlab.class, "blackWoolhalfslab");
		GameRegistry.registerBlock(VanillaExpansion.blackWoolBlockDoubleSlab, BlackWoolBlockItemSlab.class, "blackWoolfullslab");

		GameRegistry.registerBlock(VanillaExpansion.dirtBlockHalfSlab, DirtBlockItemSlab.class, "dirthalfslab");
		GameRegistry.registerBlock(VanillaExpansion.dirtBlockDoubleSlab, DirtBlockItemSlab.class, "dirtfullslab");
	
		GameRegistry.registerBlock(VanillaExpansion.sandStairs, "sandStairs");
		GameRegistry.registerBlock(VanillaExpansion.redSandStairs, "redSandStairs");
		GameRegistry.registerBlock(VanillaExpansion.goldBlockStairs, "goldBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.diamondBlockStairs, "diamondBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.ironBlockStairs, "ironBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.coalBlockStairs, "coalBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.lapisBlockStairs, "lapisBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.netherrackBlockStairs, "netherrackBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.redstoneBlockStairs, "redstoneBlockStairs");

		GameRegistry.registerBlock(VanillaExpansion.whiteWoolBlockStairs, "whiteWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.orangeWoolBlockStairs, "orangeWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.magentaWoolBlockStairs, "magentaWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.lightBlueWoolBlockStairs, "lightBlueWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.yellowWoolBlockStairs, "yellowWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.limeWoolBlockStairs, "limeWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.pinkWoolBlockStairs, "pinkWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.grayWoolBlockStairs, "grayWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.lightGrayWoolBlockStairs, "lightGrayWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.cyanWoolBlockStairs, "cyanWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.purpleWoolBlockStairs, "purpleWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.blueWoolBlockStairs, "blueWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.brownWoolBlockStairs, "brownWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.greenWoolBlockStairs, "greenWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.redWoolBlockStairs, "redWoolBlockStairs");
		GameRegistry.registerBlock(VanillaExpansion.blackWoolBlockStairs, "blackWoolBlockStairs");

		GameRegistry.registerBlock(VanillaExpansion.dirtStairs, "dirtStairs");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		this.proxy.postInit(event);
		Recipes.registerCraftingRecipes();
	}
}
