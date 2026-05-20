package com.example.examplemod.entity.custom;

import com.example.examplemod.ExampleMod;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBiomeModifiers {
    public static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, ExampleMod.MODID);

    public static final RegistryObject<Codec<TestEntitySpawnModifier>> TESTENTITY_SPAWN_MODIFIER =
            BIOME_MODIFIER_SERIALIZERS.register("testentity_spawn_modifier",
                    () -> RecordCodecBuilder.create(inst -> inst.group(
                            Biome.LIST_CODEC.fieldOf("biomes").forGetter(TestEntitySpawnModifier::biomes)
                    ).apply(inst, TestEntitySpawnModifier::new)));

    public static void register(IEventBus eventBus) {
        BIOME_MODIFIER_SERIALIZERS.register(eventBus);
    }
}