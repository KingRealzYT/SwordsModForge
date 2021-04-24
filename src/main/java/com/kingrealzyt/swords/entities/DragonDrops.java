package com.kingrealzyt.swords.entities;

import com.kingrealzyt.swords.init.ModBlocks;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;
import net.minecraft.world.end.DragonFightManager;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.EndPodiumFeature;
import net.minecraft.world.server.ServerWorld;

public class DragonDrops extends DragonFightManager {
    public DragonDrops(ServerWorld p_i231901_1_, long p_i231901_2_, CompoundNBT p_i231901_4_, ServerWorld level, World level1) {
        super(p_i231901_1_, p_i231901_2_, p_i231901_4_);
        this.level = level;
    }

    private final World level;

    @Override
    public void setDragonKilled(EnderDragonEntity p_186096_1_) {
        this.level.setBlockAndUpdate(this.level.getHeightmapPos(Heightmap.Type.MOTION_BLOCKING, EndPodiumFeature.END_PODIUM_LOCATION), ModBlocks.BLACK_IRON_BLOCK.get().defaultBlockState());
    }
}
