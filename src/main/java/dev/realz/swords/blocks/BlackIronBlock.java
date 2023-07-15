package dev.realz.swords.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlackIronBlock extends Block {

    public BlackIronBlock() {
        super(Properties.of(Material.METAL)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL));
    }
}
