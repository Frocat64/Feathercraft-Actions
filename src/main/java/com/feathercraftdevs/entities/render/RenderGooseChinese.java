package com.feathercraftdevs.entities.render;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.entities.mobs.GooseChinese;
import com.feathercraftdevs.entities.model.ModelGooseChinese;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGooseChinese extends RenderLiving<GooseChinese>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(FeatherCraftMain.MODID + ":textures/entity/chinesegoose.png");
	
	public RenderGooseChinese(RenderManager manager) {
		super(manager, new ModelGooseChinese(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(GooseChinese entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(GooseChinese entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}