package com.kingrealzyt.swords.items;

import com.kingrealzyt.swords.Swords;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;

public class IngotBase extends Item {

    public IngotBase() {
        super(new Item.Properties().tab(Swords.INGOTTAB));
    }
}
