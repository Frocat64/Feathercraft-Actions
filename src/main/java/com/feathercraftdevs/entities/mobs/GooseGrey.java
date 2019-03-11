package com.feathercraftdevs.entities.mobs;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;

public class GooseGrey extends EntityChicken {

	public GooseGrey(World worldIn) {
		super(worldIn);
	}
	
	@Override
	public EntityChicken createChild(EntityAgeable ageable) {
		return new GooseGrey(world);
	}
}