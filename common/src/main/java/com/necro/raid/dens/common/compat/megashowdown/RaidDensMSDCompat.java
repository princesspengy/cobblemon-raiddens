package com.necro.raid.dens.common.compat.megashowdown;

import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import com.cobblemon.mod.common.pokemon.properties.AspectPropertyType;
import com.cobblemon.mod.common.pokemon.properties.StringProperty;
import com.github.yajatkaul.mega_showdown.block.MegaShowdownBlocks;
import com.github.yajatkaul.mega_showdown.item.MegaShowdownItems;
import com.github.yajatkaul.mega_showdown.utils.GlowHandler;
import com.necro.raid.dens.common.CobblemonRaidDens;
import com.necro.raid.dens.common.data.raid.RaidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.zamega.zamega.item.ZamegaItems;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

public abstract class RaidDensMSDCompat {
    public static void setupTera(Pokemon pokemon) {
        StringProperty property = AspectPropertyType.INSTANCE.fromString("msd:tera_" + pokemon.getTeraType().showdownId());
        if (property.matches(pokemon)) return;
        property.apply(pokemon);
        applyEffects(pokemon, "mega_showdown:tera_init_" + pokemon.getTeraType().showdownId().toLowerCase(), false);
        pokemon.getPersistentData().putBoolean("is_tera", true);
    }

    public static void setupDmax(PokemonEntity pokemonEntity, Pokemon pokemon) {
        StringProperty property = AspectPropertyType.INSTANCE.fromString("msd:dmax");
        if (property.matches(pokemon)) return;
        property.apply(pokemon);
        applyEffects(pokemon, "mega_showdown:dynamax", pokemon.getGmaxFactor());
        pokemon.getPersistentData().putBoolean("is_max", true);
        try { GlowHandler.applyDynamaxGlow(pokemonEntity); }
        catch (NullPointerException ignored) {}
    }

    public static ItemStack getTeraShard(RaidType raidType) {
        return switch (raidType) {
            case FIGHTING -> MegaShowdownItems.FIGHTING_TERA_SHARD.get().getDefaultInstance();
            case FLYING -> MegaShowdownItems.FLYING_TERA_SHARD.get().getDefaultInstance();
            case POISON -> MegaShowdownItems.POISON_TERA_SHARD.get().getDefaultInstance();
            case GROUND -> MegaShowdownItems.GROUND_TERA_SHARD.get().getDefaultInstance();
            case ROCK -> MegaShowdownItems.ROCK_TERA_SHARD.get().getDefaultInstance();
            case BUG -> MegaShowdownItems.BUG_TERA_SHARD.get().getDefaultInstance();
            case GHOST -> MegaShowdownItems.GHOST_TERA_SHARD.get().getDefaultInstance();
            case STEEL -> MegaShowdownItems.STEEL_TERA_SHARD.get().getDefaultInstance();
            case FIRE -> MegaShowdownItems.FIRE_TERA_SHARD.get().getDefaultInstance();
            case WATER -> MegaShowdownItems.WATER_TERA_SHARD.get().getDefaultInstance();
            case GRASS -> MegaShowdownItems.GRASS_TERA_SHARD.get().getDefaultInstance();
            case ELECTRIC -> MegaShowdownItems.ELECTRIC_TERA_SHARD.get().getDefaultInstance();
            case PSYCHIC -> MegaShowdownItems.PSYCHIC_TERA_SHARD.get().getDefaultInstance();
            case ICE -> MegaShowdownItems.ICE_TERA_SHARD.get().getDefaultInstance();
            case DRAGON -> MegaShowdownItems.DRAGON_TERA_SHARD.get().getDefaultInstance();
            case DARK -> MegaShowdownItems.DARK_TERA_SHARD.get().getDefaultInstance();
            case FAIRY -> MegaShowdownItems.FAIRY_TERA_SHARD.get().getDefaultInstance();
            case STELLAR -> MegaShowdownItems.STELLAR_TERA_SHARD.get().getDefaultInstance();
            default -> MegaShowdownItems.NORMAL_TERA_SHARD.get().getDefaultInstance();
        };
    }

