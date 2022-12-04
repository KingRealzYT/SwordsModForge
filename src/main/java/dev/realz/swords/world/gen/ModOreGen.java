package dev.realz.swords.world.gen;

import dev.realz.swords.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGen {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.BLACK_IRON_ORE_PLACED);
        base.add(ModPlacedFeatures.BLOOD_IRON_ORE_PLACED);
        base.add(ModPlacedFeatures.CRIMSON_ORE);
        base.add(ModPlacedFeatures.COBALT_ORE);
        base.add(ModPlacedFeatures.SILVER_ORE);
        base.add(ModPlacedFeatures.BRUH_ORE);


        if (event.getCategory() == Biome.BiomeCategory.NETHER) {
            base.add(ModPlacedFeatures.FIRE_ORE);
            base.add(ModPlacedFeatures.HELL_IRON_ORE);
        }

        if (event.getCategory() == Biome.BiomeCategory.THEEND) {
            base.add(ModPlacedFeatures.ENDER_ORE);
        }
    }
}
