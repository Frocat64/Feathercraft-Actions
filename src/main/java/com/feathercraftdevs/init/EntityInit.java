package com.feathercraftdevs.init;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.entities.MobRefStrings;
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

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

	public static void registerEntities() {
		//DUCKS
		registerEntity("king_eider_duck", DuckKingEider.class, MobRefStrings.ENTITY_KING_EIDER_DUCK, 15, 4992771, 12977927);
		registerEntity("pekin_duck", DuckPekin.class, MobRefStrings.ENTITY_PEKIN_DUCK, 15, 16777215, 16775024);
		registerEntity("wild_duck", DuckWild.class, MobRefStrings.ENTITY_WILD_DUCK, 15, 87574, 4992771);
		registerEntity("wood_duck", DuckWood.class, MobRefStrings.ENTITY_WOOD_DUCK, 15, 4992771, 000000);
		//GEESE
		registerEntity("canada_goose", GooseCanada.class, MobRefStrings.ENTITY_CANADA_GOOSE, 15, 000000, 2979524);
		registerEntity("chinese_goose", GooseChinese.class, MobRefStrings.ENTITY_CHINESE_GOOSE, 15, 13422284, 2979524);
		registerEntity("grey_goose", GooseGrey.class, MobRefStrings.ENTITY_GREY_GOOSE, 15, 8026746, 2979524);
		registerEntity("white_goose", GooseWhite.class, MobRefStrings.ENTITY_WHITE_GOOSE, 15, 16777215, 2979524);
		//MUSCOVYS
		registerEntity("black_white_muscovy", MuscovyBlackWhite.class, MobRefStrings.ENTITY_BLACK_WHITE_MUSCOVY, 15, 13422284, 000000);
		registerEntity("brown_white_muscovy", MuscovyBrownWhite.class, MobRefStrings.ENTITY_BROWN_WHITE_MUSCOVY, 15, 13422284, 4992771);
		registerEntity("grey_muscovy", MuscovyGrey.class, MobRefStrings.ENTITY_GREY_MUSCOVY, 15, 13422284, 8026746);
		registerEntity("white_muscovy", MuscovyWhite.class, MobRefStrings.ENTITY_WHITE_MUSCOVY, 15, 13422284, 16777215);
	}
	
	public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(FeatherCraftMain.MODID + ":" + name), entity, name, id, FeatherCraftMain.instance, range, 1, true, color1, color2);
	}
}