package dev.realz.swords.data;

import dev.realz.swords.Swords;
import dev.realz.swords.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Swords.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BLACK_IRON_BLOCK);
        blockWithItem(ModBlocks.BLACK_IRON_ORE);
        blockWithItem(ModBlocks.BLOOD_IRON_BLOCK);
        blockWithItem(ModBlocks.BLOOD_IRON_ORE);
        blockWithItem(ModBlocks.FIRE_BLOCK);
        blockWithItem(ModBlocks.FIRE_ORE);
        blockWithItem(ModBlocks.CRIMSON_BLOCK);
        blockWithItem(ModBlocks.CRIMSON_ORE);
        blockWithItem(ModBlocks.COBALT_BLOCK);
        blockWithItem(ModBlocks.COBALT_ORE);
        blockWithItem(ModBlocks.BRUH_BLOCK);
        blockWithItem(ModBlocks.BRUH_ORE);
        blockWithItem(ModBlocks.HELL_IRON_BLOCK);
        blockWithItem(ModBlocks.HELL_IRON_ORE);
        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.ENDER_BLOCK);
        blockWithItem(ModBlocks.ENDER_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}