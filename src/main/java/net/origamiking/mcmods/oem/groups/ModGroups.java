package net.origamiking.mcmods.oem.groups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.entity.model.RabbitEntityModel;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.amethyst.AmethystBlocks;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteSlabs;
import net.origamiking.mcmods.oem.blocks.concrete.ConcreteStairs;
import net.origamiking.mcmods.oem.blocks.glass.GlassBlocks;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.sculk.SculkBlocks;
import net.origamiking.mcmods.oem.blocks.server_specific.ServerSpecificBlocks;
import net.origamiking.mcmods.oem.blocks.wood.barrel.BarrelBlocks;
import net.origamiking.mcmods.oem.blocks.wood.bookshelf.BookshelfBlocks;
import net.origamiking.mcmods.oem.blocks.wood.ladder.LadderBlocks;

public class ModGroups {
    private static final ItemGroup OEM_GROUP = FabricItemGroup.builder(new Identifier(OemMain.MOD_ID, "oem_group"))
            .displayName(Text.literal("OrigamiKing's Enchancement Mod"))
            .icon(() -> new ItemStack(BarrelBlocks.SPRUCE_BARREL))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(BarrelBlocks.OAK_BARREL);
                entries.add(Blocks.BOOKSHELF);
                entries.add(LadderBlocks.OAK_LADDER);
                entries.add(BarrelBlocks.SPRUCE_BARREL);
                entries.add(BookshelfBlocks.SPRUCE_BOOKSHELF);
                entries.add(LadderBlocks.SPRUCE_LADDER);
                entries.add(BarrelBlocks.BIRCH_BARREL);
                entries.add(BookshelfBlocks.BIRCH_BOOKSHELF);
                entries.add(LadderBlocks.BIRCH_LADDER);
                entries.add(BarrelBlocks.JUNGLE_BARREL);
                entries.add(BookshelfBlocks.JUNGLE_BOOKSHELF);
                entries.add(LadderBlocks.JUNGLE_LADDER);
                entries.add(BarrelBlocks.ACACIA_BARREL);
                entries.add(BookshelfBlocks.ACACIA_BOOKSHELF);
                entries.add(LadderBlocks.ACACIA_LADDER);
                entries.add(BarrelBlocks.DARK_OAK_BARREL);
                entries.add(BookshelfBlocks.DARK_OAK_BOOKSHELF);
                entries.add(LadderBlocks.DARK_OAK_LADDER);
                entries.add(BarrelBlocks.MANGROVE_BARREL);
                entries.add(BookshelfBlocks.MANGROVE_BOOKSHELF);
                entries.add(LadderBlocks.MANGROVE_LADDER);
                entries.add(BarrelBlocks.CRIMSON_BARREL);
                entries.add(BookshelfBlocks.CRIMSON_BOOKSHELF);
                entries.add(LadderBlocks.CRIMSON_LADDER);
                entries.add(BarrelBlocks.WARPED_BARREL);
                entries.add(BookshelfBlocks.WARPED_BOOKSHELF);
                entries.add(LadderBlocks.WARPED_LADDER);
                entries.add(ConcreteStairs.WHITE_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.WHITE_CONCRETE_SLAB);
                entries.add(ConcreteStairs.LIGHT_GRAY_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.LIGHT_GRAY_CONCRETE_SLAB);
                entries.add(ConcreteStairs.GRAY_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.GRAY_CONCRETE_SLAB);
                entries.add(ConcreteStairs.BLACK_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.BLACK_CONCRETE_SLAB);
                entries.add(ConcreteStairs.BROWN_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.BROWN_CONCRETE_SLAB);
                entries.add(ConcreteStairs.RED_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.RED_CONCRETE_SLAB);
                entries.add(ConcreteStairs.ORANGE_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.ORANGE_CONCRETE_SLAB);
                entries.add(ConcreteStairs.YELLOW_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.YELLOW_CONCRETE_SLAB);
                entries.add(ConcreteStairs.LIME_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.LIME_CONCRETE_SLAB);
                entries.add(ConcreteStairs.GREEN_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.GREEN_CONCRETE_SLAB);
                entries.add(ConcreteStairs.CYAN_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.CYAN_CONCRETE_SLAB);
                entries.add(ConcreteStairs.LIGHT_BLUE_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.LIGHT_BLUE_CONCRETE_SLAB);
                entries.add(ConcreteStairs.BLUE_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.BLUE_CONCRETE_SLAB);
                entries.add(ConcreteStairs.PURPLE_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.PURPLE_CONCRETE_SLAB);
                entries.add(ConcreteStairs.MAGENTA_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.MAGENTA_CONCRETE_SLAB);
                entries.add(ConcreteStairs.PINK_CONCRETE_STAIR);
                entries.add(ConcreteSlabs.PINK_CONCRETE_SLAB);
                entries.add(SculkBlocks.SCULK_STAIR);
                entries.add(SculkBlocks.SCULK_SLAB);
                //entries.add(ModBlocks.TINTED_GLASS_PANE);
                entries.add(ServerSpecificBlocks.GOLD_CHAIN);
                entries.add(ServerSpecificBlocks.GOLD_LANTERN);
                entries.add(GlassBlocks.GLASS_STAIR);
                entries.add(GlassBlocks.GLASS_SLAB);
                entries.add(GlassBlocks.WHITE_GLASS_STAIR);
                entries.add(GlassBlocks.WHITE_GLASS_SLAB);
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
                entries.add(AmethystBlocks.AMETHYST_SLAB);
                entries.add(AmethystBlocks.AMETHYST_STAIR);
                entries.add(RandomBlocks.CALSITE_STAIRS);
                entries.add(RandomBlocks.CALSITE_SLAB);
                entries.add(RandomBlocks.TUFF_SLAB);
                entries.add(RandomBlocks.TUFF_STAIRS);
                entries.add(RandomBlocks.SMOOTH_BASALT_SLAB);
                entries.add(RandomBlocks.SMOOTH_BASALT_STAIRS);
                entries.add(RandomBlocks.NETHERRACK_SLAB);
                entries.add(RandomBlocks.NETHERRACK_STAIRS);
                entries.add(RandomBlocks.DRIPSTONE_SLAB);
                entries.add(RandomBlocks.DRIPSTONE_STAIRS);
                entries.add(RandomBlocks.SNOW_SLAB);
                entries.add(RandomBlocks.SNOW_STAIRS);
            })
            .build();
    private static final ItemGroup OEM_GROUP2 = FabricItemGroup.builder(new Identifier(OemMain.MOD_ID, "oem_group2"))
            .displayName(Text.literal("mc.origamiking.net specific"))
            .icon(() -> new ItemStack(ServerSpecificBlocks.CAVERNS_BLOCK_ONE))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_ONE);
                entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_TWO);
                entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_THREE);
                entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_FOUR);
                entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_FIVE);
                entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_SIX);
            }).build();
    public static void register() {
        OemMain.LOGGER.info("Registering Groups");
    }
}
