package com.mjr.vanillaExpansion.blocks.crops;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.mjr.vanillaExpansion.items.BasicSeed;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlocksFoodCrops {

	public static Block blockStrawberry;
	public static Item strawberrySeed;

	public static Block blockGrape;
	public static Item grapeSeed;

	public static Block blockLettuce;
	public static Item lettuceSeed;

	public static void initializeCrops() {
		blockStrawberry = new StrawberryCrop();
		strawberrySeed = new BasicSeed("strawberrySeed", blockStrawberry, Blocks.farmland);

		blockGrape = new GrapeCrop();
		grapeSeed = new BasicSeed("grapeSeed", blockGrape, Blocks.farmland);

		blockLettuce = new LettuceCrop();
		lettuceSeed = new BasicSeed("lettuceSeed", blockLettuce, Blocks.farmland);

	}

	public static void registerCrops() {
		GameRegistry.registerItem(strawberrySeed, "strawberrySeed");
		GameRegistry.registerBlock(blockStrawberry, "blockStrawberry");

		GameRegistry.registerItem(grapeSeed, "grapeSeed");
		GameRegistry.registerBlock(blockGrape, "blockGrape");

		GameRegistry.registerItem(lettuceSeed, "lettuceSeed");
		GameRegistry.registerBlock(blockLettuce, "blockLettuce");
	}
}
