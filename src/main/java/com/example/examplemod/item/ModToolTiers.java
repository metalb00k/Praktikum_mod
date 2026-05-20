package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier TESTTIER = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 6f, 5f, 25, ModTags.Blocks.NEED_TEST_TOOL, () -> Ingredient.of(ModItems.ITEMTEST.get())
            ),  ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "itemtest"), List.of(Tiers.NETHERITE), List.of());
}
