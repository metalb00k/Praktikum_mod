package com.example.examplemod.entity.animations;

import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.object.PlayState;

public interface geoentity extends GeoAnimatable {
    public default void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
       controllers.add(new AnimationController<>(this, "Walking", 0, state -> {
            return state.isMoving() ? state.setAndContinue(DefaultAnimations.WALK) : PlayState.STOP;
        }));
    }

}
