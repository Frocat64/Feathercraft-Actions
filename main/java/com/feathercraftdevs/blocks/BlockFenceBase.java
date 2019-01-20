package com.feathercraftdevs.blocks;

import com.feathercraftdevs.items.ModItems;
import com.feathercraftdevs.main.IHasModel;
import com.feathercraftdevs.main.Main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockFenceBase extends BlockPane implements IHasModel {
	
	public BlockFenceBase(String name, Material material) {
		super(material, true);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.feathercrafttab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}