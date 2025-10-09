package dev.realz.swords.blocks;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class HellIronBlock extends Block {

    public HellIronBlock() {
        super(Properties.of()
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops());
    }
}
