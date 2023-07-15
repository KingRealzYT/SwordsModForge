package dev.realz.swords;

import dev.realz.swords.init.ModBlocks;
import dev.realz.swords.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
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
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    // Creative Tabs

    public static final ItemGroup INGOTTAB = new ItemGroup("ingottab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLACK_IRON_INGOT.get());
        }
    };

    public static final ItemGroup SHARDTAB = new ItemGroup("shardtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLACK_IRON_SHARD.get());
        }
    };

    public static final ItemGroup ESSENCETAB = new ItemGroup("essencetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DRAGON_ESSENCE.get());
        }
    };

    public static final ItemGroup STICKTAB = new ItemGroup("sticktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HELL_IRON_STICK.get());
        }
    };

    public static final ItemGroup SWORDSTAB = new ItemGroup("swordstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VAMPIRIC_SWORD.get());
        }
    };

    public static final ItemGroup BLOCKSTAB = new ItemGroup("blockstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLACK_IRON_BLOCK_ITEM.get());
        }
    };

    public static final ItemGroup ORETAB = new ItemGroup("oretab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLACK_IRON_ORE_ITEM.get());
        }
    };

}
