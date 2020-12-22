package com.teamdraco.aintgotrythm.client.render;

import com.teamdraco.aintgotrythm.AintGotRythm;
import com.teamdraco.aintgotrythm.client.model.JuanModel;
import com.teamdraco.aintgotrythm.entities.JuanEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class JuanRender extends MobRenderer<JuanEntity, JuanModel<JuanEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(AintGotRythm.MOD_ID,
            "textures/entity/juan.png");

    public JuanRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new JuanModel<>(), 1.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(JuanEntity entity) {
        return TEXTURE;
    }

}
