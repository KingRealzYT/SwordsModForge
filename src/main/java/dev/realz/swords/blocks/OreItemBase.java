package dev.realz.swords.blocks;

import dev.realz.swords.Swords;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class OreItemBase extends BlockItem {

    public OreItemBase(Block block) {
        super(block, new Properties().tab(Swords.ORETAB));
    }
}
