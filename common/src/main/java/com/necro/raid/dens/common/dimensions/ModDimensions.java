package com.necro.raid.dens.common.dimensions;

import com.necro.raid.dens.common.CobblemonRaidDens;
import com.necro.raid.dens.common.data.raid.RaidBoss;
import com.necro.raid.dens.common.network.RaidDenNetworkMessages;
import com.necro.raid.dens.common.raids.RaidInstance;
import com.necro.raid.dens.common.raids.helpers.RaidHelper;
import com.necro.raid.dens.common.raids.helpers.RaidJoinHelper;
import com.necro.raid.dens.common.util.RaidUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;

import java.util.Objects;

public class ModDimensions {
    public static final ResourceKey<DimensionType> RAID_DIM_TYPE_DAY = ResourceKey.create(Registries.DIMENSION_TYPE,
            ResourceLocation.fromNamespaceAndPath(CobblemonRaidDens.MOD_ID, "raid_dimension_type_day"));

    public static final ResourceKey<DimensionType> RAID_DIM_TYPE_NIGHT = ResourceKey.create(Registries.DIMENSION_TYPE,
            ResourceLocation.fromNamespaceAndPath(CobblemonRaidDens.MOD_ID, "raid_dimension_type_night"));

    public static final ResourceKey<DimensionType> RAID_DIM_TYPE_VOID = ResourceKey.create(Registries.DIMENSION_TYPE,
            ResourceLocation.fromNamespaceAndPath(CobblemonRaidDens.MOD_ID, "raid_dimension_type_void"));

    public static final ResourceKey<Biome> RAID_DIM_BIOME = ResourceKey.create(Registries.BIOME,
        ResourceLocation.fromNamespaceAndPath(CobblemonRaidDens.MOD_ID, "raid_den"));

    public static final ResourceKey<LevelStem> RAID_DIM_DAY = ResourceKey.create(Registries.LEVEL_STEM,
        ResourceLocation.fromNamespaceAndPath(CobblemonRaidDens.MOD_ID, "raid_dimension_day"));

    public static final ResourceKey<LevelStem> RAID_DIM_NIGHT = ResourceKey.create(Registries.LEVEL_STEM,
            ResourceLocation.fromNamespaceAndPath(CobblemonRaidDens.MOD_ID, "raid_dimension_night"));

    public static final ResourceKey<LevelStem> RAID_DIM_VOID = ResourceKey.create(Registries.LEVEL_STEM,
            ResourceLocation.fromNamespaceAndPath(CobblemonRaidDens.MOD_ID, "raid_dimension_void"));

    public static final ResourceKey<Level> RAID_DIMENSION_DAY = ResourceKey.create(Registries.DIMENSION,
            ResourceLocation.fromNamespaceAndPath(CobblemonRaidDens.MOD_ID, "raid_dimension_day"));

    public static final ResourceKey<Level> RAID_DIMENSION_NIGHT = ResourceKey.create(Registries.DIMENSION,
            ResourceLocation.fromNamespaceAndPath(CobblemonRaidDens.MOD_ID, "raid_dimension_night"));

    public static final ResourceKey<Level> RAID_DIMENSION_VOID = ResourceKey.create(Registries.DIMENSION,
            ResourceLocation.fromNamespaceAndPath(CobblemonRaidDens.MOD_ID, "raid_dimension_void"));

    public static ServerLevel getRaidDimension(MinecraftServer server, RaidBoss raidBoss) {
        if (server == null) return null;
        String dimension = raidBoss.getDimension();
        if (Objects.equals(dimension, "day")) return server.getLevel(RAID_DIMENSION_DAY);
        if (Objects.equals(dimension, "night")) return server.getLevel(RAID_DIMENSION_NIGHT);
        if (Objects.equals(dimension, "void")) return server.getLevel(RAID_DIMENSION_VOID);
        else return null;
    }

    public static void onDimensionChange(ServerPlayer player, ServerLevel from, ServerLevel to) {
        boolean leavingDimension = RaidUtils.isRaidDimension(from);
        RaidJoinHelper.Participant participant = RaidJoinHelper.getParticipant(player);
        RaidInstance raid = participant == null ? null : RaidHelper.ACTIVE_RAIDS.get(participant.raid());
        if (raid == null) {
            if (leavingDimension) RaidDenNetworkMessages.JOIN_RAID.accept(player, false);
            return;
        }

        if (leavingDimension) {
            raid.removeFromBossEvent(player);
            RaidUtils.leaveRaid(player);
        }
        else if (RaidUtils.isRaidDimension(to)) raid.addToBossEvent(player);
    }
}
