package dev.realz.swords.data.tags;

import dev.realz.swords.Swords;
import dev.realz.swords.init.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Swords.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BLACK_IRON_ORE.get())
                .add(ModBlocks.BLACK_IRON_BLOCK.get())
                .add(ModBlocks.BLOOD_IRON_ORE.get())
                .add(ModBlocks.BLOOD_IRON_BLOCK.get())
                .add(ModBlocks.FIRE_ORE.get())
                .add(ModBlocks.FIRE_BLOCK.get())
                .add(ModBlocks.CRIMSON_ORE.get())
                .add(ModBlocks.CRIMSON_BLOCK.get())
                .add(ModBlocks.COBALT_ORE.get())
                .add(ModBlocks.COBALT_BLOCK.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.BRUH_ORE.get())
                .add(ModBlocks.BRUH_BLOCK.get())
                .add(ModBlocks.HELL_IRON_ORE.get())
                .add(ModBlocks.HELL_IRON_BLOCK.get())
                .add(ModBlocks.ENDER_ORE.get())
                .add(ModBlocks.ENDER_BLOCK.get())
        ;

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.BRUH_ORE.get())
                .add(ModBlocks.HELL_IRON_ORE.get())
        ;

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.BLACK_IRON_ORE.get())
                .add(ModBlocks.BLOOD_IRON_ORE.get())
                .add(ModBlocks.FIRE_ORE.get())
                .add(ModBlocks.CRIMSON_ORE.get())
                .add(ModBlocks.COBALT_ORE.get())
                .add(ModBlocks.ENDER_ORE.get())
        ;
    }
}
