package com.mjr.vanillaExpansion.items;

import net.minecraft.item.Item;

import com.mjr.vanillaExpansion.Constants;

public class BasicItem  extends Item{
	public BasicItem(String name) {
		super();
		//this.setCreativeTab(AdditionalFood.ItemsTab);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
		this.setUnlocalizedName(name);
	}
}