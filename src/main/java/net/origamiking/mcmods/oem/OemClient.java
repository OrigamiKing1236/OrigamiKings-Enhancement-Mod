package net.origamiking.mcmods.oem;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.RenderLayer;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.gold.GoldBlocks;
import net.origamiking.mcmods.oem.blocks.leaves.LeafSlabs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafStairs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafWalls;
import net.origamiking.mcmods.oem.blocks.server_specific.ServerSpecificBlocks;
import net.origamiking.mcmods.oem.blocks.wood.acacia.AcaciaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.birch.BirchWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.crimson.CrimsonWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.darkoak.DarkOakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.jungle.JungleWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.mangrove.MangroveWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.oak.OakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.spruce.SpruceWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.warped.WarpedWoodBlocks;

public class OemClient implements ClientModInitializer {
   //public static final EntityModelLayer MODEL_NEW_COW_ENTITY_LAYER = new EntityModelLayer(new Identifier("oem", "new_cow_entity"), "main");
   @Override
   public void onInitializeClient() {
      //EntityRendererRegistry.register(NewCowEntity.NEW_COW_ENTITY, (context) -> {
      //           return new NewCowEntityRenderer(context);
      //       });


      //EntityModelLayerRegistry.registerModelLayer(MODEL_NEW_COW_ENTITY_LAYER, NewCowEntityModel::getTexturedModelData);
      BlockRenderLayerMap.INSTANCE.putBlock(GoldBlocks.GOLD_BARS, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.COPPER_BARS, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.EXPOSED_COPPER_BARS, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.WEATHERED_COPPER_BARS, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.OXIDIZED_COPPER_BARS, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.COPPER_DOOR, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.COPPER_TRAPDOOR, RenderLayer.getCutoutMipped());
      BlockRenderLayerMap.INSTANCE.putBlock(OakWoodBlocks.OAK_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(SpruceWoodBlocks.SPRUCE_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(BirchWoodBlocks.BIRCH_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(JungleWoodBlocks.JUNGLE_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(AcaciaWoodBlocks.ACACIA_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(DarkOakWoodBlocks.DARK_OAK_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(MangroveWoodBlocks.MANGROVE_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(CrimsonWoodBlocks.CRIMSON_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(WarpedWoodBlocks.WARPED_LADDER, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(ServerSpecificBlocks.GOLD_CHAIN, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.COPPER_CHAIN, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.WEATHERED_COPPER_CHAIN, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.EXPOSED_COPPER_CHAIN, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(CopperBlocks.OXIDIZED_COPPER_CHAIN, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.WHITE_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.WHITE_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_GRAY_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_GRAY_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GRAY_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GRAY_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLACK_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLACK_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BROWN_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BROWN_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.RED_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.RED_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.ORANGE_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.ORANGE_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.YELLOW_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.YELLOW_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIME_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIME_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GREEN_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GREEN_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.CYAN_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.CYAN_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_BLUE_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.LIGHT_BLUE_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLUE_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.BLUE_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.PURPLE_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.PURPLE_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.MAGENTA_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.MAGENTA_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.PINK_GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.PINK_GLASS_STAIR, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GLASS_SLAB, RenderLayer.getTranslucent());
      BlockRenderLayerMap.INSTANCE.putBlock(GlassBlocks.GLASS_STAIR, RenderLayer.getTranslucent());

      //leaf cutout
      BlockRenderLayerMap.INSTANCE.putBlock(LeafStairs.OAK_LEAVES_STAIRS, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafStairs.SPRUCE_LEAVES_STAIRS, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafStairs.BIRCH_LEAVES_STAIRS, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafStairs.ACACIA_LEAVES_STAIRS, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafStairs.JUNGLE_LEAVES_STAIRS, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafStairs.DARK_OAK_LEAVES_STAIRS, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafStairs.MANGROVE_LEAVES_STAIRS, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafSlabs.OAK_LEAVES_SLAB, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafSlabs.SPRUCE_LEAVES_SLAB, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafSlabs.BIRCH_LEAVES_SLAB, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafSlabs.ACACIA_LEAVES_SLAB, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafSlabs.JUNGLE_LEAVES_SLAB, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafSlabs.DARK_OAK_LEAVES_SLAB, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafSlabs.MANGROVE_LEAVES_SLAB, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafWalls.OAK_LEAVES_WALL, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafWalls.SPRUCE_LEAVES_WALL, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafWalls.BIRCH_LEAVES_WALL, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafWalls.ACACIA_LEAVES_WALL, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafWalls.JUNGLE_LEAVES_WALL, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafWalls.DARK_OAK_LEAVES_WALL, RenderLayer.getCutout());
      BlockRenderLayerMap.INSTANCE.putBlock(LeafWalls.MANGROVE_LEAVES_WALL, RenderLayer.getCutout());
      //leaf blocks
      ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.OAK_LEAVES_STAIRS, LeafSlabs.OAK_LEAVES_SLAB, LeafWalls.OAK_LEAVES_WALL);
      ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getSpruceColor(), LeafStairs.SPRUCE_LEAVES_STAIRS, LeafSlabs.SPRUCE_LEAVES_SLAB, LeafWalls.SPRUCE_LEAVES_WALL);
      ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getBirchColor(), LeafStairs.BIRCH_LEAVES_STAIRS, LeafSlabs.BIRCH_LEAVES_SLAB, LeafWalls.BIRCH_LEAVES_WALL);
      ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.ACACIA_LEAVES_STAIRS, LeafSlabs.ACACIA_LEAVES_SLAB, LeafWalls.ACACIA_LEAVES_WALL);
      ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.JUNGLE_LEAVES_STAIRS, LeafSlabs.JUNGLE_LEAVES_SLAB, LeafWalls.JUNGLE_LEAVES_WALL);
      ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.DARK_OAK_LEAVES_STAIRS, LeafSlabs.DARK_OAK_LEAVES_SLAB, LeafWalls.DARK_OAK_LEAVES_WALL);
      ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getMangroveColor(), LeafStairs.MANGROVE_LEAVES_STAIRS, LeafSlabs.MANGROVE_LEAVES_SLAB, LeafWalls.MANGROVE_LEAVES_WALL);

      //leaf items
      ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.OAK_LEAVES_STAIRS, LeafSlabs.OAK_LEAVES_SLAB, LeafWalls.OAK_LEAVES_WALL);
      ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getSpruceColor(), LeafStairs.SPRUCE_LEAVES_STAIRS, LeafSlabs.SPRUCE_LEAVES_SLAB, LeafWalls.SPRUCE_LEAVES_WALL);
      ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getBirchColor(), LeafStairs.BIRCH_LEAVES_STAIRS, LeafSlabs.BIRCH_LEAVES_SLAB, LeafWalls.BIRCH_LEAVES_WALL);
      ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.ACACIA_LEAVES_STAIRS, LeafSlabs.ACACIA_LEAVES_SLAB, LeafWalls.ACACIA_LEAVES_WALL);
      ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.JUNGLE_LEAVES_STAIRS, LeafSlabs.JUNGLE_LEAVES_SLAB, LeafWalls.JUNGLE_LEAVES_WALL);
      ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), LeafStairs.DARK_OAK_LEAVES_STAIRS, LeafSlabs.DARK_OAK_LEAVES_SLAB, LeafWalls.DARK_OAK_LEAVES_WALL);
      ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getMangroveColor(), LeafStairs.MANGROVE_LEAVES_STAIRS, LeafSlabs.MANGROVE_LEAVES_SLAB, LeafWalls.MANGROVE_LEAVES_WALL);


   }
}