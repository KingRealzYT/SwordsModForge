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

import static net.minecraft.tags.BlockTags.makeWrapperTag;

public class ModOreGen {

    public static void generateOres(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    ModBlocks.BLACK_IRON_ORE.get().getDefaultState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    ModBlocks.BLOOD_IRON_ORE.get().getDefaultState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    ModBlocks.CRIMSON_ORE.get().getDefaultState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    ModBlocks.COBALT_ORE.get().getDefaultState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    ModBlocks.SILVER_ORE.get().getDefaultState(), 5, 15, 30, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    ModBlocks.BRUH_ORE.get().getDefaultState(), 5, 15, 30, 10);
        }

        if (event.getCategory().equals(Biome.Category.NETHER)) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
                    ModBlocks.FIRE_ORE.get().getDefaultState(), 5, 0, 128, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER,
                    ModBlocks.HELL_IRON_ORE.get().getDefaultState(), 5, 0, 128, 10);
        }

        if (event.getCategory().equals(Biome.Category.THEEND)) {
            generateOre(event.getGeneration(), END_STONE,
                    ModBlocks.ENDER_ORE.get().getDefaultState(), 5, 0, 105, 10);
        }
    }

    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state,
                                    int veinSize, int minHeight, int maxHeight, int amount) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
                        .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .square().func_242731_b(amount));
    }

    public static final RuleTest END_STONE = new BlockMatchRuleTest(Blocks.END_STONE);
}
