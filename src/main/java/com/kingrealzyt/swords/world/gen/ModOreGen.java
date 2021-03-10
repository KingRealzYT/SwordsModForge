package com.kingrealzyt.swords.world.gen;

import com.kingrealzyt.swords.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModOreGen {

    public static void generateOres(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.BLACK_IRON_ORE.get().defaultBlockState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.BLOOD_IRON_ORE.get().defaultBlockState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.CRIMSON_ORE.get().defaultBlockState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.COBALT_ORE.get().defaultBlockState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.SILVER_ORE.get().defaultBlockState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.BRUH_ORE.get().defaultBlockState(), 5, 15, 30, 10);
        }

        if (event.getCategory().equals(Biome.Category.NETHER)) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK,
                    ModBlocks.FIRE_ORE.get().defaultBlockState(), 5, 0, 128, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK,
                    ModBlocks.HELL_IRON_ORE.get().defaultBlockState(), 5, 0, 128, 10);
        }

        if (event.getCategory().equals(Biome.Category.THEEND)) {
            generateOre(event.getGeneration(), END_STONE,
                    ModBlocks.ENDER_ORE.get().defaultBlockState(), 5, 0, 105, 10);
        }
    }

    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state,
                                    int veinSize, int minHeight, int maxHeight, int amount) {
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize))
                        .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .squared().count(amount));
    }

    public static final RuleTest END_STONE = new BlockMatchRuleTest(Blocks.END_STONE);
}
