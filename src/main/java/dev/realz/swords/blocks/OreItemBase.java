package dev.realz.swords.blocks;

import dev.realz.swords.Swords;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class OreItemBase extends BlockItem {

    public OreItemBase(Block block) {
        super(block, new Item.Properties().tab(Swords.ORETAB));
    }
}
