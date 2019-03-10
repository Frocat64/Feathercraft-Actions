package com.feathercraftdevs.proxy;

import com.feathercraftdevs.entities.mobs.DuckWood;
import com.feathercraftdevs.entities.render.RenderDuckWood;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(DuckWood.class, new IRenderFactory<DuckWood>() {

			@Override
			public Render<? super DuckWood> createRenderFor(RenderManager manager) {
				return new RenderDuckWood(manager);
			}
		});
	}
}