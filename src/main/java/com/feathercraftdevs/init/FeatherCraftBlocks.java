package com.feathercraftdevs.init;

import java.util.ArrayList;
import java.util.List;

import com.feathercraftdevs.FeatherCraftMain;
import com.feathercraftdevs.init.blocks.WireFences;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = FeatherCraftMain.MODID)
public class FeatherCraftBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SHEEP_FENCE = new WireFences("sheep_fence", Material.ANVIL);
	public static final Block SHEEP_FENCE_HALF = new WireFences("sheep_fence_half", Material.ANVIL);
	public static final Block WIRE_MESH_FENCE_GREEN = new WireFences("wire_mesh_fence_green", Material.ANVIL);
	public static final Block WIRE_MESH_FENCE_GREEN_HALF = new WireFences("wire_mesh_fence_green_half", Material.ANVIL);
	public static final Block WIRE_MESH_FENCE_ZINC = new WireFences("wire_mesh_fence_zinc", Material.ANVIL);
	public static final Block WIRE_MESH_FENCE_ZINC_HALF = new WireFences("wire_mesh_fence_zinc_half", Material.ANVIL);
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Block> e) {
		e.getRegistry().registerAll(BLOCKS.toArray(new Block[BLOCKS.size()]));
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent e) {
		for (Block itm : BLOCKS) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(itm), 0, new ModelResourceLocation(itm.getRegistryName(), "inventory"));
		}
	}
}