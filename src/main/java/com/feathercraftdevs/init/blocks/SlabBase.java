package com.feathercraftdevs.init.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.util.math.AxisAlignedBB;

public class SlabBase extends BlockFenceBase {

	public SlabBase(String name, Material material) {
		super(name, material);
	}
	
	@Override
    public AxisAlignedBB getBoundingBox(net.minecraft.block.state.IBlockState state, net.minecraft.world.IBlockAccess source, net.minecraft.util.math.BlockPos pos) {
        return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    };
}