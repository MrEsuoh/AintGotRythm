package com.teamdraco.aintgotrythm.client.render;

import com.teamdraco.aintgotrythm.AintGotRythm;
import com.teamdraco.aintgotrythm.client.model.LilPPModel;
import com.teamdraco.aintgotrythm.entities.LilPPEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LilPPRender extends MobRenderer<LilPPEntity, LilPPModel<LilPPEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(AintGotRythm.MOD_ID,
            "textures/entity/lil_pp.png");

    public LilPPRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new LilPPModel<>(), 1.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(LilPPEntity entity) {
        return TEXTURE;
    }

}
