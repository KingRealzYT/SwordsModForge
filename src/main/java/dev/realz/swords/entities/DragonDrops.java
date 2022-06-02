package dev.realz.swords.entities;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.dimension.end.EndDragonFight;

public class DragonDrops extends EndDragonFight {
    public DragonDrops(ServerLevel p_64078_, long p_64079_, CompoundTag p_64080_) {
        super(p_64078_, p_64079_, p_64080_);
    }
    /*
    public DragonDrops(Level p_i231901_1_, long p_i231901_2_, CompoundNBT p_i231901_4_, ServerWorld level, World level1) {
        super(p_i231901_1_, p_i231901_2_, p_i231901_4_);
        this.level = level;
    }

    private final World level;

    @Override
    public void setDragonKilled(EnderDragonEntity enderDragon) {
        this.level.setBlockAndUpdate(this.level.getHeightmapPos(Heightmap.Type.MOTION_BLOCKING, EndPodiumFeature.END_PODIUM_LOCATION), ModBlocks.BLACK_IRON_BLOCK.get().defaultBlockState());
    }
     */
}
