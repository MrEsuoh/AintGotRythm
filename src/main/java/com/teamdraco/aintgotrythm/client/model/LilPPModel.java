package com.teamdraco.aintgotrythm.client.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * VillagerModel - Either Mojang or a mod author (Taken From Memory)
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class LilPPModel<T extends Entity> extends EntityModel<T> {
    public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer leftLeg;
    public ModelRenderer rightLeg;
    public ModelRenderer sunglasses;
    public ModelRenderer nose;
    public ModelRenderer headphoneBand;
    public ModelRenderer speakers;
    public ModelRenderer jacket;
    public ModelRenderer rightArm;
    public ModelRenderer middleArm;
    public ModelRenderer leftArm;

    public LilPPModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.jacket = new ModelRenderer(this, 0, 38);
        this.jacket.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jacket.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, 0.5F, 0.5F, 0.5F);
        this.sunglasses = new ModelRenderer(this, 32, 0);
        this.sunglasses.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.sunglasses.addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.5F, 0.5F, 0.5F);
        this.headphoneBand = new ModelRenderer(this, 40, 48);
        this.headphoneBand.setRotationPoint(-5.5F, -11.0F, 0.0F);
        this.headphoneBand.addBox(0.0F, 0.0F, 0.0F, 11.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.rightLeg = new ModelRenderer(this, 0, 22);
        this.rightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.rightLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.nose = new ModelRenderer(this, 24, 0);
        this.nose.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.nose.addBox(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.speakers = new ModelRenderer(this, 34, 56);
        this.speakers.setRotationPoint(-6.0F, -6.0F, -1.0F);
        this.speakers.addBox(0.0F, 0.0F, 0.0F, 12.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 16, 20);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.middleArm = new ModelRenderer(this, 40, 38);
        this.middleArm.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.middleArm.addBox(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(middleArm, -0.7499680008872521F, 0.0F, 0.0F);
        this.leftArm = new ModelRenderer(this, 44, 22);
        this.leftArm.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.leftArm.addBox(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm, -0.7499680008872521F, 0.0F, 0.0F);
        this.leftLeg = new ModelRenderer(this, 0, 22);
        this.leftLeg.mirror = true;
        this.leftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leftLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.rightArm = new ModelRenderer(this, 44, 22);
        this.rightArm.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.rightArm.addBox(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm, -0.7499680008872521F, 0.0F, 0.0F);
        this.body.addChild(this.jacket);
        this.head.addChild(this.sunglasses);
        this.head.addChild(this.headphoneBand);
        this.head.addChild(this.nose);
        this.head.addChild(this.speakers);
        this.body.addChild(this.middleArm);
        this.body.addChild(this.leftArm);
        this.body.addChild(this.rightArm);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) { 
        ImmutableList.of(this.rightLeg, this.head, this.body, this.leftLeg).forEach((modelRenderer) -> { 
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        boolean flag = false;
        if (entityIn instanceof AbstractVillagerEntity) {
            flag = ((AbstractVillagerEntity)entityIn).getShakeHeadTicks() > 0;
        }

        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        if (flag) {
            this.head.rotateAngleZ = 0.3F * MathHelper.sin(0.45F * ageInTicks);
            this.head.rotateAngleX = 0.4F;
        } else {
            this.head.rotateAngleZ = 0.0F;
        }

        //this.villagerArms.rotationPointY = 3.0F;
        //this.villagerArms.rotationPointZ = -1.0F;
        //this.villagerArms.rotateAngleX = -0.75F;
        this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount * 0.5F;
        this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount * 0.5F;
        this.rightLeg.rotateAngleY = 0.0F;
        this.leftLeg.rotateAngleY = 0.0F;
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public ModelRenderer getHead(){
        return getHead();
    }

    public ModelRenderer getMeatArms(){
        return getMeatArms();
    }

    public ModelRenderer getBody(){
        return getBody();
    }

    public ModelRenderer getLeftLeg(){
        return getLeftLeg();
    }

    public ModelRenderer getRightLeg(){
        return getRightLeg();
    }

    public ModelRenderer getSunglasses(){
        return getSunglasses();
    }

    public ModelRenderer getNose(){
        return getNose();
    }

    public ModelRenderer getHeadphoneBand(){
        return getHeadphoneBand();
    }

    public ModelRenderer getSpeakers(){
        return getSpeakers();
    }

    public ModelRenderer getJacket(){
        return getJacket();
    }

}
