package com.feathercraftdevs.entities.render;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.entities.mobs.GooseGrey;
import com.feathercraftdevs.entities.model.ModelGooseGrey;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGooseGrey extends RenderLiving<GooseGrey>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(FeatherCraftMain.MODID + ":textures/entity/greygoose.png");
	
	public RenderGooseGrey(RenderManager manager) {
		super(manager, new ModelGooseGrey(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(GooseGrey entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(GooseGrey entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}