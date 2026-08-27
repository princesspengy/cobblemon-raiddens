package com.necro.raid.dens.fabric.items;

import com.necro.raid.dens.common.CobblemonRaidDens;
import com.necro.raid.dens.common.items.ModItems;
import com.necro.raid.dens.common.items.item.*;
import com.necro.raid.dens.common.showdown.bagitems.CheerBagItem;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

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
        ModItems.INCARNATE_CHARM = registerItem("incarnate_charm", new KeyCharmItem("the Forces of Nature"));
        ModItems.ABUNDANCE_CHARM = registerItem("abundance_charm", new KeyCharmItem("Landorus"));
        ModItems.ROCK_PEAK_CHARM = registerItem("rock_peak_charm", new KeyCharmItem("Regirock"));
        ModItems.ICEBERG_CHARM = registerItem("iceberg_charm", new KeyCharmItem("Regice"));
        ModItems.IRON_CHARM = registerItem("iron_charm", new KeyCharmItem("Registeel"));
        ModItems.ELECTRON_CHARM = registerItem("electron_charm", new KeyCharmItem("Regieleki"));
        ModItems.DRAGON_ORB_CHARM = registerItem("dragon_orb_charm", new KeyCharmItem("Regidrago"));
        ModItems.COLOSSAL_CHARM = registerItem("colossal_charm", new KeyCharmItem("Regigigas"));
        ModItems.MUSIC_DISC_AREA_ZERO = registerItem("music_disc_area_zero", new Item((new Item.Properties()).stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("cobblemonraiddens", "area_zero")))));
        ModItems.MUSIC_DISC_CANALAVE = registerItem("music_disc_canalave", new Item((new Item.Properties()).stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("cobblemonraiddens", "canalave")))));
        ModItems.MUSIC_DISC_CORONET = registerItem("music_disc_coronet", new Item((new Item.Properties()).stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("cobblemonraiddens", "coronet")))));
        ModItems.MUSIC_DISC_ECRUTEAK = registerItem("music_disc_ecruteak", new Item((new Item.Properties()).stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("cobblemonraiddens", "ecruteak")))));
        ModItems.MUSIC_DISC_GREAT_CANYON = registerItem("music_disc_great_canyon", new Item((new Item.Properties()).stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("cobblemonraiddens", "great_canyon")))));
        ModItems.MUSIC_DISC_HEARTWOOD = registerItem("music_disc_heartwood", new Item((new Item.Properties()).stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("cobblemonraiddens", "heartwood")))));
        ModItems.MUSIC_DISC_LAKES = registerItem("music_disc_lakes", new Item((new Item.Properties()).stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("cobblemonraiddens", "lakes")))));
        ModItems.MUSIC_DISC_MT_PYRE = registerItem("music_disc_mt_pyre", new Item((new Item.Properties()).stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("cobblemonraiddens", "mt_pyre")))));
        ModItems.MUSIC_DISC_OBSIDIAN_FIELDLANDS = registerItem("music_disc_obsidian_fieldlands", new Item((new Item.Properties()).stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("cobblemonraiddens", "obsidian_fieldlands")))));
        ModItems.MUSIC_DISC_ORAS_SURF = registerItem("music_disc_oras_surf", new Item((new Item.Properties()).stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("cobblemonraiddens", "oras_surf")))));
        ModItems.MUSIC_DISC_POKEMON_LEAGUE_NIGHT = registerItem("music_disc_pokemon_league_night", new Item((new Item.Properties()).stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("cobblemonraiddens", "pokemon_league_night")))));
        ModItems.MUSIC_DISC_ROUTE_216 = registerItem("music_disc_route_216", new Item((new Item.Properties()).stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("cobblemonraiddens", "route_216")))));
    }

    private static Holder<Item> registerItem(String name, Item item) {
        return Registry.registerForHolder(
            BuiltInRegistries.ITEM,
            ResourceLocation.fromNamespaceAndPath(CobblemonRaidDens.MOD_ID, name),
            item
        );
    }
}