    public static ItemStack getZCrystal(RaidType raidType) {
        return switch (raidType) {
            case FIGHTING -> MegaShowdownItems.FIGHTINIUM_Z.get().getDefaultInstance();
            case FLYING -> MegaShowdownItems.FLYINIUM_Z.get().getDefaultInstance();
            case POISON -> MegaShowdownItems.POISONIUM_Z.get().getDefaultInstance();
            case GROUND -> MegaShowdownItems.GROUNDIUM_Z.get().getDefaultInstance();
            case ROCK -> MegaShowdownItems.ROCKIUM_Z.get().getDefaultInstance();
            case BUG -> MegaShowdownItems.BUGINIUM_Z.get().getDefaultInstance();
            case GHOST -> MegaShowdownItems.GHOSTIUM_Z.get().getDefaultInstance();
            case STEEL -> MegaShowdownItems.STEELIUM_Z.get().getDefaultInstance();
            case FIRE -> MegaShowdownItems.FIRIUM_Z.get().getDefaultInstance();
            case WATER -> MegaShowdownItems.WATERIUM_Z.get().getDefaultInstance();
            case GRASS -> MegaShowdownItems.GRASSIUM_Z.get().getDefaultInstance();
            case ELECTRIC -> MegaShowdownItems.ELECTRIUM_Z.get().getDefaultInstance();
            case PSYCHIC -> MegaShowdownItems.PSYCHIUM_Z.get().getDefaultInstance();
            case ICE -> MegaShowdownItems.ICIUM_Z.get().getDefaultInstance();
            case DRAGON -> MegaShowdownItems.DRAGONIUM_Z.get().getDefaultInstance();
            case DARK -> MegaShowdownItems.DARKINIUM_Z.get().getDefaultInstance();
            case FAIRY -> MegaShowdownItems.FAIRIUM_Z.get().getDefaultInstance();
            default -> MegaShowdownItems.NORMALIUM_Z.get().getDefaultInstance();
        };
    }

