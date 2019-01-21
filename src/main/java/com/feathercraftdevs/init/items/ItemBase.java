package com.feathercraftdevs.init.items;

import com.feathercraftdevs.FeatherCraftMain;

import net.minecraft.item.Item;

public class ItemBase extends Item {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FeatherCraftMain.feathercrafttab);
		
		FeatherCraftItems.ITEMS.add(this);
	}
	
}