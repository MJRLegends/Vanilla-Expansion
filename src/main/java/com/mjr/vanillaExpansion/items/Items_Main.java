package com.mjr.vanillaExpansion.items;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items_Main {
	
	public static Item goldDoorItem = new ItemDoorItem("gold");
	public static Item diamondDoorItem = new ItemDoorItem("diamond");
	
	public static Item darkOakDoorItem = new ItemDoorItem("dark_oak");
	public static Item spruceDoorItem = new ItemDoorItem("spruce");
	public static Item jungleDoorItem = new ItemDoorItem("jungle");
	public static Item acaciaDoorItem = new ItemDoorItem("acacia");
	public static Item birchDoorItem = new ItemDoorItem("birch");
	
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
	}
}
