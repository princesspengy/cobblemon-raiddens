package com.necro.raid.dens.fabric.sound;

import com.necro.raid.dens.common.CobblemonRaidDens;
import com.necro.raid.dens.common.sound.ModSounds;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class FabricSounds {
    public static void registerSounds() {

        ModSounds.MUSIC_DISC_AREA_ZERO = register("music_disc.area_zero");
        ModSounds.MUSIC_DISC_CANALAVE = register("music_disc.canalave");
        ModSounds.MUSIC_DISC_CORONET = register("music_disc.coronet");
        ModSounds.MUSIC_DISC_ECRUTEAK = register("music_disc.ecruteak");
        ModSounds.MUSIC_DISC_GREAT_CANYON = register("music_disc.great_canyon");
        ModSounds.MUSIC_DISC_HEARTWOOD = register("music_disc.heartwood");
        ModSounds.MUSIC_DISC_LAKES = register("music_disc.lakes");
        ModSounds.MUSIC_DISC_MT_PYRE = register("music_disc.mt_pyre");
        ModSounds.MUSIC_DISC_OBSIDIAN_FIELDLANDS = register("music_disc.obsidian_fieldlands");
        ModSounds.MUSIC_DISC_ORAS_SURF = register("music_disc.oras_surf");
        ModSounds.MUSIC_DISC_POKEMON_LEAGUE_NIGHT = register("music_disc.pokemon_league_night");
        ModSounds.MUSIC_DISC_ROUTE_216 = register("music_disc.route_216");
    }

    private static Holder<SoundEvent> register(String name) {
        ResourceLocation sound = ResourceLocation.fromNamespaceAndPath(CobblemonRaidDens.MOD_ID, name);
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, sound, SoundEvent.createVariableRangeEvent(sound));
    }
}
