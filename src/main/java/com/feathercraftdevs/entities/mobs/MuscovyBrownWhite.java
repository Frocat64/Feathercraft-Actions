package com.feathercraftdevs.entities.mobs;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;

public class MuscovyBrownWhite extends EntityChicken {

	public MuscovyBrownWhite(World worldIn) {
		super(worldIn);
		this.setSize(0.8F, 0.95F);
	}
	
		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
			this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.1875D);
		}
		
		public float getEyeHeight() {
			return 0.8F;
		}
	
	@Override
	public EntityChicken createChild(EntityAgeable ageable) {
		return new MuscovyBrownWhite(world);
	}
}