package com.feathercraftdevs;

import com.feathercraftdevs.init.FeatherCraftItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FeathercraftTab extends CreativeTabs {

	public FeathercraftTab(String label) {
		super("feathercrafttab");
	}

	public ItemStack getTabIconItem() {
		return new ItemStack (FeatherCraftItems.DUCK_FEATHER);
	}
}