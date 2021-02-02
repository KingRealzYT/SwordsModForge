package com.kingrealzyt.swords.items;

import com.kingrealzyt.swords.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static java.lang.Math.random;

public class SwordsEffects {
    @SubscribeEvent
    public static void swordEffects(LivingHurtEvent event) {
        if (event.getEntity().isLiving()) {
            if (random() < 0.5) {
            }
        }
    }
}
