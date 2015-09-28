package com.mjr.vanillaExpansion.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemMeta extends ItemBlock
{
    public ItemMeta(Block block)
    {
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int meta)
    {
        return meta;
    }
    @Override
	public String getUnlocalizedName(ItemStack stack) {
    	int i = stack.getItemDamage();
		return super.getUnlocalizedName(stack) + "." + ItemDye.field_150921_b[(ItemDye.field_150921_b.length - 1) - (i % 16)];
	}
}