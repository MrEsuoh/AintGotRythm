package com.teamdraco.aintgotrythm.client.render;

import com.teamdraco.aintgotrythm.AintGotRythm;
import com.teamdraco.aintgotrythm.client.model.JuanEntityModel;
import com.teamdraco.aintgotrythm.entities.JuanEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class JuanEntityRender extends MobRenderer<JuanEntity, JuanEntityModel<JuanEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(AintGotRythm.MOD_ID,
            "textures/entity/juan_entity.png");

    public JuanEntityRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new JuanEntityModel<>(), 1.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(JuanEntity entity) {
        return TEXTURE;
    }

}
