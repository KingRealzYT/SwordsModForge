package dev.realz.swords.init;

import dev.realz.swords.Swords;
import dev.realz.swords.blocks.BlockItemBase;
import dev.realz.swords.blocks.OreItemBase;
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
    public static final RegistryObject<Item> BLACK_IRON_INGOT = ITEMS.register("black_iron_ingot", IngotBase::new);
    public static final RegistryObject<Item> BLOOD_IRON_INGOT = ITEMS.register("blood_iron_ingot", IngotBase::new);
    public static final RegistryObject<Item> FIRE_INGOT = ITEMS.register("fire_ingot", IngotBase::new);
    public static final RegistryObject<Item> CRIMSON_INGOT = ITEMS.register("crimson_ingot", IngotBase::new);
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", IngotBase::new);
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", IngotBase::new);
    public static final RegistryObject<Item> BRUH_INGOT = ITEMS.register("bruh_ingot", IngotBase::new);
    public static final RegistryObject<Item> HELL_IRON_INGOT = ITEMS.register("hell_iron_ingot", IngotBase::new);
    public static final RegistryObject<Item> ENDER_INGOT = ITEMS.register("ender_ingot", IngotBase::new);

    // Shards
    public static final RegistryObject<Item> BLACK_IRON_SHARD = ITEMS.register("black_iron_shard", ShardBase::new);
    public static final RegistryObject<Item> FIRE_SHARD = ITEMS.register("fire_shard", ShardBase::new);
    public static final RegistryObject<Item> HELL_IRON_SHARD = ITEMS.register("hell_iron_shard", ShardBase::new);
    public static final RegistryObject<Item> ENDER_SHARD = ITEMS.register("ender_shard", ShardBase::new);

    // Sticks
    public static final RegistryObject<Item> IRON_STICK = ITEMS.register("iron_stick", StickBase::new);
    public static final RegistryObject<Item> HELL_IRON_STICK = ITEMS.register("hell_iron_stick", StickBase::new);

    // Essence
    public static final RegistryObject<Item> DRAGON_ESSENCE = ITEMS.register("dragon_essence", EssenceBase::new);

    // Swords
    public static final RegistryObject<SwordItem> BLACK_IRON_SWORD = ITEMS.register("black_iron_sword", () ->
            new BlackIronSword(ModItemTier.BLACK_IRON, 5, -2.4F, new Item.Properties().tab(Swords.SWORDSTAB)));
    public static final RegistryObject<SwordItem> BLOOD_IRON_SWORD = ITEMS.register("blood_iron_sword", () ->
            new BloodIronSword(ModItemTier.BLOOD_IRON, 5, -2.4F, new Item.Properties().tab(Swords.SWORDSTAB)));
    public static final RegistryObject<SwordItem> FIRE_SWORD = ITEMS.register("fire_sword", () ->
            new FireSword(ModItemTier.FIRE, 6, -2.4F, new Item.Properties().tab(Swords.SWORDSTAB)));
    public static final RegistryObject<SwordItem> CRIMSON_SWORD = ITEMS.register("crimson_sword", () ->
            new CrimsonSword(ModItemTier.CRIMSON, 5, -2.4F, new Item.Properties().tab(Swords.SWORDSTAB)));
    public static final RegistryObject<SwordItem> COBALT_SWORD = ITEMS.register("cobalt_sword", () ->
            new CobaltSword(ModItemTier.COBALT, 5, -2.4F, new Item.Properties().tab(Swords.SWORDSTAB)));
    public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", () ->
            new SilverSword(ModItemTier.SILVER, 5, -2.4F, new Item.Properties().tab(Swords.SWORDSTAB)));
    public static final RegistryObject<SwordItem> BRUH_SWORD = ITEMS.register("bruh_sword", () ->
            new BruhSword(ModItemTier.BRUH, 6, -2.4F, new Item.Properties().tab(Swords.SWORDSTAB)));
    public static final RegistryObject<SwordItem> HELL_IRON_SWORD = ITEMS.register("hell_iron_sword", () ->
            new HellIronSword(ModItemTier.HELL, 6, -2.4F, new Item.Properties().tab(Swords.SWORDSTAB)));
   public static final RegistryObject<SwordItem> ENDER_SWORD = ITEMS.register("ender_sword", () ->
           new EnderSword(ModItemTier.ENDER, 8, -2.4F, new Item.Properties().tab(Swords.SWORDSTAB)));

    // Combined Swords
    public static final RegistryObject<SwordItem> VAMPIRIC_SWORD = ITEMS.register("vampiric_sword", () ->
            new VampiricSword(ModItemTier.VAMPRIC, 9, -2.4F, new Item.Properties().tab(Swords.SWORDSTAB)));
    public static final RegistryObject<SwordItem> INFESTED_SWORD = ITEMS.register("infested_sword", () ->
           new InfestedSword(ModItemTier.INFESTED, 10, -2.4F, new Item.Properties().tab(Swords.SWORDSTAB)));
    public static final RegistryObject<SwordItem> HELL_BENDER_SWORD = ITEMS.register("hell_bender_sword", () ->
            new HellBenderSword(ModItemTier.HELL_BENDER, 11, -2.4F, new Item.Properties().tab(Swords.SWORDSTAB)));

    // Final Swords
    public static final RegistryObject<SwordItem> HOLY_SWORD = ITEMS.register("holy_sword", () ->
            new HolySword(ModItemTier.HOLY, 12, -2.4F, new Item.Properties().tab(Swords.SWORDSTAB)));

    // Block Items
    public static final RegistryObject<Item> BLACK_IRON_BLOCK_ITEM = ITEMS.register("black_iron_block",
            () -> new BlockItemBase(ModBlocks.BLACK_IRON_BLOCK.get()));

    public static final RegistryObject<Item> BLACK_IRON_ORE_ITEM = ITEMS.register("black_iron_ore",
            () -> new OreItemBase(ModBlocks.BLACK_IRON_ORE.get()));

    public static final RegistryObject<Item> BLOOD_IRON_BLOCK_ITEM = ITEMS.register("blood_iron_block",
            () -> new BlockItemBase(ModBlocks.BLOOD_IRON_BLOCK.get()));

    public static final RegistryObject<Item> BLOOD_IRON_ORE_ITEM = ITEMS.register("blood_iron_ore",
            () -> new OreItemBase(ModBlocks.BLOOD_IRON_ORE.get()));

    public static final RegistryObject<Item> FIRE_BLOCK_ITEM = ITEMS.register("fire_block",
            () -> new BlockItemBase(ModBlocks.FIRE_BLOCK.get()));

    public static final RegistryObject<Item> FIRE_ORE_ITEM = ITEMS.register("fire_ore",
            () -> new OreItemBase(ModBlocks.FIRE_ORE.get()));

    public static final RegistryObject<Item> CRIMSON_BLOCK_ITEM = ITEMS.register("crimson_block",
            () -> new BlockItemBase(ModBlocks.CRIMSON_BLOCK.get()));

    public static final RegistryObject<Item> CRIMSON_ORE_ITEM = ITEMS.register("crimson_ore",
            () -> new OreItemBase(ModBlocks.CRIMSON_ORE.get()));

    public static final RegistryObject<Item> COBALT_BLOCK_ITEM = ITEMS.register("cobalt_block",
            () -> new BlockItemBase(ModBlocks.COBALT_BLOCK.get()));

    public static final RegistryObject<Item> COBALT_ORE_ITEM = ITEMS.register("cobalt_ore",
            () -> new OreItemBase(ModBlocks.COBALT_ORE.get()));

    public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block",
            () -> new BlockItemBase(ModBlocks.SILVER_BLOCK.get()));

    public static final RegistryObject<Item> SILVER_ORE_ITEM = ITEMS.register("silver_ore",
            () -> new OreItemBase(ModBlocks.SILVER_ORE.get()));

    public static final RegistryObject<Item> BRUH_BLOCK_ITEM = ITEMS.register("bruh_block",
            () -> new BlockItemBase(ModBlocks.BRUH_BLOCK.get()));

    public static final RegistryObject<Item> BRUH_ORE_ITEM = ITEMS.register("bruh_ore",
            () -> new OreItemBase(ModBlocks.BRUH_ORE.get()));

    public static final RegistryObject<Item> HELL_IRON_BLOCK_ITEM = ITEMS.register("hell_iron_block",
            () -> new BlockItemBase(ModBlocks.HELL_IRON_BLOCK.get()));

    public static final RegistryObject<Item> HELL_IRON_ORE_ITEM = ITEMS.register("hell_iron_ore",
            () -> new OreItemBase(ModBlocks.HELL_IRON_ORE.get()));

    public static final RegistryObject<Item> ENDER_BLOCK_ITEM = ITEMS.register("ender_block",
            () -> new BlockItemBase(ModBlocks.ENDER_BLOCK.get()));

    public static final RegistryObject<Item> ENDER_ORE_ITEM = ITEMS.register("ender_ore",
            () -> new OreItemBase(ModBlocks.ENDER_ORE.get()));

}
