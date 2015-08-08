package com.mjr.vanillaExpansion;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;
import com.mjr.vanillaExpansion.items.Items_Main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.modID, name = Constants.modName, version = Constants.modVersion)
public class VanillaExpansion {
	@SidedProxy(clientSide = "com.mjr.vanillaExpansion.ClientProxy", serverSide = "com.mjr.vanillaExpansion.CommonProxy")
	public static CommonProxy proxy;

	@Instance(Constants.modID)
	public static VanillaExpansion instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		this.proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Blocks_Main.init();
		Items_Main.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		this.proxy.postInit(event);
		Recipes.registerCraftingRecipes();
	}
}
