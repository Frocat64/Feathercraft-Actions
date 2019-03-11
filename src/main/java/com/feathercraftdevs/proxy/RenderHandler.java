package com.feathercraftdevs.proxy;

import com.feathercraftdevs.entities.mobs.DuckKingEider;
import com.feathercraftdevs.entities.mobs.DuckPekin;
import com.feathercraftdevs.entities.mobs.DuckWild;
import com.feathercraftdevs.entities.mobs.DuckWood;
import com.feathercraftdevs.entities.mobs.GooseCanada;
import com.feathercraftdevs.entities.mobs.GooseChinese;
import com.feathercraftdevs.entities.mobs.GooseGrey;
import com.feathercraftdevs.entities.mobs.GooseWhite;
import com.feathercraftdevs.entities.mobs.MuscovyBlackWhite;
import com.feathercraftdevs.entities.mobs.MuscovyBrownWhite;
import com.feathercraftdevs.entities.mobs.MuscovyGrey;
import com.feathercraftdevs.entities.mobs.MuscovyWhite;
import com.feathercraftdevs.entities.render.RenderDuckKingEider;
import com.feathercraftdevs.entities.render.RenderDuckPekin;
import com.feathercraftdevs.entities.render.RenderDuckWild;
import com.feathercraftdevs.entities.render.RenderDuckWood;
import com.feathercraftdevs.entities.render.RenderGooseCanada;
import com.feathercraftdevs.entities.render.RenderGooseChinese;
import com.feathercraftdevs.entities.render.RenderGooseGrey;
import com.feathercraftdevs.entities.render.RenderGooseWhite;
import com.feathercraftdevs.entities.render.RenderMuscovyBlackWhite;
import com.feathercraftdevs.entities.render.RenderMuscovyBrownWhite;
import com.feathercraftdevs.entities.render.RenderMuscovyGrey;
import com.feathercraftdevs.entities.render.RenderMuscovyWhite;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

	public static void registerEntityRenders() {
		registerDuckKingEider();
		registerDuckPekin();
		registerDuckWild();
		registerDuckWood();
		registerGooseCanada();
		registerGooseChinese();
		registerGooseGrey();
		registerGooseWhite();
		registerMuscovyBlackWhite();
		registerMuscovyBrownWhite();
		registerMuscovyGrey();
		registerMuscovyWhite();
	}
	
	public static void registerDuckKingEider() {
		RenderingRegistry.registerEntityRenderingHandler(DuckKingEider.class, new IRenderFactory<DuckKingEider>() {

			@Override
			public Render<? super DuckKingEider> createRenderFor(RenderManager manager) {
				return new RenderDuckKingEider(manager);
			}
		});
	}
	
	public static void registerDuckPekin() {
		RenderingRegistry.registerEntityRenderingHandler(DuckPekin.class, new IRenderFactory<DuckPekin>() {

			@Override
			public Render<? super DuckPekin> createRenderFor(RenderManager manager) {
				return new RenderDuckPekin(manager);
			}
		});
	}
	
	public static void registerDuckWild() {
		RenderingRegistry.registerEntityRenderingHandler(DuckWild.class, new IRenderFactory<DuckWild>() {

			@Override
			public Render<? super DuckWild> createRenderFor(RenderManager manager) {
				return new RenderDuckWild(manager);
			}
		});
	}
	
	public static void registerDuckWood() {
		RenderingRegistry.registerEntityRenderingHandler(DuckWood.class, new IRenderFactory<DuckWood>() {

			@Override
			public Render<? super DuckWood> createRenderFor(RenderManager manager) {
				return new RenderDuckWood(manager);
			}
		});
	}
	
	public static void registerGooseCanada() {
		RenderingRegistry.registerEntityRenderingHandler(GooseCanada.class, new IRenderFactory<GooseCanada>() {

			@Override
			public Render<? super GooseCanada> createRenderFor(RenderManager manager) {
				return new RenderGooseCanada(manager);
			}
		});
	}
	
	public static void registerGooseChinese() {
		RenderingRegistry.registerEntityRenderingHandler(GooseChinese.class, new IRenderFactory<GooseChinese>() {

			@Override
			public Render<? super GooseChinese> createRenderFor(RenderManager manager) {
				return new RenderGooseChinese(manager);
			}
		});
	}
	
	public static void registerGooseGrey() {
		RenderingRegistry.registerEntityRenderingHandler(GooseGrey.class, new IRenderFactory<GooseGrey>() {

			@Override
			public Render<? super GooseGrey> createRenderFor(RenderManager manager) {
				return new RenderGooseGrey(manager);
			}
		});
	}
	
	public static void registerGooseWhite() {
		RenderingRegistry.registerEntityRenderingHandler(GooseWhite.class, new IRenderFactory<GooseWhite>() {

			@Override
			public Render<? super GooseWhite> createRenderFor(RenderManager manager) {
				return new RenderGooseWhite(manager);
			}
		});
	}
	
	public static void registerMuscovyBlackWhite() {
		RenderingRegistry.registerEntityRenderingHandler(MuscovyBlackWhite.class, new IRenderFactory<MuscovyBlackWhite>() {

			@Override
			public Render<? super MuscovyBlackWhite> createRenderFor(RenderManager manager) {
				return new RenderMuscovyBlackWhite(manager);
			}
		});
	}
	
	public static void registerMuscovyBrownWhite() {
		RenderingRegistry.registerEntityRenderingHandler(MuscovyBrownWhite.class, new IRenderFactory<MuscovyBrownWhite>() {

			@Override
			public Render<? super MuscovyBrownWhite> createRenderFor(RenderManager manager) {
				return new RenderMuscovyBrownWhite(manager);
			}
		});
	}
	
	public static void registerMuscovyGrey() {
		RenderingRegistry.registerEntityRenderingHandler(MuscovyGrey.class, new IRenderFactory<MuscovyGrey>() {

			@Override
			public Render<? super MuscovyGrey> createRenderFor(RenderManager manager) {
				return new RenderMuscovyGrey(manager);
			}
		});
	}
	
	public static void registerMuscovyWhite() {
		RenderingRegistry.registerEntityRenderingHandler(MuscovyWhite.class, new IRenderFactory<MuscovyWhite>() {

			@Override
			public Render<? super MuscovyWhite> createRenderFor(RenderManager manager) {
				return new RenderMuscovyWhite(manager);
			}
		});
	}
}