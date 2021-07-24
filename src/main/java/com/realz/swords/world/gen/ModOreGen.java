package com.realz.swords.world.gen;

import com.realz.swords.init.ModBlocks;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModOreGen {

    public static void generateOres(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.BiomeCategory.NETHER) || event.getCategory().equals(Biome.BiomeCategory.THEEND))) {
            generateOre(event.getGeneration(), OreFeature.NATURAL_STONE,
                    ModBlocks.BLACK_IRON_ORE.get().defaultBlockState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeature.FillerBlockType.NATURAL_STONE,
                    ModBlocks.BLOOD_IRON_ORE.get().defaultBlockState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeature.FillerBlockType.NATURAL_STONE,
                    ModBlocks.CRIMSON_ORE.get().defaultBlockState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeature.FillerBlockType.NATURAL_STONE,
                    ModBlocks.COBALT_ORE.get().defaultBlockState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeature.FillerBlockType.NATURAL_STONE,
                    ModBlocks.SILVER_ORE.get().defaultBlockState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeature.FillerBlockType.NATURAL_STONE,
                    ModBlocks.BRUH_ORE.get().defaultBlockState(), 5, 15, 30, 10);
        }

        if (event.getCategory().equals(Biome.BiomeCategory.NETHER)) {
            generateOre(event.getGeneration(), OreFeature.FillerBlockType.NETHERRACK,
                    ModBlocks.FIRE_ORE.get().defaultBlockState(), 5, 0, 128, 10);
            generateOre(event.getGeneration(), OreFeature.FillerBlockType.NETHERRACK,
                    ModBlocks.HELL_IRON_ORE.get().defaultBlockState(), 5, 0, 128, 10);
        }

        if (event.getCategory().equals(Biome.BiomeCategory.THEEND)) {
            generateOre(event.getGeneration(), END_STONE,
                    ModBlocks.ENDER_ORE.get().defaultBlockState(), 5, 0, 105, 10);
        }
    }

    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state,
                                    int veinSize, int minHeight, int maxHeight, int amount) {
        settings.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreFeature(fillerType, state, veinSize))
                        .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .squared().count(amount));
    }

    public static final RuleTest END_STONE = new BlockMatchTest(Blocks.END_STONE);
}
