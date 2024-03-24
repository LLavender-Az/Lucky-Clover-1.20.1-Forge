package net.lavender.lavendersdelight.common.block.common;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;


public class MintTea extends Item {
    public MintTea(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.literal("Stimulated 5:00").withStyle(ChatFormatting.BLUE));
        } else {
            components.add(Component.literal("Stimulated 5:00").withStyle(ChatFormatting.BLUE));
        }

        super.appendHoverText(stack, level, components, flag);
    }
    private final int MAX_STACK_SIZE = 16;

        public ItemStack finishUsingItem (ItemStack p_40684_, Level p_40685_, LivingEntity p_40686_){
            ItemStack itemstack = super.finishUsingItem(p_40684_, p_40685_, p_40686_);
            return p_40686_ instanceof Player && ((Player) p_40686_)
                    .getAbilities().instabuild ? itemstack : new ItemStack(Items.GLASS_BOTTLE);
        }
    }

