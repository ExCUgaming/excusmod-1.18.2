package com.mysticalsurvival.excusmod;

import com.mysticalsurvival.excusmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcusMod implements ModInitializer {
	public static final String MOD_ID = "excusmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}