package com.feathercraftdevs.init.items;

import java.util.ArrayList;
import java.util.List;

import com.feathercraftdevs.FeatherCraftMain;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = FeatherCraftMain.MODID)
public class FeatherCraftItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item COOKED_DUCK_MEAT = new FoodBase("cooked_duck_meat", 6, 12F, true);
	public static final Item COOKED_GOOSE_MEAT = new FoodBase("cooked_goose_meat", 6, 12F, true);
	public static final Item PRIME_COOKED_DUCK_MEAT = new FoodEffectBase("cooked_prime_duck_meat", 10, 12F, true, new PotionEffect(MobEffects.REGENERATION, (60*20)/6, 0, false, false));
	public static final Item PRIME_COOKED_GOOSE_MEAT = new FoodEffectBase("cooked_prime_goose_meat", 10, 12F, true, new PotionEffect(MobEffects.WATER_BREATHING, (60*20)/6, 0, false, false));
	public static final Item DUCK_EGG = new ItemBase("duck_egg");
	public static final Item DUCK_FEATHER = new ItemBase("duck_feather");
	public static final Item DUCK_MEAT = new FoodBase("duck_meat", 4, 12F, true);
	public static final Item GOOSE_EGG = new ItemBase("goose_egg");
	public static final Item GOOSE_FEATHER = new ItemBase("goose_feather");
	public static final Item GOOSE_MEAT = new FoodBase("goose_meat", 4, 12F, true);
	public static final Item GROWUP_FEED = new ItemBase("growup_feed");
	public static final Item PRIME_DUCK_MEAT = new FoodBase("prime_duck_meat", 6, 12F, true);
	public static final Item PRIME_GOOSE_MEAT = new FoodBase("prime_goose_meat", 6, 12F, true);
	public static final Item SUNFLOWER_SEEDS = new ItemBase("sunflower_seeds");
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> e) {
		e.getRegistry().registerAll(ITEMS.toArray(new Item[ITEMS.size()]));
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent e) {
		for (Item itm : ITEMS) {
			ModelLoader.setCustomModelResourceLocation(itm, 0, new ModelResourceLocation(itm.getRegistryName(), "inventory"));
		}
	}
}