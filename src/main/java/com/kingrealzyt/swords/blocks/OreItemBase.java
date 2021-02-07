package com.kingrealzyt.swords.blocks;

import com.kingrealzyt.swords.Swords;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class OreItemBase extends BlockItem {

    public OreItemBase(Block block) {
        super(block, new Properties().group(Swords.ORETAB));
    }
}
