package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.armor.materials.CopperArmorMaterial;
import net.origamiking.mcmods.oem.blocks.amethyst.AmethystBlocks;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteWalls;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.leaves.LeafSlabs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafStairs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafWalls;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.sculk.SculkBlocks;
import net.origamiking.mcmods.oem.blocks.server_specific.ServerSpecificBlocks;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.concrete.ConcreteVSlabs;
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
import net.origamiking.mcmods.oem.blocks.wool.black.BlackWool;
import net.origamiking.mcmods.oem.blocks.wool.brown.BrownWool;
import net.origamiking.mcmods.oem.blocks.wool.cyan.CyanWool;
import net.origamiking.mcmods.oem.blocks.wool.gray.GrayWool;
import net.origamiking.mcmods.oem.blocks.wool.green.GreenWool;
import net.origamiking.mcmods.oem.blocks.wool.light_gray.LightGrayWool;
import net.origamiking.mcmods.oem.blocks.wool.lime.LimeWool;
import net.origamiking.mcmods.oem.blocks.wool.orange.OrangeWool;
import net.origamiking.mcmods.oem.blocks.wool.red.RedWool;
import net.origamiking.mcmods.oem.blocks.wool.white.WhiteWool;
import net.origamiking.mcmods.oem.blocks.wool.yellow.YellowWool;
import net.origamiking.mcmods.oem.blocks.wool.lightblue.LightBlueWool;
import net.origamiking.mcmods.oem.blocks.wool.blue.BlueWool;
import net.origamiking.mcmods.oem.blocks.wool.purple.PurpleWool;
import net.origamiking.mcmods.oem.blocks.wool.magenta.MagentaWool;
import net.origamiking.mcmods.oem.blocks.wool.pink.PinkWool;
import net.origamiking.mcmods.oem.items.ModItems;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }
    public static ShapelessRecipeJsonBuilder createButtonRecipe(RecipeCategory category, ItemConvertible output, Ingredient input) {
        return ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1);
    }
    public static void offerButtonRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        createButtonRecipe(category, output, Ingredient.ofItems(input)).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }
    public static CraftingRecipeJsonBuilder createBarRecipe(RecipeCategory category, ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 16).input('#', input).pattern("   ").pattern("###").pattern("###");
    }
    public static void offerBarRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        createBarRecipe(category, output, Ingredient.ofItems(input)).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }
    public static CraftingRecipeJsonBuilder createVerticalSlab(RecipeCategory category, ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6).input('#', input).pattern("#  ").pattern("#  ").pattern("#  ");
    }
    public static void offerVerticalSlabRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        createVerticalSlab(category, output, Ingredient.ofItems(input)).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }
    public static CraftingRecipeJsonBuilder createDoor(RecipeCategory category, ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 3).input('#', input).pattern("## ").pattern("## ").pattern("## ");
    }
    public static void offerDoorRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        createDoor(category, output, Ingredient.ofItems(input)).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }
    public static CraftingRecipeJsonBuilder createChest(RecipeCategory category, ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).input('#', input).pattern("###").pattern("# #").pattern("###");
    }
    public static void offerChestRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        createChest(category, output, Ingredient.ofItems(input)).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }
    public static CraftingRecipeJsonBuilder createTrappedChest(RecipeCategory category, ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).input('#', input).input('T', Items.TRIPWIRE_HOOK).pattern("###").pattern("#T#").pattern("###");
    }
    public static void offerTrappedChestRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        createTrappedChest(category, output, Ingredient.ofItems(input)).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        RecipeProvider.createStairsRecipe(GlassBlocks.GLASS_STAIR, Ingredient.ofItems(Blocks.GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GLASS_SLAB, Ingredient.ofItems(Blocks.GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.WHITE_GLASS_STAIR, Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.WHITE_GLASS_SLAB, Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.LIGHT_GRAY_GLASS_STAIR, Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIGHT_GRAY_GLASS_SLAB, Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.GRAY_GLASS_STAIR, Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GRAY_GLASS_SLAB, Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.BLACK_GLASS_STAIR, Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BLACK_GLASS_SLAB, Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.BROWN_GLASS_STAIR, Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BROWN_GLASS_SLAB, Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.RED_GLASS_STAIR, Ingredient.ofItems(Blocks.RED_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.RED_GLASS_SLAB, Ingredient.ofItems(Blocks.RED_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.ORANGE_GLASS_STAIR, Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.ORANGE_GLASS_SLAB, Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.YELLOW_GLASS_STAIR, Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.YELLOW_GLASS_SLAB, Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.LIME_GLASS_STAIR, Ingredient.ofItems(Blocks.LIME_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIME_GLASS_SLAB, Ingredient.ofItems(Blocks.LIME_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.GREEN_GLASS_STAIR, Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GREEN_GLASS_SLAB, Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.CYAN_GLASS_STAIR, Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.CYAN_GLASS_SLAB, Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.LIGHT_BLUE_GLASS_STAIR, Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIGHT_BLUE_GLASS_SLAB, Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.BLUE_GLASS_STAIR, Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BLUE_GLASS_SLAB, Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.PURPLE_GLASS_STAIR, Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.PURPLE_GLASS_SLAB, Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.MAGENTA_GLASS_STAIR, Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.MAGENTA_GLASS_SLAB, Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS));
        RecipeProvider.createStairsRecipe(GlassBlocks.PINK_GLASS_STAIR, Ingredient.ofItems(Blocks.PINK_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GlassBlocks.PINK_GLASS_SLAB, Ingredient.ofItems(Blocks.PINK_STAINED_GLASS));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, RandomBlocks.CALSITE_SLAB, Ingredient.ofItems(Blocks.CALCITE));
        RecipeProvider.createStairsRecipe(RandomBlocks.CALSITE_STAIRS, Ingredient.ofItems(Blocks.CALCITE));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, RandomBlocks.TUFF_SLAB, Ingredient.ofItems(Blocks.TUFF));
        RecipeProvider.createStairsRecipe(RandomBlocks.TUFF_STAIRS, Ingredient.ofItems(Blocks.TUFF));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SMOOTH_BASALT_SLAB, Ingredient.ofItems(Blocks.SMOOTH_BASALT));
        RecipeProvider.createStairsRecipe(RandomBlocks.SMOOTH_BASALT_STAIRS, Ingredient.ofItems(Blocks.SMOOTH_BASALT));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, RandomBlocks.NETHERRACK_SLAB, Ingredient.ofItems(Blocks.NETHERRACK));
        RecipeProvider.createStairsRecipe(RandomBlocks.NETHERRACK_STAIRS, Ingredient.ofItems(Blocks.NETHERRACK));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, RandomBlocks.DRIPSTONE_SLAB, Ingredient.ofItems(Blocks.DRIPSTONE_BLOCK));
        RecipeProvider.createStairsRecipe(RandomBlocks.DRIPSTONE_STAIRS, Ingredient.ofItems(Blocks.DRIPSTONE_BLOCK));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SNOW_SLAB, Ingredient.ofItems(Blocks.SNOW_BLOCK));
        RecipeProvider.createStairsRecipe(RandomBlocks.SNOW_STAIRS, Ingredient.ofItems(Blocks.SNOW_BLOCK));
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AmethystBlocks.AMETHYST_WALL, Blocks.AMETHYST_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.CALSITE_WALL, Blocks.CALCITE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.TUFF_WALL, Blocks.TUFF);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SNOW_WALL, Blocks.SNOW_BLOCK);
        RecipeProvider.createStairsRecipe(SculkBlocks.SCULK_STAIR, Ingredient.ofItems(Blocks.SCULK));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, SculkBlocks.SCULK_SLAB, Ingredient.ofItems(Blocks.SCULK));
        offerBarRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_BARS, Blocks.COPPER_BLOCK);
        offerBarRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_BARS, Blocks.EXPOSED_COPPER);
        offerBarRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_BARS, Blocks.WEATHERED_COPPER);
        offerBarRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_BARS, Blocks.OXIDIZED_COPPER);
        RecipeProvider.createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_PRESSURE_PLATE, Ingredient.ofItems(Blocks.COPPER_BLOCK));
        RecipeProvider.createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_PRESSURE_PLATE, Ingredient.ofItems(Blocks.EXPOSED_COPPER));
        RecipeProvider.createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_PRESSURE_PLATE, Ingredient.ofItems(Blocks.WEATHERED_COPPER));
        RecipeProvider.createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, Ingredient.ofItems(Blocks.OXIDIZED_COPPER));
        offerButtonRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_BUTTON, Blocks.COPPER_BLOCK);
        offerButtonRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_BUTTON, Blocks.EXPOSED_COPPER);
        offerButtonRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_BUTTON, Blocks.WEATHERED_COPPER);
        offerButtonRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_BUTTON, Blocks.OXIDIZED_COPPER);
        RecipeProvider.createDoorRecipe(CopperBlocks.COPPER_DOOR, Ingredient.ofItems(Blocks.COPPER_BLOCK));
        RecipeProvider.createTrapdoorRecipe(CopperBlocks.COPPER_TRAPDOOR, Ingredient.ofItems(Blocks.COPPER_BLOCK));
        RecipeProvider.createStairsRecipe(LeafStairs.OAK_LEAVES_STAIRS, Ingredient.ofItems(Blocks.OAK_LEAVES));
        RecipeProvider.createStairsRecipe(LeafStairs.SPRUCE_LEAVES_STAIRS, Ingredient.ofItems(Blocks.SPRUCE_LEAVES));
        RecipeProvider.createStairsRecipe(LeafStairs.BIRCH_LEAVES_STAIRS, Ingredient.ofItems(Blocks.BIRCH_LEAVES));
        RecipeProvider.createStairsRecipe(LeafStairs.ACACIA_LEAVES_STAIRS, Ingredient.ofItems(Blocks.ACACIA_LEAVES));
        RecipeProvider.createStairsRecipe(LeafStairs.JUNGLE_LEAVES_STAIRS, Ingredient.ofItems(Blocks.JUNGLE_LEAVES));
        RecipeProvider.createStairsRecipe(LeafStairs.DARK_OAK_LEAVES_STAIRS, Ingredient.ofItems(Blocks.DARK_OAK_LEAVES));
        RecipeProvider.createStairsRecipe(LeafStairs.MANGROVE_LEAVES_STAIRS, Ingredient.ofItems(Blocks.MANGROVE_LEAVES));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, WhiteWool.WHITE_WOOL_SLAB, Ingredient.ofItems(Blocks.WHITE_WOOL));
        RecipeProvider.createStairsRecipe(WhiteWool.WHITE_WOOL_STAIRS, Ingredient.ofItems(Blocks.WHITE_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,WhiteWool.WHITE_WOOL_WALL, Blocks.WHITE_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, LightGrayWool.LIGHT_GRAY_WOOL_SLAB, Ingredient.ofItems(Blocks.LIGHT_GRAY_WOOL));
        RecipeProvider.createStairsRecipe(LightGrayWool.LIGHT_GRAY_WOOL_STAIRS, Ingredient.ofItems(Blocks.LIGHT_GRAY_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,LightGrayWool.LIGHT_GRAY_WOOL_WALL, Blocks.LIGHT_GRAY_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GrayWool.GRAY_WOOL_SLAB, Ingredient.ofItems(Blocks.GRAY_WOOL));
        RecipeProvider.createStairsRecipe(GrayWool.GRAY_WOOL_STAIRS, Ingredient.ofItems(Blocks.GRAY_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,GrayWool.GRAY_WOOL_WALL, Blocks.GRAY_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlackWool.BLACK_WOOL_SLAB, Ingredient.ofItems(Blocks.BLACK_WOOL));
        RecipeProvider.createStairsRecipe(BlackWool.BLACK_WOOL_STAIRS, Ingredient.ofItems(Blocks.BLACK_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,BlackWool.BLACK_WOOL_WALL, Blocks.BLACK_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BrownWool.BROWN_WOOL_SLAB, Ingredient.ofItems(Blocks.BROWN_WOOL));
        RecipeProvider.createStairsRecipe(BrownWool.BROWN_WOOL_STAIRS, Ingredient.ofItems(Blocks.BROWN_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,BrownWool.BROWN_WOOL_WALL, Blocks.BROWN_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, RedWool.RED_WOOL_SLAB, Ingredient.ofItems(Blocks.RED_WOOL));
        RecipeProvider.createStairsRecipe(RedWool.RED_WOOL_STAIRS, Ingredient.ofItems(Blocks.RED_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,RedWool.RED_WOOL_WALL, Blocks.RED_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, OrangeWool.ORANGE_WOOL_SLAB, Ingredient.ofItems(Blocks.ORANGE_WOOL));
        RecipeProvider.createStairsRecipe(OrangeWool.ORANGE_WOOL_STAIRS, Ingredient.ofItems(Blocks.ORANGE_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,OrangeWool.ORANGE_WOOL_WALL, Blocks.ORANGE_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, YellowWool.YELLOW_WOOL_SLAB, Ingredient.ofItems(Blocks.YELLOW_WOOL));
        RecipeProvider.createStairsRecipe(YellowWool.YELLOW_WOOL_STAIRS, Ingredient.ofItems(Blocks.YELLOW_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,YellowWool.YELLOW_WOOL_WALL, Blocks.YELLOW_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, LimeWool.LIME_WOOL_SLAB, Ingredient.ofItems(Blocks.LIME_WOOL));
        RecipeProvider.createStairsRecipe(LimeWool.LIME_WOOL_STAIRS, Ingredient.ofItems(Blocks.LIME_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,LimeWool.LIME_WOOL_WALL, Blocks.LIME_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, GreenWool.GREEN_WOOL_SLAB, Ingredient.ofItems(Blocks.GREEN_WOOL));
        RecipeProvider.createStairsRecipe(GreenWool.GREEN_WOOL_STAIRS, Ingredient.ofItems(Blocks.GREEN_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,GreenWool.GREEN_WOOL_WALL, Blocks.GREEN_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, CyanWool.CYAN_WOOL_SLAB, Ingredient.ofItems(Blocks.CYAN_WOOL));
        RecipeProvider.createStairsRecipe(CyanWool.CYAN_WOOL_STAIRS, Ingredient.ofItems(Blocks.CYAN_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,CyanWool.CYAN_WOOL_WALL, Blocks.CYAN_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, LightBlueWool.LIGHT_BLUE_WOOL_SLAB, Ingredient.ofItems(Blocks.LIGHT_BLUE_WOOL));
        RecipeProvider.createStairsRecipe(LightBlueWool.LIGHT_BLUE_WOOL_STAIRS, Ingredient.ofItems(Blocks.LIGHT_BLUE_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,LightBlueWool.LIGHT_BLUE_WOOL_WALL, Blocks.LIGHT_BLUE_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlueWool.BLUE_WOOL_SLAB, Ingredient.ofItems(Blocks.BLUE_WOOL));
        RecipeProvider.createStairsRecipe(BlueWool.BLUE_WOOL_STAIRS, Ingredient.ofItems(Blocks.BLUE_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,BlueWool.BLUE_WOOL_WALL, Blocks.BLUE_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, PurpleWool.PURPLE_WOOL_SLAB, Ingredient.ofItems(Blocks.PURPLE_WOOL));
        RecipeProvider.createStairsRecipe(PurpleWool.PURPLE_WOOL_STAIRS, Ingredient.ofItems(Blocks.PURPLE_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,PurpleWool.PURPLE_WOOL_WALL, Blocks.PURPLE_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, MagentaWool.MAGENTA_WOOL_SLAB, Ingredient.ofItems(Blocks.MAGENTA_WOOL));
        RecipeProvider.createStairsRecipe(MagentaWool.MAGENTA_WOOL_STAIRS, Ingredient.ofItems(Blocks.MAGENTA_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,MagentaWool.MAGENTA_WOOL_WALL, Blocks.MAGENTA_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, PinkWool.PINK_WOOL_SLAB, Ingredient.ofItems(Blocks.PINK_WOOL));
        RecipeProvider.createStairsRecipe(PinkWool.PINK_WOOL_STAIRS, Ingredient.ofItems(Blocks.PINK_WOOL));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,PinkWool.PINK_WOOL_WALL, Blocks.PINK_WOOL);
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, LeafSlabs.OAK_LEAVES_SLAB, Ingredient.ofItems(Blocks.OAK_LEAVES));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, LeafSlabs.SPRUCE_LEAVES_SLAB, Ingredient.ofItems(Blocks.SPRUCE_LEAVES));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, LeafSlabs.BIRCH_LEAVES_SLAB, Ingredient.ofItems(Blocks.BIRCH_LEAVES));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, LeafSlabs.JUNGLE_LEAVES_SLAB, Ingredient.ofItems(Blocks.JUNGLE_LEAVES));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, LeafSlabs.ACACIA_LEAVES_SLAB, Ingredient.ofItems(Blocks.ACACIA_LEAVES));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, LeafSlabs.DARK_OAK_LEAVES_SLAB, Ingredient.ofItems(Blocks.DARK_OAK_LEAVES));
        RecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, LeafSlabs.MANGROVE_LEAVES_SLAB, Ingredient.ofItems(Blocks.MANGROVE_LEAVES));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,LeafWalls.OAK_LEAVES_WALL, Blocks.OAK_LEAVES);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,LeafWalls.SPRUCE_LEAVES_WALL, Blocks.SPRUCE_LEAVES);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,LeafWalls.BIRCH_LEAVES_WALL, Blocks.BIRCH_LEAVES);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,LeafWalls.JUNGLE_LEAVES_WALL, Blocks.JUNGLE_LEAVES);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,LeafWalls.ACACIA_LEAVES_WALL, Blocks.ACACIA_LEAVES);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,LeafWalls.DARK_OAK_LEAVES_WALL, Blocks.DARK_OAK_LEAVES);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,LeafWalls.MANGROVE_LEAVES_WALL, Blocks.MANGROVE_LEAVES);
        RecipeProvider.createDoorRecipe(CopperBlocks.EXPOSED_COPPER_DOOR, Ingredient.ofItems(Blocks.EXPOSED_COPPER));
        RecipeProvider.createTrapdoorRecipe(CopperBlocks.EXPOSED_COPPER_TRAPDOOR, Ingredient.ofItems(Blocks.EXPOSED_COPPER));
        RecipeProvider.createDoorRecipe(CopperBlocks.WEATHERED_COPPER_DOOR, Ingredient.ofItems(Blocks.WEATHERED_COPPER));
        RecipeProvider.createTrapdoorRecipe(CopperBlocks.WEATHERED_COPPER_TRAPDOOR, Ingredient.ofItems(Blocks.WEATHERED_COPPER));
        RecipeProvider.createDoorRecipe(CopperBlocks.OXIDIZED_COPPER_DOOR, Ingredient.ofItems(Blocks.OXIDIZED_COPPER));
        RecipeProvider.createTrapdoorRecipe(CopperBlocks.OXIDIZED_COPPER_TRAPDOOR, Ingredient.ofItems(Blocks.OXIDIZED_COPPER));
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
        RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, SculkBlocks.SCULK_WALL, Blocks.SCULK);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.STONE_VERTICAL_SLAB, Blocks.STONE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.COBBLESTONE_VERTICAL_SLAB, Blocks.COBBLESTONE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_MOSSY_COBBLESTONE_SLAB, Blocks.MOSSY_COBBLESTONE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_SMOOTH_STONE_SLAB, Blocks.SMOOTH_STONE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_STONE_BRICK_SLAB, Blocks.STONE_BRICKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_MOSSY_STONE_BRICK_SLAB, Blocks.MOSSY_STONE_BRICKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_GRANITE_SLAB, Blocks.GRANITE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_POLISHED_GRANITE_SLAB, Blocks.POLISHED_GRANITE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_DIORITE_SLAB, Blocks.DIORITE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_POLISHED_DIORITE_SLAB, Blocks.POLISHED_DIORITE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_ANDESITE_SLAB, Blocks.ANDESITE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_POLISHED_ANDESITE_SLAB, Blocks.POLISHED_ANDESITE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_COBBLED_DEEPSLATE_SLAB, Blocks.COBBLED_DEEPSLATE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_POLISHED_DEEPSLATE_SLAB, Blocks.POLISHED_DEEPSLATE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE_BRICKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_DEEPSLATE_TILE_SLAB, Blocks.DEEPSLATE_TILES);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_BRICK_SLAB, Blocks.BRICKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_MUD_BRICK_SLAB, Blocks.MUD_BRICKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_SANDSTONE_SLAB, Blocks.SANDSTONE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_CUT_SANDSTONE_SLAB, Blocks.CUT_SANDSTONE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_RED_SANDSTONE_SLAB, Blocks.RED_SANDSTONE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, Blocks.SMOOTH_RED_SANDSTONE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_CUT_RED_SANDSTONE_SLAB, Blocks.CUT_RED_SANDSTONE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_PRISMARINE_SLAB, Blocks.PRISMARINE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_DARK_PRISMARINE_SLAB, Blocks.DARK_PRISMARINE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_NETHER_BRICK_SLAB, Blocks.NETHER_BRICKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_RED_NETHER_BRICK_SLAB, Blocks.RED_NETHER_BRICKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_BLACKSTONE_SLAB, Blocks.BLACKSTONE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_POLISHED_BLACKSTONE_SLAB, Blocks.POLISHED_BLACKSTONE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.POLISHED_BLACKSTONE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_ENDSTONE_BRICK_SLAB, Blocks.END_STONE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_QUARTZ_SLAB, Blocks.QUARTZ_BLOCK);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_SMOOTH_QUARTZ_SLAB, Blocks.SMOOTH_QUARTZ);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_OAK_SLAB, Blocks.OAK_PLANKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_SPRUCE_SLAB, Blocks.SPRUCE_PLANKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_BIRCH_SLAB, Blocks.BIRCH_PLANKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_JUNGLE_SLAB, Blocks.JUNGLE_PLANKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_ACACIA_SLAB, Blocks.ACACIA_PLANKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_DARK_OAK_SLAB, Blocks.DARK_OAK_PLANKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_MANGROVE_SLAB, Blocks.MANGROVE_PLANKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_CRIMSON_SLAB, Blocks.CRIMSON_PLANKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_WARPED_SLAB, Blocks.WARPED_PLANKS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.WHITE_CONCRETE_VERTICAL_SLAB, Blocks.WHITE_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.GRAY_CONCRETE_VERTICAL_SLAB, Blocks. GRAY_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.BLACK_CONCRETE_VERTICAL_SLAB, Blocks.BLACK_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.BROWN_CONCRETE_VERTICAL_SLAB, Blocks.BROWN_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.RED_CONCRETE_VERTICAL_SLAB, Blocks.RED_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.ORANGE_CONCRETE_VERTICAL_SLAB, Blocks.ORANGE_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.YELLOW_CONCRETE_VERTICAL_SLAB, Blocks.YELLOW_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.LIME_CONCRETE_VERTICAL_SLAB, Blocks.LIME_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.GREEN_CONCRETE_VERTICAL_SLAB, Blocks.GREEN_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.CYAN_CONCRETE_VERTICAL_SLAB, Blocks.CYAN_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.BLUE_CONCRETE_VERTICAL_SLAB, Blocks.BLUE_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.PURPLE_CONCRETE_VERTICAL_SLAB, Blocks.PURPLE_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.MAGENTA_CONCRETE_VERTICAL_SLAB, Blocks.MAGENTA_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.PINK_CONCRETE_VERTICAL_SLAB, Blocks.PINK_CONCRETE);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.WHITE_GLASS_VERTICAL_SLAB, Blocks.WHITE_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.LIGHT_GRAY_GLASS_VERTICAL_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.GRAY_GLASS_VERTICAL_SLAB, Blocks.GRAY_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.BLACK_GLASS_VERTICAL_SLAB, Blocks.BLACK_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.BROWN_GLASS_VERTICAL_SLAB, Blocks.BROWN_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.RED_GLASS_VERTICAL_SLAB, Blocks.RED_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.ORANGE_GLASS_VERTICAL_SLAB, Blocks.ORANGE_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.YELLOW_GLASS_VERTICAL_SLAB, Blocks.YELLOW_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.LIME_GLASS_VERTICAL_SLAB, Blocks.LIME_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.GREEN_GLASS_VERTICAL_SLAB, Blocks.GREEN_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.CYAN_GLASS_VERTICAL_SLAB, Blocks.CYAN_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.LIGHT_BLUE_GLASS_VERTICAL_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.BLUE_GLASS_VERTICAL_SLAB, Blocks.BLUE_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.PURPLE_GLASS_VERTICAL_SLAB, Blocks.PURPLE_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.MAGENTA_GLASS_VERTICAL_SLAB, Blocks.MAGENTA_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.PINK_GLASS_VERTICAL_SLAB, Blocks.PINK_STAINED_GLASS);
        offerVerticalSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.GLASS_VERTICAL_SLAB, Blocks.GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GLASS_STAIR, Blocks.GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GLASS_SLAB, Blocks.GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.WHITE_GLASS_STAIR, Blocks.WHITE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.WHITE_GLASS_SLAB, Blocks.WHITE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIGHT_GRAY_GLASS_STAIR, Blocks.LIGHT_GRAY_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIGHT_GRAY_GLASS_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GRAY_GLASS_STAIR, Blocks.GRAY_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GRAY_GLASS_SLAB, Blocks.GRAY_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BLACK_GLASS_STAIR, Blocks.BLACK_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BLACK_GLASS_SLAB, Blocks.BLACK_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BROWN_GLASS_STAIR, Blocks.BROWN_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BROWN_GLASS_SLAB, Blocks.BROWN_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.RED_GLASS_STAIR, Blocks.RED_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.RED_GLASS_SLAB, Blocks.RED_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.ORANGE_GLASS_STAIR, Blocks.ORANGE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.ORANGE_GLASS_SLAB, Blocks.ORANGE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.YELLOW_GLASS_STAIR, Blocks.YELLOW_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.YELLOW_GLASS_SLAB, Blocks.YELLOW_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIME_GLASS_STAIR, Blocks.LIME_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIME_GLASS_SLAB, Blocks.LIME_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GREEN_GLASS_STAIR, Blocks.GREEN_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.GREEN_GLASS_SLAB, Blocks.GREEN_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.CYAN_GLASS_STAIR, Blocks.CYAN_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.CYAN_GLASS_SLAB, Blocks.CYAN_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIGHT_BLUE_GLASS_STAIR, Blocks.LIGHT_BLUE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.LIGHT_BLUE_GLASS_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BLUE_GLASS_STAIR, Blocks.BLUE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.BLUE_GLASS_SLAB, Blocks.BLUE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.PURPLE_GLASS_STAIR, Blocks.PURPLE_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.PURPLE_GLASS_SLAB, Blocks.PURPLE_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.MAGENTA_GLASS_STAIR, Blocks.MAGENTA_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.MAGENTA_GLASS_SLAB, Blocks.MAGENTA_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.PINK_GLASS_STAIR, Blocks.PINK_STAINED_GLASS, 1);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassBlocks.PINK_GLASS_SLAB, Blocks.PINK_STAINED_GLASS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.CALSITE_SLAB, Blocks.CALCITE, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.CALSITE_STAIRS, Blocks.CALCITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.TUFF_SLAB, Blocks.TUFF, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.TUFF_STAIRS, Blocks.TUFF);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SNOW_SLAB, Blocks.SNOW_BLOCK, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SNOW_STAIRS, Blocks.SNOW_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AmethystBlocks.AMETHYST_WALL, Blocks.AMETHYST_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.CALSITE_WALL, Blocks.CALCITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.TUFF_WALL, Blocks.TUFF);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.SNOW_WALL, Blocks.SNOW_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, SculkBlocks.SCULK_STAIR, Blocks.SCULK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, SculkBlocks.SCULK_SLAB, Blocks.SCULK,2);
        RecipeProvider.offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COPPER_NUGGET, RecipeCategory.BUILDING_BLOCKS, Items.COPPER_INGOT);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_CHAIN, Blocks.COPPER_BLOCK, 6);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_CHAIN, Blocks.EXPOSED_COPPER, 6);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_CHAIN, Blocks.WEATHERED_COPPER, 6);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_CHAIN, Blocks.OXIDIZED_COPPER, 6);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_BARS, Blocks.COPPER_BLOCK, 3);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_BARS, Blocks.EXPOSED_COPPER, 3);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_BARS, Blocks.WEATHERED_COPPER, 3);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_BARS, Blocks.OXIDIZED_COPPER, 3);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_PRESSURE_PLATE, Blocks.COPPER_BLOCK, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_PRESSURE_PLATE, Blocks.EXPOSED_COPPER, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_PRESSURE_PLATE, Blocks.WEATHERED_COPPER, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, Blocks.OXIDIZED_COPPER, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_BUTTON, Blocks.COPPER_BLOCK, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_BUTTON, Blocks.EXPOSED_COPPER, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_BUTTON, Blocks.WEATHERED_COPPER, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_BUTTON, Blocks.OXIDIZED_COPPER, 8);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_DOOR, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_TRAPDOOR, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.COMBAT, CopperArmorMaterial.getCopperArmor.COPPER_HELMET, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.COMBAT, CopperArmorMaterial.getCopperArmor.COPPER_CHESTPLATE, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.COMBAT, CopperArmorMaterial.getCopperArmor.COPPER_LEGGINGS, Blocks.COPPER_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.COMBAT, CopperArmorMaterial.getCopperArmor.COPPER_BOOTS, Blocks.COPPER_BLOCK);
        //leaves
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafStairs.OAK_LEAVES_STAIRS, Blocks.OAK_LEAVES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafStairs.SPRUCE_LEAVES_STAIRS,Blocks.SPRUCE_LEAVES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafStairs.BIRCH_LEAVES_STAIRS, Blocks.BIRCH_LEAVES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafStairs.ACACIA_LEAVES_STAIRS, Blocks.ACACIA_LEAVES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafStairs.JUNGLE_LEAVES_STAIRS, Blocks.JUNGLE_LEAVES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafStairs.DARK_OAK_LEAVES_STAIRS, Blocks.DARK_OAK_LEAVES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafStairs.MANGROVE_LEAVES_STAIRS, Blocks.MANGROVE_LEAVES);
        //wool
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WhiteWool.WHITE_WOOL_SLAB, Blocks.WHITE_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WhiteWool.WHITE_WOOL_STAIRS, Blocks.WHITE_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WhiteWool.WHITE_WOOL_WALL, Blocks.WHITE_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LightGrayWool.LIGHT_GRAY_WOOL_SLAB, Blocks.LIGHT_GRAY_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LightGrayWool.LIGHT_GRAY_WOOL_STAIRS,Blocks.LIGHT_GRAY_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LightGrayWool.LIGHT_GRAY_WOOL_WALL, Blocks.LIGHT_GRAY_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GrayWool.GRAY_WOOL_SLAB, Blocks.GRAY_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GrayWool.GRAY_WOOL_STAIRS,Blocks.GRAY_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GrayWool.GRAY_WOOL_WALL, Blocks.GRAY_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlackWool.BLACK_WOOL_SLAB, Blocks.BLACK_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlackWool.BLACK_WOOL_STAIRS,Blocks.BLACK_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlackWool.BLACK_WOOL_WALL, Blocks.BLACK_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BrownWool.BROWN_WOOL_SLAB, Blocks.BROWN_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BrownWool.BROWN_WOOL_STAIRS,Blocks.BROWN_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BrownWool.BROWN_WOOL_WALL, Blocks.BROWN_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RedWool.RED_WOOL_SLAB, Blocks.RED_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RedWool.RED_WOOL_STAIRS,Blocks.RED_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RedWool.RED_WOOL_WALL, Blocks.RED_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OrangeWool.ORANGE_WOOL_SLAB, Blocks.ORANGE_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OrangeWool.ORANGE_WOOL_STAIRS,Blocks.ORANGE_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OrangeWool.ORANGE_WOOL_WALL, Blocks.ORANGE_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, YellowWool.YELLOW_WOOL_SLAB, Blocks.YELLOW_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, YellowWool.YELLOW_WOOL_STAIRS,Blocks.YELLOW_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, YellowWool.YELLOW_WOOL_WALL, Blocks.YELLOW_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LimeWool.LIME_WOOL_SLAB, Blocks.LIME_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LimeWool.LIME_WOOL_STAIRS,Blocks.LIME_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LimeWool.LIME_WOOL_WALL, Blocks.LIME_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GreenWool.GREEN_WOOL_SLAB, Blocks.GREEN_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GreenWool.GREEN_WOOL_STAIRS,Blocks.GREEN_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GreenWool.GREEN_WOOL_WALL, Blocks.GREEN_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CyanWool.CYAN_WOOL_SLAB, Blocks.CYAN_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CyanWool.CYAN_WOOL_STAIRS,Blocks.CYAN_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CyanWool.CYAN_WOOL_WALL, Blocks.CYAN_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LightBlueWool.LIGHT_BLUE_WOOL_SLAB, Blocks.LIGHT_BLUE_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LightBlueWool.LIGHT_BLUE_WOOL_STAIRS,Blocks.LIGHT_BLUE_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LightBlueWool.LIGHT_BLUE_WOOL_WALL, Blocks.LIGHT_BLUE_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlueWool.BLUE_WOOL_SLAB, Blocks.BLUE_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlueWool.BLUE_WOOL_STAIRS,Blocks.BLUE_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlueWool.BLUE_WOOL_WALL, Blocks.BLUE_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PurpleWool.PURPLE_WOOL_SLAB, Blocks.PURPLE_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PurpleWool.PURPLE_WOOL_STAIRS,Blocks.PURPLE_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PurpleWool.PURPLE_WOOL_WALL, Blocks.PURPLE_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MagentaWool.MAGENTA_WOOL_SLAB, Blocks.MAGENTA_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MagentaWool.MAGENTA_WOOL_STAIRS,Blocks.MAGENTA_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MagentaWool.MAGENTA_WOOL_WALL, Blocks.MAGENTA_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PinkWool.PINK_WOOL_SLAB, Blocks.PINK_WOOL, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PinkWool.PINK_WOOL_STAIRS,Blocks.PINK_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PinkWool.PINK_WOOL_WALL, Blocks.PINK_WOOL);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafSlabs.OAK_LEAVES_SLAB, Blocks.OAK_LEAVES,2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafSlabs.SPRUCE_LEAVES_SLAB, Blocks.SPRUCE_LEAVES,2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafSlabs.BIRCH_LEAVES_SLAB, Blocks.BIRCH_LEAVES,2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafSlabs.JUNGLE_LEAVES_SLAB, Blocks.JUNGLE_LEAVES,2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafSlabs.ACACIA_LEAVES_SLAB, Blocks.ACACIA_LEAVES,2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafSlabs.DARK_OAK_LEAVES_SLAB, Blocks.DARK_OAK_LEAVES,2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafSlabs.MANGROVE_LEAVES_SLAB, Blocks.MANGROVE_LEAVES,2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafWalls.OAK_LEAVES_WALL, Blocks.OAK_LEAVES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafWalls.SPRUCE_LEAVES_WALL, Blocks.SPRUCE_LEAVES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafWalls.BIRCH_LEAVES_WALL, Blocks.BIRCH_LEAVES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafWalls.JUNGLE_LEAVES_WALL, Blocks.JUNGLE_LEAVES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafWalls.ACACIA_LEAVES_WALL, Blocks.ACACIA_LEAVES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafWalls.DARK_OAK_LEAVES_WALL, Blocks.DARK_OAK_LEAVES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, LeafWalls.MANGROVE_LEAVES_WALL, Blocks.MANGROVE_LEAVES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_DOOR, Blocks.EXPOSED_COPPER);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.EXPOSED_COPPER_TRAPDOOR, Blocks.EXPOSED_COPPER);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_DOOR, Blocks.WEATHERED_COPPER);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.WEATHERED_COPPER_TRAPDOOR, Blocks.WEATHERED_COPPER);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_DOOR, Blocks.OXIDIZED_COPPER);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CopperBlocks.OXIDIZED_COPPER_TRAPDOOR, Blocks.OXIDIZED_COPPER);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteWalls.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, SculkBlocks.SCULK_WALL, Blocks.SCULK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.STONE_VERTICAL_SLAB, Blocks.STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.COBBLESTONE_VERTICAL_SLAB, Blocks.COBBLESTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_MOSSY_COBBLESTONE_SLAB, Blocks.MOSSY_COBBLESTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_SMOOTH_STONE_SLAB, Blocks.SMOOTH_STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_STONE_BRICK_SLAB, Blocks.STONE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_MOSSY_STONE_BRICK_SLAB, Blocks.MOSSY_STONE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_GRANITE_SLAB, Blocks.GRANITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_POLISHED_GRANITE_SLAB, Blocks.POLISHED_GRANITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_DIORITE_SLAB, Blocks.DIORITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_POLISHED_DIORITE_SLAB, Blocks.POLISHED_DIORITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_ANDESITE_SLAB, Blocks.ANDESITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_POLISHED_ANDESITE_SLAB, Blocks.POLISHED_ANDESITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_COBBLED_DEEPSLATE_SLAB, Blocks.COBBLED_DEEPSLATE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_POLISHED_DEEPSLATE_SLAB, Blocks.POLISHED_DEEPSLATE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_DEEPSLATE_TILE_SLAB, Blocks.DEEPSLATE_TILES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_BRICK_SLAB, Blocks.BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_MUD_BRICK_SLAB, Blocks.MUD_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_SANDSTONE_SLAB, Blocks.SANDSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_SANDSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_CUT_SANDSTONE_SLAB, Blocks.CUT_SANDSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_RED_SANDSTONE_SLAB, Blocks.RED_SANDSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB, Blocks.SMOOTH_RED_SANDSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_CUT_RED_SANDSTONE_SLAB, Blocks.CUT_RED_SANDSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_PRISMARINE_SLAB, Blocks.PRISMARINE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_PRISMARINE_BRICK_SLAB, Blocks.PRISMARINE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_DARK_PRISMARINE_SLAB, Blocks.DARK_PRISMARINE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_NETHER_BRICK_SLAB, Blocks.NETHER_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_RED_NETHER_BRICK_SLAB, Blocks.RED_NETHER_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_BLACKSTONE_SLAB, Blocks.BLACKSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_POLISHED_BLACKSTONE_SLAB, Blocks.POLISHED_BLACKSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_ENDSTONE_BRICK_SLAB, Blocks.END_STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_QUARTZ_SLAB, Blocks.QUARTZ_BLOCK);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_SMOOTH_QUARTZ_SLAB, Blocks.SMOOTH_QUARTZ);
//                RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_CUT_COPPER_SLAB);
//                RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_EXPOSED_CUT_COPPER_SLAB);
//                RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_WEATHERED_CUT_COPPER_SLAB);
//                RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_OXIDIZED_CUT_COPPER_SLAB);
//                RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_WAXED_CUT_COPPER_SLAB);
//                RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB);
//                RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB);
//                RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, StoneVSlabs.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_OAK_SLAB, Blocks.OAK_PLANKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_SPRUCE_SLAB, Blocks.SPRUCE_PLANKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_BIRCH_SLAB, Blocks.BIRCH_PLANKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_JUNGLE_SLAB, Blocks.JUNGLE_PLANKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_ACACIA_SLAB, Blocks.ACACIA_PLANKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_DARK_OAK_SLAB, Blocks.DARK_OAK_PLANKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_MANGROVE_SLAB, Blocks.MANGROVE_PLANKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_CRIMSON_SLAB, Blocks.CRIMSON_PLANKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WoodVSlabs.VERTICAL_WARPED_SLAB, Blocks.WARPED_PLANKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.WHITE_CONCRETE_VERTICAL_SLAB, Blocks.WHITE_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.GRAY_CONCRETE_VERTICAL_SLAB, Blocks. GRAY_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.BLACK_CONCRETE_VERTICAL_SLAB, Blocks.BLACK_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.BROWN_CONCRETE_VERTICAL_SLAB, Blocks.BROWN_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.RED_CONCRETE_VERTICAL_SLAB, Blocks.RED_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.ORANGE_CONCRETE_VERTICAL_SLAB, Blocks.ORANGE_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.YELLOW_CONCRETE_VERTICAL_SLAB, Blocks.YELLOW_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.LIME_CONCRETE_VERTICAL_SLAB, Blocks.LIME_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.GREEN_CONCRETE_VERTICAL_SLAB, Blocks.GREEN_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.CYAN_CONCRETE_VERTICAL_SLAB, Blocks.CYAN_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.BLUE_CONCRETE_VERTICAL_SLAB, Blocks.BLUE_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.PURPLE_CONCRETE_VERTICAL_SLAB, Blocks.PURPLE_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.MAGENTA_CONCRETE_VERTICAL_SLAB, Blocks.MAGENTA_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ConcreteVSlabs.PINK_CONCRETE_VERTICAL_SLAB, Blocks.PINK_CONCRETE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.WHITE_GLASS_VERTICAL_SLAB, Blocks.WHITE_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.LIGHT_GRAY_GLASS_VERTICAL_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.GRAY_GLASS_VERTICAL_SLAB, Blocks.GRAY_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.BLACK_GLASS_VERTICAL_SLAB, Blocks.BLACK_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.BROWN_GLASS_VERTICAL_SLAB, Blocks.BROWN_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.RED_GLASS_VERTICAL_SLAB, Blocks.RED_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.ORANGE_GLASS_VERTICAL_SLAB, Blocks.ORANGE_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.YELLOW_GLASS_VERTICAL_SLAB, Blocks.YELLOW_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.LIME_GLASS_VERTICAL_SLAB, Blocks.LIME_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.GREEN_GLASS_VERTICAL_SLAB, Blocks.GREEN_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.CYAN_GLASS_VERTICAL_SLAB, Blocks.CYAN_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.LIGHT_BLUE_GLASS_VERTICAL_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.BLUE_GLASS_VERTICAL_SLAB, Blocks.BLUE_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.PURPLE_GLASS_VERTICAL_SLAB, Blocks.PURPLE_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.MAGENTA_GLASS_VERTICAL_SLAB, Blocks.MAGENTA_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.PINK_GLASS_VERTICAL_SLAB, Blocks.PINK_STAINED_GLASS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, GlassVSlabs.GLASS_VERTICAL_SLAB, Blocks.GLASS);
//        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.BLACKSTONE_FURNACE, Blocks.BLACKSTONE);
//        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, RandomBlocks.DEEPSLATE_FURNACE, Blocks.COBBLED_DEEPSLATE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ServerSpecificBlocks.IRON_BAR_DOOR, Blocks.IRON_BLOCK, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ServerSpecificBlocks.GOLD_BAR_DOOR, Blocks.GOLD_BLOCK, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ServerSpecificBlocks.COPPER_BAR_DOOR, Blocks.COPPER_BLOCK, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ServerSpecificBlocks.EXPOSED_COPPER_BAR_DOOR, Blocks.EXPOSED_COPPER, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ServerSpecificBlocks.WEATHERED_COPPER_BAR_DOOR, Blocks.WEATHERED_COPPER, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ServerSpecificBlocks.OXIDIZED_COPPER_BAR_DOOR, Blocks.OXIDIZED_COPPER, 2);

        offerDoorRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ServerSpecificBlocks.IRON_BAR_DOOR, Items.IRON_INGOT);
        offerDoorRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ServerSpecificBlocks.GOLD_BAR_DOOR, Items.GOLD_INGOT);
        offerDoorRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ServerSpecificBlocks.COPPER_BAR_DOOR, Items.COPPER_INGOT);

