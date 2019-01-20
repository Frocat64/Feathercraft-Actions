package com.feathercraftdevs.items;

import com.feathercraftdevs.main.FeathercraftTab;
import com.feathercraftdevs.main.IHasModel;
import com.feathercraftdevs.main.Main;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.feathercrafttab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}