package com.mjr.vanillaExpansion.items;

import net.minecraft.item.ItemFood;

import com.mjr.vanillaExpansion.Constants;

public class BasicFoodItem extends ItemFood{

	public BasicFoodItem(int i, int j, boolean b, String name) {
		super(j, b);
		//this.setCreativeTab(AdditionalFood.ItemsTab);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
		this.setUnlocalizedName(name);
	}

}
