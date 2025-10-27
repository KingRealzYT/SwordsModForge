package dev.realz.swords.data.tags;

import dev.realz.swords.Swords;
import dev.realz.swords.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, Swords.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.SWORDS)
                .add(ModItems.BLACK_IRON_SWORD.get())
                .add(ModItems.BLOOD_IRON_SWORD.get())
                .add(ModItems.FIRE_SWORD.get())
                .add(ModItems.CRIMSON_SWORD.get())
                .add(ModItems.COBALT_SWORD.get())
                .add(ModItems.SILVER_SWORD.get())
                .add(ModItems.BRUH_SWORD.get())
                .add(ModItems.HELL_IRON_SWORD.get())
                .add(ModItems.ENDER_SWORD.get())

                .add(ModItems.VAMPIRIC_SWORD.get())
                .add(ModItems.INFESTED_SWORD.get())
                .add(ModItems.HELL_BENDER_SWORD.get())

                .add(ModItems.HOLY_SWORD.get())
        ;

    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
