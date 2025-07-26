package com.AlexBespolyy.Insurgencia_Mecanica.init;

import java.util.function.Supplier;

import com.github.standobyte.jojo.init.ModSounds;
import com.github.standobyte.jojo.util.mc.OstSoundList;
import com.AlexBespolyy.Insurgencia_Mecanica.Insurgencia_Mecanica;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(
            ForgeRegistries.SOUND_EVENTS, Insurgencia_Mecanica.MOD_ID); // TODO sounds.json
    
    public static final RegistryObject<SoundEvent> EXAMPLE_STAND_SUMMON_VOICELINE = SOUNDS.register("example_stand_summon_voiceline", 
            () -> new SoundEvent(new ResourceLocation(Insurgencia_Mecanica.MOD_ID, "example_stand_summon_voiceline")));

    public static final Supplier<SoundEvent> EXAMPLE_STAND_SUMMON_SOUND = ModSounds.STAND_SUMMON_DEFAULT;
    
    public static final Supplier<SoundEvent> EXAMPLE_STAND_UNSUMMON_SOUND = ModSounds.STAND_UNSUMMON_DEFAULT;
    
    public static final Supplier<SoundEvent> EXAMPLE_STAND_PUNCH_LIGHT = ModSounds.STAND_PUNCH_LIGHT;
    
    public static final Supplier<SoundEvent> EXAMPLE_STAND_PUNCH_HEAVY = ModSounds.STAND_PUNCH_HEAVY;
    
    public static final Supplier<SoundEvent> EXAMPLE_STAND_PUNCH_BARRAGE = ModSounds.STAND_PUNCH_LIGHT;
    
    public static final Supplier<SoundEvent> EXAMPLE_STAND_THROW_PICKAXE = ModSounds.STAND_PUNCH_LIGHT;

    public static final Supplier<SoundEvent> STOP_TIME = ModSounds.DIO_TIME_STOP;

    public static final Supplier<SoundEvent> INDOOR_DRIVER = ModSounds.SILVER_CHARIOT_DASH;
    
    public static final OstSoundList EXAMPLE_STAND_OST = new OstSoundList(
            new ResourceLocation(Insurgencia_Mecanica.MOD_ID, "example_stand_ost"), SOUNDS);
}
