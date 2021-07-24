package com.realz.swords.entities;

import com.realz.swords.init.ModBlocks;
import net.minecraft.world.level.dimension.end.EndDragonFight;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.EndPodiumFeature;

public class DragonDrops extends EndDragonFight {
    public DragonDrops(ServerWorld p_i231901_1_, long p_i231901_2_, CompoundNBT p_i231901_4_, ServerWorld level, World level1) {
        super(p_i231901_1_, p_i231901_2_, p_i231901_4_);
        this.level = level;
    }

    private final World level;

    @Override
    public void setDragonKilled(EnderDragonEntity enderDragon) {
        this.level.setBlockAndUpdate(this.level.getHeightmapPos(Heightmap.Type.MOTION_BLOCKING, EndPodiumFeature.END_PODIUM_LOCATION), ModBlocks.BLACK_IRON_BLOCK.get().defaultBlockState());
    }
}
