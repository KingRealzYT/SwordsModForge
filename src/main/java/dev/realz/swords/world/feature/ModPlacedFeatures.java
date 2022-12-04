package dev.realz.swords.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> BLACK_IRON_ORE_PLACED = PlacementUtils.register("black_iron_ore_placed",
            ModConfiguredFeatures.BLACK_IRON_ORE, ModOrePlacement.commonOrePlacement(3,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.top())));
    public static final Holder<PlacedFeature> BLOOD_IRON_ORE_PLACED = PlacementUtils.register("blood_iron_ore_placed",
            ModConfiguredFeatures.BLOOD_IRON_ORE, ModOrePlacement.commonOrePlacement(4,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.top())));
    public static final Holder<PlacedFeature> FIRE_ORE = PlacementUtils.register("nether_fire_ore_placed",
            ModConfiguredFeatures.FIRE_ORE, ModOrePlacement.commonOrePlacement(2,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.top())));

    public static final Holder<PlacedFeature> CRIMSON_ORE = PlacementUtils.register("crimson_ore_placed",
            ModConfiguredFeatures.CRIMSON_ORE, ModOrePlacement.commonOrePlacement(5,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.top())));

    public static final Holder<PlacedFeature> COBALT_ORE = PlacementUtils.register("cobalt_ore_placed",
            ModConfiguredFeatures.COBALT_ORE, ModOrePlacement.commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.top())));

    public static final Holder<PlacedFeature> SILVER_ORE = PlacementUtils.register("silver_ore_placed",
            ModConfiguredFeatures.SILVER_ORE, ModOrePlacement.commonOrePlacement(5,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.top())));

    public static final Holder<PlacedFeature> BRUH_ORE = PlacementUtils.register("bruh_ore_placed",
            ModConfiguredFeatures.BRUH_ORE, ModOrePlacement.commonOrePlacement(6,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.top())));

    public static final Holder<PlacedFeature> HELL_IRON_ORE = PlacementUtils.register("nether_hell_iron_ore_placed",
            ModConfiguredFeatures.HELL_IRON_ORE, ModOrePlacement.commonOrePlacement(2,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.top())));

    public static final Holder<PlacedFeature> ENDER_ORE = PlacementUtils.register("end_ender_ore_placed",
            ModConfiguredFeatures.ENDER_ORE, ModOrePlacement.commonOrePlacement(2,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.top())));
}
