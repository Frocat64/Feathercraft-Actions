package com.feathercraftdevs.entities.render;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.entities.mobs.DuckPekin;
import com.feathercraftdevs.entities.model.ModelDuckPekin;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDuckPekin extends RenderLiving<DuckPekin>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(FeatherCraftMain.MODID + ":textures/entity/pekinduck.png");
	
	public RenderDuckPekin(RenderManager manager) {
		super(manager, new ModelDuckPekin(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(DuckPekin entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(DuckPekin entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}