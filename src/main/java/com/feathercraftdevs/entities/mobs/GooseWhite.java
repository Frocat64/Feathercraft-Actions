package com.feathercraftdevs.entities.mobs;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;

public class GooseWhite extends EntityChicken {

	public GooseWhite(World worldIn) {
		super(worldIn);
	}
	
	@Override
	public EntityChicken createChild(EntityAgeable ageable) {
		return new GooseWhite(world);
	}
}