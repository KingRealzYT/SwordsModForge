package dev.realz.swords.world;

import dev.realz.swords.Swords;
import dev.realz.swords.init.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLACK_IRON_ORE_KEY = registerKey("black_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLOOD_IRON_ORE_KEY = registerKey("blood_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CRIMSON_ORE_KEY = registerKey("crimson_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COBALT_ORE_KEY = registerKey("cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BRUH_ORE_KEY = registerKey("bruh_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("silver_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_FIRE_ORE_KEY = registerKey("fire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_HELL_IRON_ORE_KEY = registerKey("hell_iron_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ENDER_ORE_KEY = registerKey("ender_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplacables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldBlackIronOre = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.BLACK_IRON_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldBloodIronOre = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.BLOOD_IRON_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherFireOre = List.of(OreConfiguration.target(netherrackReplacables,
                ModBlocks.FIRE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldCrimsonOre = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.CRIMSON_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldCobaltOre = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.COBALT_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldBruhOre = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.BRUH_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherHellIronOre = List.of(OreConfiguration.target(netherrackReplacables,
                ModBlocks.HELL_IRON_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldSilverOre = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.SILVER_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> endEnderOre = List.of(OreConfiguration.target(endReplaceables,
                ModBlocks.ENDER_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_BLACK_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(overworldBlackIronOre, 4));
        register(context, OVERWORLD_BLOOD_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(overworldBloodIronOre, 5));
        register(context, OVERWORLD_CRIMSON_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCrimsonOre, 4));
        register(context, OVERWORLD_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCobaltOre, 3));
        register(context, OVERWORLD_BRUH_ORE_KEY, Feature.ORE, new OreConfiguration(overworldBruhOre, 5));
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOre, 4));

        register(context, NETHER_FIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherFireOre, 3));
        register(context, NETHER_HELL_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(netherHellIronOre, 5));

        register(context, END_ENDER_ORE_KEY, Feature.ORE, new OreConfiguration(endEnderOre, 2));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Swords.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
