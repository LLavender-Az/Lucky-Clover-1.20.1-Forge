package net.lavender.lavendersdelight.common.block.common;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;


public class SaltedMeat extends Item {
    public SaltedMeat(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.literal("Strength I 0:10").withStyle(ChatFormatting.GOLD));
        } else {
            components.add(Component.literal("Strength I 0:10").withStyle(ChatFormatting.GOLD));
        }


        super.appendHoverText(stack, level, components, flag);
    }
}