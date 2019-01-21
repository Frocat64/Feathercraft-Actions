package com.feathercraftdevs.init.items;

import com.feathercraftdevs.FeatherCraftMain;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood {
	
	public FoodBase(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FeatherCraftMain.feathercrafttab);
		
		FeatherCraftItems.ITEMS.add(this);
	}
}