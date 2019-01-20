package com.feathercraftdevs.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SHEEP_FENCE = new WireFences("sheep_fence", Material.ANVIL);
	public static final Block SHEEP_FENCE_HALF = new WireFences("sheep_fence_half", Material.ANVIL);
	public static final Block WIRE_MESH_FENCE_GREEN = new WireFences("wire_mesh_fence_green", Material.ANVIL);
	public static final Block WIRE_MESH_FENCE_GREEN_HALF = new WireFences("wire_mesh_fence_green_half", Material.ANVIL);
	public static final Block WIRE_MESH_FENCE_ZINC = new WireFences("wire_mesh_fence_zinc", Material.ANVIL);
	public static final Block WIRE_MESH_FENCE_ZINC_HALF = new WireFences("wire_mesh_fence_zinc_half", Material.ANVIL);
}