package com.kingrealzyt.swords.swordeffects;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class CobaltSword extends SwordItem {

    public CobaltSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity entity, LivingEntity player) {
        if (!Minecraft.getInstance().player.getCooldowns().isOnCooldown(this)) {
            LightningBoltEntity lightning = EntityType.LIGHTNING_BOLT.create(player.level);
            lightning.setPos(entity.getX(), entity.getY(), entity.getZ());
            player.level.addFreshEntity(lightning);
            assert Minecraft.getInstance().player != null;
            Minecraft.getInstance().player.getCooldowns().addCooldown(this, 200);
            ActionResult.success(Minecraft.getInstance().player.getItemInHand(player.getUsedItemHand()));
            return true;
        }
        ActionResult.fail(Minecraft.getInstance().player.getItemInHand(player.getUsedItemHand()));
        return true;
    }
}
