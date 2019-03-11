package com.feathercraftdevs.entities.render;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.entities.mobs.MuscovyGrey;
import com.feathercraftdevs.entities.model.ModelMuscovyGrey;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMuscovyGrey extends RenderLiving<MuscovyGrey>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(FeatherCraftMain.MODID + ":textures/entity/greymuscovy.png");
	
	public RenderMuscovyGrey(RenderManager manager) {
		super(manager, new ModelMuscovyGrey(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(MuscovyGrey entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(MuscovyGrey entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}