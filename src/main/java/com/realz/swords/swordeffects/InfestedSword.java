package com.realz.swords.swordeffects;

import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class InfestedSword extends SwordItem {

    public InfestedSword(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity entity, LivingEntity player) {
        entity.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 1, false, false));
        assert Minecraft.getInstance().player != null;
        if (!Minecraft.getInstance().player.getCooldowns().isOnCooldown(this)) {
            LightningBolt lightning = EntityType.LIGHTNING_BOLT.create(player.level);
            lightning.setPos(entity.getX(), entity.getY(), entity.getZ());
            player.level.addFreshEntity(lightning);
            assert Minecraft.getInstance().player != null;
            Minecraft.getInstance().player.getCooldowns().addCooldown(this, 200);
            InteractionResultHolder.success(Minecraft.getInstance().player.getItemInHand(player.getUsedItemHand()));
            return true;
        }
        InteractionResultHolder.fail(Minecraft.getInstance().player.getItemInHand(player.getUsedItemHand()));
        return true;
    }
}
