package com.necro.raid.dens.common.items.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class KeyCharmItem extends Item {
    String bossName;

    public KeyCharmItem(String boss) {
        super(new Properties().rarity(Rarity.EPIC));
        bossName = boss;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @NotNull TooltipContext context, List<Component> tooltip, @NotNull TooltipFlag flag) {
        tooltip.add(Component.translatable("item.cobblemonraiddens.key_shard.tooltip.1", (this.bossName)).withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.translatable("item.cobblemonraiddens.key_shard.tooltip.2", (this.bossName)).withStyle(ChatFormatting.GRAY));
    }
}
