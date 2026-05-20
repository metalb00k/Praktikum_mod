package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.block.ModBlocks;
import com.example.examplemod.entity.custom.modentities;
import com.example.examplemod.item.custom.testAdvancedItem;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =

            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<Item> ITEMTEST =
            ITEMS.register("itemtest", () -> new Item(new Item.Properties() ));
    public static final RegistryObject<Item> SWORD =
            ITEMS.register("sword", () -> new SwordItem(ModToolTiers.TESTTIER, 6,-1, new Item.Properties() ));
    public static final RegistryObject<Item> PICKAXE =
            ITEMS.register("pickaxe", () -> new PickaxeItem(ModToolTiers.TESTTIER, 3,-2f, new Item.Properties() ));
    public static final RegistryObject<Item> SHOVEL =
            ITEMS.register("shovel", () -> new ShovelItem(ModToolTiers.TESTTIER, 3,-2f, new Item.Properties() ));
    public static final RegistryObject<Item> HOE =
            ITEMS.register("hoe", () -> new HoeItem(ModToolTiers.TESTTIER, 3,-2f, new Item.Properties() ));

    public static final RegistryObject<Item> AXE =
            ITEMS.register("axe", () -> new AxeItem(ModToolTiers.TESTTIER, 3,-2f, new Item.Properties() ));
    public static final RegistryObject<Item> TESTENTITY_SPAWN_EGG = ITEMS.register("testentity_spawn_egg",
            () -> new ForgeSpawnEggItem(modentities.TESTENTITY, 0x5a7a94, 0x1a2a3a, new Item.Properties()));
    public static final RegistryObject<Item> HELMET =
            ITEMS.register("helmet", () -> new ArmorItem(ModArmorMaterials.ITEMTEST ,ArmorItem.Type.HELMET, new Item.Properties() ));
    public static final RegistryObject<Item> CHESTPLATE =
            ITEMS.register("chestplate", () -> new ArmorItem(ModArmorMaterials.ITEMTEST, ArmorItem.Type.CHESTPLATE, new Item.Properties() ));
    public static final RegistryObject<Item> LEGGINGS =
            ITEMS.register("leggings", () -> new ArmorItem(ModArmorMaterials.ITEMTEST, ArmorItem.Type.LEGGINGS, new Item.Properties() ));
    public static final RegistryObject<Item> BOOTS =
            ITEMS.register("boots", () -> new ArmorItem(ModArmorMaterials.ITEMTEST, ArmorItem.Type.BOOTS, new Item.Properties() ));

    public static final RegistryObject<Item> METALDETECTOR =
            ITEMS.register("metaldetector", () -> new testAdvancedItem(new Item.Properties().durability(100) ));
    public static final RegistryObject<Item> PROTEINTUBES =
            ITEMS.register("proteintubes", () -> new Item(new Item.Properties().food(ModFoods.PROTEINTUBES)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
