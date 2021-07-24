package com.realz.swords.swordeffects;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.WorldGenLevel;

public class HolySword extends SwordItem {

    public HolySword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity entity, LivingEntity player) {
        entity.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 100, 1, false, false));
        entity.addEffect(new EffectInstance(Effects.WEAKNESS, 100, 1, false, false));
        entity.setSecondsOnFire(2);
        entity.addEffect(new EffectInstance(Effects.POISON, 100, 1, false, false));
        if (!Minecraft.getInstance().player.getCooldowns().isOnCooldown(this)) {
            LightningBoltEntity lightning = EntityType.LIGHTNING_BOLT.create(player.level);
            lightning.setPos(entity.getX(), entity.getY(), entity.getZ());
            player.level.addFreshEntity(lightning);
            assert Minecraft.getInstance().player != null;
            Minecraft.getInstance().player.getCooldowns().addCooldown(this, 400);
            ActionResult.success(Minecraft.getInstance().player.getItemInHand(player.getUsedItemHand()));
            return true;
        }
        return true;
    }

    @Override
    public ActionResult<ItemStack> use(WorldGenLevel worldIn, Player playerIn, Hand handIn) {
        if (playerIn.getInventory().contains(new ItemStack(Items.ENDER_PEARL))) {
            if (!playerIn.getCooldowns().isOnCooldown(this)) {
                ThrowableProjectile enderPearl = new EnderPearlEntity(worldIn, 0, 0, 0);
                enderPearl.setPos(playerIn.getX(), playerIn.getEyeY(), playerIn.getZ());
                enderPearl.shootFromRotation(playerIn, playerIn.xRotO, playerIn.yRotO, 0.0F, 1.5F, 1F);
                playerIn.level.addFreshEntity(enderPearl);
                enderPearl.setOwner(playerIn);
                PlayerInventory inv = playerIn.;
                if (!playerIn.isCreative()) {
                    for (int i = 0; i < inv.getContainerSize(); i++) {
                        if (inv.getItem(i).getItem().equals(Items.ENDER_PEARL)) {
                            inv.removeItem(i, 1);
                        }
                    }
                }
                playerIn.getCooldowns().addCooldown(this, 60);
                return ActionResult.success(playerIn.getItemInHand(handIn));
            }
        }
        return ActionResult.fail(playerIn.getItemInHand(handIn));
    }
}
