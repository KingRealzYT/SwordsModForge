package dev.realz.swords.swordeffects;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class EnderSword extends SwordItem {
    public EnderSword(Tier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
        super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
        if (playerIn.getInventory().findSlotMatchingItem(new ItemStack(Items.ENDER_PEARL)) != -1) {
            if (!playerIn.getCooldowns().isOnCooldown(this)) {
                ThrownEnderpearl enderPearl = new ThrownEnderpearl(worldIn, playerIn);
                enderPearl.setPos(playerIn.getX(), playerIn.getEyeY(), playerIn.getZ());
                enderPearl.shootFromRotation(playerIn, playerIn.getXRot(), playerIn.getYHeadRot(), 0.0F, 1.5F, 1F);
                playerIn.level.addFreshEntity(enderPearl);
                enderPearl.setOwner(playerIn);
                Inventory inv = playerIn.getInventory();
                if (!playerIn.isCreative()) {
                    for (int i = 0; i < inv.getContainerSize(); i++) {
                        if (inv.getItem(i).getItem().equals(Items.ENDER_PEARL)) {
                            inv.removeItem(i, 1);
                        }
                    }
                }
                playerIn.getCooldowns().addCooldown(this, 60);
                return InteractionResultHolder.success(playerIn.getItemInHand(handIn));
            }
        }
        return InteractionResultHolder.fail(playerIn.getItemInHand(handIn));
    }
}
