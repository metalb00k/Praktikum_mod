package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MOD_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MODID);
    public static final RegistryObject<CreativeModeTab> PROJEKT_TAB =
            CREATIVE_MOD_TAB.register("projekt", () -> net.minecraft.world.item.CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.ITEMTEST.get()))
                    .title(Component.translatable("creativetab._Projekt"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ITEMTEST.get());
                        pOutput.accept(ModItems.SWORD.get());
                        pOutput.accept(ModBlocks.TESTBLOCK.get());
                        pOutput.accept(ModItems.METALDETECTOR.get());
                        pOutput.accept(ModBlocks.MINE.get());
                        pOutput.accept(ModItems.PROTEINTUBES.get());
                        pOutput.accept(ModItems.PICKAXE.get());
                        pOutput.accept(ModItems.AXE.get());
                        pOutput.accept(ModItems.HELMET.get());
                        pOutput.accept(ModItems.CHESTPLATE.get());
                        pOutput.accept(ModItems.LEGGINGS.get());
                        pOutput.accept(ModItems.BOOTS.get());
                        pOutput.accept(ModItems.TESTENTITY_SPAWN_EGG.get());
                        pOutput.accept(ModItems.SHOVEL.get());
                        pOutput.accept(ModItems.HOE.get());
                     //   pOutput.accept(ModBlocks.TESTORE.get());
                    })
                    .build() );
    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TAB.register(eventBus);
    }

}
