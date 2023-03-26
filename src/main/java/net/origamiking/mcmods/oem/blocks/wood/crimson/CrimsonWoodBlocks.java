package net.origamiking.mcmods.oem.blocks.wood.crimson;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;


public class CrimsonWoodBlocks {
    public static final Block CRIMSON_BARREL = registerBlock(OemMain.MOD_ID, "crimson_barrel", new BarrelBlock(OrigamiBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block CRIMSON_BOOKSHELF = registerBlock(OemMain.MOD_ID, "crimson_bookshelf", new Block(OrigamiBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block CRIMSON_LADDER = registerBlock(OemMain.MOD_ID, "crimson_ladder", new LadderBlock(OrigamiBlockSettings.of(Material.WOOD).nonOpaque().strength(4f).requiresTool().sounds(BlockSoundGroup.LADDER)));

    public static void getCrimsonBlocks() {}
}
