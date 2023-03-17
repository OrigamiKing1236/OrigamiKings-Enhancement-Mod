package net.origamiking.mcmods.oem.blocks.leaves;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.StairShape;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class LeafStairs extends BlocksUtils {
    public static String id = OemMain.MOD_ID;
    public static final Block OAK_LEAVES_STAIRS = registerBlock(id, "oak_leaves_stairs", new StairsBlock(Blocks.OAK_LOG.getDefaultState(), FabricBlockSettings.of(Material.LEAVES).nonOpaque().requiresTool().sounds(BlockSoundGroup.GRASS).strength(0.2f).ticksRandomly()));
    public static final Block SPRUCE_LEAVES_STAIRS = registerBlock(id, "spruce_leaves_stairs", new StairsBlock(Blocks.SPRUCE_LOG.getDefaultState(), FabricBlockSettings.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()));
    public static final Block BIRCH_LEAVES_STAIRS = registerBlock(id, "birch_leaves_stairs", new StairsBlock(Blocks.BIRCH_LOG.getDefaultState(), FabricBlockSettings.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()));
    public static final Block JUNGLE_LEAVES_STAIRS = registerBlock(id, "jungle_leaves_stairs", new StairsBlock(Blocks.JUNGLE_LOG.getDefaultState(), FabricBlockSettings.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()));
    public static final Block ACACIA_LEAVES_STAIRS = registerBlock(id, "acacia_leaves_stairs", new StairsBlock(Blocks.ACACIA_LOG.getDefaultState(), FabricBlockSettings.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()));
    public static final Block DARK_OAK_LEAVES_STAIRS = registerBlock(id, "dark_oak_leaves_stairs", new StairsBlock(Blocks.DARK_OAK_LOG.getDefaultState(), FabricBlockSettings.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()));
    public static final Block MANGROVE_LEAVES_STAIRS = registerBlock(id, "mangrove_leaves_stairs", new StairsBlock(Blocks.MANGROVE_LOG.getDefaultState(), FabricBlockSettings.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS).ticksRandomly()));
    //public static final Block CRIMSON_LEAVES_STAIRS = registerBlock(id, "crimson_leaves_stairs", new StairsBlock(Blocks.SPRUCE_LEAVES.getDefaultState(), FabricBlockSettings.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS)));
    //public static final Block WARPED_LEAVES_STAIRS = registerBlock(id, "crimson_leaves_stairs", new StairsBlock(Blocks.SPRUCE_LEAVES.getDefaultState(), FabricBlockSettings.of(Material.LEAVES).nonOpaque().strength(0.2f).requiresTool().sounds(BlockSoundGroup.GRASS)));

        public static void getLeafStairs () {}
}
