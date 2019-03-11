package com.feathercraftdevs.entities.mobs;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;

public class MuscovyBlackWhite extends EntityChicken {

	public MuscovyBlackWhite(World worldIn) {
		super(worldIn);
	}
	
	@Override
	public EntityChicken createChild(EntityAgeable ageable) {
		return new MuscovyBlackWhite(world);
	}
}