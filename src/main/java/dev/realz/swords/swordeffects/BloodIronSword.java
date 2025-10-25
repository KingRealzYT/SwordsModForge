package dev.realz.swords.swordeffects;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import org.jetbrains.annotations.NotNull;

public class BloodIronSword extends SwordItem {

    public BloodIronSword(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack stack, @NotNull LivingEntity entity, @NotNull LivingEntity player) {
        Player player2 = (Player) player;
        if (!player2.getCooldowns().isOnCooldown(this)) {
            entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 2, false, false));
            player2.getCooldowns().addCooldown(this, 300);
            return true;
        }
        return true;
    }
}
