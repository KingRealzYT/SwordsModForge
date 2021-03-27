package com.kingrealzyt.swords.swordeffects;

import com.kingrealzyt.swords.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.EnderPearlEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;;

public class EnderSword extends SwordItem {


    public EnderSword(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
        super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
    }

    @Override
    public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getItemInHand(Hand.MAIN_HAND);
        if (playerIn.inventory.items.contains(Items.ENDER_PEARL)) {
            EnderPearlEntity e = EntityType.ENDER_PEARL.create(worldIn);
            e.getOwner();
            worldIn.playSound((PlayerEntity)null, playerIn.getX(), playerIn.getY(), playerIn.getZ(), SoundEvents.ENDER_PEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
            playerIn.getCooldowns().addCooldown(this, 20);
            if (!playerIn.level.isClientSide) {
                EnderPearlEntity enderpearlentity = new EnderPearlEntity(worldIn, playerIn);
                enderpearlentity.setItem(itemstack);
                enderpearlentity.shootFromRotation(playerIn, playerIn.xRot, playerIn.yRot, 0.0F, 1.5F, 1.0F);
                playerIn.level.addFreshEntity(enderpearlentity);
            }

            playerIn.awardStat(Stats.ITEM_USED.get(this));
            if (!playerIn.abilities.instabuild) {
                itemstack.shrink(1);
            }
        }
        return ActionResult.sidedSuccess(itemstack, playerIn.level.isClientSide());
    }
}
