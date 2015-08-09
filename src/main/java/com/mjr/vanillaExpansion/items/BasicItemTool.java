package com.mjr.vanillaExpansion.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class BasicItemTool extends Item {
	public BasicItemTool(String name, int maxDamage) {
		super();
		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
		this.setUnlocalizedName(name);
		this.setMaxDamage(maxDamage);
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		ItemStack result = itemStack.copy();
		result.setItemDamage(result.getItemDamage() + 1);
		result.stackSize = 1;
		return result;
	}

	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack p_77630_1_) {
		return false;
	}

	@Override
	public boolean hasContainerItem() {
		return true;
	}
}