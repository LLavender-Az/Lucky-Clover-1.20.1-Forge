package net.lavender.lavendersdelight.common.block.common;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.GravelBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class IronRichGravel extends GravelBlock {
    private final IntProvider xpRange;

    public IronRichGravel(BlockBehaviour.Properties pProperties, IntProvider pXpRange) {
        super(pProperties);
        this.xpRange = pXpRange;
    }

    public void spawnAfterBreak(BlockState pState, ServerLevel pLevel, BlockPos pPos, ItemStack pStack, boolean pDropExperience) {
        super.spawnAfterBreak(pState, pLevel, pPos, pStack, pDropExperience);

    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader level, net.minecraft.util.RandomSource randomSource, BlockPos pos, int fortuneLevel, int silkTouchLevel) {
        return silkTouchLevel == 0 ? this.xpRange.sample(randomSource) : 0;
    }
}