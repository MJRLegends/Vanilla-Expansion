package com.mjr.vanillaExpansion;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;
import com.mjr.vanillaExpansion.items.Items_Main;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void registerCraftingRecipes() {
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.sandHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.sand, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.redSandHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.sand, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.goldBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.gold_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.diamondBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.diamond_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.ironBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.iron_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coalBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.coal_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.lapisBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.lapis_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.emeraldBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.emerald_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.netherrackBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.netherrack, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.redstoneBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.redstone_block, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Blocks_Main.glowstoneBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.glowstone, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.packedIceBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.packed_ice, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.iceBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.ice, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Blocks_Main.whiteWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.orangeWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.magentaWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.lightBlueWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.yellowWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.limeWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.pinkWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.grayWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 7) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.lightGrayWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 8) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.cyanWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 9) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.purpleWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 10) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.blueWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 11) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.brownWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 12) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.greenWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 13) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.redWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.blackWoolBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 15) });

		GameRegistry.addRecipe(new ItemStack(Blocks_Main.whiteStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.orangeStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.magentaStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.lightBlueStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.yellowStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.limeStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.pinkStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.grayStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 7) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.lightGrayStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 8) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.cyanStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 9) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.purpleStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 10) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.blueStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 11) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.brownStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 12) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.greenStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 13) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.redStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.blackStainedClayHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 15) });

		GameRegistry.addRecipe(new ItemStack(Blocks_Main.dirtBlockHalfSlab, 6), new Object[] { "XXX", 'X', new ItemStack(Blocks.dirt, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Blocks_Main.sandStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.sand, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.redSandStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.sand, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.goldBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.gold_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.diamondBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.diamond_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.ironBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.iron_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coalBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.coal_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.lapisBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.lapis_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.emeraldBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.emerald_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.netherrackBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.netherrack, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.redstoneBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.redstone_block, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Blocks_Main.glowstoneBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.glowstone, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.packedIceBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.packed_ice, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.iceBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.ice, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Blocks_Main.whiteWoolBlockStairs, 1), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.orangeWoolBlockStairs, 1), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.magentaWoolBlockStairs, 1), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.lightBlueWoolBlockStairs, 1), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.yellowWoolBlockStairs, 1), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.limeWoolBlockStairs, 1), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.pinkWoolBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.grayWoolBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 7) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.lightBlueWoolBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 8) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.cyanWoolBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 9) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.purpleWoolBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 10) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.blueWoolBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 11) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.brownWoolBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 12) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.greenWoolBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 13) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.redWoolBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.blackWoolBlockStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 15) });

		GameRegistry.addRecipe(new ItemStack(Blocks_Main.dirtStairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.dirt, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Blocks_Main.whiteStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.orangeStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.magentaStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.lightBlueStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.yellowStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.limeStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.pinkStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.grayStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 7) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.lightGrayStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 8) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.cyanStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 9) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.purpleStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 10) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.blueStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 11) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.brownStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 12) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.greenStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 13) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.redStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.blackStainedClayStairs, 6), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.stained_hardened_clay, 1, 15) });

		GameRegistry.addRecipe(new ItemStack(Items_Main.bacon, 5), new Object[] { "YZ ", "   ", "   ", 'Y', new ItemStack(Items.porkchop, 1, 0), 'Z', new ItemStack(Items_Main.knife, 1, OreDictionary.WILDCARD_VALUE) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.milkshakepowder, 4), new Object[] { "YZ ", "   ", "   ", 'Y', new ItemStack(Items_Main.strawberry, 1, 0), 'Z', new ItemStack(Items_Main.mixingbowl, 1, OreDictionary.WILDCARD_VALUE) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.four, 2), new Object[] { "Y Y", "YZY", "Y Y", 'Y', new ItemStack(Items.wheat, 1, 0), 'Z', new ItemStack(Items_Main.mixingbowl, 1, OreDictionary.WILDCARD_VALUE) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.dough, 6), new Object[] { "YZE", "EE ", "   ", 'Y', new ItemStack(Items_Main.four, 1, 0), 'E', new ItemStack(Items.egg, 1, 0), 'Z',
				new ItemStack(Items_Main.mixingbowl, 1, OreDictionary.WILDCARD_VALUE) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.breadDough, 6), new Object[] { "YZ ", "   ", "   ", 'Y', new ItemStack(Items_Main.four, 1, 0), 'Z', new ItemStack(Items_Main.mixingbowl, 1, OreDictionary.WILDCARD_VALUE) });

		GameRegistry.addRecipe(new ItemStack(Items_Main.rawPasta, 3), new Object[] { "YZ ", "   ", "   ", 'Y', new ItemStack(Items_Main.dough, 1, 0), 'Z', new ItemStack(Items_Main.rollingPin, 1, OreDictionary.WILDCARD_VALUE) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.milkshake, 1), new Object[] { "YMB", "   ", "   ", 'Y', new ItemStack(Items_Main.milkshakepowder, 1, 0), 'M', new ItemStack(Items.milk_bucket, 1, 0), 'B', new ItemStack(Items.glass_bottle, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.rollingPin, 1), new Object[] { "   ", "SWS", "   ", 'W', new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE), 'S', new ItemStack(Items.stick, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.mixingbowl, 1), new Object[] { "   ", " BS", "   ", 'B', new ItemStack(Items.bowl, 1, 0), 'S', new ItemStack(Items.stick, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.knife, 1), new Object[] { "  B", "  S", "   ", 'B', new ItemStack(Items.iron_ingot, 1, 0), 'S', new ItemStack(Items.stick, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Items.cake, 1), new Object[] { "MMM", "SES", "DDD", 'M', new ItemStack(Items.milk_bucket, 1, 0), 'S', new ItemStack(Items.sugar, 1, 0), 'E', new ItemStack(Items.egg, 1, 0), 'D',
				new ItemStack(Items_Main.dough, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.rawBread, 1), new Object[] { "   ", "DFZ", "   ", 'F', new ItemStack(Items_Main.four, 1, 0), 'D', new ItemStack(Items_Main.breadDough, 1, 0), 'Z',
				new ItemStack(Items_Main.rollingPin, 1, OreDictionary.WILDCARD_VALUE) });

		GameRegistry.addRecipe(new ItemStack(Items_Main.strawberryIceCream, 1), new Object[] { "FF ", "DZB", "   ", 'F', new ItemStack(Items.snowball, 1, 0), 'D', new ItemStack(Items_Main.strawberry, 1, 0), 'B', new ItemStack(Items.bowl, 1, 0), 'Z',
				new ItemStack(Items_Main.mixingbowl, 1, OreDictionary.WILDCARD_VALUE) });

		GameRegistry.addRecipe(new ItemStack(Items.wooden_door, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks.planks, 0) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.spruceDoorItem, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks.planks, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.birchDoorItem, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks.planks, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.jungleDoorItem, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks.planks, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.acaciaDoorItem, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks.planks, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.darkOakDoorItem, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks.planks, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.goldDoorItem, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Items.gold_ingot, 1) });
		GameRegistry.addRecipe(new ItemStack(Items_Main.diamondDoorItem, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Items.diamond, 1) });
		
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.goldFence, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.gold_ingot, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.diamondFence, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.diamond, 1, 0) });

		for (int i = 0; i < 16; i++) {
			GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredStoneBricks, 8, i), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.stone, 1), 'Y', new ItemStack(Items.dye, 1, 15 - i) });
		}
		for (int i = 0; i < 16; i++) {
			GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredWoodPlanks, 8, i), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.planks, 1), 'Y', new ItemStack(Items.dye, 1, 15 - i) });
		}
