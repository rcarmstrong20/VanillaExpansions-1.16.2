package rcarmstrong20.vanilla_expansions.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction.Axis;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import rcarmstrong20.vanilla_expansions.util.VeShapeUtil;

public class VeBabyMooshroomPlushBlock extends VeBabyCowPlushBlock
{
    protected static final VoxelShape NORTH_MUSHROOM_STEM_SHAPE = Block.makeCuboidShape(7.5D, 6.0D, 9.0D, 8.5D, 7.0D,
            10.0D);
    protected static final VoxelShape NORTH_MUSHROOM_BOTTOM_SHAPE = Block.makeCuboidShape(6.0D, 7.0D, 7.5D, 10.0D, 8.0D,
            11.5D);
    protected static final VoxelShape NORTH_MUSHROOM_TOP_SHAPE = Block.makeCuboidShape(6.5D, 8.0D, 8.0D, 9.5D, 8.5D,
            11.0D);

    protected static final VoxelShape NORTH_MUSHROOM_SHAPE = VoxelShapes.or(NORTH_MUSHROOM_STEM_SHAPE,
            NORTH_MUSHROOM_BOTTOM_SHAPE, NORTH_MUSHROOM_TOP_SHAPE);

    protected static final VoxelShape NORTH_SHAPE = VoxelShapes.or(NORTH_MUSHROOM_SHAPE,
            VeBabyCowPlushBlock.NORTH_SHAPE);

    protected static final VoxelShape SOUTH_SHAPE = VeShapeUtil.rotate180(Axis.Y, NORTH_SHAPE);
    protected static final VoxelShape WEST_SHAPE = VeShapeUtil.rotate270(Axis.Y, NORTH_SHAPE);
    protected static final VoxelShape EAST_SHAPE = VeShapeUtil.rotate90(Axis.Y, NORTH_SHAPE);

    public VeBabyMooshroomPlushBlock(Properties properties)
    {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        return defineShapes(state, NORTH_SHAPE, SOUTH_SHAPE, WEST_SHAPE, EAST_SHAPE);
    }
}
