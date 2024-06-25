package net.marcusislion.mtrsignaddon;

import net.fabricmc.api.ModInitializer;
import net.marcusislion.mtrsignaddon.block.ModBlocks;
import net.marcusislion.mtrsignaddon.item.ModItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MTRSignAddon implements ModInitializer {
	public static final String MOD_ID = "mtrsignaddon";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		MTRSignAddon.LOGGER.info("Start generation of the : " + MTRSignAddon.MOD_ID + " mod.");
		ModBlocks.registerModBlocks();
		ModItemGroup.registerItemGroups();
	}
}
