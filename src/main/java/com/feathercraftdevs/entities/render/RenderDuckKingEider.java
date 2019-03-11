package com.feathercraftdevs.entities.render;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.entities.mobs.DuckKingEider;
import com.feathercraftdevs.entities.model.ModelDuckKingEider;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDuckKingEider extends RenderLiving<DuckKingEider>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(FeatherCraftMain.MODID + ":textures/entity/kingeiderduck.png");
	
	public RenderDuckKingEider(RenderManager manager) {
		super(manager, new ModelDuckKingEider(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(DuckKingEider entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(DuckKingEider entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}