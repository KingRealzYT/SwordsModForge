package com.kingrealzyt.swords;

import com.kingrealzyt.swords.init.ModBlocks;
import com.kingrealzyt.swords.init.ModItems;
import com.kingrealzyt.swords.world.gen.ModOreGen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("rswords")
public class Swords
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "rswords";

    public Swords() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, ModOreGen::generateOres);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(() -> { });
    }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    // Creative Tabs

    public static final ItemGroup INGOTTAB = new ItemGroup("ingottab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.BLACK_IRON_INGOT.get());
        }
    };

    public static final ItemGroup SHARDTAB = new ItemGroup("shardtab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.BLACK_IRON_SHARD.get());
        }
    };

    public static final ItemGroup STICKTAB = new ItemGroup("sticktab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.HELL_IRON_STICK.get());
        }
    };

    public static final ItemGroup SWORDSTAB = new ItemGroup("swordstab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.VAMPIRIC_SWORD.get());
        }
    };

    public static final ItemGroup BLOCKSTAB = new ItemGroup("blockstab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.BLACK_IRON_BLOCK_ITEM.get());
        }
    };

    public static final ItemGroup ORETAB = new ItemGroup("oretab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.BLACK_IRON_ORE_ITEM.get());
        }
    };

}
