package com.kingrealzyt.swords.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CobaltBlock extends Block {

    public CobaltBlock() {
        super(Properties.of(Material.METAL)
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .requiresCorrectToolForDrops()
                .harvestTool(ToolType.PICKAXE));
    }
}
