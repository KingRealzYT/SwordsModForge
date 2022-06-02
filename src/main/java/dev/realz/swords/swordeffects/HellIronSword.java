package dev.realz.swords.swordeffects;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class HellIronSword extends SwordItem {

    public HellIronSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    public boolean hasEffect(ItemStack itemstack) {
        return true;
    }
}
