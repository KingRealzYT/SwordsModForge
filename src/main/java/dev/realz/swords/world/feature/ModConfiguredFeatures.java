package dev.realz.swords.world.feature;

import dev.realz.swords.init.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_BLACK_IRON_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BLACK_IRON_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_BLOOD_IRON_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BLOOD_IRON_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> NETHER_FIRE_ORE = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.FIRE_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_CRIMSON_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CRIMSON_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_COBALT_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.COBALT_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SILVER_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_BRUH_ORE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BRUH_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> NETHER_HELL_IRON_ORE = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.HELL_IRON_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> END_ENDER_ORE = List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ENDER_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BLACK_IRON_ORE = FeatureUtils.register("black_iron_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_BLACK_IRON_ORE, 3));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BLOOD_IRON_ORE = FeatureUtils.register("blood_iron_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_BLOOD_IRON_ORE, 4));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> FIRE_ORE = FeatureUtils.register("fire_ore",
            Feature.ORE, new OreConfiguration(NETHER_FIRE_ORE, 2));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CRIMSON_ORE = FeatureUtils.register("crimson_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_CRIMSON_ORE, 5));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> COBALT_ORE = FeatureUtils.register("cobalt_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_COBALT_ORE, 7));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SILVER_ORE = FeatureUtils.register("silver_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORE, 5));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BRUH_ORE = FeatureUtils.register("bruh_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_BRUH_ORE, 6));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> HELL_IRON_ORE = FeatureUtils.register("hell_iron_ore",
            Feature.ORE, new OreConfiguration(NETHER_HELL_IRON_ORE, 2));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ENDER_ORE = FeatureUtils.register("ender_ore",
            Feature.ORE, new OreConfiguration(END_ENDER_ORE, 2));
}
