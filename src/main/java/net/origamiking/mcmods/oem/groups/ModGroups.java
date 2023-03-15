package net.origamiking.mcmods.oem.groups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.ArmorRegistry;
import net.origamiking.mcmods.oem.armor.materials.CopperArmorMaterial;
import net.origamiking.mcmods.oem.blocks.amethyst.AmethystBlocks;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteSlabs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteStairs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteWalls;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.copper.WaxedCopperBlocks;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.gold.GoldBlocks;
import net.origamiking.mcmods.oem.blocks.leaves.LeafSlabs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafStairs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafWalls;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.sculk.SculkBlocks;
import net.origamiking.mcmods.oem.blocks.server_specific.ServerSpecificBlocks;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.CopperVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.concrete.ConcreteVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.glass.GlassVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.stone.StoneVSlabs;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.wood.WoodVSlabs;
import net.origamiking.mcmods.oem.blocks.verticalstairs.stone.StoneVStairs;
import net.origamiking.mcmods.oem.blocks.verticalstairs.wood.WoodVStairs;
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
import net.origamiking.mcmods.oem.blocks.wool.red.RedWool;
import net.origamiking.mcmods.oem.blocks.wool.white.WhiteWool;
import net.origamiking.mcmods.oem.blocks.wool.yellow.YellowWool;
import net.origamiking.mcmods.oem.blocks.wool.purple.PurpleWool;
import net.origamiking.mcmods.oem.items.ModItems;

