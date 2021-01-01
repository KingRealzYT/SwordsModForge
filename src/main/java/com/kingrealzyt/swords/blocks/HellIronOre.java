package com.kingrealzyt.swords.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HellIronOre extends OreBlock {

    public HellIronOre() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE));
    }
}
