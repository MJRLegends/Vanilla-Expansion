package com.mjr.vanillaExpansion.blocks.crops;

import net.minecraft.item.Item;

import com.mjr.vanillaExpansion.blocks.BlockCrop;
import com.mjr.vanillaExpansion.items.Items_Main;

public class StrawberryCrop extends BlockCrop{

	public StrawberryCrop() {
		super("strawberry");
	}
	@Override
    protected Item func_149866_i()
    {
        return BlocksFoodCrops.strawberrySeed;
    }
	
	@Override
    protected Item func_149865_P()
    {
        return Items_Main.strawberry;
    }
}
