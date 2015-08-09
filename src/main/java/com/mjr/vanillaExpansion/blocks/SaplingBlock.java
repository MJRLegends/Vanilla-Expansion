package com.mjr.vanillaExpansion.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.mjr.vanillaExpansion.Constants;
import com.mjr.vanillaExpansion.VanillaExpansion;
import com.mjr.vanillaExpansion.worldgen.WorldGenTreesBanana;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SaplingBlock extends BlockFlower {

	/****************************************** VARIABLES *********************************************/
	public String name;
	
    
	public final String[] typesSapling;
	
	private final IIcon[] textures;

	/****************************************** CONSTRUCTOR *********************************************/
	public SaplingBlock(String name) {
		super(0);
		this.stepSound = soundTypeGrass;
		this.setHardness(0.0F);
		float f = 0.4F;
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		this.setCreativeTab(VanillaExpansion.vanillaExpansionTab);
		this.setBlockName(name);
		this.name = name;
		typesSapling = new String[] { Constants.TEXTURE_PREFIX + name };
		textures = new IIcon[typesSapling.length];
	}

	/****************************************** METODOS PROPIEDADES *********************************************/
	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		meta &= 7;
		return textures[MathHelper.clamp_int(meta, 0, 5)];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconReg) {
		for (int i = 0; i < textures.length; ++i) {
			textures[i] = iconReg.registerIcon(typesSapling[i]);
		}
	}

    /**
     * Determines if the same sapling is present at the given location.
     */
    public boolean isSameSapling(World par1World, int par2, int par3, int par4, int par5)
    {
        return par1World.getBlock(par2, par3, par4) == this && (par1World.getBlockMetadata(par2, par3, par4) & 3) == par5;
    }
	/**
	 * Determines the damage on the item the block drops. Used in cloth and
	 * wood.
	 */
	@Override
	public int damageDropped(int par1) {
		return par1 & 3;
	}

	/**
	 * returns a list of blocks with the same ID, but different meta (eg: wood
	 * returns 4 blocks)
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tab, List listSaplings) {
		listSaplings.add(new ItemStack(item, 1, 0));
	}

	/****************************************** METODOS PROPIOS *********************************************/
	/**
	 * Mark or Grow marked
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @param par1Random
	 */
	public void markOrGrowMarked(World world, int x, int y, int z,	Random par1Random) {
		int l = world.getBlockMetadata(x, y, z);

		if ((l & 8) == 0) {
			world.setBlockMetadataWithNotify(x, y, z, l | 8, 4);
		} else {
			this.growTree(world, x, y, z, par1Random);
		}
	}

	/**
	 * Grow tree function
	 ***/
	public void growTree(World world, int x, int y, int z, Random par1Random) {
		if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
		int l = world.getBlockMetadata(x, y, z) & 7;
		Object object = null;
		int i1 = 0;
		int j1 = 0;
		object = new WorldGenTreesBanana(true, (2 + par1Random.nextInt(4)) * 2, 0, 0, false);
		world.setBlock(x, y, z, Blocks.air, 0, 4);
		if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
			world.setBlock(x, y, z, this, l, 4);
		}
	}

	/****************************************** METODOS EVENTOS *********************************************/
	/**
	 * Ticks the block if it's been scheduled
	 */
	@Override
	public void updateTick(World world, int x, int y, int z, Random par1Random) {
		if (!world.isRemote) {
			super.updateTick(world, x, y, z, par1Random);

			if (world.getBlockLightValue(x, y + 1, z) >= 9 && par1Random.nextInt(7) == 0) {
				this.markOrGrowMarked(world, x, y, z, par1Random);
			}
		}
	}

}