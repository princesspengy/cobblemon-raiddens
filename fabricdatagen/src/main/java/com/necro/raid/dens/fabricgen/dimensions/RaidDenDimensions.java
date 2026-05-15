package com.necro.raid.dens.fabricgen.dimensions;

import com.necro.raid.dens.common.dimensions.ModDimensions;
import com.necro.raid.dens.common.dimensions.RaidDenChunkGenerator;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;

import java.util.OptionalLong;

public class RaidDenDimensions {
    public static void bootstrapType(BootstrapContext<DimensionType> context) {
        context.register(ModDimensions.RAID_DIM_TYPE_DAY, new DimensionType(
            OptionalLong.of(6000),
            false,
            false,
            false,
            false,
            1.0,
            true,
            false,
            -64,
            128,
            128,
            BlockTags.AIR,
            BuiltinDimensionTypes.OVERWORLD_EFFECTS,
            0.0f,
            new DimensionType.MonsterSettings(false, false, ConstantInt.ZERO, 0)
        ));
        context.register(ModDimensions.RAID_DIM_TYPE_NIGHT, new DimensionType(
                OptionalLong.of(18000),
                false,
                false,
                false,
                false,
                1.0,
                true,
                false,
                -64,
                128,
                128,
                BlockTags.AIR,
                BuiltinDimensionTypes.OVERWORLD_EFFECTS,
                0.0f,
                new DimensionType.MonsterSettings(false, false, ConstantInt.ZERO, 0)
        ));
        context.register(ModDimensions.RAID_DIM_TYPE_VOID, new DimensionType(
                OptionalLong.of(6000),
                false,
                false,
                false,
                false,
                1.0,
                true,
                false,
                -64,
                128,
                128,
                BlockTags.AIR,
                BuiltinDimensionTypes.END_EFFECTS,
                0.0f,
                new DimensionType.MonsterSettings(false, false, ConstantInt.ZERO, 0)
        ));
    }

    public static void bootstrapBiome(BootstrapContext<Biome> context) {
        BiomeSpecialEffects.Builder builder = (new BiomeSpecialEffects.Builder())
            .waterColor(4159204)
            .waterFogColor(329011)
            .fogColor(12638463)
            .skyColor(0)
            .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS);

        context.register(ModDimensions.RAID_DIM_BIOME, new Biome.BiomeBuilder()
            .hasPrecipitation(false)
            .downfall(0.4f)
            .temperature(0.7f)
            .generationSettings(BiomeGenerationSettings.EMPTY)
            .mobSpawnSettings(MobSpawnSettings.EMPTY)
            .specialEffects(builder.build())
            .build()
        );
    }

    public static void bootstrapLevel(BootstrapContext<LevelStem> context) {
        LevelStem levelStemDay = new LevelStem(
            context.lookup(Registries.DIMENSION_TYPE).getOrThrow(ModDimensions.RAID_DIM_TYPE_DAY),
            new RaidDenChunkGenerator(context.lookup(Registries.BIOME).getOrThrow(ModDimensions.RAID_DIM_BIOME))
        );
        LevelStem levelStemNight = new LevelStem(
                context.lookup(Registries.DIMENSION_TYPE).getOrThrow(ModDimensions.RAID_DIM_TYPE_NIGHT),
                new RaidDenChunkGenerator(context.lookup(Registries.BIOME).getOrThrow(ModDimensions.RAID_DIM_BIOME))
        );
        LevelStem levelStemVoid = new LevelStem(
                context.lookup(Registries.DIMENSION_TYPE).getOrThrow(ModDimensions.RAID_DIM_TYPE_VOID),
                new RaidDenChunkGenerator(context.lookup(Registries.BIOME).getOrThrow(ModDimensions.RAID_DIM_BIOME))
        );
        context.register(ModDimensions.RAID_DIM_DAY, levelStemDay);
        context.register(ModDimensions.RAID_DIM_NIGHT, levelStemNight);
        context.register(ModDimensions.RAID_DIM_VOID, levelStemVoid);
    }
}
