package com.realz.swords.blocks;

import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolType;

public class CobaltOre extends OreBlock {

    public CobaltOre() {
        super(Properties.of(Material.METAL)
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .requiresCorrectToolForDrops()
                .harvestTool(ToolType.PICKAXE));
    }
}