public class ModGroups {
    private static final ItemGroup OEM_GROUP = FabricItemGroup.builder(new Identifier(OemMain.MOD_ID, "oem_group"))
            .displayName(Text.literal("OrigamiKing's Enhancement Mod"))
            .icon(() -> new ItemStack(SpruceWoodBlocks.SPRUCE_BARREL))
            .entries((context, entries) -> {
                entries.add(OakWoodBlocks.OAK_BARREL);
                entries.add(Blocks.BOOKSHELF);
                entries.add(OakWoodBlocks.OAK_LADDER);
                entries.add(SpruceWoodBlocks.SPRUCE_BARREL);
                entries.add(SpruceWoodBlocks.SPRUCE_BOOKSHELF);
                entries.add(SpruceWoodBlocks.SPRUCE_LADDER);
                entries.add(BirchWoodBlocks.BIRCH_BARREL);
                entries.add(BirchWoodBlocks.BIRCH_BOOKSHELF);
                entries.add(BirchWoodBlocks.BIRCH_LADDER);
                entries.add(JungleWoodBlocks.JUNGLE_BARREL);
                entries.add(JungleWoodBlocks.JUNGLE_BOOKSHELF);
                entries.add(JungleWoodBlocks.JUNGLE_LADDER);
                entries.add(AcaciaWoodBlocks.ACACIA_BARREL);
                entries.add(AcaciaWoodBlocks.ACACIA_BOOKSHELF);
                entries.add(AcaciaWoodBlocks.ACACIA_LADDER);
                entries.add(DarkOakWoodBlocks.DARK_OAK_BARREL);
                entries.add(DarkOakWoodBlocks.DARK_OAK_BOOKSHELF);
                entries.add(DarkOakWoodBlocks.DARK_OAK_LADDER);
                entries.add(MangroveWoodBlocks.MANGROVE_BARREL);
                entries.add(MangroveWoodBlocks.MANGROVE_BOOKSHELF);
                entries.add(MangroveWoodBlocks.MANGROVE_LADDER);
                entries.add(CrimsonWoodBlocks.CRIMSON_BARREL);
                entries.add(CrimsonWoodBlocks.CRIMSON_BOOKSHELF);
                entries.add(CrimsonWoodBlocks.CRIMSON_LADDER);
                entries.add(WarpedWoodBlocks.WARPED_BARREL);
                entries.add(WarpedWoodBlocks.WARPED_BOOKSHELF);
                entries.add(WarpedWoodBlocks.WARPED_LADDER);
                //concrete
                entries.add(ConcreteStairs.WHITE_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.WHITE_CONCRETE_SLAB);
                entries.add(ConcreteWalls.WHITE_CONCRETE_WALL);
                entries.add(ConcreteStairs.LIGHT_GRAY_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.LIGHT_GRAY_CONCRETE_SLAB);
                entries.add(ConcreteWalls.LIGHT_GRAY_CONCRETE_WALL);
                entries.add(ConcreteStairs.GRAY_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.GRAY_CONCRETE_SLAB);
                entries.add(ConcreteWalls.GRAY_CONCRETE_WALL);
                entries.add(ConcreteStairs.BLACK_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.BLACK_CONCRETE_SLAB);
                entries.add(ConcreteWalls.BLACK_CONCRETE_WALL);
                entries.add(ConcreteStairs.BROWN_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.BROWN_CONCRETE_SLAB);
                entries.add(ConcreteWalls.BROWN_CONCRETE_WALL);
                entries.add(ConcreteStairs.RED_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.RED_CONCRETE_SLAB);
                entries.add(ConcreteWalls.RED_CONCRETE_WALL);
                entries.add(ConcreteStairs.ORANGE_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.ORANGE_CONCRETE_SLAB);
                entries.add(ConcreteWalls.ORANGE_CONCRETE_WALL);
                entries.add(ConcreteStairs.YELLOW_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.YELLOW_CONCRETE_SLAB);
                entries.add(ConcreteWalls.YELLOW_CONCRETE_WALL);
                entries.add(ConcreteStairs.LIME_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.LIME_CONCRETE_SLAB);
                entries.add(ConcreteWalls.LIME_CONCRETE_WALL);
                entries.add(ConcreteStairs.GREEN_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.GREEN_CONCRETE_SLAB);
                entries.add(ConcreteWalls.GREEN_CONCRETE_WALL);
                entries.add(ConcreteStairs.CYAN_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.CYAN_CONCRETE_SLAB);
                entries.add(ConcreteWalls.CYAN_CONCRETE_WALL);
                entries.add(ConcreteStairs.LIGHT_BLUE_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.LIGHT_BLUE_CONCRETE_SLAB);
                entries.add(ConcreteWalls.LIGHT_BLUE_CONCRETE_WALL);
                entries.add(ConcreteStairs.BLUE_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.BLUE_CONCRETE_SLAB);
                entries.add(ConcreteWalls.BLUE_CONCRETE_WALL);
                entries.add(ConcreteStairs.PURPLE_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.PURPLE_CONCRETE_SLAB);
                entries.add(ConcreteWalls.PURPLE_CONCRETE_WALL);
                entries.add(ConcreteStairs.MAGENTA_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.MAGENTA_CONCRETE_SLAB);
                entries.add(ConcreteWalls.MAGENTA_CONCRETE_WALL);
                entries.add(ConcreteStairs.PINK_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.PINK_CONCRETE_SLAB);
                entries.add(ConcreteWalls.PINK_CONCRETE_WALL);
                //entries.add(entries.add(StoneVSlabs.TINTED_GLASS_PANE);
                //Glass
                entries.add(GlassBlocks.GLASS_SLAB);
                entries.add(GlassBlocks.GLASS_STAIR);
                entries.add(GlassBlocks.WHITE_GLASS_SLAB);
                entries.add(GlassBlocks.WHITE_GLASS_STAIR);
                entries.add(GlassBlocks.LIGHT_GRAY_GLASS_SLAB);
                entries.add(GlassBlocks.LIGHT_GRAY_GLASS_STAIR);
                entries.add(GlassBlocks.GRAY_GLASS_SLAB);
                entries.add(GlassBlocks.GRAY_GLASS_STAIR);
                entries.add(GlassBlocks.BLACK_GLASS_SLAB);
                entries.add(GlassBlocks.BLACK_GLASS_STAIR);
                entries.add(GlassBlocks.BROWN_GLASS_SLAB);
                entries.add(GlassBlocks.BROWN_GLASS_STAIR);
                entries.add(GlassBlocks.RED_GLASS_SLAB);
                entries.add(GlassBlocks.RED_GLASS_STAIR);
                entries.add(GlassBlocks.ORANGE_GLASS_SLAB);
                entries.add(GlassBlocks.ORANGE_GLASS_STAIR);
                entries.add(GlassBlocks.YELLOW_GLASS_SLAB);
                entries.add(GlassBlocks.YELLOW_GLASS_STAIR);
                entries.add(GlassBlocks.LIME_GLASS_SLAB);
                entries.add(GlassBlocks.LIME_GLASS_STAIR);
                entries.add(GlassBlocks.GREEN_GLASS_SLAB);
                entries.add(GlassBlocks.GREEN_GLASS_STAIR);
                entries.add(GlassBlocks.CYAN_GLASS_SLAB);
                entries.add(GlassBlocks.CYAN_GLASS_STAIR);
                entries.add(GlassBlocks.LIGHT_BLUE_GLASS_SLAB);
                entries.add(GlassBlocks.LIGHT_BLUE_GLASS_STAIR);
                entries.add(GlassBlocks.BLUE_GLASS_SLAB);
                entries.add(GlassBlocks.BLUE_GLASS_STAIR);
                entries.add(GlassBlocks.PURPLE_GLASS_SLAB);
                entries.add(GlassBlocks.PURPLE_GLASS_STAIR);
                entries.add(GlassBlocks.MAGENTA_GLASS_SLAB);
                entries.add(GlassBlocks.MAGENTA_GLASS_STAIR);
                entries.add(GlassBlocks.PINK_GLASS_SLAB);
                entries.add(GlassBlocks.PINK_GLASS_STAIR);
                //wool
                entries.add(WhiteWool.WHITE_WOOL_SLAB);
                entries.add(WhiteWool.WHITE_WOOL_STAIRS);
                entries.add(WhiteWool.WHITE_WOOL_WALL);
                entries.add(LightGrayWool.LIGHT_GRAY_WOOL_SLAB);
                entries.add(LightGrayWool.LIGHT_GRAY_WOOL_STAIRS);
                entries.add(LightGrayWool.LIGHT_GRAY_WOOL_WALL);
                entries.add(GrayWool.GRAY_WOOL_SLAB);
                entries.add(GrayWool.GRAY_WOOL_STAIRS);
                entries.add(GrayWool.GRAY_WOOL_WALL);
                entries.add(BlackWool.BLACK_WOOL_SLAB);
                entries.add(BlackWool.BLACK_WOOL_STAIRS);
                entries.add(BlackWool.BLACK_WOOL_WALL);
                entries.add(BrownWool.BROWN_WOOL_SLAB);
                entries.add(BrownWool.BROWN_WOOL_STAIRS);
                entries.add(BrownWool.BROWN_WOOL_WALL);
                entries.add(RedWool.RED_WOOL_SLAB);
                entries.add(RedWool.RED_WOOL_STAIRS);
                entries.add(RedWool.RED_WOOL_WALL);
                entries.add(OrangeWool.ORANGE_WOOL_SLAB);
                entries.add(OrangeWool.ORANGE_WOOL_STAIRS);
                entries.add(OrangeWool.ORANGE_WOOL_WALL);
                entries.add(YellowWool.YELLOW_WOOL_SLAB);
                entries.add(YellowWool.YELLOW_WOOL_STAIRS);
                entries.add(YellowWool.YELLOW_WOOL_WALL);
                entries.add(LimeWool.LIME_WOOL_SLAB);
                entries.add(LimeWool.LIME_WOOL_STAIRS);
                entries.add(LimeWool.LIME_WOOL_WALL);
                entries.add(GreenWool.GREEN_WOOL_SLAB);
                entries.add(GreenWool.GREEN_WOOL_STAIRS);
                entries.add(GreenWool.GREEN_WOOL_WALL);
                entries.add(CyanWool.CYAN_WOOL_SLAB);
                entries.add(CyanWool.CYAN_WOOL_STAIRS);
                entries.add(CyanWool.CYAN_WOOL_WALL);
                entries.add(LightBlueWool.LIGHT_BLUE_WOOL_SLAB);
                entries.add(LightBlueWool.LIGHT_BLUE_WOOL_STAIRS);
                entries.add(LightBlueWool.LIGHT_BLUE_WOOL_WALL);
                entries.add(BlueWool.BLUE_WOOL_SLAB);
                entries.add(BlueWool.BLUE_WOOL_STAIRS);
                entries.add(BlueWool.BLUE_WOOL_WALL);
                entries.add(PurpleWool.PURPLE_WOOL_SLAB);
                entries.add(PurpleWool.PURPLE_WOOL_STAIRS);
                entries.add(PurpleWool.PURPLE_WOOL_WALL);
                entries.add(MagentaWool.MAGENTA_WOOL_SLAB);
                entries.add(MagentaWool.MAGENTA_WOOL_STAIRS);
                entries.add(MagentaWool.MAGENTA_WOOL_WALL);
                entries.add(PinkWool.PINK_WOOL_SLAB);
                entries.add(PinkWool.PINK_WOOL_STAIRS);
                entries.add(PinkWool.PINK_WOOL_WALL);
                //other
                entries.add(AmethystBlocks.AMETHYST_SLAB);
                entries.add(AmethystBlocks.AMETHYST_STAIR);
                entries.add(AmethystBlocks.AMETHYST_WALL);
                entries.add(RandomBlocks.CALSITE_STAIRS);
                entries.add(RandomBlocks.CALSITE_SLAB);
                entries.add(RandomBlocks.CALSITE_WALL);
                entries.add(RandomBlocks.TUFF_SLAB);
                entries.add(RandomBlocks.TUFF_STAIRS);
                entries.add(RandomBlocks.TUFF_WALL);
                entries.add(RandomBlocks.SMOOTH_BASALT_SLAB);
                entries.add(RandomBlocks.SMOOTH_BASALT_STAIRS);
                entries.add(RandomBlocks.SMOOTH_BASALT_WALL);
                entries.add(RandomBlocks.NETHERRACK_SLAB);
                entries.add(RandomBlocks.NETHERRACK_STAIRS);
                entries.add(RandomBlocks.NETHERRACK_WALL);
                entries.add(RandomBlocks.DRIPSTONE_SLAB);
                entries.add(RandomBlocks.DRIPSTONE_STAIRS);
                entries.add(RandomBlocks.DRIPSTONE_WALL);
                entries.add(RandomBlocks.SNOW_SLAB);
                entries.add(RandomBlocks.SNOW_STAIRS);
                entries.add(RandomBlocks.SNOW_WALL);
                //sculk
                entries.add(SculkBlocks.SCULK_STAIR);
                entries.add(SculkBlocks.SCULK_SLAB);
                entries.add(SculkBlocks.SCULK_WALL);
                //leaves
                entries.add(LeafStairs.OAK_LEAVES_STAIRS);
                entries.add(LeafSlabs.OAK_LEAVES_SLAB);
                entries.add(LeafWalls.OAK_LEAVES_WALL);
                entries.add(LeafStairs.SPRUCE_LEAVES_STAIRS);
                entries.add(LeafSlabs.SPRUCE_LEAVES_SLAB);
                entries.add(LeafWalls.SPRUCE_LEAVES_WALL);
                entries.add(LeafStairs.BIRCH_LEAVES_STAIRS);
                entries.add(LeafSlabs.BIRCH_LEAVES_SLAB);
                entries.add(LeafWalls.BIRCH_LEAVES_WALL);
                entries.add(LeafStairs.JUNGLE_LEAVES_STAIRS);
                entries.add(LeafSlabs.JUNGLE_LEAVES_SLAB);
                entries.add(LeafWalls.JUNGLE_LEAVES_WALL);
                entries.add(LeafStairs.ACACIA_LEAVES_STAIRS);
                entries.add(LeafSlabs.ACACIA_LEAVES_SLAB);
                entries.add(LeafWalls.ACACIA_LEAVES_WALL);
                entries.add(LeafStairs.DARK_OAK_LEAVES_STAIRS);
                entries.add(LeafSlabs.DARK_OAK_LEAVES_SLAB);
                entries.add(LeafWalls.DARK_OAK_LEAVES_WALL);
                entries.add(LeafStairs.MANGROVE_LEAVES_STAIRS);
                entries.add(LeafSlabs.MANGROVE_LEAVES_SLAB);
                entries.add(LeafWalls.MANGROVE_LEAVES_WALL);
                //gold
                entries.add(ServerSpecificBlocks.GOLD_CHAIN);
                entries.add(ServerSpecificBlocks.GOLD_LANTERN);
                entries.add(GoldBlocks.GOLD_BARS);
                //copper
                entries.add(ModItems.COPPER_NUGGET);
                entries.add(CopperBlocks.COPPER_CHAIN);
                entries.add(CopperBlocks.EXPOSED_COPPER_CHAIN);
                entries.add(CopperBlocks.WEATHERED_COPPER_CHAIN);
                entries.add(CopperBlocks.OXIDIZED_COPPER_CHAIN);
                entries.add(CopperBlocks.COPPER_LANTERN);
                entries.add(CopperBlocks.EXPOSED_COPPER_LANTERN);
                entries.add(CopperBlocks.WEATHERED_COPPER_LANTERN);
                entries.add(CopperBlocks.OXIDIZED_COPPER_LANTERN);
                entries.add(CopperBlocks.COPPER_BARS);
                entries.add(CopperBlocks.EXPOSED_COPPER_BARS);
                entries.add(CopperBlocks.WEATHERED_COPPER_BARS);
                entries.add(CopperBlocks.OXIDIZED_COPPER_BARS);
                entries.add(CopperBlocks.COPPER_PRESSURE_PLATE);
                entries.add(CopperBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
                entries.add(CopperBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
                entries.add(CopperBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
                entries.add(CopperBlocks.COPPER_BUTTON);
                entries.add(CopperBlocks.EXPOSED_COPPER_BUTTON);
                entries.add(CopperBlocks.WEATHERED_COPPER_BUTTON);
                entries.add(CopperBlocks.OXIDIZED_COPPER_BUTTON);
                entries.add(CopperBlocks.COPPER_DOOR);
                entries.add(CopperBlocks.COPPER_TRAPDOOR);
                entries.add(CopperBlocks.EXPOSED_COPPER_DOOR);
                entries.add(CopperBlocks.EXPOSED_COPPER_TRAPDOOR);
                entries.add(CopperBlocks.WEATHERED_COPPER_DOOR);
                entries.add(CopperBlocks.WEATHERED_COPPER_TRAPDOOR);
                entries.add(CopperBlocks.OXIDIZED_COPPER_DOOR);
                entries.add(CopperBlocks.OXIDIZED_COPPER_TRAPDOOR);
                entries.add(CopperArmorMaterial.getCopperArmor.COPPER_HELMET);
                entries.add(CopperArmorMaterial.getCopperArmor.COPPER_CHESTPLATE);
                entries.add(CopperArmorMaterial.getCopperArmor.COPPER_LEGGINGS);
                entries.add(CopperArmorMaterial.getCopperArmor.COPPER_BOOTS);
                entries.add(WaxedCopperBlocks.WAXED_COPPER_BARS);
                entries.add(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_BARS);
                entries.add(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_BARS);
                entries.add(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_BARS);
                entries.add(WaxedCopperBlocks.WAXED_COPPER_CHAIN);
                entries.add(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_CHAIN);
                entries.add(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_CHAIN);
                entries.add(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_CHAIN);
                entries.add(WaxedCopperBlocks.WAXED_COPPER_LANTERN);
                entries.add(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_LANTERN);
                entries.add(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_LANTERN);
                entries.add(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_LANTERN);
                entries.add(WaxedCopperBlocks.WAXED_COPPER_PRESSURE_PLATE);
                entries.add(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
                entries.add(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
                entries.add(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
                entries.add(WaxedCopperBlocks.WAXED_COPPER_BUTTON);
                entries.add(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_BUTTON);
                entries.add(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_BUTTON);
                entries.add(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_BUTTON);
                entries.add(WaxedCopperBlocks.WAXED_COPPER_DOOR);
                entries.add(WaxedCopperBlocks.WAXED_COPPER_TRAPDOOR);
                entries.add(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_DOOR);
                entries.add(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR);
                entries.add(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_DOOR);
                entries.add(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR);
                entries.add(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_DOOR);
                entries.add(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);
                entries.add(AzaleaWoodBlocks.AZALEA_LADDER);
                entries.add(AzaleaWoodBlocks.AZALEA_BARREL);
                entries.add(AzaleaWoodBlocks.AZALEA_BOOKSHELF);
                entries.add(AzaleaWoodBlocks.AZALEA_LOG);
                entries.add(AzaleaWoodBlocks.STRIPPED_AZALEA_LOG);
                entries.add(AzaleaWoodBlocks.AZALEA_WOOD);
                entries.add(AzaleaWoodBlocks.STRIPPED_AZALEA_WOOD);
                entries.add(AzaleaWoodBlocks.AZALEA_PLANKS);
                entries.add(AzaleaWoodBlocks.AZALEA_STAIR);
                entries.add(AzaleaWoodBlocks.AZALEA_SLAB);
                entries.add(AzaleaWoodBlocks.AZALEA_FENCE);
                entries.add(AzaleaWoodBlocks.AZALEA_FENCE_GATE);
                entries.add(AzaleaWoodBlocks.AZALEA_DOOR);
                entries.add(AzaleaWoodBlocks.AZALEA_TRAPDOOR);
                entries.add(AzaleaWoodBlocks.AZALEA_PRESSURE_PLATE);
                entries.add(AzaleaWoodBlocks.AZALEA_BUTTON);
                entries.add(ServerSpecificBlocks.IRON_BAR_DOOR);
                entries.add(ServerSpecificBlocks.GOLD_BAR_DOOR);
                entries.add(ServerSpecificBlocks.COPPER_BAR_DOOR);
                entries.add(ServerSpecificBlocks.EXPOSED_COPPER_BAR_DOOR);
                entries.add(ServerSpecificBlocks.WEATHERED_COPPER_BAR_DOOR);
                entries.add(ServerSpecificBlocks.OXIDIZED_COPPER_BAR_DOOR);
//                entries.add(AcaciaWoodBlocks.ACACIA_CHEST);
//                entries.add(AcaciaWoodBlocks.ACACIA_TRAPPED_CHEST);
//                entries.add(AzaleaWoodBlocks.AZALEA_CHEST);
//                entries.add(AzaleaWoodBlocks.AZALEA_TRAPPED_CHEST);
//                entries.add(BirchWoodBlocks.BIRCH_CHEST);
//                entries.add(BirchWoodBlocks.BIRCH_TRAPPED_CHEST);
//                entries.add(CrimsonWoodBlocks.CRIMSON_CHEST);
//                entries.add(CrimsonWoodBlocks.CRIMSON_TRAPPED_CHEST);
//                entries.add(DarkOakWoodBlocks.DARK_OAK_CHEST);
//                entries.add(DarkOakWoodBlocks.DARK_OAK_TRAPPED_CHEST);
//                entries.add(JungleWoodBlocks.JUNGLE_CHEST);
//                entries.add(JungleWoodBlocks.JUNGLE_TRAPPED_CHEST);
//                entries.add(MangroveWoodBlocks.MANGROVE_CHEST);
//                entries.add(MangroveWoodBlocks.MANGROVE_TRAPPED_CHEST);
//                entries.add(OakWoodBlocks.OAK_CHEST);
//                entries.add(OakWoodBlocks.OAK_TRAPPED_CHEST);
//                entries.add(SpruceWoodBlocks.SPRUCE_CHEST);
//                entries.add(SpruceWoodBlocks.SPRUCE_TRAPPED_CHEST);
//                entries.add(WarpedWoodBlocks.WARPED_CHEST);
//                entries.add(WarpedWoodBlocks.WARPED_TRAPPED_CHEST);
            }).build();
    public static final ItemGroup OEM_V_SLABS = FabricItemGroup.builder(new Identifier(OemMain.MOD_ID, "oem_v_slabs"))
            .displayName(Text.literal("Oem Vertical Slabs"))
            .icon(()-> new ItemStack(StoneVSlabs.STONE_VERTICAL_SLAB))
            .entries((context, entries) -> {
                entries.add(StoneVSlabs.STONE_VERTICAL_SLAB);
                entries.add(StoneVSlabs.COBBLESTONE_VERTICAL_SLAB);
                entries.add(StoneVSlabs.VERTICAL_MOSSY_COBBLESTONE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_SMOOTH_STONE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_STONE_BRICK_SLAB);
                entries.add(StoneVSlabs.VERTICAL_MOSSY_STONE_BRICK_SLAB);
                entries.add(StoneVSlabs.VERTICAL_GRANITE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_POLISHED_GRANITE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_DIORITE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_POLISHED_DIORITE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_ANDESITE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_POLISHED_ANDESITE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_COBBLED_DEEPSLATE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_POLISHED_DEEPSLATE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_DEEPSLATE_BRICK_SLAB);
                entries.add(StoneVSlabs.VERTICAL_DEEPSLATE_TILE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_BRICK_SLAB);
                entries.add(StoneVSlabs.VERTICAL_MUD_BRICK_SLAB);
                entries.add(StoneVSlabs.VERTICAL_SANDSTONE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_SMOOTH_SANDSTONE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_CUT_SANDSTONE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_RED_SANDSTONE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_CUT_RED_SANDSTONE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_PRISMARINE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_PRISMARINE_BRICK_SLAB);
                entries.add(StoneVSlabs.VERTICAL_DARK_PRISMARINE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_NETHER_BRICK_SLAB);
                entries.add(StoneVSlabs.VERTICAL_RED_NETHER_BRICK_SLAB);
                entries.add(StoneVSlabs.VERTICAL_BLACKSTONE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_POLISHED_BLACKSTONE_SLAB);
                entries.add(StoneVSlabs.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB);
                entries.add(StoneVSlabs.VERTICAL_ENDSTONE_BRICK_SLAB);
                entries.add(StoneVSlabs.VERTICAL_QUARTZ_SLAB);
                entries.add(StoneVSlabs.VERTICAL_SMOOTH_QUARTZ_SLAB);
                entries.add(CopperVSlabs.VERTICAL_CUT_COPPER_SLAB);
                entries.add(CopperVSlabs.VERTICAL_EXPOSED_CUT_COPPER_SLAB);
                entries.add(CopperVSlabs.VERTICAL_WEATHERED_CUT_COPPER_SLAB);
                entries.add(CopperVSlabs.VERTICAL_OXIDIZED_CUT_COPPER_SLAB);
                entries.add(CopperVSlabs.VERTICAL_WAXED_CUT_COPPER_SLAB);
                entries.add(CopperVSlabs.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB);
                entries.add(CopperVSlabs.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB);
                entries.add(CopperVSlabs.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB);
                entries.add(WoodVSlabs.VERTICAL_OAK_SLAB);
                entries.add(WoodVSlabs.VERTICAL_SPRUCE_SLAB);
                entries.add(WoodVSlabs.VERTICAL_BIRCH_SLAB);
                entries.add(WoodVSlabs.VERTICAL_JUNGLE_SLAB);
                entries.add(WoodVSlabs.VERTICAL_ACACIA_SLAB);
                entries.add(WoodVSlabs.VERTICAL_DARK_OAK_SLAB);
                entries.add(WoodVSlabs.VERTICAL_MANGROVE_SLAB);
                entries.add(WoodVSlabs.VERTICAL_CRIMSON_SLAB);
                entries.add(WoodVSlabs.VERTICAL_WARPED_SLAB);
                entries.add(ConcreteVSlabs.WHITE_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.GRAY_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.BLACK_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.BROWN_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.RED_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.ORANGE_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.YELLOW_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.LIME_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.GREEN_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.CYAN_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.BLUE_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.PURPLE_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.MAGENTA_CONCRETE_VERTICAL_SLAB);
                entries.add(ConcreteVSlabs.PINK_CONCRETE_VERTICAL_SLAB);
                entries.add(GlassVSlabs.GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.WHITE_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.LIGHT_GRAY_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.GRAY_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.BLACK_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.BROWN_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.RED_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.ORANGE_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.YELLOW_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.LIME_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.GREEN_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.CYAN_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.LIGHT_BLUE_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.BLUE_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.PURPLE_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.MAGENTA_GLASS_VERTICAL_SLAB);
                entries.add(GlassVSlabs.PINK_GLASS_VERTICAL_SLAB);
            }).build();
    private static final ItemGroup OEM_GROUP2 = FabricItemGroup.builder(new Identifier(OemMain.MOD_ID, "oem_group2"))
            .displayName(Text.literal("mc.origamiking.net specific"))
            .icon(() -> new ItemStack(ServerSpecificBlocks.CAVERNS_BLOCK_ONE))
            .entries((context, entries) -> {
                if (context.hasPermissions()) {
                    entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_ONE);
                    entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_TWO);
                    entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_THREE);
                    entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_FOUR);
                    entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_FIVE);
                    entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_SIX);
                    entries.add(ArmorRegistry.VIKING_ARMOR_HELMET);
                    //entries.add(ServerSpecificBlocks.BOOMBOX);
                    entries.add(ServerSpecificBlocks.PRIM);
                    entries.add(StoneVStairs.STONE_BRICK_VERTICAL_STAIRS);
                    entries.add(WoodVStairs.OAK_VERTICAL_STAIRS);
                    entries.add(ModItems.FUT_GUN);
                }
            }).build();
    public static void register() {
        OemMain.LOGGER.info("Registering Groups for OEM");
    }
}
