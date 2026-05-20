package com.example.examplemod.item.custom;

import com.example.examplemod.util.ModTags;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class testAdvancedItem extends Item {
    public testAdvancedItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (!pContext.getLevel().isClientSide()) {
            BlockPos pos = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean blockfound = false;
            for (int i = 0; i <= pos.getY() + 64; i++){
            BlockState blockthere = pContext.getLevel().getBlockState(pos.below(i));
            if (isvaluableblock(blockthere)){
                outputValuableCord(pos.below(i), player, blockthere.getBlock());
                blockfound = true;
            }

                }
            if(blockfound == false){
                player.sendSystemMessage(Component.literal("nothing down there"));

            }


        }
        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), player ->  player.broadcastBreakEvent(player.getUsedItemHand()));

        return InteractionResult.SUCCESS;

    }

    private void outputValuableCord(BlockPos blockPos, Player player, Block block) {
        player.sendSystemMessage(Component.literal("found " + I18n.get(block.getDescriptionId()) + " at " + blockPos.getX() +","+ blockPos.getY()+ "," + blockPos.getZ() ));
    }

    private boolean isvaluableblock(BlockState blockthere) {
        return blockthere.is(ModTags.Blocks.METAL_DETECTOR_VALUABLES);
    }
}
