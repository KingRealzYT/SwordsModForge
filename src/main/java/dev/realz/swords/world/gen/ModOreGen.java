package dev.realz.swords.world.gen;

import dev.realz.swords.init.ModBlocks;

public class ModOreGen {
    public static void generateOres(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.BLACK_IRON_ORE.get().defaultBlockState(), 5, 0, 15, 2);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.BLOOD_IRON_ORE.get().defaultBlockState(), 5, 0, 15, 2);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.CRIMSON_ORE.get().defaultBlockState(), 5, 0, 15, 2);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.COBALT_ORE.get().defaultBlockState(), 5, 0, 15, 2);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.SILVER_ORE.get().defaultBlockState(), 5, 0, 15, 2);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ModBlocks.BRUH_ORE.get().defaultBlockState(), 5, 0, 15, 2);
        }

        if (event.getCategory().equals(Biome.Category.NETHER)) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK,
                    ModBlocks.FIRE_ORE.get().defaultBlockState(), 5, 0, 15, 2);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK,
                    ModBlocks.HELL_IRON_ORE.get().defaultBlockState(), 5, 0, 15, 2);
        }

        if (event.getCategory().equals(Biome.Category.THEEND)) {
            generateOre(event.getGeneration(), END_STONE,
                    ModBlocks.ENDER_ORE.get().defaultBlockState(), 5, 0, 15, 2);
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
