package dev.realz.swords.blocks;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class EnderBlock extends Block {

    public EnderBlock() {
        super(Properties.of()
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops());
    }
}
