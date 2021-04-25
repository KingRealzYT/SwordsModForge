package com.realz.swords.blocks;

import com.realz.swords.Swords;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().tab(Swords.BLOCKSTAB));
    }
}
