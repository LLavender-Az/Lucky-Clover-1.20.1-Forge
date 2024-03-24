package net.lavender.lavendersdelight.datagen;

import net.lavender.lavendersdelight.LavendersDelight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {





        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(LavendersDelight.MOD_ID, name));
        }
    }

    public static class Items {





        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(LavendersDelight.MOD_ID, name));
        }
    }
}