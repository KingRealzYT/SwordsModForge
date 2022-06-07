package dev.realz.swords.util.enums;

import dev.realz.swords.init.ModItems;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements Tier {

    BLACK_IRON(3, 1500, 7.0F, 6, 11, () -> {
        return Ingredient.of(ModItems.BLACK_IRON_INGOT.get());
    }),
    BLOOD_IRON(3, 1500, 7.0F, 6, 11, () -> {
        return Ingredient.of(ModItems.BLOOD_IRON_INGOT.get());
    }),
    FIRE(3, 1800, 7.0F, 7, 12, () -> {
        return Ingredient.of(ModItems.FIRE_INGOT.get());
    }),
    CRIMSON(3, 1600, 7.0F, 6, 11, () -> {
        return Ingredient.of(ModItems.CRIMSON_INGOT.get());
    }),
    COBALT(3, 1600, 7.0F, 6, 11, () -> {
        return Ingredient.of(ModItems.COBALT_INGOT.get());
    }),
    SILVER(3, 1500, 7.0F, 6, 11, () -> {
        return Ingredient.of(ModItems.SILVER_INGOT.get());
    }),
    BRUH(3, 1800, 7.0F, 6.5F, 12, () -> {
        return Ingredient.of(ModItems.BRUH_INGOT.get());
    }),
    HELL(3, 1800, 7.0F, 7, 12, () -> {
        return Ingredient.of(ModItems.HELL_IRON_INGOT.get());
    }),

    ENDER(3, 2000, 7.0F, 9, 13, () -> {
        return Ingredient.of(ModItems.ENDER_INGOT.get());
    }),

    VAMPRIC(3, 2200, 7.0F, 10, 15, () -> {
        return Ingredient.of(ModItems.VAMPIRIC_SWORD.get());
    });

    /*INFESTED(3, 2400, 7.0F, 11, 16, () -> {
        return Ingredient.of(ModItems.INFESTED_SWORD.get());
    }),*/

    /*HELL_BENDER(3, 2600, 7.0F, 12, 17, () -> {
        return Ingredient.of(ModItems.HELL_BENDER_SWORD.get());
    }),*/

    /*HOLY(3, 3000, 7.0F, 13, 18, () -> {
        return Ingredient.of(ModItems.HOLY_SWORD.get());
    });*/


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return 0;
    }

    @Override
    public float getSpeed() {
        return 0;
    }

    @Override
    public float getAttackDamageBonus() {
        return 0;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
