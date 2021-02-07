package com.kingrealzyt.swords.swordeffects;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;

public class HolySword extends SwordItem {

    public HolySword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
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
        entity.addPotionEffect(new EffectInstance(Effects.POISON, 100, 1, false, false));
        if (!Minecraft.getInstance().player.getCooldownTracker().hasCooldown(this)) {
            LightningBoltEntity lightning = EntityType.LIGHTNING_BOLT.create(player.world);
            lightning.setPosition(entity.getPosX(), entity.getPosY(), entity.getPosZ());
            player.world.addEntity(lightning);
            assert Minecraft.getInstance().player != null;
            Minecraft.getInstance().player.getCooldownTracker().setCooldown(this, 400);
            ActionResult.resultSuccess(Minecraft.getInstance().player.getHeldItem(player.getActiveHand()));
            return true;
        }
        return true;
    }
}
