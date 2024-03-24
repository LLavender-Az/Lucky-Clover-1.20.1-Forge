package net.lavender.lavendersdelight.common.item.common;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;


public class MilkshakeItem extends SyrupItem {
    public MilkshakeItem(Properties properties) {
        super(properties);
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.literal("Radiant 5:00").withStyle(ChatFormatting.BLUE));
        } else {
            components.add(Component.literal("Radiant 5:00").withStyle(ChatFormatting.BLUE));
        }

        super.appendHoverText(stack, level, components, flag);
    }
}
