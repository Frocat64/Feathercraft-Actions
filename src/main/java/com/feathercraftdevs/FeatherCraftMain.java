package com.feathercraftdevs;

import com.feathercraftdevs.init.items.FeatherCraftItems;
import com.feathercraftdevs.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = FeatherCraftMain.MODID, name = FeatherCraftMain.NAME, version = FeatherCraftMain.VERSION)
public class FeatherCraftMain {

	public static final String MODID = "feathercraft";
	public static final String NAME = "Feathercraft for Animania";
	public static final String VERSION = "0.1.6";
	public static final String CLIENTPROXY = "com.feathercraftdevs.proxy.ClientProxy";
	public static final String SERVERPROXY = "com.feathercraftdevs.proxy.CommonProxy";
	public static final CreativeTabs feathercrafttab = new CreativeTabs("feathercrafttab") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack (FeatherCraftItems.DUCK_FEATHER);
		}
	};
	
	@Instance
	public static FeatherCraftMain instance;

	@SidedProxy(clientSide = FeatherCraftMain.CLIENTPROXY, serverSide = FeatherCraftMain.SERVERPROXY)
	public static CommonProxy proxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		proxy.registerRenders();
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}