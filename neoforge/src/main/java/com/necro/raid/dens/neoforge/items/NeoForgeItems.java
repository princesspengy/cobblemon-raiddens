package com.necro.raid.dens.neoforge.items;

import com.necro.raid.dens.common.CobblemonRaidDens;
import com.necro.raid.dens.common.items.ModItems;
import com.necro.raid.dens.common.items.item.*;
import com.necro.raid.dens.common.showdown.bagitems.CheerBagItem;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NeoForgeItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobblemonRaidDens.MOD_ID);

    public static void registerItems() {
        ModItems.RAID_POUCH = ITEMS.register("raid_pouch", RaidPouchItem::new);
        ModItems.ATTACK_CHEER = ITEMS.register("cheer_attack", () -> new CheerItem(CheerBagItem.CheerType.ATTACK));
        ModItems.DEFENSE_CHEER = ITEMS.register("cheer_defense", () -> new CheerItem(CheerBagItem.CheerType.DEFENSE));
        ModItems.HEAL_CHEER = ITEMS.register("cheer_heal", () -> new CheerItem(CheerBagItem.CheerType.HEAL));
        ModItems.RAID_SHARD = ITEMS.register("raid_shard", RaidShardItem::new);
        ModItems.CATCHING_CHARM = ITEMS.register("catching_charm", CatchingCharmItem::new);
        ModItems.ARTIFICIAL_CHARM = ITEMS.register("artificial_charm", () -> new KeyCharmItem("Magearna"));
        ModItems.BLUE_EON_CHARM = ITEMS.register("blue_eon_charm", () -> new KeyCharmItem("Latios"));
        ModItems.BLUE_WARRIOR_CHARM = ITEMS.register("blue_warrior_charm", () -> new KeyCharmItem("Zacian"));
        ModItems.BOUNDARY_CHARM = ITEMS.register("boundary_charm", () -> new KeyCharmItem("Kyurem"));
        ModItems.CONTINENT_CHARM = ITEMS.register("continent_charm", () -> new KeyCharmItem("Groudon"));
        ModItems.DEEP_BLACK_CHARM = ITEMS.register("deep_black_charm", () -> new KeyCharmItem("Zekrom"));
        ModItems.DJINN_CHARM = ITEMS.register("djinn_charm", () -> new KeyCharmItem("Hoopa"));
        ModItems.FUSED_BLACK_CHARM = ITEMS.register("fused_black_charm", () -> new KeyCharmItem("Kyurem & Zekrom"));
        ModItems.FUSED_WHITE_CHARM = ITEMS.register("fused_white_charm", () -> new KeyCharmItem("Kyurem & Reshiram"));
        ModItems.GENETIC_CHARM = ITEMS.register("genetic_charm", () -> new KeyCharmItem("Mewtwo"));
        ModItems.HIGH_KING_CHARM = ITEMS.register("high_king_charm", () -> new KeyCharmItem("Calyrex & its steed"));
        ModItems.JEWEL_CHARM = ITEMS.register("jewel_charm", () -> new KeyCharmItem("Diancie"));
        ModItems.KING_CHARM = ITEMS.register("king_charm", () -> new KeyCharmItem("Calyrex"));
        ModItems.LAVA_CHARM = ITEMS.register("lava_charm", () -> new KeyCharmItem("Heatran"));
        ModItems.MOON_CHARM = ITEMS.register("moon_charm", () -> new KeyCharmItem("Lunala"));
        ModItems.ORDER_CHARM = ITEMS.register("order_charm", () -> new KeyCharmItem("Zygarde"));
        ModItems.PITCH_BLACK_CHARM = ITEMS.register("pitch_black_charm", () -> new KeyCharmItem("Darkrai"));
        ModItems.PRISM_CHARM = ITEMS.register("prism_charm", () -> new KeyCharmItem("Necrozma"));
        ModItems.PRISMATIC_DAWN_CHARM = ITEMS.register("prismatic_dawn_charm", () -> new KeyCharmItem("Necrozma & Lunala"));
        ModItems.PRISMATIC_DUSK_CHARM = ITEMS.register("prismatic_dusk_charm", () -> new KeyCharmItem("Necrozma & Solgaleo"));
        ModItems.RED_EON_CHARM = ITEMS.register("red_eon_charm", () -> new KeyCharmItem("Latias"));
        ModItems.RED_WARRIOR_CHARM = ITEMS.register("red_warrior_charm", () -> new KeyCharmItem("Zamazenta"));
        ModItems.SEA_BASIN_CHARM = ITEMS.register("sea_basin_charm", () -> new KeyCharmItem("Kyogre"));
        ModItems.SKY_HIGH_CHARM = ITEMS.register("sky_high_charm", () -> new KeyCharmItem("Rayquaza"));
        ModItems.STEED_CHARM = ITEMS.register("steed_charm", () -> new KeyCharmItem("Glastrier & Spectrier"));
        ModItems.SUN_CHARM = ITEMS.register("sun_charm", () -> new KeyCharmItem("Solgaleo"));
        ModItems.THUNDERCLAP_CHARM = ITEMS.register("thunderclap_charm", () -> new KeyCharmItem("Zeraora"));
        ModItems.VAST_WHITE_CHARM = ITEMS.register("vast_white_charm", () -> new KeyCharmItem("Reshiram"));
        ModItems.ZENITH_CHARM = ITEMS.register("zenith_charm", () -> new KeyCharmItem("Necrozma's fused form"));
    }

    public static void registerBlockItem(String name, Supplier<BlockItem> blockItem) {
        ITEMS.register(name, blockItem);
    }
}
