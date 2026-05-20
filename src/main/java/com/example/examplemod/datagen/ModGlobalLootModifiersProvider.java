package com.example.examplemod.datagen;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.item.ModItems;
import com.example.examplemod.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, ExampleMod.MODID);
    }

    @Override
    protected void start() {
        add("itemtest_from_slime", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(
                        ResourceLocation.fromNamespaceAndPath("minecraft", "entities/slime") // Change source Mob
                ).build()
        }, ModItems.ITEMTEST.get())); //change Item
        add("pine_cone_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(), //change source block
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.ITEMTEST.get())); //change item
        add("metal_detector_from_jungle_temples", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft", "chests/jungle_temple" )).build() }, ModItems.METALDETECTOR.get())); //path location, Moditems item

    }}
