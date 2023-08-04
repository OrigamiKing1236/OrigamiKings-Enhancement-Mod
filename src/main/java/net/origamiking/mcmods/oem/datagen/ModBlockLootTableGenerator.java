package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.origamiking.mcmods.oem.blocks.amethyst.AmethystBlocks;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteSlabs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteStairs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteWalls;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.copper.WaxedCopperBlocks;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.gold.GoldBlocks;
import net.origamiking.mcmods.oem.blocks.leaves.LeafCarpets;
import net.origamiking.mcmods.oem.blocks.leaves.LeafSlabs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafStairs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafWalls;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.sculk.SculkBlocks;
import net.origamiking.mcmods.oem.blocks.sponge.ModSpongeBlocks;
import net.origamiking.mcmods.oem.blocks.terracotta.TerracottaSlabs;
import net.origamiking.mcmods.oem.blocks.terracotta.TerracottaStairs;
import net.origamiking.mcmods.oem.blocks.terracotta.TerracottaWalls;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.concrete.ConcreteVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.copper.CopperVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.glass.GlassVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.stone.StoneVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.wood.WoodVSlabs;
import net.origamiking.mcmods.oem.blocks.wood.acacia.AcaciaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.azalea.AzaleaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.birch.BirchWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.crimson.CrimsonWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.darkoak.DarkOakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.jungle.JungleWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.mangrove.MangroveWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.oak.OakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.spruce.SpruceWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.warped.WarpedWoodBlocks;
import net.origamiking.mcmods.oem.blocks.woodcutter.ModWoodcutter;
import net.origamiking.mcmods.oem.blocks.wool.black.BlackWool;
import net.origamiking.mcmods.oem.blocks.wool.blue.BlueWool;
import net.origamiking.mcmods.oem.blocks.wool.brown.BrownWool;
import net.origamiking.mcmods.oem.blocks.wool.cyan.CyanWool;
import net.origamiking.mcmods.oem.blocks.wool.gray.GrayWool;
import net.origamiking.mcmods.oem.blocks.wool.green.GreenWool;
import net.origamiking.mcmods.oem.blocks.wool.light_gray.LightGrayWool;
import net.origamiking.mcmods.oem.blocks.wool.lightblue.LightBlueWool;
import net.origamiking.mcmods.oem.blocks.wool.lime.LimeWool;
import net.origamiking.mcmods.oem.blocks.wool.magenta.MagentaWool;
import net.origamiking.mcmods.oem.blocks.wool.orange.OrangeWool;
import net.origamiking.mcmods.oem.blocks.wool.pink.PinkWool;
import net.origamiking.mcmods.oem.blocks.wool.purple.PurpleWool;
import net.origamiking.mcmods.oem.blocks.wool.red.RedWool;
import net.origamiking.mcmods.oem.blocks.wool.white.WhiteWool;
import net.origamiking.mcmods.oem.blocks.wool.yellow.YellowWool;
import net.origamiking.mcmods.oemextra.extra.blocks.serverspecific.ServerSpecificBlocks;
import net.origamiking.mcmods.oemextra.extra.blocks.verticalstairs.stone.StoneVStairs;
import net.origamiking.mcmods.oemextra.extra.blocks.verticalstairs.wood.WoodVStairs;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ConcreteStairs.WHITE_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.WHITE_CONCRETE_SLAB);
        addDrop(ConcreteStairs.LIGHT_GRAY_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.LIGHT_GRAY_CONCRETE_SLAB);
        addDrop(ConcreteStairs.GRAY_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.GRAY_CONCRETE_SLAB);
        addDrop(ConcreteStairs.BLACK_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.BLACK_CONCRETE_SLAB);
        addDrop(ConcreteStairs.BROWN_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.BROWN_CONCRETE_SLAB);
        addDrop(ConcreteStairs.RED_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.RED_CONCRETE_SLAB);
        addDrop(ConcreteStairs.ORANGE_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.ORANGE_CONCRETE_SLAB);
        addDrop(ConcreteStairs.YELLOW_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.YELLOW_CONCRETE_SLAB);
        addDrop(ConcreteStairs.LIME_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.LIME_CONCRETE_SLAB);
        addDrop(ConcreteStairs.GREEN_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.GREEN_CONCRETE_SLAB);
        addDrop(ConcreteStairs.CYAN_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.CYAN_CONCRETE_SLAB);
        addDrop(ConcreteStairs.LIGHT_BLUE_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.LIGHT_BLUE_CONCRETE_SLAB);
        addDrop(ConcreteStairs.BLUE_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.BLUE_CONCRETE_SLAB);
        addDrop(ConcreteStairs.PURPLE_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.PURPLE_CONCRETE_SLAB);
        addDrop(ConcreteStairs.MAGENTA_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.MAGENTA_CONCRETE_SLAB);
        addDrop(ConcreteStairs.PINK_CONCRETE_STAIR);
        addDrop(ConcreteSlabs.PINK_CONCRETE_SLAB);
        addDrop(SculkBlocks.SCULK_STAIR);
        addDrop(SculkBlocks.SCULK_SLAB);
        addDrop(OakWoodBlocks.OAK_BARREL);
        addDrop(OakWoodBlocks.OAK_LADDER);
        addDrop(SpruceWoodBlocks.SPRUCE_BARREL);
        addDrop(SpruceWoodBlocks.SPRUCE_LADDER);
        addDrop(SpruceWoodBlocks.SPRUCE_BOOKSHELF);
        addDrop(BirchWoodBlocks.BIRCH_LADDER);
        addDrop(BirchWoodBlocks.BIRCH_BARREL);
        addDrop(BirchWoodBlocks.BIRCH_BOOKSHELF);
        addDrop(JungleWoodBlocks.JUNGLE_LADDER);
        addDrop(JungleWoodBlocks.JUNGLE_BOOKSHELF);
        addDrop(JungleWoodBlocks.JUNGLE_BARREL);
        addDrop(AcaciaWoodBlocks.ACACIA_LADDER);
        addDrop(AcaciaWoodBlocks.ACACIA_BOOKSHELF);
        addDrop(AcaciaWoodBlocks.ACACIA_BARREL);
        addDrop(DarkOakWoodBlocks.DARK_OAK_LADDER);
        addDrop(DarkOakWoodBlocks.DARK_OAK_BOOKSHELF);
        addDrop(DarkOakWoodBlocks.DARK_OAK_BARREL);
        addDrop(MangroveWoodBlocks.MANGROVE_LADDER);
        addDrop(MangroveWoodBlocks.MANGROVE_BARREL);
        addDrop(MangroveWoodBlocks.MANGROVE_BOOKSHELF);
        addDrop(CrimsonWoodBlocks.CRIMSON_LADDER);
        addDrop(CrimsonWoodBlocks.CRIMSON_BARREL);
        addDrop(CrimsonWoodBlocks.CRIMSON_BOOKSHELF);
        addDrop(WarpedWoodBlocks.WARPED_LADDER);
        addDrop(WarpedWoodBlocks.WARPED_BARREL);
        addDrop(WarpedWoodBlocks.WARPED_BOOKSHELF);
        addDrop(GoldBlocks.GOLD_CHAIN);
        addDropWithSilkTouch(GlassBlocks.WHITE_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.WHITE_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.LIGHT_GRAY_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.LIGHT_GRAY_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.GRAY_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.GRAY_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.BLACK_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.BLACK_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.BROWN_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.BROWN_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.RED_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.RED_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.ORANGE_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.ORANGE_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.YELLOW_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.YELLOW_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.LIME_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.LIME_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.GREEN_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.GREEN_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.CYAN_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.CYAN_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.LIGHT_BLUE_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.LIGHT_BLUE_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.BLUE_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.BLUE_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.PURPLE_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.PURPLE_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.MAGENTA_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.MAGENTA_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.PINK_GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.PINK_GLASS_STAIR);
        addDropWithSilkTouch(GlassBlocks.GLASS_SLAB);
        addDropWithSilkTouch(GlassBlocks.GLASS_STAIR);
        addDrop(ServerSpecificBlocks.CAVERNS_BLOCK_ONE);
        addDrop(ServerSpecificBlocks.CAVERNS_BLOCK_TWO);
        addDrop(ServerSpecificBlocks.CAVERNS_BLOCK_THREE);
        addDrop(ServerSpecificBlocks.CAVERNS_BLOCK_FOUR);
        addDrop(ServerSpecificBlocks.CAVERNS_BLOCK_FIVE);
        addDrop(ServerSpecificBlocks.CAVERNS_BLOCK_SIX);
        addDrop(GoldBlocks.GOLD_LANTERN);
        addDrop(AmethystBlocks.AMETHYST_SLAB);
        addDrop(AmethystBlocks.AMETHYST_STAIR);
        addDrop(RandomBlocks.CALSITE_SLAB);
        addDrop(RandomBlocks.CALSITE_STAIRS);
        addDrop(RandomBlocks.TUFF_SLAB);
        addDrop(RandomBlocks.TUFF_STAIRS);
        addDrop(RandomBlocks.SMOOTH_BASALT_SLAB);
        addDrop(RandomBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(RandomBlocks.DRIPSTONE_SLAB);
        addDrop(RandomBlocks.DRIPSTONE_STAIRS);
        addDrop(RandomBlocks.NETHERRACK_SLAB);
        addDrop(RandomBlocks.NETHERRACK_STAIRS);
        addDrop(RandomBlocks.SNOW_SLAB);
        addDrop(RandomBlocks.SNOW_STAIRS);
        addDrop(AmethystBlocks.AMETHYST_WALL);
        addDrop(RandomBlocks.CALSITE_WALL);
        addDrop(RandomBlocks.TUFF_WALL);
        addDrop(RandomBlocks.SMOOTH_BASALT_WALL);
        addDrop(RandomBlocks.NETHERRACK_WALL);
        addDrop(RandomBlocks.DRIPSTONE_WALL);
        addDrop(RandomBlocks.SNOW_WALL);
        addDrop(CopperBlocks.COPPER_CHAIN);
        addDrop(CopperBlocks.COPPER_BARS);
        addDrop(CopperBlocks.WEATHERED_COPPER_BARS);
        addDrop(CopperBlocks.EXPOSED_COPPER_BARS);
        addDrop(CopperBlocks.OXIDIZED_COPPER_BARS);
        addDrop(CopperBlocks.COPPER_LANTERN);
        addDrop(CopperBlocks.COPPER_PRESSURE_PLATE);
        addDrop(CopperBlocks.EXPOSED_COPPER_CHAIN);
        addDrop(CopperBlocks.WEATHERED_COPPER_CHAIN);
        addDrop(CopperBlocks.OXIDIZED_COPPER_CHAIN);
        addDrop(CopperBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
        addDrop(CopperBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
        addDrop(CopperBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
        addDrop(CopperBlocks.COPPER_BUTTON);
        addDrop(CopperBlocks.EXPOSED_COPPER_BUTTON);
        addDrop(CopperBlocks.WEATHERED_COPPER_BUTTON);
        addDrop(CopperBlocks.OXIDIZED_COPPER_BUTTON);
        addDrop(CopperBlocks.COPPER_DOOR);
        addDrop(CopperBlocks.COPPER_TRAPDOOR);
        addDrop(WhiteWool.WHITE_WOOL_STAIRS);
        addDrop(WhiteWool.WHITE_WOOL_WALL);
        addDrop(WhiteWool.WHITE_WOOL_SLAB);
        addDrop(LightGrayWool.LIGHT_GRAY_WOOL_STAIRS);
        addDrop(LightGrayWool.LIGHT_GRAY_WOOL_WALL);
        addDrop(LightGrayWool.LIGHT_GRAY_WOOL_SLAB);
        addDrop(GrayWool.GRAY_WOOL_STAIRS);
        addDrop(GrayWool.GRAY_WOOL_WALL);
        addDrop(GrayWool.GRAY_WOOL_SLAB);
        addDrop(BlackWool.BLACK_WOOL_STAIRS);
        addDrop(BlackWool.BLACK_WOOL_WALL);
        addDrop(BlackWool.BLACK_WOOL_SLAB);
        addDrop(BrownWool.BROWN_WOOL_STAIRS);
        addDrop(BrownWool.BROWN_WOOL_WALL);
        addDrop(BrownWool.BROWN_WOOL_SLAB);
        addDrop(RedWool.RED_WOOL_STAIRS);
        addDrop(RedWool.RED_WOOL_WALL);
        addDrop(RedWool.RED_WOOL_SLAB);
        addDrop(OrangeWool.ORANGE_WOOL_STAIRS);
        addDrop(OrangeWool.ORANGE_WOOL_WALL);
        addDrop(OrangeWool.ORANGE_WOOL_SLAB);
        addDrop(YellowWool.YELLOW_WOOL_STAIRS);
        addDrop(YellowWool.YELLOW_WOOL_WALL);
        addDrop(YellowWool.YELLOW_WOOL_SLAB);
        addDrop(LimeWool.LIME_WOOL_STAIRS);
        addDrop(LimeWool.LIME_WOOL_WALL);
        addDrop(LimeWool.LIME_WOOL_SLAB);
        addDrop(GreenWool.GREEN_WOOL_STAIRS);
        addDrop(GreenWool.GREEN_WOOL_WALL);
        addDrop(GreenWool.GREEN_WOOL_SLAB);
        addDrop(CyanWool.CYAN_WOOL_STAIRS);
        addDrop(CyanWool.CYAN_WOOL_WALL);
        addDrop(CyanWool.CYAN_WOOL_SLAB);
        addDrop(LightBlueWool.LIGHT_BLUE_WOOL_STAIRS);
        addDrop(LightBlueWool.LIGHT_BLUE_WOOL_WALL);
        addDrop(LightBlueWool.LIGHT_BLUE_WOOL_SLAB);
        addDrop(BlueWool.BLUE_WOOL_STAIRS);
        addDrop(BlueWool.BLUE_WOOL_WALL);
        addDrop(BlueWool.BLUE_WOOL_SLAB);
        addDrop(PurpleWool.PURPLE_WOOL_STAIRS);
        addDrop(PurpleWool.PURPLE_WOOL_WALL);
        addDrop(PurpleWool.PURPLE_WOOL_SLAB);
        addDrop(MagentaWool.MAGENTA_WOOL_STAIRS);
        addDrop(MagentaWool.MAGENTA_WOOL_WALL);
        addDrop(MagentaWool.MAGENTA_WOOL_SLAB);
        addDropWithSilkTouch(LeafStairs.OAK_LEAVES_STAIRS);
        addDropWithSilkTouch(LeafStairs.SPRUCE_LEAVES_STAIRS);
        addDropWithSilkTouch(LeafStairs.BIRCH_LEAVES_STAIRS);
        addDropWithSilkTouch(LeafStairs.ACACIA_LEAVES_STAIRS);
        addDropWithSilkTouch(LeafStairs.JUNGLE_LEAVES_STAIRS);
        addDropWithSilkTouch(LeafStairs.MANGROVE_LEAVES_STAIRS);
        addDropWithSilkTouch(LeafSlabs.OAK_LEAVES_SLAB);
        addDropWithSilkTouch(LeafSlabs.SPRUCE_LEAVES_SLAB);
        addDropWithSilkTouch(LeafSlabs.BIRCH_LEAVES_SLAB);
        addDropWithSilkTouch(LeafSlabs.ACACIA_LEAVES_SLAB);
        addDropWithSilkTouch(LeafSlabs.JUNGLE_LEAVES_SLAB);
        addDropWithSilkTouch(LeafSlabs.MANGROVE_LEAVES_SLAB);
        addDropWithSilkTouch(LeafWalls.OAK_LEAVES_WALL);
        addDropWithSilkTouch(LeafWalls.SPRUCE_LEAVES_WALL);
        addDropWithSilkTouch(LeafWalls.BIRCH_LEAVES_WALL);
        addDropWithSilkTouch(LeafWalls.ACACIA_LEAVES_WALL);
        addDropWithSilkTouch(LeafWalls.JUNGLE_LEAVES_WALL);
        addDropWithSilkTouch(LeafWalls.MANGROVE_LEAVES_WALL);
        addDrop(CopperBlocks.EXPOSED_COPPER_DOOR);
        addDrop(CopperBlocks.EXPOSED_COPPER_TRAPDOOR);
        addDrop(CopperBlocks.WEATHERED_COPPER_DOOR);
        addDrop(CopperBlocks.WEATHERED_COPPER_TRAPDOOR);
        addDrop(CopperBlocks.OXIDIZED_COPPER_DOOR);
        addDrop(CopperBlocks.OXIDIZED_COPPER_TRAPDOOR);
        addDrop(ConcreteWalls.WHITE_CONCRETE_WALL);
        addDrop(ConcreteWalls.LIGHT_GRAY_CONCRETE_WALL);
        addDrop(ConcreteWalls.GRAY_CONCRETE_WALL);
        addDrop(ConcreteWalls.BLACK_CONCRETE_WALL);
        addDrop(ConcreteWalls.BROWN_CONCRETE_WALL);
        addDrop(ConcreteWalls.RED_CONCRETE_WALL);
        addDrop(ConcreteWalls.ORANGE_CONCRETE_WALL);
        addDrop(ConcreteWalls.YELLOW_CONCRETE_WALL);
        addDrop(ConcreteWalls.LIME_CONCRETE_WALL);
        addDrop(ConcreteWalls.GREEN_CONCRETE_WALL);
        addDrop(ConcreteWalls.CYAN_CONCRETE_WALL);
        addDrop(ConcreteWalls.LIGHT_BLUE_CONCRETE_WALL);
        addDrop(ConcreteWalls.BLUE_CONCRETE_WALL);
        addDrop(ConcreteWalls.PURPLE_CONCRETE_WALL);
        addDrop(ConcreteWalls.MAGENTA_CONCRETE_WALL);
        addDrop(ConcreteWalls.PINK_CONCRETE_WALL);
        addDrop(GoldBlocks.GOLD_BARS);
        addDrop(PinkWool.PINK_WOOL_STAIRS);
        addDrop(PinkWool.PINK_WOOL_SLAB);
        addDrop(PinkWool.PINK_WOOL_WALL);
        addDrop(SculkBlocks.SCULK_WALL);
        addDrop(StoneVSlabs.STONE_VERTICAL_SLAB);
        addDrop(StoneVSlabs.COBBLESTONE_VERTICAL_SLAB);
        addDrop(StoneVSlabs.STONE_VERTICAL_SLAB);
        addDrop(StoneVSlabs.COBBLESTONE_VERTICAL_SLAB);
        addDrop(StoneVSlabs.VERTICAL_MOSSY_COBBLESTONE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_SMOOTH_STONE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_STONE_BRICK_SLAB);
        addDrop(StoneVSlabs.VERTICAL_MOSSY_STONE_BRICK_SLAB);
        addDrop(StoneVSlabs.VERTICAL_GRANITE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_POLISHED_GRANITE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_DIORITE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_POLISHED_DIORITE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_ANDESITE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_POLISHED_ANDESITE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_COBBLED_DEEPSLATE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_POLISHED_DEEPSLATE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_DEEPSLATE_BRICK_SLAB);
        addDrop(StoneVSlabs.VERTICAL_DEEPSLATE_TILE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_BRICK_SLAB);
        addDrop(StoneVSlabs.VERTICAL_MUD_BRICK_SLAB);
        addDrop(StoneVSlabs.VERTICAL_SANDSTONE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_SMOOTH_SANDSTONE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_CUT_SANDSTONE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_RED_SANDSTONE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_CUT_RED_SANDSTONE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_PRISMARINE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_PRISMARINE_BRICK_SLAB);
        addDrop(StoneVSlabs.VERTICAL_DARK_PRISMARINE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_NETHER_BRICK_SLAB);
        addDrop(StoneVSlabs.VERTICAL_RED_NETHER_BRICK_SLAB);
        addDrop(StoneVSlabs.VERTICAL_BLACKSTONE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_POLISHED_BLACKSTONE_SLAB);
        addDrop(StoneVSlabs.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB);
        addDrop(StoneVSlabs.VERTICAL_ENDSTONE_BRICK_SLAB);
        addDrop(StoneVSlabs.VERTICAL_QUARTZ_SLAB);
        addDrop(StoneVSlabs.VERTICAL_SMOOTH_QUARTZ_SLAB);
        addDrop(CopperVSlabs.VERTICAL_CUT_COPPER_SLAB);
        addDrop(CopperVSlabs.VERTICAL_EXPOSED_CUT_COPPER_SLAB);
        addDrop(CopperVSlabs.VERTICAL_WEATHERED_CUT_COPPER_SLAB);
        addDrop(CopperVSlabs.VERTICAL_OXIDIZED_CUT_COPPER_SLAB);
        addDrop(CopperVSlabs.VERTICAL_WAXED_CUT_COPPER_SLAB);
        addDrop(CopperVSlabs.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB);
        addDrop(CopperVSlabs.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB);
        addDrop(CopperVSlabs.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB);
        addDrop(WoodVSlabs.VERTICAL_OAK_SLAB);
        addDrop(WoodVSlabs.VERTICAL_SPRUCE_SLAB);
        addDrop(WoodVSlabs.VERTICAL_BIRCH_SLAB);
        addDrop(WoodVSlabs.VERTICAL_JUNGLE_SLAB);
        addDrop(WoodVSlabs.VERTICAL_ACACIA_SLAB);
        addDrop(WoodVSlabs.VERTICAL_DARK_OAK_SLAB);
        addDrop(WoodVSlabs.VERTICAL_MANGROVE_SLAB);
        addDrop(WoodVSlabs.VERTICAL_CRIMSON_SLAB);
        addDrop(WoodVSlabs.VERTICAL_WARPED_SLAB);
        addDrop(ConcreteVSlabs.WHITE_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.GRAY_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.BLACK_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.BROWN_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.RED_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.ORANGE_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.YELLOW_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.LIME_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.GREEN_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.CYAN_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.BLUE_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.PURPLE_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.MAGENTA_CONCRETE_VERTICAL_SLAB);
        addDrop(ConcreteVSlabs.PINK_CONCRETE_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.WHITE_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.LIGHT_GRAY_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.GRAY_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.BLACK_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.BROWN_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.RED_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.ORANGE_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.YELLOW_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.LIME_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.GREEN_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.CYAN_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.LIGHT_BLUE_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.BLUE_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.PURPLE_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.MAGENTA_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.PINK_GLASS_VERTICAL_SLAB);
        addDropWithSilkTouch(GlassVSlabs.GLASS_VERTICAL_SLAB);
        addDrop(ServerSpecificBlocks.PRIM);
        addDrop(WoodVStairs.OAK_VERTICAL_STAIRS);
        addDrop(StoneVStairs.STONE_BRICK_VERTICAL_STAIRS);
        addDrop(AzaleaWoodBlocks.AZALEA_LADDER);
        addDrop(AzaleaWoodBlocks.AZALEA_BARREL);
        addDrop(AzaleaWoodBlocks.AZALEA_BOOKSHELF);
        addDrop(AzaleaWoodBlocks.AZALEA_LOG);
        addDrop(AzaleaWoodBlocks.STRIPPED_AZALEA_LOG);
        addDrop(AzaleaWoodBlocks.AZALEA_WOOD);
        addDrop(AzaleaWoodBlocks.STRIPPED_AZALEA_WOOD);
        addDrop(AzaleaWoodBlocks.AZALEA_PLANKS);
        addDrop(AzaleaWoodBlocks.AZALEA_STAIR);
        addDrop(AzaleaWoodBlocks.AZALEA_SLAB);
        addDrop(AzaleaWoodBlocks.AZALEA_FENCE);
        addDrop(AzaleaWoodBlocks.AZALEA_FENCE_GATE);
        addDrop(AzaleaWoodBlocks.AZALEA_DOOR);
        addDrop(AzaleaWoodBlocks.AZALEA_TRAPDOOR);
        addDrop(AzaleaWoodBlocks.AZALEA_PRESSURE_PLATE);
        addDrop(AzaleaWoodBlocks.AZALEA_BUTTON);
        addDrop(RandomBlocks.IRON_BAR_DOOR);
        addDrop(RandomBlocks.GOLD_BAR_DOOR);
        addDrop(RandomBlocks.COPPER_BAR_DOOR);
        addDrop(RandomBlocks.EXPOSED_COPPER_BAR_DOOR);
        addDrop(RandomBlocks.WEATHERED_COPPER_BAR_DOOR);
        addDrop(RandomBlocks.OXIDIZED_COPPER_BAR_DOOR);
//        addDrop(AcaciaWoodBlocks.ACACIA_CHEST);
//        addDrop(AcaciaWoodBlocks.ACACIA_TRAPPED_CHEST);
//        addDrop(AzaleaWoodBlocks.AZALEA_CHEST);
//        addDrop(AzaleaWoodBlocks.AZALEA_TRAPPED_CHEST);
//        addDrop(BirchWoodBlocks.BIRCH_CHEST);
//        addDrop(BirchWoodBlocks.BIRCH_TRAPPED_CHEST);
//        addDrop(CrimsonWoodBlocks.CRIMSON_CHEST);
//        addDrop(CrimsonWoodBlocks.CRIMSON_TRAPPED_CHEST);
//        addDrop(DarkOakWoodBlocks.DARK_OAK_CHEST);
//        addDrop(DarkOakWoodBlocks.DARK_OAK_TRAPPED_CHEST);
//        addDrop(JungleWoodBlocks.JUNGLE_CHEST);
//        addDrop(JungleWoodBlocks.JUNGLE_TRAPPED_CHEST);
//        addDrop(MangroveWoodBlocks.MANGROVE_CHEST);
//        addDrop(MangroveWoodBlocks.MANGROVE_TRAPPED_CHEST);
//        addDrop(OakWoodBlocks.OAK_CHEST);
//        addDrop(OakWoodBlocks.OAK_TRAPPED_CHEST);
//        addDrop(SpruceWoodBlocks.SPRUCE_CHEST);
//        addDrop(SpruceWoodBlocks.SPRUCE_TRAPPED_CHEST);
//        addDrop(WarpedWoodBlocks.WARPED_CHEST);
//        addDrop(WarpedWoodBlocks.WARPED_TRAPPED_CHEST);
        addDrop(WaxedCopperBlocks.WAXED_COPPER_BARS);
        addDrop(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_BARS);
        addDrop(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_BARS);
        addDrop(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_BARS);
        addDrop(WaxedCopperBlocks.WAXED_COPPER_CHAIN);
        addDrop(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_CHAIN);
        addDrop(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_CHAIN);
        addDrop(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_CHAIN);
        addDrop(WaxedCopperBlocks.WAXED_COPPER_LANTERN);
        addDrop(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_LANTERN);
        addDrop(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_LANTERN);
        addDrop(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_LANTERN);
        addDrop(WaxedCopperBlocks.WAXED_COPPER_PRESSURE_PLATE);
        addDrop(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        addDrop(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        addDrop(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
        addDrop(WaxedCopperBlocks.WAXED_COPPER_BUTTON);
        addDrop(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_BUTTON);
        addDrop(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_BUTTON);
        addDrop(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_BUTTON);
        addDrop(WaxedCopperBlocks.WAXED_COPPER_DOOR);
        addDrop(WaxedCopperBlocks.WAXED_COPPER_TRAPDOOR);
        addDrop(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_DOOR);
        addDrop(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR);
        addDrop(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_DOOR);
        addDrop(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR);
        addDrop(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_DOOR);
        addDrop(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);
        addDropWithSilkTouch(GlassBlocks.GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.WHITE_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.LIGHT_GRAY_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.GRAY_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.BLACK_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.BROWN_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.RED_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.ORANGE_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.YELLOW_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.LIME_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.GREEN_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.CYAN_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.LIGHT_BLUE_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.BLUE_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.PURPLE_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.MAGENTA_GLASS_WALL);
        addDropWithSilkTouch(GlassBlocks.PINK_GLASS_WALL);
        addDropWithSilkTouch(LeafCarpets.OAK_LEAVES_CARPET);
        addDropWithSilkTouch(LeafCarpets.SPRUCE_LEAVES_CARPET);
        addDropWithSilkTouch(LeafCarpets.BIRCH_LEAVES_CARPET);
        addDropWithSilkTouch(LeafCarpets.JUNGLE_LEAVES_CARPET);
        addDropWithSilkTouch(LeafCarpets.ACACIA_LEAVES_CARPET);
        addDropWithSilkTouch(LeafCarpets.DARK_OAK_LEAVES_CARPET);
        addDropWithSilkTouch(LeafCarpets.MANGROVE_LEAVES_CARPET);
        addDrop(RandomBlocks.GUNPOWDER_BLOCK);
        addDrop(ModWoodcutter.WOODCUTTER);
        addDrop(ModSpongeBlocks.LAVA_SPONGE);
        addDrop(ModSpongeBlocks.WET_LAVA_SPONGE);
        addDrop(OakWoodBlocks.OAK_LOG_FENCE);
        addDrop(SpruceWoodBlocks.SPRUCE_LOG_FENCE);
        addDrop(BirchWoodBlocks.BIRCH_LOG_FENCE);
        addDrop(JungleWoodBlocks.JUNGLE_LOG_FENCE);
        addDrop(AcaciaWoodBlocks.ACACIA_LOG_FENCE);
        addDrop(DarkOakWoodBlocks.DARK_OAK_LOG_FENCE);
        addDrop(MangroveWoodBlocks.MANGROVE_LOG_FENCE);
        addDrop(CrimsonWoodBlocks.CRIMSON_LOG_FENCE);
        addDrop(WarpedWoodBlocks.WARPED_LOG_FENCE);
        //terracotta
        addDrop(TerracottaStairs.WHITE_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.WHITE_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.WHITE_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.WHITE_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.LIGHT_GRAY_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.LIGHT_GRAY_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.LIGHT_GRAY_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.LIGHT_GRAY_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.GRAY_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.GRAY_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.GRAY_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.GRAY_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.BLACK_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.BLACK_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.BLACK_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.BLACK_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.BROWN_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.BROWN_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.BROWN_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.BROWN_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.RED_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.RED_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.RED_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.RED_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.ORANGE_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.ORANGE_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.ORANGE_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.ORANGE_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.YELLOW_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.YELLOW_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.YELLOW_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.YELLOW_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.LIME_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.LIME_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.LIME_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.LIME_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.GREEN_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.GREEN_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.GREEN_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.GREEN_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.CYAN_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.CYAN_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.CYAN_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.CYAN_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.LIGHT_BLUE_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.LIGHT_BLUE_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.LIGHT_BLUE_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.LIGHT_BLUE_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.BLUE_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.BLUE_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.BLUE_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.BLUE_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.PURPLE_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.PURPLE_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.PURPLE_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.PURPLE_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.MAGENTA_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.MAGENTA_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.MAGENTA_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.MAGENTA_TERRACOTTA_WALL);
        addDrop(TerracottaStairs.PINK_TERRACOTTA_STAIR);
        addDrop(TerracottaSlabs.PINK_TERRACOTTA_SLAB, slabDrops(TerracottaSlabs.PINK_TERRACOTTA_SLAB));
        addDrop(TerracottaWalls.PINK_TERRACOTTA_WALL);

        addDrop(AcaciaWoodBlocks.ACACIA_LOG_SLAB, slabDrops(AcaciaWoodBlocks.ACACIA_LOG_SLAB));
        addDrop(AcaciaWoodBlocks.ACACIA_LOG_STAIRS);
        addDrop(AzaleaWoodBlocks.AZALEA_LOG_SLAB, slabDrops(AzaleaWoodBlocks.AZALEA_LOG_SLAB));
        addDrop(AzaleaWoodBlocks.AZALEA_LOG_STAIRS);
        addDrop(BirchWoodBlocks.BIRCH_LOG_SLAB, slabDrops(BirchWoodBlocks.BIRCH_LOG_SLAB));
        addDrop(BirchWoodBlocks.BIRCH_LOG_STAIRS);
        addDrop(CrimsonWoodBlocks.CRIMSON_LOG_SLAB, slabDrops(CrimsonWoodBlocks.CRIMSON_LOG_SLAB));
        addDrop(CrimsonWoodBlocks.CRIMSON_LOG_STAIRS);
        addDrop(DarkOakWoodBlocks.DARK_OAK_LOG_SLAB, slabDrops(DarkOakWoodBlocks.DARK_OAK_LOG_SLAB));
        addDrop(DarkOakWoodBlocks.DARK_OAK_LOG_STAIRS);
        addDrop(JungleWoodBlocks.JUNGLE_LOG_SLAB, slabDrops(JungleWoodBlocks.JUNGLE_LOG_SLAB));
        addDrop(JungleWoodBlocks.JUNGLE_LOG_STAIRS);
        addDrop(MangroveWoodBlocks.MANGROVE_LOG_SLAB, slabDrops(MangroveWoodBlocks.MANGROVE_LOG_SLAB));
        addDrop(MangroveWoodBlocks.MANGROVE_LOG_STAIRS);
        addDrop(OakWoodBlocks.OAK_LOG_SLAB, slabDrops(OakWoodBlocks.OAK_LOG_SLAB));
        addDrop(OakWoodBlocks.OAK_LOG_STAIRS);
        addDrop(SpruceWoodBlocks.SPRUCE_LOG_SLAB, slabDrops(SpruceWoodBlocks.SPRUCE_LOG_SLAB));
        addDrop(SpruceWoodBlocks.SPRUCE_LOG_STAIRS);
        addDrop(WarpedWoodBlocks.WARPED_LOG_SLAB, slabDrops(WarpedWoodBlocks.WARPED_LOG_SLAB));
        addDrop(WarpedWoodBlocks.WARPED_LOG_STAIRS);
    }
}
