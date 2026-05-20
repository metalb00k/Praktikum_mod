package com.example.examplemod.entity.custom;

import com.example.examplemod.ExampleMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


    @Mod.EventBusSubscriber(modid = ExampleMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class modentities {
        public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
                DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ExampleMod.MODID);

        public static final RegistryObject<EntityType<testentity>> TESTENTITY =
                ENTITY_TYPES.register("testentity",
                        () -> EntityType.Builder.of(testentity::new, MobCategory.CREATURE)
                                .sized(0.6f, 1.8f)
                                .build(ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "testentity").toString()));

        public static void register(IEventBus eventBus) {
            ENTITY_TYPES.register(eventBus);
        }

        @SubscribeEvent
        public static void registerAttributes(EntityAttributeCreationEvent event) {
            event.put(TESTENTITY.get(), testentity.createMobAttributes()
                    .add(Attributes.MAX_HEALTH, 20.0)
                    .add(Attributes.MOVEMENT_SPEED, 0.3)
                    .add(Attributes.MAX_HEALTH, 20.0)
                    .add(Attributes.MOVEMENT_SPEED, 0.3)
                    .add(Attributes.ATTACK_DAMAGE, 3.0) // <-- add this
                    .build());
        }
    }

