package com.necro.raid.dens.common.loot.function;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.necro.raid.dens.common.compat.ModCompat;
import com.necro.raid.dens.common.compat.megashowdown.RaidDensMSDCompat;
import com.necro.raid.dens.common.components.ModComponents;
import com.necro.raid.dens.common.data.raid.RaidTier;
import com.necro.raid.dens.common.data.raid.RaidType;
import com.necro.raid.dens.common.loot.context.RaidLootContexts;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.functions.LootItemConditionalFunction;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctionType;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MegaStoneFunction extends LootItemConditionalFunction {
    public static final MapCodec<MegaStoneFunction> CODEC = RecordCodecBuilder.mapCodec((instance) -> commonFields(instance)
        .apply(instance, MegaStoneFunction::new));

    protected MegaStoneFunction(List<LootItemCondition> list) {
        super(list);
    }

    @Override
    public @NotNull LootItemFunctionType<MegaStoneFunction> getType() {
        return RaidLootFunctions.MEGA_STONE_FUNCTION.value();
    }

    @Override
    protected @NotNull ItemStack run(@NotNull ItemStack itemStack, @NotNull LootContext lootContext) {
        if (!ModCompat.MEGA_SHOWDOWN.isLoaded()) return itemStack;

        ItemStack raidPouch = lootContext.getParamOrNull(RaidLootContexts.RAID_POUCH);
        if (raidPouch == null) return itemStack;

        ResourceLocation raidBoss = raidPouch.get(ModComponents.BOSS_COMPONENT.value());
        if (raidBoss == null ) return itemStack;
        return RaidDensMSDCompat.getMegaStone(raidBoss);
    }

    public static Builder<?> apply() {
        return simpleBuilder(MegaStoneFunction::new);
    }
}
