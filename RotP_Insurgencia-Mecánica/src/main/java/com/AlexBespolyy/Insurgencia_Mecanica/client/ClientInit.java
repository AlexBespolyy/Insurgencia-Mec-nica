package com.AlexBespolyy.Insurgencia_Mecanica.client;

import com.AlexBespolyy.Insurgencia_Mecanica.Insurgencia_Mecanica;
import com.AlexBespolyy.Insurgencia_Mecanica.client.render.ExamplePickaxeRenderer;
import com.AlexBespolyy.Insurgencia_Mecanica.client.render.ExampleStandRenderer;
import com.AlexBespolyy.Insurgencia_Mecanica.init.InitEntities;
import com.AlexBespolyy.Insurgencia_Mecanica.init.InitStands;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = Insurgencia_Mecanica.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientInit {
    
    @SubscribeEvent
    public static void onFMLClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(
                InitStands.STAND_EXAMPLE_STAND.getEntityType(), ExampleStandRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(
                InitEntities.EXAMPLE_PICKAXE.get(), manager -> new ExamplePickaxeRenderer(manager));
    }
}
