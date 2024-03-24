package net.lavender.lavendersdelight.common.item.common;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;


public class CandyItem extends Item {
    public CandyItem(Properties properties) {
        super(properties);
    }
    public static final int EAT_DURATION = 24;


    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.literal("Perky 0:15").withStyle(ChatFormatting.GOLD));
        } else {
            components.add(Component.literal("Perky 0:15").withStyle(ChatFormatting.GOLD));
        }

        super.appendHoverText(stack, level, components, flag);
    }
}