//		for (int i = 0; i < 16; i++) {
//			GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredTrapDoors, 8, i), new Object[] { "XXX", "XXX", 'X', new ItemStack(Blocks_Main.coloredWoodPlanks, 8, i) });
//		}
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences1, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences2, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences3, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences4, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences5, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences6, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences7, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences8, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 7) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences9, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 8) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences10, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 9) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences11, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 10) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences12, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 11) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences13, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 12) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences14, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 13) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences15, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(Blocks_Main.coloredFences16, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.fence, 1), 'Y', new ItemStack(Items.dye, 1, 15) });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons1, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons2, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons3, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons4, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons5, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons6, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons7, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 6));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons8, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 7));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons9, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 8));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons10, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons11, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons12, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons13, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons14, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons15, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredWoodPlanksButtons16, 8, 0), new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 15));

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons1, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons2, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons3, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons4, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons5, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons6, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons7, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 6));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons8, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 7));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons9, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 8));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons10, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons11, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons12, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons13, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons14, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons15, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks_Main.coloredStoneButtons16, 8, 0), new ItemStack(Blocks_Main.coloredStoneBricks, 1, 15));
		
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem1, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 15)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem2, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 14)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem3, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 13)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem4, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 12)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem5, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 11)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem6, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 10)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem7, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 9)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem8, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 8)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem9, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 7)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem10, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 6)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem11, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem12, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem13, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem14, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem15, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(Items_Main.coloredDoorItem16, 3), new Object[] { "WW ", "WW ", "WW ", 'W', new ItemStack(Blocks_Main.coloredWoodPlanks, 1, 0)});
	}

	public static void furnaceRecipes() {
		// GameRegistry.addSmelting(Items_Main.rawBacon, new
		// ItemStack(Items_Main.bacon, 1), 5);
		// GameRegistry.addSmelting(Items_Main.rawChickenNuggets, new
		// ItemStack(Items_Main.chickenNuggets, 1), 5);
		GameRegistry.addSmelting(Items_Main.rawPasta, new ItemStack(Items_Main.pasta, 1), 5);
		GameRegistry.addSmelting(Items_Main.rawBread, new ItemStack(Items.bread, 1), 5);
	}

}
