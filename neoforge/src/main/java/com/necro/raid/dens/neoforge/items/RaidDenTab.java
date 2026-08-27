package com.necro.raid.dens.neoforge.items;

import com.necro.raid.dens.common.CobblemonRaidDens;
import com.necro.raid.dens.common.items.ModItems;
import com.necro.raid.dens.neoforge.blocks.NeoForgeBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class RaidDenTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister
        .create(Registries.CREATIVE_MODE_TAB, CobblemonRaidDens.MOD_ID);

    @SuppressWarnings("unused")
    public static final Supplier<CreativeModeTab> RAID_DEN_TAB = CREATIVE_TABS.register("raid_den_tab",
        () -> CreativeModeTab.builder().title(Component.translatable("itemgroup.cobblemonraiddens.raid_den_tab"))
            .icon(() -> new ItemStack(NeoForgeBlocks.RAID_CRYSTAL_BLOCK))
            .displayItems((context, entries) -> {
                entries.accept(NeoForgeBlocks.RAID_CRYSTAL_BLOCK);
                entries.accept(ModItems.RAID_SHARD.value());
                entries.accept(ModItems.RAID_POUCH.value());
                entries.accept(ModItems.ATTACK_CHEER.value());
                entries.accept(ModItems.DEFENSE_CHEER.value());
                entries.accept(ModItems.HEAL_CHEER.value());
                entries.accept(ModItems.CATCHING_CHARM.value());
                entries.accept(ModItems.ARTIFICIAL_CHARM.value());
                entries.accept(ModItems.BLUE_EON_CHARM.value());
                entries.accept(ModItems.BLUE_WARRIOR_CHARM.value());
                entries.accept(ModItems.BOUNDARY_CHARM.value());
                entries.accept(ModItems.CONTINENT_CHARM.value());
                entries.accept(ModItems.DEEP_BLACK_CHARM.value());
                entries.accept(ModItems.DJINN_CHARM.value());
                entries.accept(ModItems.FUSED_BLACK_CHARM.value());
                entries.accept(ModItems.FUSED_WHITE_CHARM.value());
                entries.accept(ModItems.GENETIC_CHARM.value());
                entries.accept(ModItems.HIGH_KING_CHARM.value());
                entries.accept(ModItems.JEWEL_CHARM.value());
                entries.accept(ModItems.KING_CHARM.value());
                entries.accept(ModItems.LAVA_CHARM.value());
                entries.accept(ModItems.MOON_CHARM.value());
                entries.accept(ModItems.ORDER_CHARM.value());
                entries.accept(ModItems.PITCH_BLACK_CHARM.value());
                entries.accept(ModItems.PRISM_CHARM.value());
                entries.accept(ModItems.PRISMATIC_DAWN_CHARM.value());
                entries.accept(ModItems.PRISMATIC_DUSK_CHARM.value());
                entries.accept(ModItems.RED_EON_CHARM.value());
                entries.accept(ModItems.RED_WARRIOR_CHARM.value());
                entries.accept(ModItems.SEA_BASIN_CHARM.value());
                entries.accept(ModItems.SKY_HIGH_CHARM.value());
                entries.accept(ModItems.STEED_CHARM.value());
                entries.accept(ModItems.SUN_CHARM.value());
                entries.accept(ModItems.THUNDERCLAP_CHARM.value());
                entries.accept(ModItems.VAST_WHITE_CHARM.value());
                entries.accept(ModItems.ZENITH_CHARM.value());
                entries.accept(ModItems.INCARNATE_CHARM.value());
                entries.accept(ModItems.ABUNDANCE_CHARM.value());
                entries.accept(ModItems.ROCK_PEAK_CHARM.value());
                entries.accept(ModItems.ICEBERG_CHARM.value());
                entries.accept(ModItems.IRON_CHARM.value());
                entries.accept(ModItems.ELECTRON_CHARM.value());
                entries.accept(ModItems.DRAGON_ORB_CHARM.value());
                entries.accept(ModItems.COLOSSAL_CHARM.value());
                entries.accept(ModItems.MUSIC_DISC_AREA_ZERO.value());
                entries.accept(ModItems.MUSIC_DISC_CANALAVE.value());
                entries.accept(ModItems.MUSIC_DISC_CORONET.value());
                entries.accept(ModItems.MUSIC_DISC_ECRUTEAK.value());
                entries.accept(ModItems.MUSIC_DISC_GREAT_CANYON.value());
                entries.accept(ModItems.MUSIC_DISC_HEARTWOOD.value());
                entries.accept(ModItems.MUSIC_DISC_LAKES.value());
                entries.accept(ModItems.MUSIC_DISC_MT_PYRE.value());
                entries.accept(ModItems.MUSIC_DISC_OBSIDIAN_FIELDLANDS.value());
                entries.accept(ModItems.MUSIC_DISC_ORAS_SURF.value());
                entries.accept(ModItems.MUSIC_DISC_POKEMON_LEAGUE_NIGHT.value());
                entries.accept(ModItems.MUSIC_DISC_ROUTE_216.value());

            }).build());
}
