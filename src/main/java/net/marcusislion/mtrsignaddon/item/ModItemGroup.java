package net.marcusislion.mtrsignaddon.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.marcusislion.mtrsignaddon.MTRSignAddon;
import net.marcusislion.mtrsignaddon.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SignAddonOnPole = FabricItemGroupBuilder.build(
            new Identifier(MTRSignAddon.MOD_ID, "signaddononpole"),
            () -> new ItemStack(ModBlocks.TWENTYSIGNBLOCK)
    );

    public static final ItemGroup SignAddonOnGround = FabricItemGroupBuilder.build(
            new Identifier(MTRSignAddon.MOD_ID, "signaddononground"),
            () -> new ItemStack(ModBlocks.TWENTYGROUNDSIGNBLOCK)
    );

    public static final ItemGroup SignAddonOnSignalingGallows = FabricItemGroupBuilder.build(
            new Identifier(MTRSignAddon.MOD_ID, "signaddononsignalinggallows"),
            () -> new ItemStack(ModBlocks.TWENTYGALLOWSSIGNBLOCK)
    );

    public static void registerItemGroups(){
        MTRSignAddon.LOGGER.info("Registering Item Groups for : " + MTRSignAddon.MOD_ID);
        MTRSignAddon.LOGGER.info("Item Group : SignAddonOnPole");
        MTRSignAddon.LOGGER.info("Item Group : SignAddonOnGround");
        MTRSignAddon.LOGGER.info("Item Group : SignAddonOnSignalingGallows");
    }
}
