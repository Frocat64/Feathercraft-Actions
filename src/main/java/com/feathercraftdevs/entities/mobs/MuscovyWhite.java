package com.feathercraftdevs.entities.mobs;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;

public class MuscovyWhite extends EntityChicken {

	public MuscovyWhite(World worldIn) {
		super(worldIn);
	}
	
	@Override
	public EntityChicken createChild(EntityAgeable ageable) {
		return new MuscovyWhite(world);
	}
}