package com.feathercraftdevs.entities.render;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.entities.mobs.DuckWood;
import com.feathercraftdevs.entities.model.ModelDuckWood;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDuckWood extends RenderLiving<DuckWood>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(FeatherCraftMain.MODID + ":textures/entity/woodduck.png");
	
	public RenderDuckWood(RenderManager manager) {
		super(manager, new ModelDuckWood(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(DuckWood entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(DuckWood entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}