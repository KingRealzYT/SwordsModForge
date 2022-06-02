package dev.realz.swords.swordeffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.EnderPearlEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class HellBenderSword extends SwordItem {

    public HellBenderSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity entity, LivingEntity player) {
        entity.addEffect(new EffectInstance(Effects.POISON, 100, 2, false, false));
        return true;
    }

    @Override
    public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (playerIn.inventory.contains(new ItemStack(Items.ENDER_PEARL))) {
            if (!playerIn.getCooldowns().isOnCooldown(this)) {
                ThrowableEntity enderPearl = new EnderPearlEntity(worldIn, 0, 0, 0);
                enderPearl.setPos(playerIn.getX(), playerIn.getEyeY(), playerIn.getZ());
                enderPearl.shootFromRotation(playerIn, playerIn.xRot, playerIn.yRot, 0.0F, 1.5F, 1F);
                playerIn.level.addFreshEntity(enderPearl);
                enderPearl.setOwner(playerIn);
                PlayerInventory inv = playerIn.inventory;
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
