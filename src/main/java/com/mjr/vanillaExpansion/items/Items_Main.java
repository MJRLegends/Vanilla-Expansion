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
	
	public static Item coloredDoorItem1 = new ItemColoredDoorItem("coloredDoorItem1");
	public static Item coloredDoorItem2 = new ItemColoredDoorItem("coloredDoorItem2");
	public static Item coloredDoorItem3 = new ItemColoredDoorItem("coloredDoorItem3");
	public static Item coloredDoorItem4 = new ItemColoredDoorItem("coloredDoorItem4");
	public static Item coloredDoorItem5 = new ItemColoredDoorItem("coloredDoorItem5");
	public static Item coloredDoorItem6 = new ItemColoredDoorItem("coloredDoorItem6");
	public static Item coloredDoorItem7 = new ItemColoredDoorItem("coloredDoorItem7");
	public static Item coloredDoorItem8 = new ItemColoredDoorItem("coloredDoorItem8");
	public static Item coloredDoorItem9 = new ItemColoredDoorItem("coloredDoorItem9");
	public static Item coloredDoorItem10 = new ItemColoredDoorItem("coloredDoorItem10");
	public static Item coloredDoorItem11 = new ItemColoredDoorItem("coloredDoorItem11");
	public static Item coloredDoorItem12 = new ItemColoredDoorItem("coloredDoorItem12");
	public static Item coloredDoorItem13 = new ItemColoredDoorItem("coloredDoorItem13");
	public static Item coloredDoorItem14 = new ItemColoredDoorItem("coloredDoorItem14");
	public static Item coloredDoorItem15 = new ItemColoredDoorItem("coloredDoorItem15");
	public static Item coloredDoorItem16 = new ItemColoredDoorItem("coloredDoorItem16");

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
		//GameRegistry.registerItem(diamondDoorItem, "diamondDoorItem");

		GameRegistry.registerItem(darkOakDoorItem, "darkOakDoorItem");
		GameRegistry.registerItem(spruceDoorItem, "spruceDoorItem");
		GameRegistry.registerItem(jungleDoorItem, "jungleDoorItem");
		GameRegistry.registerItem(acaciaDoorItem, "acaciaDoorItem");
		GameRegistry.registerItem(birchDoorItem, "birchDoorItem");
		
		GameRegistry.registerItem(coloredDoorItem1, "coloredDoorItem1");
		GameRegistry.registerItem(coloredDoorItem2, "coloredDoorItem2");
		GameRegistry.registerItem(coloredDoorItem3, "coloredDoorItem3");
		GameRegistry.registerItem(coloredDoorItem4, "coloredDoorItem4");
		GameRegistry.registerItem(coloredDoorItem5, "coloredDoorItem5");
		GameRegistry.registerItem(coloredDoorItem6, "coloredDoorItem6");
		GameRegistry.registerItem(coloredDoorItem7, "coloredDoorItem7");
		GameRegistry.registerItem(coloredDoorItem8, "coloredDoorItem8");
		GameRegistry.registerItem(coloredDoorItem9, "coloredDoorItem9");
		GameRegistry.registerItem(coloredDoorItem10, "coloredDoorItem10");
		GameRegistry.registerItem(coloredDoorItem11, "coloredDoorItem11");
		GameRegistry.registerItem(coloredDoorItem12, "coloredDoorItem12");
		GameRegistry.registerItem(coloredDoorItem13, "coloredDoorItem13");
		GameRegistry.registerItem(coloredDoorItem14, "coloredDoorItem14");
		GameRegistry.registerItem(coloredDoorItem15, "coloredDoorItem15");
		GameRegistry.registerItem(coloredDoorItem16, "coloredDoorItem16");

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
