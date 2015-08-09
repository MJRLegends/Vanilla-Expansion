package com.mjr.vanillaExpansion.items;

import net.minecraft.item.Item;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

public class BasicItem  extends Item{
	public BasicItem(String name) {
		super();
		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
		this.setUnlocalizedName(name);
	}
}