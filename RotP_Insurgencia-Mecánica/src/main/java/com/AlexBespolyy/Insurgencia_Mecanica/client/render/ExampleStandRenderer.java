package com.AlexBespolyy.Insurgencia_Mecanica.client.render;

import com.github.standobyte.jojo.client.render.entity.model.stand.StandEntityModel;
import com.github.standobyte.jojo.client.render.entity.model.stand.StandModelRegistry;
import com.github.standobyte.jojo.client.render.entity.renderer.stand.StandEntityRenderer;
import com.AlexBespolyy.Insurgencia_Mecanica.Insurgencia_Mecanica;
import com.AlexBespolyy.Insurgencia_Mecanica.entity.ExampleStandEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class ExampleStandRenderer extends StandEntityRenderer<ExampleStandEntity, StandEntityModel<ExampleStandEntity>> {
    
    public ExampleStandRenderer(EntityRendererManager renderManager) {
        super(renderManager, 
                StandModelRegistry.registerModel(new ResourceLocation(Insurgencia_Mecanica.MOD_ID, "example_stand"), HevyStarModel::new),
                new ResourceLocation(Insurgencia_Mecanica.MOD_ID, "textures/entity/stand/example_stand.png"), 0);
    }
}
