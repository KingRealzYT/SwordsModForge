package com.realz.swords.blocks;

import com.realz.swords.Swords;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class OreItemBase extends BlockItem {

    public OreItemBase(Block block) {
        super(block, new Properties().tab(Swords.ORETAB));
    }
}
