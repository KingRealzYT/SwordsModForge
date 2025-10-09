package dev.realz.swords.entities;

import net.minecraft.command.arguments.NBTCompoundTagArgument;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.world.World;

public class DragonDrops extends EnderDragonEntity {
    public DragonDrops(EntityType<? extends EnderDragonEntity> p_i50230_1_, World p_i50230_2_) {
        super(p_i50230_1_, p_i50230_2_);
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
