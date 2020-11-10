package me.dogeon.dogeon_mod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class RustyIronBlock extends Block implements Oxidizable {
    private final Block oxidationResult;

    protected RustyIronBlock(Settings settings, Block block) {
        super(settings);
        this.oxidationResult = block;
    }

    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        super.onBlockAdded(state, world, pos, oldState, notify);
        this.scheduleOxidation(world, this, pos);
    }

    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.scheduledTick(state, world, pos, random);
        this.oxidize(world, world.getBlockState(pos), pos);
    }

    public BlockState getOxidationResult(BlockState state) { return this.oxidationResult.getDefaultState(); }

    public int getOxidationTime(Random random) { return 400 + random.nextInt(256); }

    public void oxidize(World world, BlockState state, BlockPos pos) {
        world.setBlockState(pos, this.getOxidationResult(state));
        world.addBlockBreakParticles(pos, state);
    }
}
