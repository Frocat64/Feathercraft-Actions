package com.feathercraftdevs.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Duckmalewood - eeias4
 * Created using Tabula 7.0.0
 */
public class ModelDuckWood extends ModelBase {
    public ModelRenderer Body1;
    public ModelRenderer Neck;
    public ModelRenderer Body3;
    public ModelRenderer RightWing1;
    public ModelRenderer Leg11;
    public ModelRenderer Leg21;
    public ModelRenderer LeftWing1;
    public ModelRenderer Neck2;
    public ModelRenderer Head;
    public ModelRenderer Beak1;
    public ModelRenderer Beak2;
    public ModelRenderer HeadFeathers;
    public ModelRenderer Body4;
    public ModelRenderer RightWing2;
    public ModelRenderer RightWing3;
    public ModelRenderer RightWing4;
    public ModelRenderer RightWing5;
    public ModelRenderer RightWing6;
    public ModelRenderer RightWing7;
    public ModelRenderer RightWing8;
    public ModelRenderer RightWing9;
    public ModelRenderer Leg12;
    public ModelRenderer Leg13;
    public ModelRenderer Leg22;
    public ModelRenderer Leg23;
    public ModelRenderer LeftWing2;
    public ModelRenderer LeftWing3;
    public ModelRenderer LeftWing4;
    public ModelRenderer LeftWing5;
    public ModelRenderer LeftWing6;
    public ModelRenderer LeftWing7;
    public ModelRenderer LeftWing8;
    public ModelRenderer LeftWing9;

