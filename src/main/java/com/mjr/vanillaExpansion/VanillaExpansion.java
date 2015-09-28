package com.mjr.vanillaExpansion;

import java.util.ArrayList;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;

import com.mjr.vanillaExpansion.blocks.Blocks_Main;
import com.mjr.vanillaExpansion.blocks.crops.BlocksFoodCrops;
import com.mjr.vanillaExpansion.items.Items_Main;
import com.mjr.vanillaExpansion.worldgen.TreeWorldGenerator;

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

	public static CreativeTabs vanillaExpansionTab = new CreativeTabs("vanillaExpansionTab") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Blocks_Main.purpleStainedClayHalfSlab);
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		VanillaExpansion.proxy.preInit(event);
		removeRecipe(new ItemStack(Items.bread));
		removeRecipe(new ItemStack(Items.cake));
		removeRecipe(new ItemStack(Items.wooden_door));
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Blocks_Main.init();
		Items_Main.init();
		BlocksFoodCrops.initializeCrops();
		BlocksFoodCrops.registerCrops();
		GameRegistry.registerWorldGenerator(new TreeWorldGenerator(), 20);
		MinecraftForge.EVENT_BUS.register(new BoneMealEvent());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		VanillaExpansion.proxy.postInit(event);
		Recipes.registerCraftingRecipes();
		Recipes.furnaceRecipes();
		MinecraftForge.addGrassSeed(new ItemStack(BlocksFoodCrops.grapeSeed), 10);
		MinecraftForge.addGrassSeed(new ItemStack(BlocksFoodCrops.lettuceSeed), 10);
		MinecraftForge.addGrassSeed(new ItemStack(BlocksFoodCrops.strawberrySeed), 10);
	}

	private static void removeRecipe(ItemStack resultItem) {
		ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();

		for (int scan = 0; scan < recipes.size(); scan++) {
			IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
			ItemStack recipeResult = tmpRecipe.getRecipeOutput();
			if (ItemStack.areItemStacksEqual(resultItem, recipeResult)) {
				recipes.remove(scan);
			}
		}
	}
}
