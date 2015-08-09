
package com.mjr.vanillaExpansion.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LogBlock extends BlockRotatedPillar {
	
	public String name;
	/********************************************** CONSTRUCTORES **************************************************/
	public LogBlock(String name) {
		super(Material.wood);
		this.setHardness(1.5F);
		this.setHarvestLevel("axe", 0);
		this.setStepSound(Block.soundTypeWood);
		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		this.setBlockName(name);
		this.name = name;
	}
	/********************************************** METODOS PROPIEDADES **************************************************/
	@Override
	public boolean isFlammable(IBlockAccess world, int x, int y, int z, net.minecraftforge.common.util.ForgeDirection face) {
		return true;
	}
    /**
     * Chance that fire will spread and consume this block.
     * 300 being a 100% chance, 0, being a 0% chance.
     *
     * @param world The current world
     * @param x The blocks X position
     * @param y The blocks Y position
     * @param z The blocks Z position
     * @param face The face that the fire is coming from
     * @return A number ranging from 0 to 300 relating used to determine if the block will be consumed by fire
     */
    @Override
	public int getFlammability(IBlockAccess world, int x, int y, int z, ForgeDirection face)
    {
        return 20;
    }
    /**
     * Called when fire is updating on a neighbor block.
     * The higher the number returned, the faster fire will spread around this block.
     *
     * @param world The current world
     * @param x The blocks X position
     * @param y The blocks Y position
     * @param z The blocks Z position
     * @param face The face that the fire is coming from
     * @return A number that is used to determine the speed of fire growth around the block
     */
    @Override
	public int getFireSpreadSpeed(IBlockAccess world, int x, int y, int z, ForgeDirection face)
    {
        return 5;
    }
	@Override
	public int damageDropped(int damage) {
		return 20;
	}
	/**
	 * Limit to valid metadata
	 * @param par1
	 * @return a number between 0 and 3
	 */
	public static int func_150165_c(int par1)
    {
        return par1 & 3;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    @Override
    public Item getItemDropped(int x, Random yRandom, int z)
    {
        return Item.getItemFromBlock(this);
    }
	// Textures
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int p_149691_2_)
	{
	return side == 1 || side == 0 ? this.top : (side == 2 ? this.front : this.blockIcon);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_)
	{
	this.blockIcon = p_149651_1_.registerIcon(Constants.TEXTURE_PREFIX + name);
	this.top = p_149651_1_.registerIcon(Constants.TEXTURE_PREFIX + name +"Top");
	this.front = p_149651_1_.registerIcon(Constants.TEXTURE_PREFIX + name);
	}
	@Override
    public boolean canSustainLeaves(IBlockAccess block, int x, int y, int z)
    {
        return true;
    }
    @Override
    public boolean isWood(IBlockAccess block, int x, int y, int z)
    {
        return true;
    }
    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @Override
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List blockList)
    {
        blockList.add(new ItemStack(item, 1, 0));
    }
    /********************************************** METODOS EVENTOS **************************************************/
    @Override
    public void breakBlock(World world, int x, int y, int z, Block bloque, int meta)
    {
        byte b0 = 4;
        int i1 = b0 + 1;

        if (world.checkChunksExist(x - i1, y - i1, z - i1, x + i1, y + i1, z + i1))
        {
            for (int j1 = -b0; j1 <= b0; ++j1)
            {
                for (int k1 = -b0; k1 <= b0; ++k1)
                {
                    for (int l1 = -b0; l1 <= b0; ++l1)
                    {
                        Block block = world.getBlock(x + j1, y + k1, z + l1);
                        if (block.isLeaves(world, x + j1, y + k1, z + l1))
                        {
                            block.beginLeavesDecay(world, x + j1, y + k1, z + l1);
                        }
                    }
                }
            }
        }
    }

	@Override
	protected IIcon getSideIcon(int arg0) {
		return null;
	}
}