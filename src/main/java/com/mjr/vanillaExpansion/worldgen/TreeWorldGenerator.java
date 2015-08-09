package com.mjr.vanillaExpansion.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class TreeWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
	}

	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		int minHeight = 50;
		int treesPerChunk = 1;
        for(int k = 0; k < treesPerChunk; k++){
			int chunkX1 = chunkX + random.nextInt(16);
			int chunkY1 = minHeight + random.nextInt(40);
			int chunkZ1 = chunkZ + random.nextInt(16);

			BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
			if(b == BiomeGenBase.river
					|| b == BiomeGenBase.forest
					|| b == BiomeGenBase.plains
					|| b == BiomeGenBase.forestHills
					|| b == BiomeGenBase.extremeHills
					|| b == BiomeGenBase.extremeHillsEdge
					|| b == BiomeGenBase.extremeHillsPlus)
			{
				(new WorldGenTreesBanana(true, 10, 0, 0, false)).generate(world, random, chunkX1, chunkY1, chunkZ1);
			}
        }
        for(int k = 0; k < treesPerChunk; k++){
			int chunkX1 = chunkX + random.nextInt(16);
			int chunkY1 = minHeight + random.nextInt(40);
			int chunkZ1 = chunkZ + random.nextInt(16);

			BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
			if(b == BiomeGenBase.river
					|| b == BiomeGenBase.forest
					|| b == BiomeGenBase.plains
					|| b == BiomeGenBase.forestHills
					|| b == BiomeGenBase.extremeHills
					|| b == BiomeGenBase.extremeHillsEdge
					|| b == BiomeGenBase.extremeHillsPlus)
			{
				(new WorldGenTreesLemon(true, 10, 0, 0, false)).generate(world, random, chunkX1, chunkY1, chunkZ1);
			}
        }
        for(int k = 0; k < treesPerChunk; k++){
			int chunkX1 = chunkX + random.nextInt(16);
			int chunkY1 = minHeight + random.nextInt(40);
			int chunkZ1 = chunkZ + random.nextInt(16);

			BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
			if(b == BiomeGenBase.river
					|| b == BiomeGenBase.forest
					|| b == BiomeGenBase.plains
					|| b == BiomeGenBase.forestHills
					|| b == BiomeGenBase.extremeHills
					|| b == BiomeGenBase.extremeHillsEdge
					|| b == BiomeGenBase.extremeHillsPlus)
			{
				(new WorldGenTreesMango(true, 10, 0, 0, false)).generate(world, random, chunkX1, chunkY1, chunkZ1);
			}
        }
        for(int k = 0; k < treesPerChunk; k++){
			int chunkX1 = chunkX + random.nextInt(16);
			int chunkY1 = minHeight + random.nextInt(40);
			int chunkZ1 = chunkZ + random.nextInt(16);

			BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
			if(b == BiomeGenBase.river
					|| b == BiomeGenBase.forest
					|| b == BiomeGenBase.plains
					|| b == BiomeGenBase.forestHills
					|| b == BiomeGenBase.extremeHills
					|| b == BiomeGenBase.extremeHillsEdge
					|| b == BiomeGenBase.extremeHillsPlus)
			{
				(new WorldGenTreesCherry(true, 10, 0, 0, false)).generate(world, random, chunkX1, chunkY1, chunkZ1);
			}
        }
	}

	private void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

}