    public static ItemStack getMegaStone(ResourceLocation raidBoss) {
        String path = raidBoss.getPath();

        return switch (path) {
            case "mega/abomasnow" -> MegaShowdownItems.ABOMASITE.get().getDefaultInstance();
            case "mega/absol" -> MegaShowdownItems.ABSOLITE.get().getDefaultInstance();
            case "mega/aerodactyl" -> MegaShowdownItems.AERODACTYLITE.get().getDefaultInstance();
            case "mega/aggron" -> MegaShowdownItems.AGGRONITE.get().getDefaultInstance();
            case "mega/alakazam" -> MegaShowdownItems.ALAKAZITE.get().getDefaultInstance();
            case "mega/altaria" -> MegaShowdownItems.ALTARIANITE.get().getDefaultInstance();
            case "mega/ampharos" -> MegaShowdownItems.AMPHAROSITE.get().getDefaultInstance();
            case "mega/audino" -> MegaShowdownItems.AUDINITE.get().getDefaultInstance();
            case "mega/banette" -> MegaShowdownItems.BANETTITE.get().getDefaultInstance();
            case "mega/beedrill" -> MegaShowdownItems.BEEDRILLITE.get().getDefaultInstance();
            case "mega/blastoise" -> MegaShowdownItems.BLASTOISINITE.get().getDefaultInstance();
            case "mega/blaziken" -> MegaShowdownItems.BLAZIKENITE.get().getDefaultInstance();
            case "mega/camerupt" -> MegaShowdownItems.CAMERUPTITE.get().getDefaultInstance();
            case "mega/charizard_x" -> MegaShowdownItems.CHARIZARDITE_X.get().getDefaultInstance();
            case "mega/charizard_y" -> MegaShowdownItems.CHARIZARDITE_Y.get().getDefaultInstance();
            case "mega_greater/diancie_mega" -> MegaShowdownItems.DIANCITE.get().getDefaultInstance();
            case "mega/gallade" -> MegaShowdownItems.GALLADITE.get().getDefaultInstance();
            case "mega/glalie" -> MegaShowdownItems.GLALITITE.get().getDefaultInstance();
            case "mega/garchomp" -> MegaShowdownItems.GARCHOMPITE.get().getDefaultInstance();
            case "mega/gardevoir" -> MegaShowdownItems.GARDEVOIRITE.get().getDefaultInstance();
            case "mega/gengar" -> MegaShowdownItems.GENGARITE.get().getDefaultInstance();
            case "mega/gyarados" -> MegaShowdownItems.GYARADOSITE.get().getDefaultInstance();
            case "mega/heracross" -> MegaShowdownItems.HERACRONITE.get().getDefaultInstance();
            case "mega/houndoom" -> MegaShowdownItems.HOUNDOOMINITE.get().getDefaultInstance();
            case "mega/kangaskhan" -> MegaShowdownItems.KANGASKHANITE.get().getDefaultInstance();
            case "mega_greater/latias_mega" -> MegaShowdownItems.LATIASITE.get().getDefaultInstance();
            case "mega_greater/latios_mega" -> MegaShowdownItems.LATIOSITE.get().getDefaultInstance();
            case "mega/lopunny" -> MegaShowdownItems.LOPUNNITE.get().getDefaultInstance();
            case "mega/lucario" -> MegaShowdownItems.LUCARIONITE.get().getDefaultInstance();
            case "mega/manectric" -> MegaShowdownItems.MANECTITE.get().getDefaultInstance();
            case "mega/mawile" -> MegaShowdownItems.MAWILITE.get().getDefaultInstance();
            case "mega/medicham" -> MegaShowdownItems.MEDICHAMITE.get().getDefaultInstance();
            case "mega/metagross" -> MegaShowdownItems.METAGROSSITE.get().getDefaultInstance();
            case "mega/pidgeot" -> MegaShowdownItems.PIDGEOTITE.get().getDefaultInstance();
            case "mega/pinsir" -> MegaShowdownItems.PINSIRITE.get().getDefaultInstance();
            case "mega/sableye" -> MegaShowdownItems.SABLENITE.get().getDefaultInstance();
            case "mega/salamence" -> MegaShowdownItems.SALAMENCITE.get().getDefaultInstance();
            case "mega/sceptile" -> MegaShowdownItems.SCEPTILITE.get().getDefaultInstance();
            case "mega/scizor" -> MegaShowdownItems.SCIZORITE.get().getDefaultInstance();
            case "mega/sharpedo" -> MegaShowdownItems.SHARPEDONITE.get().getDefaultInstance();
            case "mega/slowbro" -> MegaShowdownItems.SLOWBRONITE.get().getDefaultInstance();
            case "mega/steelix" -> MegaShowdownItems.STEELIXITE.get().getDefaultInstance();
            case "mega/swampert" -> MegaShowdownItems.SWAMPERTITE.get().getDefaultInstance();
            case "mega/tyranitar" -> MegaShowdownItems.TYRANITARITE.get().getDefaultInstance();
            case "mega/venusaur" -> MegaShowdownItems.VENUSAURITE.get().getDefaultInstance();
            case "mega/absol_z" -> ZamegaItems.ABSOLITEZ.get().getDefaultInstance();
            case "mega/barbaracle" -> ZamegaItems.BARBARACITE.get().getDefaultInstance();
            case "mega/baxcalibur" -> ZamegaItems.BAXCALIBRITE.get().getDefaultInstance();
            case "mega/chandelure" -> ZamegaItems.CHANDELURITE.get().getDefaultInstance();
            case "mega/chesnaught" -> ZamegaItems.CHESNAUGHTITE.get().getDefaultInstance();
            case "mega/chimecho" -> ZamegaItems.CHIMECHITE.get().getDefaultInstance();
            case "mega/clefable" -> ZamegaItems.CLEFABLITE.get().getDefaultInstance();
            case "mega/crabominable" -> ZamegaItems.CRABOMINITE.get().getDefaultInstance();
            case "mega_greater/darkrai_mega" -> ZamegaItems.DARKRANITE.get().getDefaultInstance();
            case "mega/delphox" -> ZamegaItems.DELPHOXITE.get().getDefaultInstance();
            case "mega/dragalge" -> ZamegaItems.DRAGALGITE.get().getDefaultInstance();
            case "mega/dragonite" -> ZamegaItems.DRAGONINITE.get().getDefaultInstance();
            case "mega/drampa" -> ZamegaItems.DRAMPANITE.get().getDefaultInstance();
            case "mega/eelektross" -> ZamegaItems.EELEKTROSSITE.get().getDefaultInstance();
            case "mega/emboar" -> ZamegaItems.EMBOARITE.get().getDefaultInstance();
            case "mega/excadrill" -> ZamegaItems.EXCADRITE.get().getDefaultInstance();
            case "mega/falinks" -> ZamegaItems.FALINKSITE.get().getDefaultInstance();
            case "mega/feraligatr" -> ZamegaItems.FERALIGITE.get().getDefaultInstance();
            case "mega_greater/floette_eternal" -> ZamegaItems.FLOETTITE.get().getDefaultInstance();
            case "mega/froslass" -> ZamegaItems.FROSLASSITE.get().getDefaultInstance();
            case "mega/garchomp_z" -> ZamegaItems.GARCHOMPITEZ.get().getDefaultInstance();
            case "mega/glimmora" -> ZamegaItems.GLIMMORANITE.get().getDefaultInstance();
            case "mega/golisopod" -> ZamegaItems.GOLISOPITE.get().getDefaultInstance();
            case "mega/golurk" -> ZamegaItems.GOLURKITE.get().getDefaultInstance();
            case "mega/greninja" -> ZamegaItems.GRENINJITE.get().getDefaultInstance();
            case "mega/hawlucha" -> ZamegaItems.HAWLUCHANITE.get().getDefaultInstance();
            case "mega_greater/heatran" -> ZamegaItems.HEATRANITE.get().getDefaultInstance();
            case "mega/lucario_z" -> ZamegaItems.LUCARIONITEZ.get().getDefaultInstance();
            case "mega_greater/magearna" -> ZamegaItems.MAGEARNITE.get().getDefaultInstance();
            case "mega/malamar" -> ZamegaItems.MALAMARITE.get().getDefaultInstance();
            case "mega/meganium" -> ZamegaItems.MEGANIUMITE.get().getDefaultInstance();
            case "mega/meowstic_f" -> ZamegaItems.MEOWSTICITE.get().getDefaultInstance();
            case "mega/meowstic_m" -> ZamegaItems.MEOWSTICITE.get().getDefaultInstance();
            case "mega/pyroar" -> ZamegaItems.PYROARITE.get().getDefaultInstance();
            case "mega/raichu_x" -> ZamegaItems.RAICHUNITEX.get().getDefaultInstance();
            case "mega/raichu_y" -> ZamegaItems.RAICHUNITEY.get().getDefaultInstance();
            case "mega/scolipede" -> ZamegaItems.SCOLIPITE.get().getDefaultInstance();
            case "mega/scovillain" -> ZamegaItems.SCOVILLAINITE.get().getDefaultInstance();
            case "mega/scrafty" -> ZamegaItems.SCRAFTINITE.get().getDefaultInstance();
            case "mega/skarmory" -> ZamegaItems.SKARMORITE.get().getDefaultInstance();
            case "mega/staraptor" -> ZamegaItems.STARAPTITE.get().getDefaultInstance();
            case "mega/starmie" -> ZamegaItems.STARMINITE.get().getDefaultInstance();
            case "mega/tatsugiri" -> ZamegaItems.TATSUGIRINITE.get().getDefaultInstance();
            case "mega/victreebel" -> ZamegaItems.VICTREEBELITE.get().getDefaultInstance();
            case "mega_greater/zeraora" -> ZamegaItems.ZERAORITE.get().getDefaultInstance();
            default -> MegaShowdownItems.MEGA_STONE.get().getDefaultInstance();
        };
    }

