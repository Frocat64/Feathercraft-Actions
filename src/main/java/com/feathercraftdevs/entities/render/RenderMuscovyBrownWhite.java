package com.feathercraftdevs.entities.render;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.entities.mobs.MuscovyBrownWhite;
import com.feathercraftdevs.entities.model.ModelMuscovyBrownWhite;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMuscovyBrownWhite extends RenderLiving<MuscovyBrownWhite>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(FeatherCraftMain.MODID + ":textures/entity/brwmuscovy.png");
	
	public RenderMuscovyBrownWhite(RenderManager manager) {
		super(manager, new ModelMuscovyBrownWhite(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(MuscovyBrownWhite entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(MuscovyBrownWhite entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}