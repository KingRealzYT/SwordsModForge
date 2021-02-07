package com.kingrealzyt.swords.swordeffects;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class FireSword extends SwordItem {

    public FireSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean hasEffect(ItemStack itemstack) {
        return true;
    }

    public boolean hitEntity(ItemStack par1ItemStack, LivingEntity par2EntityLiving, LivingEntity par3EntityLiving)
    {
        par2EntityLiving.setFire(3);
        return true;
    }
}
