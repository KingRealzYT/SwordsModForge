package dev.realz.swords.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FireBlock extends Block {

    public FireBlock() {
        super(Properties.of(Material.METAL)
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops());
    }
}
