package com.AlexBespolyy.Insurgencia_Mecanica.init;

import com.AlexBespolyy.Insurgencia_Mecanica.Insurgencia_Mecanica;
import com.AlexBespolyy.Insurgencia_Mecanica.entity.ExamplePickaxeEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(
            ForgeRegistries.ENTITIES, Insurgencia_Mecanica.MOD_ID);
    
    
    
    public static final RegistryObject<EntityType<ExamplePickaxeEntity>> EXAMPLE_PICKAXE = ENTITIES.register("example_pickaxe", 
            () -> EntityType.Builder.<ExamplePickaxeEntity>of(ExamplePickaxeEntity::new, EntityClassification.MISC)
            .sized(1.0F, 1.0F)
            .build(Insurgencia_Mecanica.MOD_ID + ":example_pickaxe"));
};
