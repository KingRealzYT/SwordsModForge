package dev.realz.swords.init;

import dev.realz.swords.Swords;
import dev.realz.swords.blocks.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Swords.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> BLACK_IRON_BLOCK = registerBlock("black_iron_block", BlackIronBlock::new);
    public static final RegistryObject<Block> BLACK_IRON_ORE = registerOreBlock("black_iron_ore", BlackIronOre::new);
    public static final RegistryObject<Block> BLOOD_IRON_BLOCK = registerBlock("blood_iron_block", BloodIronBlock::new);
    public static final RegistryObject<Block> BLOOD_IRON_ORE = registerOreBlock("blood_iron_ore", BloodIronOre::new);
    public static final RegistryObject<Block> FIRE_BLOCK = registerBlock("fire_block", FireBlock::new);
    public static final RegistryObject<Block> FIRE_ORE = registerOreBlock("fire_ore", FireOre::new);
    public static final RegistryObject<Block> CRIMSON_BLOCK = registerBlock("crimson_block", CrimsonBlock::new);
    public static final RegistryObject<Block> CRIMSON_ORE = registerOreBlock("crimson_ore", CrimsonOre::new);
    public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block", CobaltBlock::new);
    public static final RegistryObject<Block> COBALT_ORE = registerOreBlock("cobalt_ore", CobaltOre::new);
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block", SilverBlock::new);
    public static final RegistryObject<Block> SILVER_ORE = registerOreBlock("silver_ore", SilverOre::new);
    public static final RegistryObject<Block> BRUH_BLOCK = registerBlock("bruh_block", BruhBlock::new);
    public static final RegistryObject<Block> BRUH_ORE = registerOreBlock("bruh_ore", BruhOre::new);
    public static final RegistryObject<Block> HELL_IRON_BLOCK = registerBlock("hell_iron_block", HellIronBlock::new);
    public static final RegistryObject<Block> HELL_IRON_ORE = registerOreBlock("hell_iron_ore", HellIronOre::new);
    public static final RegistryObject<Block> ENDER_BLOCK = registerBlock("ender_block", EnderBlock::new);
    public static final RegistryObject<Block> ENDER_ORE = registerOreBlock("ender_ore", EnderOre::new);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerOreBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerOreBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModCreativeTabs.addToBlocksTab(ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties())));
    }
    private static <T extends Block>RegistryObject<Item> registerOreBlockItem(String name, RegistryObject<T> block) {
        return ModCreativeTabs.addToOresTab(ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties())));
    }
}
