package com.feathercraftdevs.entities.render;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.entities.mobs.MuscovyBlackWhite;
import com.feathercraftdevs.entities.model.ModelMuscovyBlackWhite;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMuscovyBlackWhite extends RenderLiving<MuscovyBlackWhite>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(FeatherCraftMain.MODID + ":textures/entity/blwmuscovy.png");
	
	public RenderMuscovyBlackWhite(RenderManager manager) {
		super(manager, new ModelMuscovyBlackWhite(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(MuscovyBlackWhite entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(MuscovyBlackWhite entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}