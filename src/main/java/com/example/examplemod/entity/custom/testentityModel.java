package com.example.examplemod.entity.custom;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.model.GeoModel;

public class testentityModel extends GeoModel<testentity> {
    @Override
    public ResourceLocation getModelResource(testentity animatable) {
        return ResourceLocation.fromNamespaceAndPath("examplemod", "geo/testentity.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(testentity animatable) {
        return ResourceLocation.fromNamespaceAndPath("examplemod", "textures/entities/testentity.png");
    }

    @Override
    public ResourceLocation getAnimationResource(testentity animatable) {
        return ResourceLocation.fromNamespaceAndPath("examplemod", "animations/testentity.model.animation.json");
    }



    }

