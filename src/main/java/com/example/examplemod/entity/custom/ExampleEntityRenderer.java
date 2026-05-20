package com.example.examplemod.entity.custom;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ExampleEntityRenderer extends GeoEntityRenderer<testentity> {
    public ExampleEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new testentityModel());;
    }
}