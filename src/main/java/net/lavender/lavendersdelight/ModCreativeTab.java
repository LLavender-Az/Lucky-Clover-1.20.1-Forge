package net.lavender.lavendersdelight;

import net.lavender.lavendersdelight.common.block.BlockInit;
import net.lavender.lavendersdelight.common.item.FoodInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LavendersDelight.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LAVENDERSDELIGHT_CREATIVE_TAB = CREATIVE_MODE_TABS.register("lavendersdelight_creative_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(FoodInit.FLOWERING_BLOSSOM.get()))
                    .title(Component.literal("Lavenders Delight"))
                    .displayItems((pParameters, pOutput) -> {

                        //blocks
                        pOutput.accept(BlockInit.AZALEA.get());
                        pOutput.accept(FoodInit.FLOWERING_BLOSSOM.get());
                        //plants


                        //foods

                        pOutput.accept(FoodInit.PEACH.get());
                        pOutput.accept(FoodInit.CANDIED_PEACH.get());
                        pOutput.accept(FoodInit.BAKED_PEACH.get());
                        pOutput.accept(FoodInit.PEACH_SLICE.get());
                        pOutput.accept(FoodInit.LEMON.get());
                        pOutput.accept(FoodInit.LEMON_SLICE.get());
                        pOutput.accept(FoodInit.CHERRY.get());
                        pOutput.accept(FoodInit.MINT.get());
                        pOutput.accept(ItemInit.ROOTED_MINT.get());
                        pOutput.accept(ItemInit.PEACH_PIT.get());
                        pOutput.accept(ItemInit.PINECONE.get());
                        pOutput.accept(FoodInit.PINE_NUTS.get());
                        pOutput.accept(ItemInit.PINE_TAR.get());


                        pOutput.accept(FoodInit.MILK_CHOCOLATE.get());
                        pOutput.accept(FoodInit.PEACH_CANDY.get());
                        pOutput.accept(FoodInit.MELON_TANGHULU.get());
                        pOutput.accept(FoodInit.POPPY_SEED_MUFFIN.get());
                        pOutput.accept(FoodInit.LAVENDER_DUMPLING.get());
                        pOutput.accept(FoodInit.PEACH_COOKIE_CRUMBLE.get());
                        pOutput.accept(FoodInit.CHERRY_ROLL.get());
                        pOutput.accept(BlockInit.CHEESE_WHEEL.get());
                        pOutput.accept(FoodInit.CHEESE_WEDGE.get());
                        pOutput.accept(FoodInit.CHEESE_N_FRUITS.get());
                        pOutput.accept(FoodInit.GRILLED_CHEESE.get());
                        pOutput.accept(FoodInit.BREAD_SLICE.get());
                        pOutput.accept(FoodInit.SALTED_MEAT.get());
                        pOutput.accept(FoodInit.BUDDING_GREEN_BLOSSOM.get());
                        pOutput.accept(FoodInit.GRILLED_BROWN_MUSHROOM.get());


                        pOutput.accept(FoodInit.MINT_ICE_CREAM.get());
                        pOutput.accept(FoodInit.CHOCOLATE_ICE_CREAM.get());
                        pOutput.accept(FoodInit.PEACHES_N_CREAM.get());


                        //misc







                        //drinks
                        pOutput.accept(FoodInit.MINT_CHOCOLATE_MILKSHAKE.get());
                        pOutput.accept(FoodInit.MINT_TEA.get());
                        pOutput.accept(FoodInit.SWEET_BERRY_JUICE.get());
                        pOutput.accept(FoodInit.BASE_TEA.get());
                        pOutput.accept(FoodInit.LEMON_TEA.get());
                        pOutput.accept(FoodInit.LEMONADE.get());
                        pOutput.accept(FoodInit.PEACH_JUICE.get());
                        pOutput.accept(FoodInit.CHERRY_SUNSET.get());
                        pOutput.accept(FoodInit.HONEY_MINT_TEA.get());
                        pOutput.accept(FoodInit.GLOWBERRY_JUICE.get());

                        pOutput.accept(FoodInit.PEACH_SODA.get());
                        pOutput.accept(FoodInit.COLA.get());
                        pOutput.accept(FoodInit.CARBONATED_WATER.get());
                        pOutput.accept(FoodInit.LEMON_JUICE.get());
                        pOutput.accept(FoodInit.PEACH_SYRUP.get());
                        pOutput.accept(FoodInit.CHERRY_SYRUP.get());
                        pOutput.accept(FoodInit.MINT_EXTRACT.get());




                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