    public ModelDuckWood () {
        this.textureWidth = 72;
        this.textureHeight = 64;
        this.Leg23 = new ModelRenderer(this, 0, 29);
        this.Leg23.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.Leg23.addBox(-1.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F);
        this.RightWing1 = new ModelRenderer(this, 46, 41);
        this.RightWing1.setRotationPoint(-2.9F, -1.9F, -5.9F);
        this.RightWing1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(RightWing1, 0.0F, 0.0F, 0.091106186954104F);
        this.LeftWing6 = new ModelRenderer(this, 49, 34);
        this.LeftWing6.setRotationPoint(0.01F, 0.4F, 0.3F);
        this.LeftWing6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(LeftWing6, 1.2292353921796064F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 13);
        this.Head.setRotationPoint(0.0F, -1.2F, -2.6F);
        this.Head.addBox(-1.5F, -2.8F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Head, 1.3613568165555772F, 0.0F, 0.0F);
        this.Beak1 = new ModelRenderer(this, 0, 4);
        this.Beak1.setRotationPoint(0.0F, -1.5F, -2.5F);
        this.Beak1.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Beak1, 0.24434609527920614F, -0.0F, 0.0F);
        this.LeftWing2 = new ModelRenderer(this, 23, 43);
        this.LeftWing2.setRotationPoint(-0.02F, 1.9F, 0.6F);
        this.LeftWing2.addBox(0.0F, 0.1F, -0.5F, 1, 1, 5, 0.0F);
        this.setRotateAngle(LeftWing2, 0.5918411493512771F, 0.0F, 0.0F);
        this.Beak2 = new ModelRenderer(this, 0, 9);
        this.Beak2.setRotationPoint(0.01F, -1.1F, -2.3F);
        this.Beak2.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Beak2, 0.08726646259971647F, -0.0F, 0.0F);
        this.RightWing4 = new ModelRenderer(this, 47, 52);
        this.RightWing4.setRotationPoint(0.01F, 0.9F, -0.2F);
        this.RightWing4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.RightWing2 = new ModelRenderer(this, 23, 43);
        this.RightWing2.setRotationPoint(0.0F, 1.9F, 0.6F);
        this.RightWing2.addBox(0.0F, 0.1F, -0.5F, 1, 1, 5, 0.0F);
        this.RightWing6 = new ModelRenderer(this, 49, 34);
        this.RightWing6.setRotationPoint(0.01F, 0.4F, 0.3F);
        this.RightWing6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(RightWing6, 1.2292353921796064F, 0.0F, 0.0F);
        this.Leg22 = new ModelRenderer(this, 20, 26);
        this.Leg22.setRotationPoint(0.0F, 2.2F, 0.0F);
        this.Leg22.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Leg22, -0.15707963267948966F, -0.0F, 0.0F);
        this.LeftWing1 = new ModelRenderer(this, 46, 41);
        this.LeftWing1.setRotationPoint(2.01F, -0.9F, -5.9F);
        this.LeftWing1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(LeftWing1, 0.0F, 0.0F, -0.091106186954104F);
        this.Body3 = new ModelRenderer(this, 37, 0);
        this.Body3.setRotationPoint(0.0F, 0.0F, -0.8F);
        this.Body3.addBox(-2.5F, -1.7F, 0.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(Body3, -0.13962634015954636F, 0.017453292519943295F, 0.0F);
        this.LeftWing3 = new ModelRenderer(this, 10, 43);
        this.LeftWing3.setRotationPoint(0.01F, 0.8F, -0.3F);
        this.LeftWing3.addBox(0.0F, 0.0F, -0.2F, 1, 1, 5, 0.0F);
        this.RightWing7 = new ModelRenderer(this, 25, 12);
        this.RightWing7.setRotationPoint(-0.01F, 0.0F, 1.5F);
        this.RightWing7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(RightWing7, 1.2747884856566583F, 0.0F, 0.0F);
        this.LeftWing7 = new ModelRenderer(this, 25, 12);
        this.LeftWing7.setRotationPoint(-0.01F, 0.0F, 1.5F);
        this.LeftWing7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(LeftWing7, 1.2747884856566583F, 0.0F, 0.0F);
        this.RightWing8 = new ModelRenderer(this, 35, 21);
        this.RightWing8.setRotationPoint(0.01F, 0.9F, 0.3F);
        this.RightWing8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Leg13 = new ModelRenderer(this, 0, 29);
        this.Leg13.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.Leg13.addBox(-1.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F);
        this.Leg12 = new ModelRenderer(this, 20, 26);
        this.Leg12.setRotationPoint(0.0F, 2.2F, 0.0F);
        this.Leg12.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Leg12, -0.15707963267948966F, -0.0F, 0.0F);
        this.Neck2 = new ModelRenderer(this, 1, 21);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.Neck2.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Neck2, -0.890117918517108F, 0.0F, 0.0F);
        this.HeadFeathers = new ModelRenderer(this, 7, 1);
        this.HeadFeathers.setRotationPoint(0.0F, -2.3F, -0.8F);
        this.HeadFeathers.addBox(-1.0F, 0.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(HeadFeathers, 1.0016444577195458F, 0.0F, 0.0F);
        this.RightWing5 = new ModelRenderer(this, 31, 37);
        this.RightWing5.setRotationPoint(-0.02F, 0.6F, 1.0F);
        this.RightWing5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(RightWing5, -1.2217304763960306F, 0.0F, 0.0F);
        this.Body4 = new ModelRenderer(this, 23, 1);
        this.Body4.setRotationPoint(0.0F, -0.6F, 2.7F);
        this.Body4.addBox(-2.0F, -0.8F, 0.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(Body4, -0.17453292519943295F, -0.0F, 0.0F);
        this.RightWing3 = new ModelRenderer(this, 10, 43);
        this.RightWing3.setRotationPoint(0.01F, 0.8F, -0.3F);
        this.RightWing3.addBox(0.0F, 0.0F, -0.2F, 1, 1, 5, 0.0F);
        this.setRotateAngle(RightWing3, 0.5918411493512771F, 0.0F, 0.0F);
        this.RightWing9 = new ModelRenderer(this, 31, 27);
        this.RightWing9.setRotationPoint(0.02F, 0.5F, 0.0F);
        this.RightWing9.addBox(0.0F, 0.3F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(RightWing9, -0.5410520681182421F, 0.0F, 0.0F);
        this.LeftWing4 = new ModelRenderer(this, 47, 52);
        this.LeftWing4.setRotationPoint(0.01F, 0.9F, -0.2F);
        this.LeftWing4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.Leg11 = new ModelRenderer(this, 12, 27);
        this.Leg11.setRotationPoint(-2.01F, 0.3F, -2.3F);
        this.Leg11.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Leg11, 0.15707963267948966F, -0.0F, 0.0F);
        this.LeftWing9 = new ModelRenderer(this, 31, 27);
        this.LeftWing9.setRotationPoint(0.02F, 0.5F, 0.0F);
        this.LeftWing9.addBox(0.0F, 0.3F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LeftWing9, -0.5410520681182421F, 0.0F, 0.0F);
        this.LeftWing5 = new ModelRenderer(this, 31, 37);
        this.LeftWing5.setRotationPoint(-0.02F, 0.6F, 1.0F);
        this.LeftWing5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(LeftWing5, -1.2217304763960306F, 0.0F, 0.0F);
        this.LeftWing8 = new ModelRenderer(this, 35, 21);
        this.LeftWing8.setRotationPoint(0.01F, 0.9F, 0.3F);
        this.LeftWing8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Body1 = new ModelRenderer(this, 40, 20);
        this.Body1.setRotationPoint(0.0F, 17.4F, 0.0F);
        this.Body1.addBox(-3.0F, -2.0F, -6.0F, 6, 4, 6, 0.0F);
        this.Neck = new ModelRenderer(this, 47, 13);
        this.Neck.setRotationPoint(0.0F, -0.6F, -5.2F);
        this.Neck.addBox(-1.5F, -1.0F, -3.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Neck, -0.47123889803846897F, 0.0F, 0.0F);
        this.Leg21 = new ModelRenderer(this, 12, 27);
        this.Leg21.setRotationPoint(2.01F, 0.3F, -2.3F);
        this.Leg21.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Leg21, 0.15707963267948966F, -0.0F, 0.0F);
        this.Leg22.addChild(this.Leg23);
        this.Body1.addChild(this.RightWing1);
        this.LeftWing5.addChild(this.LeftWing6);
        this.Neck2.addChild(this.Head);
        this.Head.addChild(this.Beak1);
        this.LeftWing1.addChild(this.LeftWing2);
        this.Head.addChild(this.Beak2);
        this.RightWing3.addChild(this.RightWing4);
        this.RightWing1.addChild(this.RightWing2);
        this.RightWing5.addChild(this.RightWing6);
        this.Leg21.addChild(this.Leg22);
        this.Body1.addChild(this.LeftWing1);
        this.Body1.addChild(this.Body3);
        this.LeftWing2.addChild(this.LeftWing3);
        this.RightWing5.addChild(this.RightWing7);
        this.LeftWing5.addChild(this.LeftWing7);
        this.RightWing7.addChild(this.RightWing8);
        this.Leg12.addChild(this.Leg13);
        this.Leg11.addChild(this.Leg12);
        this.Neck.addChild(this.Neck2);
        this.Head.addChild(this.HeadFeathers);
        this.RightWing4.addChild(this.RightWing5);
        this.Body3.addChild(this.Body4);
        this.RightWing2.addChild(this.RightWing3);
        this.RightWing7.addChild(this.RightWing9);
        this.LeftWing3.addChild(this.LeftWing4);
        this.Body1.addChild(this.Leg11);
        this.LeftWing7.addChild(this.LeftWing9);
        this.LeftWing4.addChild(this.LeftWing5);
        this.LeftWing7.addChild(this.LeftWing8);
        this.Body1.addChild(this.Neck);
        this.Body1.addChild(this.Leg21);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
   // @Override
   // public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
    	
   // }
}
