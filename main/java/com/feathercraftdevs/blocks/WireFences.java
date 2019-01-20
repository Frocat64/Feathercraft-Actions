package com.feathercraftdevs.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WireFences extends BlockFenceBase {

	public WireFences(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(0.5F);
		setResistance(1.0F);
		setHarvestLevel("pickaxe", 0);
		setLightOpacity(1);
	}
}