package dev.realz.swords.blocks;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class BlackIronBlock extends Block {

    public BlackIronBlock() {
        super(Properties.of()
                .requiresCorrectToolForDrops()
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL));
    }
}