//        offerChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AcaciaWoodBlocks.ACACIA_CHEST, Blocks.ACACIA_PLANKS);
//        offerTrappedChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AcaciaWoodBlocks.ACACIA_TRAPPED_CHEST, Blocks.ACACIA_PLANKS);
        offerChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AzaleaWoodBlocks.AZALEA_CHEST, AzaleaWoodBlocks.AZALEA_PLANKS);
        offerTrappedChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AzaleaWoodBlocks.AZALEA_TRAPPED_CHEST, AzaleaWoodBlocks.AZALEA_PLANKS);
        offerChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BirchWoodBlocks.BIRCH_CHEST, Blocks.BIRCH_PLANKS);
        offerTrappedChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BirchWoodBlocks.BIRCH_TRAPPED_CHEST, Blocks.BIRCH_PLANKS);
        offerChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CrimsonWoodBlocks.CRIMSON_CHEST, Blocks.CRIMSON_PLANKS);
        offerTrappedChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, CrimsonWoodBlocks.CRIMSON_TRAPPED_CHEST, Blocks.CRIMSON_PLANKS);
        offerChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DarkOakWoodBlocks.DARK_OAK_CHEST, Blocks.DARK_OAK_PLANKS);
        offerTrappedChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DarkOakWoodBlocks.DARK_OAK_TRAPPED_CHEST, Blocks.DARK_OAK_PLANKS);
        offerChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, JungleWoodBlocks.JUNGLE_CHEST, Blocks.JUNGLE_PLANKS);
        offerTrappedChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, JungleWoodBlocks.JUNGLE_TRAPPED_CHEST, Blocks.JUNGLE_PLANKS);
        offerChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MangroveWoodBlocks.MANGROVE_CHEST, Blocks.MANGROVE_PLANKS);
        offerTrappedChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MangroveWoodBlocks.MANGROVE_TRAPPED_CHEST, Blocks.MANGROVE_PLANKS);
        offerChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OakWoodBlocks.OAK_CHEST, Blocks.OAK_PLANKS);
        offerTrappedChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OakWoodBlocks.OAK_TRAPPED_CHEST, Blocks.OAK_PLANKS);
        offerChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, SpruceWoodBlocks.SPRUCE_CHEST, Blocks.SPRUCE_PLANKS);
        offerTrappedChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, SpruceWoodBlocks.SPRUCE_TRAPPED_CHEST, Blocks.SPRUCE_PLANKS);
        offerChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WarpedWoodBlocks.WARPED_CHEST, Blocks.WARPED_PLANKS);
        offerTrappedChestRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, WarpedWoodBlocks.WARPED_TRAPPED_CHEST, Blocks.WARPED_PLANKS);



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CopperBlocks.COPPER_PRESSURE_PLATE, 2)
                .pattern("   ").pattern("   ").pattern("###").input('#', Items.COPPER_INGOT)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT), RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(CopperBlocks.COPPER_PRESSURE_PLATE)));

        /*ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.COPPER_INGOT, 1)
                .pattern("###").pattern("###").pattern("###").input('#', ModItems.COPPER_NUGGET)
                .criterion(RecipeProvider.hasItem(ModItems.COPPER_NUGGET), RecipeProvider.conditionsFromItem(ModItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.COPPER_NUGGET)));*/


        /*ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocksServerSpecific.GOLD_LANTERN, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.GOLD_NUGGET)
                .criterion(RecipeProvider.hasItem(Blocks.GLASS), RecipeProvider.conditionsFromItem(Blocks.GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocksGlass.GLASS_STAIR)));*/
//        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, GoldBlocks.GOLD_BARS, 16)
//                .pattern("###")
//                .pattern("###")
//                .pattern("   ")
//                .input('#', Items.GOLD_INGOT)
//                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
//                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(GoldBlocks.GOLD_BARS)));
    }
    public static void StairsSlabsWallsOther(Consumer<RecipeJsonProvider> exporter) {


    }
//    public static CraftingRecipeJsonBuilder RecipeProvider.offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,ItemConvertible output, Ingredient input) {
//        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6).input('#', input).pattern("   ").pattern("###").pattern("###");
//    }

}