    public static ItemStack getMaxMushroom() {
        return MegaShowdownBlocks.MAX_MUSHROOM.get().asItem().getDefaultInstance();
    }

    // Reflection to maintain compatibility with older versions
    // To be removed in Cobblemon 1.8 update
    private static void applyEffects(Pokemon pokemon, String effectId, boolean isGmax) {
        try {
            Class<?> effect = getEffectClass();
            Method getEffect = effect.getMethod("getEffect", String.class);
            Object effectInstance = getEffect.invoke( null, effectId);
            runApplyEffects(effect, effectInstance, pokemon, isGmax);
        }
        catch (NoSuchMethodException | ClassNotFoundException | IllegalAccessException | InvocationTargetException e) {
            CobblemonRaidDens.LOGGER.error("Error applying MSD Effect:", e);
        }
    }

    private static Class<?> getEffectClass() throws ClassNotFoundException {
        try {
            return Class.forName("com.github.yajatkaul.mega_showdown.api.codec.Effect");
        }
        catch (ClassNotFoundException e) {
            return Class.forName("com.github.yajatkaul.mega_showdown.codec.Effect");
        }
    }

    private static void runApplyEffects(Class<?> clazz, Object instance, Pokemon pokemon, boolean isGmax) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        try {
            Method method = clazz.getMethod("applyEffects", Pokemon.class, List.class, Optional.class, PokemonEntity.class);
            method.invoke(instance, pokemon, isGmax ? List.of("dynamax_form=gmax") : List.of(), Optional.empty(), null);
        }
        catch (NoSuchMethodException e) {
            Method method = clazz.getMethod("applyEffects", Pokemon.class, List.class, PokemonEntity.class);
            method.invoke(instance, pokemon, isGmax ? List.of("dynamax_form=gmax") : List.of(), null);
        }
    }
}
