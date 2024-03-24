package net.lavender.lavendersdelight.common.block;

import net.lavender.lavendersdelight.LavendersDelight;
import net.lavender.lavendersdelight.common.block.common.IronRichGravel;
import net.lavender.lavendersdelight.common.block.common.WildBlossom;
import net.lavender.lavendersdelight.common.item.FoodInit;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LavendersDelight.MOD_ID);
    public static final RegistryObject<Block> IRON_RICH_GRAVEL = BLOCKS.register("iron_rich_gravel",
            () -> new IronRichGravel(BlockBehaviour.Properties.copy(Blocks.GRAVEL).sound(SoundType.GRAVEL)
                    .mapColor(MapColor.RAW_IRON), UniformInt.of(2,4)));
    public static final RegistryObject<Block> WILD_BLOSSOM = BLOCKS.register("wild_blossom",
            () -> new WildBlossom(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> AZALEA = registerBlock("azalea",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 160, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE).instabreak()));
    public static final RegistryObject<Block> POTTED_AZALEA = BLOCKS.register("potted_azalea",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), BlockInit.AZALEA,
                    BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE)));

    public static final RegistryObject<Block> PEACH_CRATE = registerBlock("peach_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> LEMON_CRATE = registerBlock("lemon_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> CHERRY_CRATE = registerBlock("cherry_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> CARBONATED_ROCK_CRATE = registerBlock("carbonated_rock_crate",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.CALCITE)
                    .pushReaction(PushReaction.NORMAL).strength(2, 2).mapColor(MapColor.WOOD)));
    public static final RegistryObject<Block> PEACH_PIT_SACK = registerBlock("peach_pit_sack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> MINT_SACK = registerBlock("mint_sack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));

    public static final RegistryObject<Block> MINT_CROP = registerBlock("mint_crop",
            () -> new MintCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> GREEN_BLOSSOM = registerBlock("green_blossom",
            () -> new FlowerBlock(MobEffects.HEAL, 0, BlockBehaviour.Properties.of().sound(SoundType.GRASS).
                    noCollission().mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> ROSE = registerBlock("rose",
            () -> new FlowerBlock(MobEffects.REGENERATION, 300, BlockBehaviour.Properties.of().sound(SoundType.GRASS).
                    noCollission().mapColor(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> WILD_MINT = registerBlock("wild_mint",
            () -> new FlowerBlock(MobEffects.DAMAGE_RESISTANCE, 300, BlockBehaviour.Properties.of().sound(SoundType.GRASS).
                    noCollission().mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> LAVENDER = registerBlock("lavender",
            () -> new FlowerBlock(MobEffects.HEAL, 300, BlockBehaviour.Properties.of().sound(SoundType.GRASS)
                    .noCollission().mapColor(MapColor.COLOR_PURPLE)));

    public static final RegistryObject<Block> POTTED_MINT = BLOCKS.register("potted_mint",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), BlockInit.WILD_MINT,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ROSE = BLOCKS.register("potted_rose",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), BlockInit.ROSE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_LAVENDER = BLOCKS.register("potted_lavender",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), BlockInit.LAVENDER,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return FoodInit.FOODS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
