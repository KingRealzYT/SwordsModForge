package dev.realz.swords.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlackIronBlock extends Block {

    public BlackIronBlock() {
        super(Properties.of(Material.METAL)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops());
    }
}
