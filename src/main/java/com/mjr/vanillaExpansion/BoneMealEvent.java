package com.mjr.vanillaExpansion;

import com.mjr.vanillaExpansion.blocks.BlockSapling;
import com.mjr.vanillaExpansion.blocks.Blocks_Main;

import net.minecraftforge.event.entity.player.BonemealEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class BoneMealEvent {
	@SubscribeEvent
	public void usedBonemeal(BonemealEvent event) {
		if (event.block == Blocks_Main.bananaSapling) {
			if (!event.world.isRemote) {
				((BlockSapling) Blocks_Main.bananaSapling).markOrGrowMarked(event.world, event.x, event.y, event.z, event.world.rand);
				event.setResult(Result.ALLOW);
			}
		}
		else if (event.block == Blocks_Main.mangoSapling) {
			if (!event.world.isRemote) {
				((BlockSapling) Blocks_Main.mangoSapling).markOrGrowMarked(event.world, event.x, event.y, event.z, event.world.rand);
				event.setResult(Result.ALLOW);
			}
		}
		else if (event.block == Blocks_Main.lemonSapling) {
			if (!event.world.isRemote) {
				((BlockSapling) Blocks_Main.lemonSapling).markOrGrowMarked(event.world, event.x, event.y, event.z, event.world.rand);
				event.setResult(Result.ALLOW);
			}
		}
		else if (event.block == Blocks_Main.cherrySapling) {
			if (!event.world.isRemote) {
				((BlockSapling) Blocks_Main.cherrySapling).markOrGrowMarked(event.world, event.x, event.y, event.z, event.world.rand);
				event.setResult(Result.ALLOW);
			}
		}
	}

}
