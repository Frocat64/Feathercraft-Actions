package com.feathercraftdevs.entities.render;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.entities.mobs.GooseCanada;
import com.feathercraftdevs.entities.model.ModelGooseCanada;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGooseCanada extends RenderLiving<GooseCanada>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(FeatherCraftMain.MODID + ":textures/entity/canadagoose.png");
	
	public RenderGooseCanada(RenderManager manager) {
		super(manager, new ModelGooseCanada(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(GooseCanada entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(GooseCanada entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}