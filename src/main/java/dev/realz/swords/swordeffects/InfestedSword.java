package dev.realz.swords.swordeffects;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class InfestedSword extends SwordItem {

    public InfestedSword(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity entity, LivingEntity player) {
        Player player2 = (Player) player;
        if (!player2.getCooldowns().isOnCooldown(this)) {
            LightningBolt lightning = EntityType.LIGHTNING_BOLT.create(player.level());
            lightning.setPos(entity.getX(), entity.getY(), entity.getZ());
            player.level().addFreshEntity(lightning);
            player2.getCooldowns().addCooldown(this, 200);
            return true;
        }
        return true;
    }

}
