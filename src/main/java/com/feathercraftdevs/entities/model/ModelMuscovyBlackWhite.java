package com.feathercraftdevs.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Goose - Ecraft&M�rbis
 * Created using Tabula 7.0.0
 */
public class ModelMuscovyBlackWhite extends ModelBase {
    public ModelRenderer Body1;
    public ModelRenderer Neck;
    public ModelRenderer Body3;
    public ModelRenderer LeftWing1;
    public ModelRenderer RightWing1;
    public ModelRenderer RightLeg1;
    public ModelRenderer LeftLeg1;
    public ModelRenderer Neck2;
    public ModelRenderer Neck3;
    public ModelRenderer Head;
    public ModelRenderer Beak1;
    public ModelRenderer Beak2;
    public ModelRenderer Crown;
    public ModelRenderer Body4;
    public ModelRenderer Body5;
    public ModelRenderer LeftWing2;
    public ModelRenderer LeftWing3;
    public ModelRenderer LeftWing4;
    public ModelRenderer LeftWing5;
    public ModelRenderer LeftWing6;
    public ModelRenderer LeftWing7;
    public ModelRenderer LeftWing8;
    public ModelRenderer LeftWing9;
    public ModelRenderer RightWing2;
    public ModelRenderer RightWing3;
    public ModelRenderer RightWing4;
    public ModelRenderer RightWing5;
    public ModelRenderer RightWing6;
    public ModelRenderer RightWing7;
    public ModelRenderer RightWing8;
    public ModelRenderer RightWing9;
    public ModelRenderer RightLeg2;
    public ModelRenderer RightLeg3;
    public ModelRenderer LeftLeg2;
    public ModelRenderer LeftLeg3;

