package com.feathercraftdevs.main;

import com.feathercraftdevs.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FeathercraftTab extends CreativeTabs {

	public FeathercraftTab(String label) {
		super("feathercrafttab");
	}

	public ItemStack getTabIconItem() {
		return new ItemStack (ModItems.DUCK_FEATHER);
	}
}