package com.necro.raid.dens.common.loot.function;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.necro.raid.dens.common.compat.ModCompat;
import com.necro.raid.dens.common.compat.megashowdown.RaidDensMSDCompat;
import com.necro.raid.dens.common.components.ModComponents;
import com.necro.raid.dens.common.data.raid.RaidTier;
import com.necro.raid.dens.common.data.raid.RaidType;
import com.necro.raid.dens.common.loot.context.RaidLootContexts;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.functions.LootItemConditionalFunction;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctionType;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.necro.raid.dens.common.loot.function.RaidLootFunctions.Z_CRYSTAL_FUNCTION;

public class ZCrystalFunction extends LootItemConditionalFunction {
    public static final MapCodec<ZCrystalFunction> CODEC = RecordCodecBuilder.mapCodec((instance) -> commonFields(instance)
        .apply(instance, ZCrystalFunction::new));

    protected ZCrystalFunction(List<LootItemCondition> list) {
        super(list);
    }

    @Override
    public @NotNull LootItemFunctionType<ZCrystalFunction> getType() {
        return RaidLootFunctions.Z_CRYSTAL_FUNCTION.value();
    }

    @Override
    protected @NotNull ItemStack run(@NotNull ItemStack itemStack, @NotNull LootContext lootContext) {
        if (!ModCompat.MEGA_SHOWDOWN.isLoaded()) return itemStack;

        ItemStack raidPouch = lootContext.getParamOrNull(RaidLootContexts.RAID_POUCH);
        if (raidPouch == null) return itemStack;

        RaidTier raidTier = raidPouch.get(ModComponents.TIER_COMPONENT.value());
        RaidType raidType = raidPouch.get(ModComponents.TYPE_COMPONENT.value());
        if (raidTier == null || raidType == null || raidType == RaidType.NONE) return itemStack;
        return RaidDensMSDCompat.getZCrystal(raidType);
    }

    public static Builder<?> apply() {
        return simpleBuilder(ZCrystalFunction::new);
    }
}
