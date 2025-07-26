package com.AlexBespolyy.Insurgencia_Mecanica;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.AlexBespolyy.Insurgencia_Mecanica.init.InitEntities;
import com.AlexBespolyy.Insurgencia_Mecanica.init.InitSounds;
import com.AlexBespolyy.Insurgencia_Mecanica.init.InitStands;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// Your addon's main file

@Mod(Insurgencia_Mecanica.MOD_ID)
public class Insurgencia_Mecanica {
    // The mod's id. Used quite often, mostly when creating ResourceLocation (objects).
    // Its value should match the "modid" entry in the META-INF/mods.toml file
    public static final String MOD_ID = "insurgencia_mecanica";
    public static final Logger LOGGER = LogManager.getLogger();

    public Insurgencia_Mecanica() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // All DeferredRegister objects are registered here.
        // A DeferredRegister needs to be created for each type of objects that need to be registered in the game 
        // (see ForgeRegistries or JojoCustomRegistries)
        InitEntities.ENTITIES.register(modEventBus);
        InitSounds.SOUNDS.register(modEventBus);
        InitStands.ACTIONS.register(modEventBus);
        InitStands.STANDS.register(modEventBus);
    }
}
