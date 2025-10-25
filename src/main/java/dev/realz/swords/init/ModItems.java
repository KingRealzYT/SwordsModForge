package dev.realz.swords.init;

import dev.realz.swords.Swords;
import dev.realz.swords.essence.EssenceBase;
import dev.realz.swords.items.IngotBase;
import dev.realz.swords.items.ShardBase;
import dev.realz.swords.items.StickBase;
import dev.realz.swords.swordeffects.*;
import dev.realz.swords.util.enums.ModItemTier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Swords.MOD_ID);

    // Ingots
    public static final RegistryObject<Item> BLACK_IRON_INGOT = ModCreativeTabs.addToIngotTab(ITEMS.register("black_iron_ingot", IngotBase::new));
    public static final RegistryObject<Item> BLOOD_IRON_INGOT = ModCreativeTabs.addToIngotTab(ITEMS.register("blood_iron_ingot", IngotBase::new));
    public static final RegistryObject<Item> FIRE_INGOT = ModCreativeTabs.addToIngotTab(ITEMS.register("fire_ingot", IngotBase::new));
    public static final RegistryObject<Item> CRIMSON_INGOT = ModCreativeTabs.addToIngotTab(ITEMS.register("crimson_ingot", IngotBase::new));
    public static final RegistryObject<Item> COBALT_INGOT = ModCreativeTabs.addToIngotTab(ITEMS.register("cobalt_ingot", IngotBase::new));
    public static final RegistryObject<Item> SILVER_INGOT = ModCreativeTabs.addToIngotTab(ITEMS.register("silver_ingot", IngotBase::new));
    public static final RegistryObject<Item> BRUH_INGOT = ModCreativeTabs.addToIngotTab(ITEMS.register("bruh_ingot", IngotBase::new));
    public static final RegistryObject<Item> HELL_IRON_INGOT = ModCreativeTabs.addToIngotTab(ITEMS.register("hell_iron_ingot", IngotBase::new));
    public static final RegistryObject<Item> ENDER_INGOT = ModCreativeTabs.addToIngotTab(ITEMS.register("ender_ingot", IngotBase::new));

    // Shards
    public static final RegistryObject<Item> BLACK_IRON_SHARD = ModCreativeTabs.addToShardTab(ITEMS.register("black_iron_shard", ShardBase::new));
    public static final RegistryObject<Item> BLOOD_IRON_SHARD = ModCreativeTabs.addToShardTab(ITEMS.register("blood_iron_shard", ShardBase::new));
    public static final RegistryObject<Item> FIRE_SHARD = ModCreativeTabs.addToShardTab(ITEMS.register("fire_shard", ShardBase::new));
    public static final RegistryObject<Item> CRIMSON_SHARD = ModCreativeTabs.addToShardTab(ITEMS.register("crimson_shard", ShardBase::new));
    public static final RegistryObject<Item> COBALT_SHARD = ModCreativeTabs.addToShardTab(ITEMS.register("cobalt_shard", ShardBase::new));
    public static final RegistryObject<Item> SILVER_SHARD = ModCreativeTabs.addToShardTab(ITEMS.register("silver_shard", ShardBase::new));
    public static final RegistryObject<Item> BRUH_SHARD = ModCreativeTabs.addToShardTab(ITEMS.register("bruh_shard", ShardBase::new));
    public static final RegistryObject<Item> HELL_IRON_SHARD = ModCreativeTabs.addToShardTab(ITEMS.register("hell_iron_shard", ShardBase::new));
    public static final RegistryObject<Item> ENDER_SHARD = ModCreativeTabs.addToShardTab(ITEMS.register("ender_shard", ShardBase::new));

    // Sticks
    public static final RegistryObject<Item> IRON_STICK = ModCreativeTabs.addToStickTab(ITEMS.register("iron_stick", StickBase::new));
    public static final RegistryObject<Item> HELL_IRON_STICK = ModCreativeTabs.addToStickTab(ITEMS.register("hell_iron_stick", StickBase::new));

    // Essence
    public static final RegistryObject<Item> DRAGON_ESSENCE = ModCreativeTabs.addToEssenceTab(ITEMS.register("dragon_essence", EssenceBase::new));

    // Swords
    public static final RegistryObject<SwordItem> BLACK_IRON_SWORD = ModCreativeTabs.addToSwordsTab(ITEMS.register("black_iron_sword", () ->
            new BlackIronSword(ModItemTier.BLACK_IRON, 2, -2.2F, new Item.Properties())));
    public static final RegistryObject<SwordItem> BLOOD_IRON_SWORD = ModCreativeTabs.addToSwordsTab(ITEMS.register("blood_iron_sword", () ->
            new BloodIronSword(ModItemTier.BLOOD_IRON, 2, -2.2F, new Item.Properties())));
    public static final RegistryObject<SwordItem> FIRE_SWORD = ModCreativeTabs.addToSwordsTab(ITEMS.register("fire_sword", () ->
            new FireSword(ModItemTier.FIRE, 3, -2.4F, new Item.Properties())));
    public static final RegistryObject<SwordItem> CRIMSON_SWORD = ModCreativeTabs.addToSwordsTab(ITEMS.register("crimson_sword", () ->
            new CrimsonSword(ModItemTier.CRIMSON, 4, -2.4F, new Item.Properties())));
    public static final RegistryObject<SwordItem> COBALT_SWORD = ModCreativeTabs.addToSwordsTab(ITEMS.register("cobalt_sword", () ->
            new CobaltSword(ModItemTier.COBALT, 3, -2F, new Item.Properties())));
    public static final RegistryObject<SwordItem> SILVER_SWORD = ModCreativeTabs.addToSwordsTab(ITEMS.register("silver_sword", () ->
            new SilverSword(ModItemTier.SILVER, 4, -2.9F, new Item.Properties())));
    public static final RegistryObject<SwordItem> BRUH_SWORD = ModCreativeTabs.addToSwordsTab(ITEMS.register("bruh_sword", () ->
            new BruhSword(ModItemTier.BRUH, 2, -2.4F, new Item.Properties())));
    public static final RegistryObject<SwordItem> HELL_IRON_SWORD = ModCreativeTabs.addToSwordsTab(ITEMS.register("hell_iron_sword", () ->
            new HellIronSword(ModItemTier.HELL, 6, -2.4F, new Item.Properties())));
   public static final RegistryObject<SwordItem> ENDER_SWORD = ModCreativeTabs.addToSwordsTab(ITEMS.register("ender_sword", () ->
           new EnderSword(ModItemTier.ENDER, 6, -2.4F, new Item.Properties())));

    // Combined Swords
    public static final RegistryObject<SwordItem> VAMPIRIC_SWORD = ModCreativeTabs.addToSwordsTab(ITEMS.register("vampiric_sword", () ->
            new VampiricSword(ModItemTier.VAMPRIC, 6, -2.4F, new Item.Properties())));
    public static final RegistryObject<SwordItem> INFESTED_SWORD = ModCreativeTabs.addToSwordsTab(ITEMS.register("infested_sword", () ->
           new InfestedSword(ModItemTier.INFESTED, 8, -2.4F, new Item.Properties())));
    public static final RegistryObject<SwordItem> HELL_BENDER_SWORD = ModCreativeTabs.addToSwordsTab(ITEMS.register("hell_bender_sword", () ->
            new HellBenderSword(ModItemTier.HELL_BENDER, 11, -2.4F, new Item.Properties())));

    // Final Swords
    public static final RegistryObject<SwordItem> HOLY_SWORD = ModCreativeTabs.addToSwordsTab(ITEMS.register("holy_sword", () ->
            new HolySword(ModItemTier.HOLY, 6, -2.4F, new Item.Properties())));
}
