package com.mjr.vanillaExpansion.blocks;

import java.util.List;

import com.mjr.vanillaExpansion.VanillaExpansion;

import net.minecraft.block.BlockButton;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCustomButtons extends BlockButton
{
	@SideOnly(Side.CLIENT)
	public static final String[] baseNames = new String[] {"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"};

	private int meta;
    protected BlockCustomButtons(int blockMeta, String name)
    {
        super(false);
        this.meta = blockMeta;
        if(name.contains("colored"))
        	this.setBlockName(name + "_" + baseNames[meta]);
        else
        	this.setBlockName(name);
        this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return Blocks_Main.coloredWoodPlanks.getIcon(1, meta);
    }
}