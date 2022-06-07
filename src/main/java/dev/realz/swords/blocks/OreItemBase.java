package dev.realz.swords.blocks;

import dev.realz.swords.Swords;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class OreItemBase extends BlockItem {

    public OreItemBase(Block block) {
        super(block, new Properties().tab(Swords.ORETAB));
    }
}
