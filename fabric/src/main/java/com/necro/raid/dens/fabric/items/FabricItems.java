package com.necro.raid.dens.fabric.items;

import com.necro.raid.dens.common.CobblemonRaidDens;
import com.necro.raid.dens.common.items.ModItems;
import com.necro.raid.dens.common.items.item.*;
import com.necro.raid.dens.common.showdown.bagitems.CheerBagItem;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class FabricItems {
    public static void registerItems() {
        ModItems.RAID_POUCH = registerItem("raid_pouch", new RaidPouchItem());
        ModItems.ATTACK_CHEER = registerItem("cheer_attack", new CheerItem(CheerBagItem.CheerType.ATTACK));
        ModItems.DEFENSE_CHEER = registerItem("cheer_defense", new CheerItem(CheerBagItem.CheerType.DEFENSE));
        ModItems.HEAL_CHEER = registerItem("cheer_heal", new CheerItem(CheerBagItem.CheerType.HEAL));
        ModItems.RAID_SHARD = registerItem("raid_shard", new RaidShardItem());
        ModItems.CATCHING_CHARM = registerItem("catching_charm", new CatchingCharmItem());
        ModItems.ARTIFICIAL_CHARM = registerItem("artificial_charm", new KeyCharmItem("Magearna"));
        ModItems.BLUE_EON_CHARM = registerItem("blue_eon_charm", new KeyCharmItem("Latios"));
        ModItems.BLUE_WARRIOR_CHARM = registerItem("blue_warrior_charm", new KeyCharmItem("Zacian"));
        ModItems.BOUNDARY_CHARM = registerItem("boundary_charm", new KeyCharmItem("Kyurem"));
        ModItems.CONTINENT_CHARM = registerItem("continent_charm", new KeyCharmItem("Groudon"));
        ModItems.DEEP_BLACK_CHARM = registerItem("deep_black_charm", new KeyCharmItem("Zekrom"));
        ModItems.DJINN_CHARM = registerItem("djinn_charm", new KeyCharmItem("Hoopa"));
        ModItems.FUSED_BLACK_CHARM = registerItem("fused_black_charm", new KeyCharmItem("Kyurem & Zekrom"));
        ModItems.FUSED_WHITE_CHARM = registerItem("fused_white_charm", new KeyCharmItem("Kyurem & Reshiram"));
        ModItems.GENETIC_CHARM = registerItem("genetic_charm", new KeyCharmItem("Mewtwo"));
        ModItems.HIGH_KING_CHARM = registerItem("high_king_charm", new KeyCharmItem("Calyrex & its steed"));
        ModItems.JEWEL_CHARM = registerItem("jewel_charm", new KeyCharmItem("Diancie"));
        ModItems.KING_CHARM = registerItem("king_charm", new KeyCharmItem("Calyrex"));
        ModItems.LAVA_CHARM = registerItem("lava_charm", new KeyCharmItem("Heatran"));
        ModItems.MOON_CHARM = registerItem("moon_charm", new KeyCharmItem("Lunala"));
        ModItems.ORDER_CHARM = registerItem("order_charm", new KeyCharmItem("Zygarde"));
        ModItems.PITCH_BLACK_CHARM = registerItem("pitch_black_charm", new KeyCharmItem("Darkrai"));
        ModItems.PRISM_CHARM = registerItem("prism_charm", new KeyCharmItem("Necrozma"));
        ModItems.PRISMATIC_DAWN_CHARM = registerItem("prismatic_dawn_charm", new KeyCharmItem("Necrozma & Lunala"));
        ModItems.PRISMATIC_DUSK_CHARM = registerItem("prismatic_dusk_charm", new KeyCharmItem("Necrozma & Solgaleo"));
        ModItems.RED_EON_CHARM = registerItem("red_eon_charm", new KeyCharmItem("Latias"));
        ModItems.RED_WARRIOR_CHARM = registerItem("red_warrior_charm", new KeyCharmItem("Zamazenta"));
        ModItems.SEA_BASIN_CHARM = registerItem("sea_basin_charm", new KeyCharmItem("Kyogre"));
        ModItems.SKY_HIGH_CHARM = registerItem("sky_high_charm", new KeyCharmItem("Rayquaza"));
        ModItems.STEED_CHARM = registerItem("steed_charm", new KeyCharmItem("Glastrier & Spectrier"));
        ModItems.SUN_CHARM = registerItem("sun_charm", new KeyCharmItem("Solgaleo"));
        ModItems.THUNDERCLAP_CHARM = registerItem("thunderclap_charm", new KeyCharmItem("Zeraora"));
        ModItems.VAST_WHITE_CHARM = registerItem("vast_white_charm", new KeyCharmItem("Reshiram"));
        ModItems.ZENITH_CHARM = registerItem("zenith_charm", new KeyCharmItem("Necrozma's fused form"));
    }

    private static Holder<Item> registerItem(String name, Item item) {
        return Registry.registerForHolder(
            BuiltInRegistries.ITEM,
            ResourceLocation.fromNamespaceAndPath(CobblemonRaidDens.MOD_ID, name),
            item
        );
    }
}
