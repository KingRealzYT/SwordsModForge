package dev.realz.swords;

import dev.realz.swords.init.ModBlocks;
import dev.realz.swords.init.ModItems;
import dev.realz.swords.world.gen.ModOreGen;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("rswords")
public class Swords
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "rswords";

    public Swords() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(ModOreGen::onBiomeLoadingEvent);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(ModOreGen::registerOreFeatures);
    }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    // Creative Tabs

    public static final CreativeModeTab INGOTTAB = new CreativeModeTab("ingottab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLACK_IRON_INGOT.get());
        }
    };

    public static final CreativeModeTab SHARDTAB = new CreativeModeTab("shardtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLACK_IRON_SHARD.get());
        }
    };

    public static final CreativeModeTab ESSENCETAB = new CreativeModeTab("essencetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DRAGON_ESSENCE.get());
        }
    };

    public static final CreativeModeTab STICKTAB = new CreativeModeTab("sticktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HELL_IRON_STICK.get());
        }
    };

    public static final CreativeModeTab SWORDSTAB = new CreativeModeTab("swordstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VAMPIRIC_SWORD.get());
        }
    };

    public static final CreativeModeTab BLOCKSTAB = new CreativeModeTab("blockstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLACK_IRON_BLOCK_ITEM.get());
        }
    };

    public static final CreativeModeTab ORETAB = new CreativeModeTab("oretab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLACK_IRON_ORE_ITEM.get());
        }
    };

}
