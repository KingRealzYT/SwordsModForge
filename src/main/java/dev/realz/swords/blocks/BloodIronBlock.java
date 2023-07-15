package dev.realz.swords.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BloodIronBlock extends Block {

    public BloodIronBlock() {
        super(Properties.of(Material.METAL)
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops());
    }
}
