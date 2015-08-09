package com.mjr.vanillaExpansion.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSoup;

import com.mjr.vanillaExpansion.Constants;

import cpw.mods.fml.common.registry.GameRegistry;

public class Items_Main {

	public static Item goldDoorItem = new ItemDoorItem("gold");
	public static Item diamondDoorItem = new ItemDoorItem("diamond");

	public static Item darkOakDoorItem = new ItemDoorItem("dark_oak");
	public static Item spruceDoorItem = new ItemDoorItem("spruce");
	public static Item jungleDoorItem = new ItemDoorItem("jungle");
	public static Item acaciaDoorItem = new ItemDoorItem("acacia");
	public static Item birchDoorItem = new ItemDoorItem("birch");

	public static Item banana = new BasicFoodItem(10, 5, false, "banana");
	public static Item strawberry = new BasicFoodItem(10, 5, false, "strawberry");
	public static Item cherry = new BasicFoodItem(10, 5, false, "cherry");
	public static Item grape = new BasicFoodItem(10, 5, false, "grape");
	public static Item lemon = new BasicFoodItem(10, 5, false, "lemon");
	public static Item lettuce = new BasicFoodItem(10, 5, false, "lettuce");
	public static Item mango = new BasicFoodItem(10, 5, false, "mango");

	public static Item pasta = new BasicFoodItem(10, 5, false, "pasta");
	public static Item bacon = new BasicFoodItem(10, 5, false, "bacon");
	public static Item chickenNuggets = new BasicFoodItem(10, 5, false, "chickenNuggets");

	public static Item rawPasta = new BasicFoodItem(10, 5, false, "rawPasta");
	public static Item rawBacon = new BasicFoodItem(10, 5, false, "rawBacon");
	public static Item rawChickenNuggets = new BasicFoodItem(10, 5, false, "rawChickenNuggets");
	public static Item rawBread = new BasicFoodItem(10, 5, false, "rawBread");

	public static Item four = new BasicItem("four");
	public static Item dough = new BasicItem("dough");
	public static Item breadDough = new BasicItem("breadDough");

	public static Item milkshake = new BasicFoodItem(10, 5, false, "milkshake");
	public static Item milkshakepowder = new BasicFoodItem(10, 5, false, "milkshakepowder");

	public static Item knife = new BasicItemTool("knife", 32);
	public static Item mixingbowl = new BasicItemTool("mixingbowl", 32);
	public static Item rollingPin = new BasicItemTool("rollingPin", 32);

	public static Item strawberryIceCream = new ItemSoup(2).setUnlocalizedName("strawberryIceCream").setTextureName(
			Constants.TEXTURE_PREFIX + "strawberryIceCream");

	public static void init() {
		registerItems();
	}

	private static void registerItems() {
		GameRegistry.registerItem(goldDoorItem, "goldDoorItem");
		GameRegistry.registerItem(diamondDoorItem, "diamondDoorItem");

		GameRegistry.registerItem(darkOakDoorItem, "darkOakDoorItem");
		GameRegistry.registerItem(spruceDoorItem, "spruceDoorItem");
		GameRegistry.registerItem(jungleDoorItem, "jungleDoorItem");
		GameRegistry.registerItem(acaciaDoorItem, "acaciaDoorItem");
		GameRegistry.registerItem(birchDoorItem, "birchDoorItem");

		GameRegistry.registerItem(banana, "banana");
		GameRegistry.registerItem(strawberry, "strawberry");
		GameRegistry.registerItem(cherry, "cherry");
		GameRegistry.registerItem(grape, "grape");
		GameRegistry.registerItem(lemon, "lemon");
		GameRegistry.registerItem(lettuce, "lettuce");
		GameRegistry.registerItem(mango, "mango");

		GameRegistry.registerItem(pasta, "pasta");
		// GameRegistry.registerItem(bacon, "bacon");
		// GameRegistry.registerItem(chickenNuggets, "chickenNuggets");

		GameRegistry.registerItem(rawPasta, "rawPasta");
		// GameRegistry.registerItem(rawBacon, "rawBacon");
		// GameRegistry.registerItem(rawChickenNuggets, "rawChickenNuggets");
		GameRegistry.registerItem(rawBread, "rawBread");

		GameRegistry.registerItem(four, "four");
		GameRegistry.registerItem(dough, "dough");
		GameRegistry.registerItem(breadDough, "breadDough");

		GameRegistry.registerItem(milkshake, "milkshake");
		GameRegistry.registerItem(milkshakepowder, "milkshakepowder");

		GameRegistry.registerItem(knife, "knife");
		GameRegistry.registerItem(mixingbowl, "mixingbowl");
		GameRegistry.registerItem(rollingPin, "rollingPin");

		GameRegistry.registerItem(strawberryIceCream, "strawberryIceCream");
	}
}
