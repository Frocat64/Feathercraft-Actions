package com.feathercraftdevs.init.blocks;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.init.items.FeatherCraftItems;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockFenceBase extends BlockPane {
	
	public BlockFenceBase(String name, Material material) {
		super(material, true);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FeatherCraftMain.feathercrafttab);
		
		FeatherCraftBlocks.BLOCKS.add(this);
		FeatherCraftItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
}