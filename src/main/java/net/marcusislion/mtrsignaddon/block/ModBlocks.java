package net.marcusislion.mtrsignaddon.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.marcusislion.mtrsignaddon.MTRSignAddon;
import net.marcusislion.mtrsignaddon.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.marcusislion.mtrsignaddon.block.custom.*;

public class ModBlocks {

    public static final Block POLE = registerBlock("pole",
            new poleBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block TWENTYSIGNBLOCK = registerBlock("twentysignblock",
            new twentySignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block FOURTYSIGNBLOCK = registerBlock("fourtysignblock",
            new fourtySignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block SIXTYSIGNBLOCK = registerBlock("sixtysignblock",
            new sixtySignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block HEITYSIGNBLOCK = registerBlock("heitysignblock",
            new heitySignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block HUNDREDTWENTYSIGNBLOCK = registerBlock("hundredtwentysignblock",
            new twentySignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block HUNDREDSIXTYSIGNBLOCK = registerBlock("hundredsixtysignblock",
            new hundredsixtySignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block TWOHUNDREDSIGNBLOCK = registerBlock("twohundredsignblock",
            new twohHundredSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block THREEHUNDREDSIGNBLOCK = registerBlock("threehundredsignblock",
            new threeHundredSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block DEPOTSIGNBLOCK = registerBlock("depotsignblock",
            new depotSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block DOWNSIGNBLOCK = registerBlock("downsignblock",
            new downSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block UPSIGNBLOCK = registerBlock("upsignblock",
            new upSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block ENDSIGNBLOCK = registerBlock("endsignblock",
            new downSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block LEVELCROSSINGSIGNBLOCK = registerBlock("levelcrossingsignblock",
            new levelcrossingSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block SQUARESIGNBLOCK = registerBlock("squaresignblock",
            new squareSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block STATIONSIGNBLOCK = registerBlock("stationsignblock",
            new stationSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block FOURCARSIGNBLOCK = registerBlock("fourcarsignblock",
            new fourcarSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block SIXCARSIGNBLOCK = registerBlock("sixcarsignblock",
            new sixcarSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block HEIGHTCARSIGNBLOCK = registerBlock("heightcarsignblock",
            new heightcarSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block TENCARSIGNBLOCK = registerBlock("tencarsignblock",
            new tencarSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block TWELVCARCARSIGNBLOCK = registerBlock("twelvcarsignblock",
            new twelvcarSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block FOURTEENCARSIGNBLOCK = registerBlock("fourteencarsignblock",
            new fourteencarSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block SIXTEENCARSIGNBLOCK = registerBlock("sixteencarsignblock",
            new sixteencarSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block PLATEFORMELSIGNBLOCK = registerBlock("plateformelsignblock",
            new plateformelSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block PLATEFORMERSIGNBLOCK = registerBlock("plateformersignblock",
            new plateformerSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block NOVENTSIGNBLOCK = registerBlock("noventsignblock",
            new noventSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block LEFTSSIGNBLOCK = registerBlock("leftssignblock",
            new leftsSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block RIGHTSSIGNBLOCK = registerBlock("rightssignblock",
            new rightsSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block TUNNELSIGNBLOCK = registerBlock("tunnelsignblock",
            new tunnelSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block WHEEZINGSIGNBLOCK = registerBlock("wheezingsignblock",
            new wheezingSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block SWITCHOHSIGNBLOCK = registerBlock("switchohsignblock",
            new switchohSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block SWITCHTHSIGNBLOCK = registerBlock("switchthsignblock",
            new switchthSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block SWITCHTHHSIGNBLOCK = registerBlock("switchthhsignblock",
            new switchthhSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnPole);

    public static final Block DOUWNGROUNDSIGNBLOCK = registerBlock("downgroundsignblock",
            new downgroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block UPGROUNDSIGNBLOCK = registerBlock("upgroundsignblock",
            new downgroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block TWENTYGROUNDSIGNBLOCK = registerBlock("twentygroundsignblock",
            new twentygroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block FOURTYGROUNDSIGNBLOCK = registerBlock("fourtygroundsignblock",
            new fourtygroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block SIXTYGROUNDSIGNBLOCK = registerBlock("sixtygroundsignblock",
            new sixtygroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block HEIGHTYGROUNDSIGNBLOCK = registerBlock("heightygroundsignblock",
            new heightygroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block HUNDREDTWENTYGROUNDSIGNBLOCK = registerBlock("hundredtwentygroundsignblock",
            new hundredtwentygroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block HUNDREDSIXTYGROUNDSIGNBLOCK = registerBlock("hundredsixtygroundsignblock",
            new hundredsixtygroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block TWOHUNDREDGROUNDSIGNBLOCK = registerBlock("twohundredgroundsignblock",
            new twohundredgroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block THREEHUNDREDGROUNDSIGNBLOCK = registerBlock("threehundredgroundsignblock",
            new threehundredgroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block DEPOTGROUNDSIGNBLOCK = registerBlock("depotgroundsignblock",
            new depotgroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block ENDGROUNDSIGNBLOCK = registerBlock("endgroundsignblock",
            new endgroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block LEFTSGROUNDSIGNBLOCK = registerBlock("leftsgroundsignblock",
            new leftsgroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block RIGHTSGROUNDSIGNBLOCK = registerBlock("rightsgroundsignblock",
            new rightsgroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block LEVELCROSSINGGROUNDSIGNBLOCK = registerBlock("levelcrossinggroundsignblock",
            new levelcrossinggroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block SQUAREGROUNDSIGNBLOCK = registerBlock("squaregroundsignblock",
            new squaregroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block STATIONGROUNDSIGNBLOCK = registerBlock("stationgroundsignblock",
            new stationgroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block NOVENTGROUNDSIGNBLOCK = registerBlock("noventgroundsignblock",
            new noventgroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block TUNNELGROUNDSIGNBLOCK = registerBlock("tunnelgroundsignblock",
            new tunnelgroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block WHEEZINGGROUNDSIGNBLOCK = registerBlock("wheezinggroundsignblock",
            new wheezinggroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block SWITCHOHGROUNDSIGNBLOCK = registerBlock("switchohgroundsignblock",
            new switchohgroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block SWITCHTHGROUNDSIGNBLOCK = registerBlock("switchthgroundsignblock",
            new switchthgroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block SWITCHTHHGROUNDSIGNBLOCK = registerBlock("switchthhgroundsignblock",
            new switchthhgroundSignBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnGround);

    public static final Block POLELEFTCONNEXIONSIGNBLOCK = registerBlock("poleleftconnection",
            new poleleftconnexionBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnSignalingGallows);

    public static final Block POLERIGHTCONNEXIONSIGNBLOCK = registerBlock("polerightconnection",
            new polerightconnexionBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnSignalingGallows);

    public static final Block POLEHORIZONTALCONNEXIONSIGNBLOCK = registerBlock("polehorizontalconnection",
            new polehorizontalconnexionBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnSignalingGallows);

    public static final Block POLEMIDDLECONNEXIONSIGNBLOCK = registerBlock("polemiddleconnection",
            new polemiddleconnexionBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnSignalingGallows);

    public static final Block TWENTYGALLOWSSIGNBLOCK = registerBlock("twentygallows",
            new twentyGallowsBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnSignalingGallows);

    public static final Block FOURTYGALLOWSSIGNBLOCK = registerBlock("fourtygallows",
            new fourtyGallowsBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnSignalingGallows);

    public static final Block SIXTYGALLOWSSIGNBLOCK = registerBlock("sixtygallows",
            new sixtyGallowsBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnSignalingGallows);

    public static final Block HEIGHTYGALLOWSSIGNBLOCK = registerBlock("heightygallows",
            new heightyGallowsBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnSignalingGallows);

    public static final Block HUNDREDTWENTYGALLOWSSIGNBLOCK = registerBlock("hundredtwentygallows",
            new hundredtwentyGallowsBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnSignalingGallows);

    public static final Block HUNDREDSIXTYGALLOWSSIGNBLOCK = registerBlock("hundredsixtygallows",
            new hundredsixtyGallowsBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnSignalingGallows);

    public static final Block TWOHUNDREDGALLOWSSIGNBLOCK = registerBlock("twohundredgallows",
            new twohundredGallowsBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnSignalingGallows);

    public static final Block THREEHUNDREDGALLOWSSIGNBLOCK = registerBlock("threehundredgallows",
            new threehundredGallowsBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnSignalingGallows);

    public static final Block SQUAREGALLOWSSIGNBLOCK = registerBlock("squaregallows",
            new squareGallowsBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)),
            ModItemGroup.SignAddonOnSignalingGallows);

    // Méthode mise à jour pour enregistrer les blocs et les associer à un groupe d'items
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MTRSignAddon.MOD_ID, name), block);
    }

    // Méthode mise à jour pour enregistrer les items des blocs avec le groupe spécifié
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MTRSignAddon.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        MTRSignAddon.LOGGER.info("Registering mod blocks for the " + MTRSignAddon.MOD_ID + " mod.");
        MTRSignAddon.LOGGER.info("Block : POLE");
        MTRSignAddon.LOGGER.info("Block : TWENTYSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : FOURTYSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : SIXTYSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : HEITYSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : HUNDREDTWENTYSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : HUNDREDSIXTYSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : TWOHUNDREDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : THREEHUNDREDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : DEPOTSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : DOWNSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : UPSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : ENDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : LEVELCROSSINGSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : SQUARESIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : STATIONSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : FOURCARSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : SIXCARSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : HEIGHTCARSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : TENCARSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : TWELVCARCARSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : FOURTEENCARSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : SIXTEENCARSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : PLATEFORMELSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : PLATEFORMERSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : NOVENTSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : LEFTSSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : RIGHTSSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : TUNNELSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : WHEEZINGSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : SWITCHOHSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : SWITCHTHSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : SWITCHTHHSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : DOUWNGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : UPGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : TWENTYGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : FOURTYGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : SIXTYGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : HEIGHTYGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : HUNDREDTWENTYGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : HUNDREDSIXTYGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : TWOHUNDREDGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : THREEHUNDREDGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : DEPOTGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : ENDGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : LEFTSGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : RIGHTSGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : LEVELCROSSINGGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : SQUAREGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : STATIONGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : NOVENTGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : TUNNELGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : WHEEZINGGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : SWITCHOHGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : SWITCHTHGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : SWITCHTHHGROUNDSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : POLELEFTCONNEXIONSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : POLERIGHTCONNEXIONSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : POLEHORIZONTALCONNEXIONSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : POLEMIDDLECONNEXIONSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : TWENTYGALLOWSSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : FOURTYGALLOWSSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : SIXTYGALLOWSSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : HEIGHTYGALLOWSSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : HUNDREDTWENTYGALLOWSSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : HUNDREDSIXTYGALLOWSSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : TWOHUNDREDGALLOWSSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : THREEHUNDREDGALLOWSSIGNBLOCK");
        MTRSignAddon.LOGGER.info("Block : SQUAREGALLOWSSIGNBLOCK");
    }
}
