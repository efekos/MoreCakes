package dev.efekos.morecakes.block;

import dev.efekos.morecakes.registry.MoreCakesBlockProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

import java.util.Arrays;
import java.util.List;

public class HugeCakeBlock extends Block {
    public static final List<VoxelShape> SLICE_TO_SHAPE = Arrays.asList(
            makeShape1(), makeShape2(), makeShape3(), makeShape4(), makeShape5(), makeShape6(), makeShape7(), makeShape8(), makeShape9(),
            makeShape10(), makeShape11(), makeShape12(), makeShape13(), makeShape14(), makeShape15(), makeShape16()
    );
    public static final IntProperty SLICE = MoreCakesBlockProperties.HUGE_CAKE_BITES;


    public HugeCakeBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(SLICE, 0));
    }

    protected static ActionResult tryEat(WorldAccess world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!player.canConsume(false)) {
            return ActionResult.PASS;
        } else {
            player.incrementStat(Stats.EAT_CAKE_SLICE);
            player.getHungerManager().add(4, 0.25F);
            int i = state.get(SLICE);
            world.emitGameEvent(player, GameEvent.EAT, pos);
            if (i < 15) {
                world.setBlockState(pos, state.with(SLICE, i + 1), 3);
            } else {
                world.removeBlock(pos, false);
                world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
            }

            return ActionResult.SUCCESS;
        }
    }

    public static VoxelShape makeShape1() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0, 1, 0.5, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0.5, 0.1875, 0.8125, 0.9375, 0.8125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.9375, 0.3125, 0.6875, 1.25, 0.6875));

        return shape;
    }

    public static VoxelShape makeShape2() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0, 1, 0.5, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0.5, 0.1875, 0.8125, 0.9375, 0.8125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.9375, 0.4375, 0.6875, 1.25, 0.6875));

        return shape;
    }

    public static VoxelShape makeShape3() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0, 1, 0.5, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0.5, 0.1875, 0.8125, 0.9375, 0.8125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.9375, 0.5625, 0.6875, 1.25, 0.6875));

        return shape;
    }

    public static VoxelShape makeShape4() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0, 1, 0.5, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0.5, 0.1875, 0.8125, 0.9375, 0.8125));

        return shape;
    }

    public static VoxelShape makeShape5() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0, 1, 0.5, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0.5, 0.3125, 0.8125, 0.9375, 0.8125));

        return shape;
    }

    public static VoxelShape makeShape6() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0, 1, 0.5, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0.5, 0.4375, 0.8125, 0.9375, 0.8125));

        return shape;
    }

    public static VoxelShape makeShape7() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0, 1, 0.5, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0.5, 0.5625, 0.8125, 0.9375, 0.8125));

        return shape;
    }

    public static VoxelShape makeShape8() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0, 1, 0.5, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0.5, 0.6875, 0.8125, 0.9375, 0.8125));

        return shape;
    }

    public static VoxelShape makeShape9() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0, 1, 0.5, 1));

        return shape;
    }

    public static VoxelShape makeShape10() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0.125, 1, 0.5, 1));

        return shape;
    }

    public static VoxelShape makeShape11() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0.25, 1, 0.5, 1));

        return shape;
    }

    public static VoxelShape makeShape12() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0.375, 1, 0.5, 1));

        return shape;
    }

    public static VoxelShape makeShape13() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0.5, 1, 0.5, 1));

        return shape;
    }

    public static VoxelShape makeShape14() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0.625, 1, 0.5, 1));

        return shape;
    }

    public static VoxelShape makeShape15() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0.75, 1, 0.5, 1));

        return shape;
    }

    public static VoxelShape makeShape16() {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0, 0.875, 1, 0.5, 1));

        return shape;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SLICE_TO_SHAPE.get(state.get(SLICE));
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return super.canPlaceAt(state, world, pos) && world.getBlockState(pos.add(0, 1, 0)).isAir();
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world.isClient) {
            if (tryEat(world, pos, state, player).isAccepted()) {
                return ActionResult.SUCCESS;
            }
        }

        return tryEat(world, pos, state, player);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(SLICE);
    }
}
