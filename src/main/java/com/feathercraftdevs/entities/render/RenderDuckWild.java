package com.feathercraftdevs.entities.render;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.entities.mobs.DuckWild;
import com.feathercraftdevs.entities.model.ModelDuckWild;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDuckWild extends RenderLiving<DuckWild>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(FeatherCraftMain.MODID + ":textures/entity/wildduck.png");
	
	public RenderDuckWild(RenderManager manager) {
		super(manager, new ModelDuckWild(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(DuckWild entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(DuckWild entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}