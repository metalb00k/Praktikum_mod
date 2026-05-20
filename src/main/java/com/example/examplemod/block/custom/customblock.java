package com.example.examplemod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.level.block.TntBlock.explode;

public class customblock extends Block {
    public customblock(Block.Properties properties) {
        super(properties);

    }
    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return Shapes.box(0.0, 0.0, 0.0, 1.0, 0.125, 1.0); }
    @Override
    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        super.entityInside(pState, pLevel, pPos, pEntity);

        pLevel.playSound(null, pPos, SoundEvents.TNT_PRIMED, SoundSource.BLOCKS, 1f, 1f);

        if (!pLevel.isClientSide()) {
            pLevel.explode(null,
                    pPos.getX() + 0.5,
                    pPos.getY() + 0.125,
                    pPos.getZ() + 0.5,
                    4f,
                    Level.ExplosionInteraction.TNT);

    }}}


