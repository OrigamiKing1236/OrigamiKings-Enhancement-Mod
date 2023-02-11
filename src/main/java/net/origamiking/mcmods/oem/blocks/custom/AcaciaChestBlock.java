//package net.origamiking.mcmods.oem.blocks.custom;
//
//import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
//import net.minecraft.block.*;
//import net.minecraft.block.entity.*;
//import net.minecraft.block.enums.ChestType;
//import net.minecraft.entity.LivingEntity;
//import net.minecraft.entity.ai.pathing.NavigationType;
//import net.minecraft.entity.mob.PiglinBrain;
//import net.minecraft.entity.passive.CatEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.entity.player.PlayerInventory;
//import net.minecraft.fluid.FluidState;
//import net.minecraft.fluid.Fluids;
//import net.minecraft.inventory.DoubleInventory;
//import net.minecraft.inventory.Inventory;
//import net.minecraft.item.ItemPlacementContext;
//import net.minecraft.item.ItemStack;
//import net.minecraft.screen.GenericContainerScreenHandler;
//import net.minecraft.screen.NamedScreenHandlerFactory;
//import net.minecraft.screen.ScreenHandler;
//import net.minecraft.server.world.ServerWorld;
//import net.minecraft.stat.Stat;
//import net.minecraft.stat.Stats;
//import net.minecraft.state.StateManager;
//import net.minecraft.state.property.BooleanProperty;
//import net.minecraft.state.property.DirectionProperty;
//import net.minecraft.state.property.EnumProperty;
//import net.minecraft.state.property.Properties;
//import net.minecraft.text.Text;
//import net.minecraft.util.*;
//import net.minecraft.util.hit.BlockHitResult;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.Box;
//import net.minecraft.util.math.Direction;
//import net.minecraft.util.math.random.Random;
//import net.minecraft.util.shape.VoxelShape;
//import net.minecraft.world.BlockView;
//import net.minecraft.world.World;
//import net.minecraft.world.WorldAccess;
//import net.origamiking.mcmods.oem.blocks.entity.types.AcaciaChestBlockEntity;
//import org.jetbrains.annotations.Nullable;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.function.BiPredicate;
//import java.util.function.Supplier;
//
//public class AcaciaChestBlock extends AbstractChestBlock<AcaciaChestBlockEntity> implements Waterloggable {
//    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
//    public static final EnumProperty<ChestType> CHEST_TYPE = Properties.CHEST_TYPE;
//    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
//    public static final int field_31057 = 1;
//    protected static final int field_31058 = 1;
//    protected static final int field_31059 = 14;
//    protected static final VoxelShape DOUBLE_NORTH_SHAPE = Block.createCuboidShape(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
//    protected static final VoxelShape DOUBLE_SOUTH_SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
//    protected static final VoxelShape DOUBLE_WEST_SHAPE = Block.createCuboidShape(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
//    protected static final VoxelShape DOUBLE_EAST_SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
//    protected static final VoxelShape SINGLE_SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
//    private static final DoubleBlockProperties.PropertyRetriever<AcaciaChestBlockEntity, Optional<Inventory>> INVENTORY_RETRIEVER = new DoubleBlockProperties.PropertyRetriever<AcaciaChestBlockEntity, Optional<Inventory>>(){
//
//        @Override
//        public Optional<Inventory> getFromBoth(AcaciaChestBlockEntity AcaciachestBlockEntity, AcaciaChestBlockEntity AcaciachestBlockEntity2) {
//            return Optional.of(new DoubleInventory(AcaciachestBlockEntity, AcaciachestBlockEntity2));
//        }
//
//        @Override
//        public Optional<Inventory> getFrom(AcaciaChestBlockEntity acaciachestBlockEntity) {
//            return Optional.of(acaciachestBlockEntity);
//        }
//
//
//
//        @Override
//        public Optional<Inventory> getFallback() {
//            return Optional.empty();
//        }
//
////        @Override
////        public /* synthetic */ Object getFallback() {
////            return this.getFallback();
////        }
//    };
//    private static final DoubleBlockProperties.PropertyRetriever<AcaciaChestBlockEntity, Optional<NamedScreenHandlerFactory>> NAME_RETRIEVER = new DoubleBlockProperties.PropertyRetriever<AcaciaChestBlockEntity, Optional<NamedScreenHandlerFactory>>(){
//
//        @Override
//        public Optional<NamedScreenHandlerFactory> getFromBoth(final AcaciaChestBlockEntity acaciachestBlockEntity, final AcaciaChestBlockEntity acaciachestBlockEntity2) {
//            final DoubleInventory inventory = new DoubleInventory(acaciachestBlockEntity, acaciachestBlockEntity2);
//            return Optional.of(new NamedScreenHandlerFactory(){
//
//                @Override
//                @Nullable
//                public ScreenHandler createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
//                    if (acaciachestBlockEntity.checkUnlocked(playerEntity) && acaciachestBlockEntity2.checkUnlocked(playerEntity)) {
//                        acaciachestBlockEntity.checkLootInteraction(playerInventory.player);
//                        acaciachestBlockEntity2.checkLootInteraction(playerInventory.player);
//                        return GenericContainerScreenHandler.createGeneric9x6(i, playerInventory, inventory);
//                    }
//                    return null;
//                }
//
//                @Override
//                public Text getDisplayName() {
//                    if (acaciachestBlockEntity.hasCustomName()) {
//                        return acaciachestBlockEntity.getDisplayName();
//                    }
//                    if (acaciachestBlockEntity2.hasCustomName()) {
//                        return acaciachestBlockEntity2.getDisplayName();
//                    }
//                    return Text.translatable("container.chestDouble");
//                }
//            });
//        }
//
//        @Override
//        public Optional<NamedScreenHandlerFactory> getFrom(AcaciaChestBlockEntity chestBlockEntity) {
//            return Optional.of(chestBlockEntity);
//        }
//
//        @Override
//        public Optional<NamedScreenHandlerFactory> getFallback() {
//            return Optional.empty();
//        }
//
////        @Override
////        public /* synthetic */ Object getFallback() {
////            return this.getFallback();
////        }
//    };
//
//    public AcaciaChestBlock(AbstractBlock.Settings settings, Supplier<BlockEntityType<? extends AcaciaChestBlockEntity>> supplier) {
//        super(settings, supplier);
//        this.setDefaultState((BlockState)((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH)).with(CHEST_TYPE, ChestType.SINGLE)).with(WATERLOGGED, false));
//    }
//
//    public static DoubleBlockProperties.Type getDoubleBlockType(BlockState state) {
//        ChestType chestType = state.get(CHEST_TYPE);
//        if (chestType == ChestType.SINGLE) {
//            return DoubleBlockProperties.Type.SINGLE;
//        }
//        if (chestType == ChestType.RIGHT) {
//            return DoubleBlockProperties.Type.FIRST;
//        }
//        return DoubleBlockProperties.Type.SECOND;
//    }
//
//    @Override
//    public BlockRenderType getRenderType(BlockState state) {
//        return BlockRenderType.ENTITYBLOCK_ANIMATED;
//    }
//
//    @Override
//    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
//        if (state.get(WATERLOGGED).booleanValue()) {
//            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
//        }
//        if (neighborState.isOf(this) && direction.getAxis().isHorizontal()) {
//            ChestType chestType = neighborState.get(CHEST_TYPE);
//            if (state.get(CHEST_TYPE) == ChestType.SINGLE && chestType != ChestType.SINGLE && state.get(FACING) == neighborState.get(FACING) && AcaciaChestBlock.getFacing(neighborState) == direction.getOpposite()) {
//                return (BlockState)state.with(CHEST_TYPE, chestType.getOpposite());
//            }
//        } else if (ChestBlock.getFacing(state) == direction) {
//            return (BlockState)state.with(CHEST_TYPE, ChestType.SINGLE);
//        }
//        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
//    }
//
//    @Override
//    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
//        if (state.get(CHEST_TYPE) == ChestType.SINGLE) {
//            return SINGLE_SHAPE;
//        }
//        switch (AcaciaChestBlock.getFacing(state)) {
//            default: {
//                return DOUBLE_NORTH_SHAPE;
//            }
//            case SOUTH: {
//                return DOUBLE_SOUTH_SHAPE;
//            }
//            case WEST: {
//                return DOUBLE_WEST_SHAPE;
//            }
//            case EAST:
//        }
//        return DOUBLE_EAST_SHAPE;
//    }
//
//    public static Direction getFacing(BlockState state) {
//        Direction direction = state.get(FACING);
//        return state.get(CHEST_TYPE) == ChestType.LEFT ? direction.rotateYClockwise() : direction.rotateYCounterclockwise();
//    }
//
//    @Override
//    public BlockState getPlacementState(ItemPlacementContext ctx) {
//        Direction direction3;
//        ChestType chestType = ChestType.SINGLE;
//        Direction direction = ctx.getPlayerFacing().getOpposite();
//        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
//        boolean bl = ctx.shouldCancelInteraction();
//        Direction direction2 = ctx.getSide();
//        if (direction2.getAxis().isHorizontal() && bl && (direction3 = this.getNeighborChestDirection(ctx, direction2.getOpposite())) != null && direction3.getAxis() != direction2.getAxis()) {
//            direction = direction3;
//            ChestType chestType2 = chestType = direction.rotateYCounterclockwise() == direction2.getOpposite() ? ChestType.RIGHT : ChestType.LEFT;
//        }
//        if (chestType == ChestType.SINGLE && !bl) {
//            if (direction == this.getNeighborChestDirection(ctx, direction.rotateYClockwise())) {
//                chestType = ChestType.LEFT;
//            } else if (direction == this.getNeighborChestDirection(ctx, direction.rotateYCounterclockwise())) {
//                chestType = ChestType.RIGHT;
//            }
//        }
//        return (BlockState)((BlockState)((BlockState)this.getDefaultState().with(FACING, direction)).with(CHEST_TYPE, chestType)).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
//    }
//
//    @Override
//    public FluidState getFluidState(BlockState state) {
//        if (state.get(WATERLOGGED).booleanValue()) {
//            return Fluids.WATER.getStill(false);
//        }
//        return super.getFluidState(state);
//    }
//
//    @Nullable
//    private Direction getNeighborChestDirection(ItemPlacementContext ctx, Direction dir) {
//        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos().offset(dir));
//        return blockState.isOf(this) && blockState.get(CHEST_TYPE) == ChestType.SINGLE ? blockState.get(FACING) : null;
//    }
//
//    @Override
//    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
//        BlockEntity blockEntity;
//        if (itemStack.hasCustomName() && (blockEntity = world.getBlockEntity(pos)) instanceof AcaciaChestBlockEntity) {
//            ((AcaciaChestBlockEntity)blockEntity).setCustomName(itemStack.getName());
//        }
//    }
//
//    @Override
//    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
//        if (state.isOf(newState.getBlock())) {
//            return;
//        }
//        BlockEntity blockEntity = world.getBlockEntity(pos);
//        if (blockEntity instanceof Inventory) {
//            ItemScatterer.spawn(world, pos, (Inventory)((Object)blockEntity));
//            world.updateComparators(pos, this);
//        }
//        super.onStateReplaced(state, world, pos, newState, moved);
//    }
//
//    @Override
//    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
//        if (world.isClient) {
//            return ActionResult.SUCCESS;
//        }
//        NamedScreenHandlerFactory namedScreenHandlerFactory = this.createScreenHandlerFactory(state, world, pos);
//        if (namedScreenHandlerFactory != null) {
//            player.openHandledScreen(namedScreenHandlerFactory);
//            player.incrementStat(this.getOpenStat());
//            PiglinBrain.onGuardedBlockInteracted(player, true);
//        }
//        return ActionResult.CONSUME;
//    }
//
//    protected Stat<Identifier> getOpenStat() {
//        return Stats.CUSTOM.getOrCreateStat(Stats.OPEN_CHEST);
//    }
//
//    public BlockEntityType<? extends AcaciaChestBlockEntity> getExpectedEntityType() {
//        return (BlockEntityType)this.entityTypeRetriever.get();
//    }
//
//    @Nullable
//    public static Inventory getInventory(AcaciaChestBlock block, BlockState state, World world, BlockPos pos, boolean ignoreBlocked) {
//        return block.getBlockEntitySource(state, world, pos, ignoreBlocked).apply(INVENTORY_RETRIEVER).orElse(null);
//    }
//
//    @Override
//    public DoubleBlockProperties.PropertySource<? extends ChestBlockEntity> getBlockEntitySource(BlockState state, World world2, BlockPos pos2, boolean ignoreBlocked) {
//        BiPredicate<WorldAccess, BlockPos> biPredicate = ignoreBlocked ? (world, pos) -> false : AcaciaChestBlock::isChestBlocked;
//        return DoubleBlockProperties.toPropertySource((BlockEntityType)this.entityTypeRetriever.get(), AcaciaChestBlock::getDoubleBlockType, AcaciaChestBlock::getFacing, FACING, state, world2, pos2, biPredicate);
//    }
//
//    @Override
//    @Nullable
//    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
//        return this.getBlockEntitySource(state, world, pos, false).apply(NAME_RETRIEVER).orElse(null);
//    }
//
//    public static DoubleBlockProperties.PropertyRetriever<AcaciaChestBlockEntity, Float2FloatFunction> getAnimationProgressRetriever(final LidOpenable progress) {
//        return new DoubleBlockProperties.PropertyRetriever<AcaciaChestBlockEntity, Float2FloatFunction>(){
//
//            @Override
//            public Float2FloatFunction getFromBoth(AcaciaChestBlockEntity chestBlockEntity, AcaciaChestBlockEntity chestBlockEntity2) {
//                return tickDelta -> Math.max(chestBlockEntity.getAnimationProgress(tickDelta), chestBlockEntity2.getAnimationProgress(tickDelta));
//            }
//
//            @Override
//            public Float2FloatFunction getFrom(AcaciaChestBlockEntity chestBlockEntity) {
//                return chestBlockEntity::getAnimationProgress;
//            }
//
//            @Override
//            public Float2FloatFunction getFallback() {
//                return progress::getAnimationProgress;
//            }
//
////            @Override
////            public /* synthetic */ Object getFallback() {
////                return this.getFallback();
////            }
//        };
//    }
//
//    @Override
//    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
//        return new AcaciaChestBlockEntity(pos, state);
//    }
//
//    @Override
//    @Nullable
//    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
//        return world.isClient ? AcaciaChestBlock.checkType(type, this.getExpectedEntityType(), AcaciaChestBlockEntity::clientTick) : null;
//    }
//
//    public static boolean isChestBlocked(WorldAccess world, BlockPos pos) {
//        return AcaciaChestBlock.hasBlockOnTop(world, pos) || AcaciaChestBlock.hasCatOnTop(world, pos);
//    }
//
//    private static boolean hasBlockOnTop(BlockView world, BlockPos pos) {
//        BlockPos blockPos = pos.up();
//        return world.getBlockState(blockPos).isSolidBlock(world, blockPos);
//    }
//
//    private static boolean hasCatOnTop(WorldAccess world, BlockPos pos) {
//        List<CatEntity> list = world.getNonSpectatingEntities(CatEntity.class, new Box(pos.getX(), pos.getY() + 1, pos.getZ(), pos.getX() + 1, pos.getY() + 2, pos.getZ() + 1));
//        if (!list.isEmpty()) {
//            for (CatEntity catEntity : list) {
//                if (!catEntity.isInSittingPose()) continue;
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public boolean hasComparatorOutput(BlockState state) {
//        return true;
//    }
//
//    @Override
//    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
//        return ScreenHandler.calculateComparatorOutput(AcaciaChestBlock.getInventory(this, state, world, pos, false));
//    }
//
//    @Override
//    public BlockState rotate(BlockState state, BlockRotation rotation) {
//        return (BlockState)state.with(FACING, rotation.rotate(state.get(FACING)));
//    }
//
//    @Override
//    public BlockState mirror(BlockState state, BlockMirror mirror) {
//        return state.rotate(mirror.getRotation(state.get(FACING)));
//    }
//
//    @Override
//    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
//        builder.add(FACING, CHEST_TYPE, WATERLOGGED);
//    }
//
//    @Override
//    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
//        return false;
//    }
//
//    @Override
//    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
//        BlockEntity blockEntity = world.getBlockEntity(pos);
//        if (blockEntity instanceof AcaciaChestBlockEntity) {
//            ((AcaciaChestBlockEntity)blockEntity).onScheduledTick();
//        }
//    }
//}
