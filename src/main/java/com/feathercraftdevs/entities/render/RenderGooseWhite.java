package com.feathercraftdevs.entities.render;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.entities.mobs.GooseWhite;
import com.feathercraftdevs.entities.model.ModelGooseWhite;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGooseWhite extends RenderLiving<GooseWhite>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(FeatherCraftMain.MODID + ":textures/entity/whitegoose.png");
	
	public RenderGooseWhite(RenderManager manager) {
		super(manager, new ModelGooseWhite(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(GooseWhite entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(GooseWhite entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}