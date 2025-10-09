package dev.realz.swords.init;

import dev.realz.swords.Swords;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Swords.MOD_ID);

    public static final List<Supplier<? extends ItemLike>> INGOTTAB_ITEMS = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> SHARDTAB_ITEMS = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> ESSENCETAB_ITEM = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> STICKTAB_ITEM = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> SWORDSTAB_ITEM = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> BLOCKSTAB_ITEM = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> ORETAB_ITEM = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> INGOTTAB = CREATIVE_MODE_TABS.register(
      "ingottab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BLACK_IRON_INGOT.get()))
                    .title(Component.translatable("itemGroup.ingottab"))
                    .displayItems((pParameters, pOutput) -> {
                        INGOTTAB_ITEMS.forEach(itemLike -> pOutput.accept(itemLike.get()));
                    })
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> SHARDTAB = CREATIVE_MODE_TABS.register(
            "shardtab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BLACK_IRON_SHARD.get()))
                    .title(Component.translatable("itemGroup.shardtab"))
                    .displayItems((pParameters, pOutput) -> {
                        SHARDTAB_ITEMS.forEach(itemLike -> pOutput.accept(itemLike.get()));
                    })
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> ESSENCETAB = CREATIVE_MODE_TABS.register(
            "essencetab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.DRAGON_ESSENCE.get()))
                    .title(Component.translatable("itemGroup.essencetab"))
                    .displayItems((pParameters, pOutput) -> {
                        ESSENCETAB_ITEM.forEach(itemLike -> pOutput.accept(itemLike.get()));
                    })
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> STICKTAB = CREATIVE_MODE_TABS.register(
            "sticktab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.HELL_IRON_STICK.get()))
                    .title(Component.translatable("itemGroup.sticktab"))
                    .displayItems((pParameters, pOutput) -> {
                        STICKTAB_ITEM.forEach(itemLike -> pOutput.accept(itemLike.get()));
                    })
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> SWORDSTAB = CREATIVE_MODE_TABS.register(
            "swordstab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.VAMPIRIC_SWORD.get()))
                    .title(Component.translatable("itemGroup.swordstab"))
                    .displayItems((pParameters, pOutput) -> {
                        SWORDSTAB_ITEM.forEach(itemLike -> pOutput.accept(itemLike.get()));
                    })
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> BLOCKSTAB = CREATIVE_MODE_TABS.register(
            "blockstab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.BLACK_IRON_BLOCK.get()))
                    .title(Component.translatable("itemGroup.blockstab"))
                    .displayItems((pParameters, pOutput) -> {
                        BLOCKSTAB_ITEM.forEach(itemLike -> pOutput.accept(itemLike.get()));
                    })
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> ORETAB = CREATIVE_MODE_TABS.register(
            "oretab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.BLACK_IRON_ORE.get()))
                    .title(Component.translatable("itemGroup.oretab"))
                    .displayItems((pParameters, pOutput) -> {
                        ORETAB_ITEM.forEach(itemLike -> pOutput.accept(itemLike.get()));
                    })
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToIngotTab(RegistryObject<T> itemLike) {
        INGOTTAB_ITEMS.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addToShardTab(RegistryObject<T> itemLike) {
        SHARDTAB_ITEMS.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addToEssenceTab(RegistryObject<T> itemLike) {
        ESSENCETAB_ITEM.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addToStickTab(RegistryObject<T> itemLike) {
        STICKTAB_ITEM.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addToSwordsTab(RegistryObject<T> itemLike) {
        SWORDSTAB_ITEM.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addToBlocksTab(RegistryObject<T> itemLike) {
        BLOCKSTAB_ITEM.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addToOresTab(RegistryObject<T> itemLike) {
        ORETAB_ITEM.add(itemLike);
        return itemLike;
    }
}
