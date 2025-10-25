package dev.realz.swords.swordeffects;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import org.jetbrains.annotations.NotNull;

public class BlackIronSword extends SwordItem {

    public BlackIronSword(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack stack, @NotNull LivingEntity entity, @NotNull LivingEntity player) {
        Player player2 = (Player) player;
        if (!player2.getCooldowns().isOnCooldown(this)) {
            entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 5, false, false));
           player2.getCooldowns().addCooldown(this, 200);
            return true;
        }
        return true;
    }
}
