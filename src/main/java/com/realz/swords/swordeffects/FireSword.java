package com.realz.swords.swordeffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class FireSword extends SwordItem {

    public FireSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    public boolean hurtEnemy(ItemStack par1ItemStack, LivingEntity par2EntityLiving, LivingEntity par3EntityLiving)
    {
        par2EntityLiving.setSecondsOnFire(3);
        return true;
    }
}
