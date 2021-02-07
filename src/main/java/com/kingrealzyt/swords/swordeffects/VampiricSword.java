package com.kingrealzyt.swords.swordeffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class VampiricSword extends SwordItem {

    public VampiricSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean hasEffect(ItemStack itemstack) {
        return true;
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity entity, LivingEntity player) {
        entity.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 100, 1, false, false));
        entity.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 100, 1, false, false));
        entity.setFire(2);
        return true;
    }
}
