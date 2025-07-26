package com.AlexBespolyy.Insurgencia_Mecanica.item;

import com.AlexBespolyy.Insurgencia_Mecanica.Insurgencia_Mecanica;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Insurgencia_Mecanica.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    @ObjectHolder(Insurgencia_Mecanica.MOD_ID + ":sulfur")
    public static final Item SULFUR = null;

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new Item(new Item.Properties().group(ItemGroup.MATERIALS))
                        .setRegistryName(Insurgencia_Mecanica.MOD_ID, "sulfur")
        );
    }
}
