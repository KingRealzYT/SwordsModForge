package dev.realz.swords.data;

import dev.realz.swords.Swords;
import dev.realz.swords.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Swords.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BLACK_IRON_INGOT);
        simpleItem(ModItems.BLOOD_IRON_INGOT);
        simpleItem(ModItems.FIRE_INGOT);
        simpleItem(ModItems.CRIMSON_INGOT);
        simpleItem(ModItems.COBALT_INGOT);
        simpleItem(ModItems.BRUH_INGOT);
        simpleItem(ModItems.HELL_IRON_INGOT);
        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.ENDER_INGOT);

        simpleItem(ModItems.BLACK_IRON_SHARD);
        simpleItem(ModItems.BLOOD_IRON_SHARD);
        simpleItem(ModItems.FIRE_SHARD);
        simpleItem(ModItems.CRIMSON_SHARD);
        simpleItem(ModItems.COBALT_SHARD);
        simpleItem(ModItems.BRUH_SHARD);
        simpleItem(ModItems.HELL_IRON_SHARD);
        simpleItem(ModItems.SILVER_SHARD);
        simpleItem(ModItems.ENDER_SHARD);

        simpleItem(ModItems.IRON_STICK);
        simpleItem(ModItems.HELL_IRON_STICK);

        simpleItem(ModItems.DRAGON_ESSENCE);

        swordItem(ModItems.BLACK_IRON_SWORD);
        swordItem(ModItems.BLOOD_IRON_SWORD);
        swordItem(ModItems.FIRE_SWORD);
        swordItem(ModItems.CRIMSON_SWORD);
        swordItem(ModItems.COBALT_SWORD);
        swordItem(ModItems.SILVER_SWORD);
        swordItem(ModItems.BRUH_SWORD);
        swordItem(ModItems.HELL_IRON_SWORD);
        swordItem(ModItems.ENDER_SWORD);

        swordItem(ModItems.VAMPIRIC_SWORD);
        swordItem(ModItems.INFESTED_SWORD);
        swordItem(ModItems.HELL_BENDER_SWORD);

        swordItem(ModItems.HOLY_SWORD);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Swords.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder swordItem(RegistryObject<SwordItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Swords.MOD_ID,"item/" + item.getId().getPath()));
    }
}