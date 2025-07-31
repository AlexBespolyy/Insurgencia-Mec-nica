package com.AlexBespolyy.Insurgencia_Mecanica.init;

import com.AlexBespolyy.Insurgencia_Mecanica.Insurgencia_Mecanica;
import com.AlexBespolyy.Insurgencia_Mecanica.entity.Hevy_Star_Stand;
import com.github.standobyte.jojo.entity.stand.StandEntityType;

import net.minecraft.entity.EntityClassification;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitEntities {
    public static final DeferredRegister<net.minecraft.entity.EntityType<?>> ENTITIES = DeferredRegister.create(
            ForgeRegistries.ENTITIES, Insurgencia_Mecanica.MOD_ID);

    public static final RegistryObject<StandEntityType<Hevy_Star_Stand>> HEVY_STAR = ENTITIES.register("hevy_star", () ->
            new StandEntityType<>(
                    Hevy_Star_Stand::new, // Factory
                    0.9F,                 // Width
                    2.0F                  // Height
            )
    );
}
