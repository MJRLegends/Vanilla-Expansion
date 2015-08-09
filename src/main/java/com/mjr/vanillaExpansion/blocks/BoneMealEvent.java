package com.mjr.vanillaExpansion.blocks;

import net.minecraftforge.event.entity.player.BonemealEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class BoneMealEvent {
	@SubscribeEvent
	public void usedBonemeal(BonemealEvent event) {
		if (event.block == Blocks_Main.bananaSapling) {
			if (!event.world.isRemote) {
				((SaplingBlock) Blocks_Main.bananaSapling).markOrGrowMarked(event.world, event.x, event.y, event.z, event.world.rand);
				event.setResult(Result.ALLOW);
			}
		}
	}

}
