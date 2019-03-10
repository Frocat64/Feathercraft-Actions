package com.feathercraftdevs.init;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.entities.MobRefStrings;
import com.feathercraftdevs.entities.mobs.DuckWood;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

	public static void registerEntities() {
		registerEntity("wood_duck", DuckWood.class, MobRefStrings.ENTITY_WOOD_DUCK, 15, 4992771, 000000);
	}
	
	public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(FeatherCraftMain.MODID + ":" + name), entity, name, id, FeatherCraftMain.instance, range, 1, true, color1, color2);
	}
}