    public ModelMuscovyBlackWhite() {
        this.textureWidth = 80;
        this.textureHeight = 50;
        this.Body4 = new ModelRenderer(this, 36, 0);
        this.Body4.setRotationPoint(0.0F, -0.7F, 1.4F);
        this.Body4.addBox(-2.0F, -0.5F, 0.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(Body4, 0.3665191429188092F, -0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 16);
        this.Head.setRotationPoint(0.0F, 0.4F, 1.5F);
        this.Head.addBox(-1.5F, -2.87F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Head, -1.8668041679331349F, 0.0F, 0.0F);
        this.LeftWing5 = new ModelRenderer(this, 61, 25);
        this.LeftWing5.setRotationPoint(0.0F, 1.0F, 0.1F);
        this.LeftWing5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.RightWing7 = new ModelRenderer(this, 25, 12);
        this.RightWing7.setRotationPoint(0.0F, 1.0F, 0.9F);
        this.RightWing7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.LeftWing6 = new ModelRenderer(this, 47, 31);
        this.LeftWing6.setRotationPoint(0.01F, 0.5F, 1.0F);
        this.LeftWing6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(LeftWing6, -1.3658946726107624F, 0.0F, 0.0F);
        this.LeftWing1 = new ModelRenderer(this, 25, 18);
        this.LeftWing1.setRotationPoint(3.0F, -1.6F, -5.2F);
        this.LeftWing1.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 5, 0.0F);
        this.setRotateAngle(LeftWing1, 0.0F, 0.0F, -0.091106186954104F);
        this.LeftWing9 = new ModelRenderer(this, 41, 27);
        this.LeftWing9.setRotationPoint(0.0F, 0.9F, 0.8F);
        this.LeftWing9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.RightWing5 = new ModelRenderer(this, 61, 25);
        this.RightWing5.setRotationPoint(0.0F, 1.0F, 0.1F);
        this.RightWing5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Neck = new ModelRenderer(this, 46, 11);
        this.Neck.setRotationPoint(0.0F, 0.5F, -5.0F);
        this.Neck.addBox(-1.5F, -1.5F, -4.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Neck, -0.7740535232594852F, 0.0F, 0.0F);
        this.LeftWing3 = new ModelRenderer(this, 26, 29);
        this.LeftWing3.setRotationPoint(0.0F, 1.0F, -0.3F);
        this.LeftWing3.addBox(0.0F, 0.0F, -0.3F, 1, 1, 5, 0.0F);
        this.Body1 = new ModelRenderer(this, 40, 38);
        this.Body1.setRotationPoint(0.0F, 15.9F, 3.8F);
        this.Body1.addBox(-3.0F, -2.2F, -6.0F, 6, 5, 6, 0.0F);
        this.setRotateAngle(Body1, -0.24434609527920614F, 0.0F, 0.0F);
        this.Neck3 = new ModelRenderer(this, 1, 23);
        this.Neck3.setRotationPoint(0.01F, -0.1F, -4.5F);
        this.Neck3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Neck3, -2.6406831582674206F, 0.0F, 0.0F);
        this.LeftLeg1 = new ModelRenderer(this, 12, 27);
        this.LeftLeg1.setRotationPoint(1.91F, 1.4F, -2.6F);
        this.LeftLeg1.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(LeftLeg1, 0.40980330836826856F, -0.0F, 0.0F);
        this.Body5 = new ModelRenderer(this, 22, 0);
        this.Body5.setRotationPoint(0.0F, 1.2F, -0.5F);
        this.Body5.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Body5, 0.5410520681182421F, -0.0F, 0.0F);
        this.RightWing4 = new ModelRenderer(this, 47, 21);
        this.RightWing4.setRotationPoint(0.0F, 1.0F, -0.2F);
        this.RightWing4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.Body3 = new ModelRenderer(this, 53, 1);
        this.Body3.setRotationPoint(0.0F, 0.0F, -0.7F);
        this.Body3.addBox(-2.5F, -2.1F, 0.0F, 5, 4, 2, 0.0F);
        this.setRotateAngle(Body3, -0.12217304763960307F, 0.017453292519943295F, 0.0F);
        this.Beak2 = new ModelRenderer(this, 0, 9);
        this.Beak2.setRotationPoint(0.01F, 0.0F, -0.13F);
        this.Beak2.addBox(-0.5F, -1.2F, -4.6F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Beak2, -0.07853981633974483F, 0.0F, 0.0F);
        this.LeftWing2 = new ModelRenderer(this, 11, 7);
        this.LeftWing2.setRotationPoint(-0.49F, 3.0F, 0.3F);
        this.LeftWing2.addBox(0.0F, 0.0F, -0.7F, 1, 1, 5, 0.0F);
        this.setRotateAngle(LeftWing2, 1.2747884856566583F, 0.0F, 0.0F);
        this.RightWing9 = new ModelRenderer(this, 41, 27);
        this.RightWing9.setRotationPoint(0.0F, 0.9F, 0.8F);
        this.RightWing9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Neck2 = new ModelRenderer(this, 1, 40);
        this.Neck2.setRotationPoint(0.0F, 0.7F, -3.3F);
        this.Neck2.addBox(-1.0F, -1.0F, -5.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(Neck2, -0.6806784082777886F, 0.0F, 0.0F);
        this.LeftLeg3 = new ModelRenderer(this, 0, 29);
        this.LeftLeg3.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.LeftLeg3.addBox(-1.0F, 0.0F, -3.0F, 2, 0, 3, 0.0F);
        this.RightLeg1 = new ModelRenderer(this, 12, 27);
        this.RightLeg1.setRotationPoint(-1.99F, 1.4F, -2.6F);
        this.RightLeg1.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(RightLeg1, 0.40980330836826856F, -0.0F, 0.0F);
        this.RightWing2 = new ModelRenderer(this, 11, 7);
        this.RightWing2.setRotationPoint(-0.51F, 3.0F, 0.3F);
        this.RightWing2.addBox(0.0F, 0.0F, -0.7F, 1, 1, 5, 0.0F);
        this.setRotateAngle(RightWing2, 1.2747884856566583F, 0.0F, 0.0F);
        this.LeftWing8 = new ModelRenderer(this, 36, 27);
        this.LeftWing8.setRotationPoint(0.01F, 0.5F, 0.8F);
        this.LeftWing8.addBox(0.0F, 0.3F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LeftWing8, -0.5410520681182421F, 0.0F, 0.0F);
        this.RightWing6 = new ModelRenderer(this, 47, 31);
        this.RightWing6.setRotationPoint(0.01F, 0.5F, 1.0F);
        this.RightWing6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(RightWing6, -1.3658946726107624F, 0.0F, 0.0F);
        this.RightWing3 = new ModelRenderer(this, 26, 29);
        this.RightWing3.setRotationPoint(0.0F, 1.0F, -0.3F);
        this.RightWing3.addBox(0.0F, 0.0F, -0.3F, 1, 1, 5, 0.0F);
        this.LeftWing7 = new ModelRenderer(this, 25, 12);
        this.LeftWing7.setRotationPoint(0.0F, 1.0F, 0.9F);
        this.LeftWing7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.LeftLeg2 = new ModelRenderer(this, 20, 25);
        this.LeftLeg2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.LeftLeg2.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LeftLeg2, -0.15707963267948966F, -0.0F, 0.0F);
        this.RightWing1 = new ModelRenderer(this, 25, 18);
        this.RightWing1.setRotationPoint(-3.0F, -1.6F, -5.2F);
        this.RightWing1.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 5, 0.0F);
        this.setRotateAngle(RightWing1, 0.0F, 0.0F, 0.091106186954104F);
        this.RightWing8 = new ModelRenderer(this, 36, 27);
        this.RightWing8.setRotationPoint(0.01F, 0.5F, 0.8F);
        this.RightWing8.addBox(0.0F, 0.3F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(RightWing8, -0.5410520681182421F, 0.0F, 0.0F);
        this.Crown = new ModelRenderer(this, 3, 1);
        this.Crown.setRotationPoint(-0.6F, -3.0F, -2.6F);
        this.Crown.addBox(0.0F, 0.0F, -0.1F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Crown, -0.3141592653589793F, 0.0F, 0.0F);
        this.RightLeg3 = new ModelRenderer(this, 0, 29);
        this.RightLeg3.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.RightLeg3.addBox(-1.0F, 0.0F, -3.0F, 2, 0, 3, 0.0F);
        this.Beak1 = new ModelRenderer(this, 1, 4);
        this.Beak1.setRotationPoint(0.0F, -1.1F, -0.33F);
        this.Beak1.addBox(-0.5F, -2.07F, -4.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Beak1, 0.38222710618675815F, -0.0F, 0.0F);
        this.LeftWing4 = new ModelRenderer(this, 47, 21);
        this.LeftWing4.setRotationPoint(0.0F, 1.0F, -0.2F);
        this.LeftWing4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.RightLeg2 = new ModelRenderer(this, 20, 25);
        this.RightLeg2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.RightLeg2.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RightLeg2, -0.15707963267948966F, -0.0F, 0.0F);
        this.Body3.addChild(this.Body4);
        this.Neck3.addChild(this.Head);
        this.LeftWing4.addChild(this.LeftWing5);
        this.RightWing5.addChild(this.RightWing7);
        this.LeftWing5.addChild(this.LeftWing6);
        this.Body1.addChild(this.LeftWing1);
        this.LeftWing7.addChild(this.LeftWing9);
        this.RightWing4.addChild(this.RightWing5);
        this.Body1.addChild(this.Neck);
        this.LeftWing2.addChild(this.LeftWing3);
        this.Neck2.addChild(this.Neck3);
        this.Body1.addChild(this.LeftLeg1);
        this.Body4.addChild(this.Body5);
        this.RightWing3.addChild(this.RightWing4);
        this.Body1.addChild(this.Body3);
        this.Head.addChild(this.Beak2);
        this.LeftWing1.addChild(this.LeftWing2);
        this.RightWing7.addChild(this.RightWing9);
        this.Neck.addChild(this.Neck2);
        this.LeftLeg2.addChild(this.LeftLeg3);
        this.Body1.addChild(this.RightLeg1);
        this.RightWing1.addChild(this.RightWing2);
        this.LeftWing7.addChild(this.LeftWing8);
        this.RightWing5.addChild(this.RightWing6);
        this.RightWing2.addChild(this.RightWing3);
        this.LeftWing5.addChild(this.LeftWing7);
        this.LeftLeg1.addChild(this.LeftLeg2);
        this.Body1.addChild(this.RightWing1);
        this.RightWing7.addChild(this.RightWing8);
        this.Beak1.addChild(this.Crown);
        this.RightLeg2.addChild(this.RightLeg3);
        this.Head.addChild(this.Beak1);
        this.LeftWing3.addChild(this.LeftWing4);
        this.RightLeg1.addChild(this.RightLeg2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body1.offsetX, this.Body1.offsetY, this.Body1.offsetZ);
        GlStateManager.translate(this.Body1.rotationPointX * f5, this.Body1.rotationPointY * f5, this.Body1.rotationPointZ * f5);
        GlStateManager.scale(1.2D, 1.2D, 1.2D);
        GlStateManager.translate(-this.Body1.offsetX, -this.Body1.offsetY, -this.Body1.offsetZ);
        GlStateManager.translate(-this.Body1.rotationPointX * f5, -this.Body1.rotationPointY * f5, -this.Body1.rotationPointZ * f5);
        this.Body1.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
