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
    public boolean hasEffect(ItemStack itemstack) {
        return true;
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity entity, LivingEntity player) {
        if (!Minecraft.getInstance().player.getCooldownTracker().hasCooldown(this)) {
            LightningBoltEntity lightning = EntityType.LIGHTNING_BOLT.create(player.world);
            lightning.setPosition(entity.getPosX(), entity.getPosY(), entity.getPosZ());
            player.world.addEntity(lightning);
            assert Minecraft.getInstance().player != null;
            Minecraft.getInstance().player.getCooldownTracker().setCooldown(this, 200);
            ActionResult.resultSuccess(Minecraft.getInstance().player.getHeldItem(player.getActiveHand()));
            return true;
        }
        ActionResult.resultFail(Minecraft.getInstance().player.getHeldItem(player.getActiveHand()));
        return true;
    }
}
