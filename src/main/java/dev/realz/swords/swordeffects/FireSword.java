package dev.realz.swords.swordeffects;


import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import org.jetbrains.annotations.NotNull;

public class FireSword extends SwordItem {

    public FireSword(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    public boolean hurtEnemy(@NotNull ItemStack par1ItemStack, @NotNull LivingEntity pTarget, @NotNull LivingEntity pAttacker)
    {
        Player player2 = (Player) pAttacker;
        if (!player2.getCooldowns().isOnCooldown(this)) {
            pTarget.setSecondsOnFire(7);
            player2.getCooldowns().addCooldown(this, 600);
            return true;
        }
        return true;
    }
}
