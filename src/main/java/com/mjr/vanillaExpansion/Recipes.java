package com.mjr.vanillaExpansion;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void registerCraftingRecipes() {
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.sandHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.sand, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.redSandHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.sand, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.goldBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.gold_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.diamondBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.diamond_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.ironBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.iron_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.coalBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.coal_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.lapisBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.lapis_block, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.netherrackBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.netherrack, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.redstoneBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.redstone_block, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.whiteWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.orangeWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.magentaWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.lightBlueWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.yellowWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.limeWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.pinkWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 6) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.grayWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 7) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.lightGrayWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 8) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.cyanWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 9) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.purpleWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 10) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.blueWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 11) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.brownWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 12) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.greenWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 13) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.redWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.blackWoolBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.wool, 1, 15) });

		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.dirtBlockHalfSlab, 1), new Object[] { "XXX", 'X', new ItemStack(Blocks.dirt, 1, 0) });
		
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.sandStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.sand, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.redSandStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.sand, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.goldBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.gold_block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.diamondBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.diamond_block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.ironBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.iron_block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.coalBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.coal_block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.lapisBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.lapis_block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.netherrackBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.netherrack, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.redstoneBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.redstone_block, 1, 0)});
		
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.whiteWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.orangeWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.magentaWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.lightBlueWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.yellowWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.limeWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.pinkWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 6)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.grayWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 7)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.lightBlueWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 8)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.cyanWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 9)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.purpleWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 10)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.blueWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 11)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.brownWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 12)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.greenWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 13)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.redWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 14)});
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.blackWoolBlockStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.wool, 1, 15)});
	
		GameRegistry.addRecipe(new ItemStack(VanillaExpansion.dirtStairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.dirt, 1, 0) });
	}
}
