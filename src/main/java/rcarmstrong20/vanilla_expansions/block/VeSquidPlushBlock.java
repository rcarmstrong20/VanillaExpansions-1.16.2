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

public class VeSquidPlushBlock extends VePlushBlock
{
    protected static final VoxelShape SQUID_BODY_SHAPE = Block.makeCuboidShape(4.0D, 5.0D, 4.0D, 12.0D, 15.0D, 12.0D);
    protected static final VoxelShape SQUID_MOUTH_SHAPE = Block.makeCuboidShape(6.0D, 4.5D, 6.0D, 10.0D, 5.0D, 10.0D);
    protected static final VoxelShape SQUID_LEG1_SHAPE = Block.makeCuboidShape(10.5D, 0.0D, 10.5D, 11.5D, 5.0D, 11.5D);
    protected static final VoxelShape SQUID_LEG2_SHAPE = Block.makeCuboidShape(10.5D, 0.0D, 8.5D, 11.5D, 5.0D, 9.5D);
    protected static final VoxelShape SQUID_LEG3_SHAPE = Block.makeCuboidShape(10.5D, 0.0D, 6.5D, 11.5D, 5.0D, 7.5D);
    protected static final VoxelShape SQUID_LEG4_SHAPE = Block.makeCuboidShape(10.5D, 0.0D, 4.5D, 11.5D, 5.0D, 5.5D);
    protected static final VoxelShape SQUID_LEG5_SHAPE = Block.makeCuboidShape(8.5D, 0.0D, 4.5D, 9.5D, 5.0D, 5.5D);
    protected static final VoxelShape SQUID_LEG6_SHAPE = Block.makeCuboidShape(6.5D, 0.0D, 4.5D, 7.5D, 5.0D, 5.5D);
    protected static final VoxelShape SQUID_LEG7_SHAPE = Block.makeCuboidShape(4.5D, 0.0D, 4.5D, 5.5D, 5.0D, 5.5D);
    protected static final VoxelShape SQUID_LEG8_SHAPE = Block.makeCuboidShape(4.5D, 0.0D, 6.5D, 5.5D, 5.0D, 7.5D);
    protected static final VoxelShape SQUID_LEG9_SHAPE = Block.makeCuboidShape(4.5D, 0.0D, 8.5D, 5.5D, 5.0D, 9.5D);
    protected static final VoxelShape SQUID_LEG10_SHAPE = Block.makeCuboidShape(4.5D, 0.0D, 10.5D, 5.5D, 5.0D, 11.5D);
    protected static final VoxelShape SQUID_LEG11_SHAPE = Block.makeCuboidShape(6.5D, 0.0D, 10.5D, 7.5D, 5.0D, 11.5D);
    protected static final VoxelShape SQUID_LEG12_SHAPE = Block.makeCuboidShape(8.5D, 0.0D, 10.5D, 9.5D, 5.0D, 11.5D);
    protected static final VoxelShape SQUID_TOOTH1_SHAPE = Block.makeCuboidShape(9.0D, 4.0D, 9.0D, 10.0D, 4.5D, 10.0D);
    protected static final VoxelShape SQUID_TOOTH2_SHAPE = Block.makeCuboidShape(7.5D, 4.0D, 9.0D, 8.5D, 4.5D, 10.0D);
    protected static final VoxelShape SQUID_TOOTH3_SHAPE = Block.makeCuboidShape(6.0D, 4.0D, 9.0D, 7.0D, 4.5D, 10.0D);
    protected static final VoxelShape SQUID_TOOTH4_SHAPE = Block.makeCuboidShape(6.0D, 4.0D, 7.5D, 7.0D, 4.5D, 8.5D);
    protected static final VoxelShape SQUID_TOOTH5_SHAPE = Block.makeCuboidShape(6.0D, 4.0D, 6.0D, 7.0D, 4.5D, 7.0D);
    protected static final VoxelShape SQUID_TOOTH6_SHAPE = Block.makeCuboidShape(7.5D, 4.0D, 6.0D, 8.5D, 4.5D, 7.0D);
    protected static final VoxelShape SQUID_TOOTH7_SHAPE = Block.makeCuboidShape(9.0D, 4.0D, 6.0D, 10.0D, 4.5D, 7.0D);
    protected static final VoxelShape SQUID_TOOTH8_SHAPE = Block.makeCuboidShape(9.0D, 4.0D, 7.5D, 10.0D, 4.5D, 8.5D);
    protected static final VoxelShape SQUID_NORTH_RIGHT_EYE_SHAPE = Block.makeCuboidShape(9.5D, 10.0D, 3.5D, 11.5D,
            12.0D, 4.0D);
    protected static final VoxelShape SQUID_NORTH_LEFT_EYE_SHAPE = Block.makeCuboidShape(4.5D, 10.0D, 3.5D, 6.5D, 12.0D,
            4.0D);

    protected static final VoxelShape SQUID_LEGS_SHAPE = VoxelShapes.or(SQUID_LEG1_SHAPE, SQUID_LEG2_SHAPE,
            SQUID_LEG3_SHAPE, SQUID_LEG4_SHAPE, SQUID_LEG5_SHAPE, SQUID_LEG6_SHAPE, SQUID_LEG7_SHAPE, SQUID_LEG8_SHAPE,
            SQUID_LEG9_SHAPE, SQUID_LEG10_SHAPE, SQUID_LEG11_SHAPE, SQUID_LEG12_SHAPE);

    protected static final VoxelShape SQUID_TEETH_SHAPE = VoxelShapes.or(SQUID_TOOTH1_SHAPE, SQUID_TOOTH2_SHAPE,
            SQUID_TOOTH3_SHAPE, SQUID_TOOTH4_SHAPE, SQUID_TOOTH5_SHAPE, SQUID_TOOTH6_SHAPE, SQUID_TOOTH7_SHAPE,
            SQUID_TOOTH8_SHAPE);

    protected static final VoxelShape SQUID_NORTH_EYES_SHAPE = VoxelShapes.or(SQUID_NORTH_RIGHT_EYE_SHAPE,
            SQUID_NORTH_LEFT_EYE_SHAPE);

    protected static final VoxelShape SQUID_NORTH_SHAPE = VoxelShapes.or(SQUID_BODY_SHAPE, SQUID_MOUTH_SHAPE,
            SQUID_LEGS_SHAPE, SQUID_TEETH_SHAPE, SQUID_NORTH_EYES_SHAPE);

    protected static final VoxelShape SQUID_SOUTH_SHAPE = VeShapeUtil.rotate180(Axis.Y, SQUID_NORTH_SHAPE);
    protected static final VoxelShape SQUID_WEST_SHAPE = VeShapeUtil.rotate270(Axis.Y, SQUID_NORTH_SHAPE);
    protected static final VoxelShape SQUID_EAST_SHAPE = VeShapeUtil.rotate90(Axis.Y, SQUID_NORTH_SHAPE);

    public VeSquidPlushBlock(Properties properties)
    {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        return defineShapes(state, SQUID_NORTH_SHAPE, SQUID_SOUTH_SHAPE, SQUID_WEST_SHAPE, SQUID_EAST_SHAPE);
    }
}
