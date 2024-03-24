package net.lavender.lavendersdelight.common.item;

import net.lavender.lavendersdelight.LavendersDelight;
import net.lavender.lavendersdelight.common.block.BlockInit;
import net.lavender.lavendersdelight.common.item.common.FloweringBlossom;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.Items.registerItem;

public class FoodInit {
    public static final DeferredRegister<Item> FOODS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LavendersDelight.MOD_ID);


    // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z


    public static final RegistryObject<Item> FLOWERING_BLOSSOM = FOODS.register("flowering_blossom",
            () -> new FloweringBlossom(BlockInit.WILD_BLOSSOM.get(), (props().food(Foods.FLOWERING_BLOSSOM))));

    public static final RegistryObject<Item> CARBONATED_ROCK = ITEMS.register("carbonated_rock", () -> new CarbonatedRock(props()));
    public static final RegistryObject<Item> RICE_FLOUR = ITEMS.register("rice_flour", () -> new Item(props()));
    public static final RegistryObject<Item> ROOTED_MINT = ITEMS.register("rooted_mint", () -> new ItemNameBlockItem(BlockInit.MINT_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> PEACH_PIT = ITEMS.register("peach_pit", () -> new Item(props()));
    public static final RegistryObject<Item> PINECONE = ITEMS.register("pinecone", () -> new Item(props()));
    public static final RegistryObject<Item> PINE_TAR = ITEMS.register("pine_tar", () -> new Item(props()));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt", () -> new Item(props()));
    public static final RegistryObject<Item> SPRUCE_TREE_BARK = ITEMS.register("spruce_tree_bark", () -> new Item(props()));
    public static final RegistryObject<Item> TATTERED_LEATHER = ITEMS.register("tattered_leather", () -> new Item(props()));
    public static final RegistryObject<Item> WHEAT_FLOUR = ITEMS.register("wheat_flour", () -> new Item(props()));

    public static final RegistryObject<Item> GRILLED_CHEESE = FOODS.register("grilled_cheese", () -> new Item(props().food(Foods.GRILLED_CHEESE)));

    //cherry
    public static final RegistryObject<Item> CHERRY = FOODS.register("cherry", () -> new Item(props().food(Foods.CHERRY)));
    public static final RegistryObject<Item> CHERRY_ROLL = FOODS.register("cherry_roll", () -> new Item(props().food(Foods.CHERRY_ROLL)));
    public static final RegistryObject<Item> CHERRY_SYRUP = FOODS.register("cherry_syrup", () -> new SyrupItem(props().craftRemainder(Items.GLASS_BOTTLE).food(Foods.CHERRY_SYRUP)));
    public static final RegistryObject<Item> CHERRY_SUNSET = FOODS.register("cherry_sunset", () -> new MediumEffectRadiantDrink(props().food(Foods.CHERRY_SUNSET)));


    //lemon
    public static final RegistryObject<Item> LEMON = FOODS.register("lemon", () -> new Item(props().food(Foods.LEMON)));
    public static final RegistryObject<Item> LEMON_TEA = FOODS.register("lemon_tea", () -> new StrongEffectRadiantDrink(props().craftRemainder(Items.GLASS_BOTTLE).food(Foods.LEMON_TEA)));
    public static final RegistryObject<Item> LEMONADE = FOODS.register("lemonade", () -> new MediumEffectRadiantDrink(props().food(Foods.LEMONADE)));
    public static final RegistryObject<Item> LEMON_JUICE = FOODS.register("lemon_juice", () -> new DrinkItem(props().craftRemainder(Items.GLASS_BOTTLE).food(Foods.LEMON_JUICE)));
    public static final RegistryObject<Item> LEMON_SLICE = FOODS.register("lemon_slice", () -> new Item(props().food(Foods.LEMON_SLICE)));

    //mint
    public static final RegistryObject<Item> MINT = FOODS.register("mint", () -> new Item(props().food(Foods.MINT)));
    public static final RegistryObject<Item> MINT_EXTRACT = FOODS.register("mint_extract", () -> new MintExtract(props().craftRemainder(Items.GLASS_BOTTLE).food(Foods.MINT_EXTRACT)));
    public static final RegistryObject<Item> MINT_ICE_CREAM = FOODS.register("mint_ice_cream", () -> new IceCreamItem(props().craftRemainder(Items.BOWL).food(Foods.MINT_ICE_CREAM)));
    public static final RegistryObject<Item> MINT_CHOCOLATE_MILKSHAKE = FOODS.register("mint_chocolate_milkshake", () -> new MilkshakeItem(props().food(Foods.MINT_CHOCOLATE_MILKSHAKE)));
    public static final RegistryObject<Item> MINT_TEA = FOODS.register("mint_tea", () -> new StrongEffectStimulatedDrink(props().food(Foods.MINT_TEA)));

    //peaches
    public static final RegistryObject<Item> PEACH = FOODS.register("peach", () -> new Item(props().food(Foods.PEACH)));
    public static final RegistryObject<Item> PEACH_CANDY = FOODS.register("peach_candy", () -> new CandyItem(props().food(Foods.PEACH_CANDY)));
    public static final RegistryObject<Item> PEACH_COOKIE_CRUMBLE = FOODS.register("peach_cookie_crumble", () -> new Item(props().food(Foods.PEACH_COOKIE_CRUMBLE)));
    public static final RegistryObject<Item> PEACH_JUICE = FOODS.register("peach_juice", () -> new MediumEffectRadiantDrink(props().food(Foods.PEACH_JUICE)));
    public static final RegistryObject<Item> PEACHES_N_CREAM = FOODS.register("peaches_n_cream", () -> new IceCreamItem(props().food(Foods.PEACHES_N_CREAM)));
    public static final RegistryObject<Item> PEACH_SLICE = FOODS.register("peach_slice", () -> new Item(props().food(Foods.PEACH_SLICE)));
    public static final RegistryObject<Item> PEACH_SYRUP = FOODS.register("peach_syrup", () -> new SyrupItem(props().craftRemainder(Items.GLASS_BOTTLE).food(Foods.PEACH_SYRUP)));
    public static final RegistryObject<Item> PEACH_SODA = FOODS.register("peach_soda", () -> new SodaItem(props().food(Foods.PEACH_SODA)));
    public static final RegistryObject<Item> BAKED_PEACH = FOODS.register("baked_peach", () -> new Item(props().food(Foods.BAKED_PEACH)));
    public static final RegistryObject<Item> CANDIED_PEACH = FOODS.register("candied_peach", () -> new CandiedItem(props().food(Foods.CANDIED_PEACH)));

    //extra foods
    public static final RegistryObject<Item> SALTED_MEAT = FOODS.register("salted_meat", () -> new SaltedMeat(props().food(Foods.SALTED_MEAT)));
    public static final RegistryObject<Item> BREAD_SLICE = FOODS.register("bread_slice", () -> new Item(props().food(Foods.BREAD_SLICE)));
    public static final RegistryObject<Item> BUDDING_GREEN_BLOSSOM = FOODS.register("budding_green_blossom", () -> new BuddingGreenBlossom(props().food(Foods.BUDDING_GREEN_BLOSSOM)));
    public static final RegistryObject<Item> CARBONATED_WATER = FOODS.register("carbonated_water", () -> new DrinkItem(props().craftRemainder(Items.GLASS_BOTTLE).food(Foods.CARBONATED_WATER)));
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = FOODS.register("chocolate_ice_cream", () -> new StrongEffectRadiantSnack(props().craftRemainder(Items.BOWL).food(Foods.CHOCOLATE_ICE_CREAM)));
    public static final RegistryObject<Item> GLOWBERRY_JUICE = FOODS.register("glowberry_juice", () -> new GlowberryJuice(props().food(Foods.GLOWBERRY_JUICE)));
    public static final RegistryObject<Item> GRILLED_BROWN_MUSHROOM = FOODS.register("grilled_brown_mushroom", () -> new Item(props().food(Foods.GRILLED_BROWN_MUSHROOM)));
    public static final RegistryObject<Item> HONEY_MINT_TEA = FOODS.register("honey_mint_tea", () -> new SmallEffectRadiantDrink(props().food(Foods.HONEY_MINT_TEA)));
    public static final RegistryObject<Item> LAVENDER_DUMPLING = FOODS.register("lavender_dumpling", () -> new Item(props().food(Foods.LAVENDER_DUMPLING)));
    public static final RegistryObject<Item> MILK_CHOCOLATE = FOODS.register("milk_chocolate", () -> new Item(props().food(Foods.MILK_CHOCOLATE)));
    public static final RegistryObject<Item> MELON_TANGHULU = FOODS.register("melon_tanghulu", () -> new CandiedItem(props().food(Foods.MELON_TANGHULU)));
    public static final RegistryObject<Item> PINE_NUTS = FOODS.register("pine_nuts", () -> new Item(props().food(Foods.PINE_NUTS)));
    public static final RegistryObject<Item> POPPY_SEEDS = FOODS.register("poppy_seeds", () -> new Item(props().food(Foods.POPPY_SEEDS)));
    public static final RegistryObject<Item> POPPY_SEED_MUFFIN = FOODS.register("poppy_seed_muffin", () -> new Item(props().food(Foods.POPPY_SEED_MUFFIN)));
    public static final RegistryObject<Item> BASE_TEA = FOODS.register("base_tea", () -> new DrinkItem(props().craftRemainder(Items.GLASS_BOTTLE).food(Foods.BASE_TEA)));
    public static final RegistryObject<Item> SWEET_BERRY_JUICE = FOODS.register("sweet_berry_juice", () -> new DrinkItem(props().food(Foods.SWEET_BERRY_JUICE)));
    public static final RegistryObject<Item> COLA = FOODS.register("cola", () -> new SodaItem(props().food(Foods.COLA)));

    private static Item.Properties props() {
        return new Item.Properties();
    }

    public static class Foods {
        public static final FoodProperties FLOWERING_BLOSSOM = new FoodProperties.Builder().nutrition(3).saturationMod(0.85f).fast()
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 160, 0), 1.0f).build();



        public static final FoodProperties GRILLED_CHEESE = new FoodProperties.Builder().nutrition(8).saturationMod(0.5f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3600, 0), 1.0f).build();

        //cherry
        public static final FoodProperties CHERRY = new FoodProperties.Builder().nutrition(3).saturationMod(0.4f)
                .effect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 0), 0.8f).build();
        public static final FoodProperties CHERRY_ROLL = new FoodProperties.Builder().nutrition(5).saturationMod(0.45f)
                .effect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 1), 1.0F).build();
        public static final FoodProperties CHERRY_SYRUP = new FoodProperties.Builder().nutrition(2).alwaysEat().saturationMod(0.3f).build();
        public static final FoodProperties CHERRY_SUNSET = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.3f)
                .effect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 0), 1.0f).build();

        //base items
        public static final FoodProperties CARBONATED_WATER = new FoodProperties.Builder().nutrition(0).alwaysEat().saturationMod(0.0f).build();

        //lemon
        public static final FoodProperties LEMON = new FoodProperties.Builder().nutrition(4).saturationMod(0.4f)
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 0.8f).build();
        public static final FoodProperties LEMONADE = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.3f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3600, 0), 1.0f).build();
        public static final FoodProperties LEMON_JUICE = new FoodProperties.Builder().nutrition(0).alwaysEat().saturationMod(0f).build();
        public static final FoodProperties LEMON_SLICE = new FoodProperties.Builder().nutrition(1).saturationMod(0.20f).build();
        public static final FoodProperties LEMON_TEA = new FoodProperties.Builder().nutrition(2).alwaysEat().saturationMod(0.3f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3600, 0), 1.0f).build();

        //mint
        public static final FoodProperties MINT = new FoodProperties.Builder().nutrition(1).saturationMod(0.01f)
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0), 0.8F).fast().build();
        public static final FoodProperties MINT_EXTRACT = new FoodProperties.Builder().nutrition(1).saturationMod(0.3f)
                .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 1), 1.0F).build();
        public static final FoodProperties MINT_ICE_CREAM = new FoodProperties.Builder().nutrition(6).saturationMod(0.5f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 1), 1.0F)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 6000, 0), 1.0f).build();
        public static final FoodProperties MINT_CHOCOLATE_MILKSHAKE = new FoodProperties.Builder().nutrition(7).saturationMod(0.5f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 1), 1.0F)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 6000, 0), 1.0f).build();
        public static final FoodProperties MINT_TEA = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.3f)
                .effect(() -> new MobEffectInstance(ModEffects.STIMULATED.get(), 6000, 0), 1.0f).build();

        //peaches
        public static final FoodProperties PEACH = new FoodProperties.Builder().nutrition(4).saturationMod(0.38f)
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 0.8f).build();
        public static final FoodProperties PEACH_CANDY = new FoodProperties.Builder().nutrition(1).saturationMod(0.25f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1.0f).fast().build();
        public static final FoodProperties PEACH_COOKIE_CRUMBLE = new FoodProperties.Builder().nutrition(5).saturationMod(0.45f)
                .effect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 1), 1.0F).build();
        public static final FoodProperties PEACH_JUICE = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.3f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 3600, 0), 1.0f).build();
        public static final FoodProperties PEACHES_N_CREAM = new FoodProperties.Builder().nutrition(6).saturationMod(0.5f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 1), 1.0F)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 6000, 0), 1.0f).build();
        public static final FoodProperties PEACH_SLICE = new FoodProperties.Builder().nutrition(2).fast().saturationMod(0.20f).build();
        public static final FoodProperties PEACH_SYRUP = new FoodProperties.Builder().nutrition(2).alwaysEat().saturationMod(0.3f).build();
        public static final FoodProperties PEACH_SODA = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.3f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0), 1.0f).build();
        public static final FoodProperties BAKED_PEACH = new FoodProperties.Builder().nutrition(5).saturationMod(0.4f).build();
        public static final FoodProperties CANDIED_PEACH = new FoodProperties.Builder().nutrition(4).saturationMod(0.5f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 600, 0), 1.0f).build();

        //extra foods
        public static final FoodProperties POPPY_SEEDS = new FoodProperties.Builder().nutrition(0).fast().saturationMod(0.2f).build();
        public static final FoodProperties POPPY_SEED_MUFFIN = new FoodProperties.Builder().nutrition(5).saturationMod(0.45f).build();
        public static final FoodProperties PINE_NUTS = new FoodProperties.Builder().nutrition(0).fast().saturationMod(0.2f).build();
        public static final FoodProperties BASE_TEA = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.8f).build();
        public static final FoodProperties SWEET_BERRY_JUICE = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 0), 1.0f).build();
        public static final FoodProperties MELON_TANGHULU = new FoodProperties.Builder().nutrition(3).saturationMod(0.45f).build();
        public static final FoodProperties MILK_CHOCOLATE = new FoodProperties.Builder().nutrition(4).saturationMod(0.40f).build();
        public static final FoodProperties GLOWBERRY_JUICE = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.3f)
                .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 600, 0), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0), 1.0f).build();
        public static final FoodProperties HONEY_MINT_TEA = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.3f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 600, 0), 1.0f)
                .effect(() -> new MobEffectInstance(ModEffects.STIMULATED.get(), 600, 0), 1.0f).build();
        public static final FoodProperties SALTED_MEAT = new FoodProperties.Builder().nutrition(10).saturationMod(0.8f)
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0), 1.0f).build();
        public static final FoodProperties BREAD_SLICE = new FoodProperties.Builder().nutrition(2).saturationMod(0.5f).build();
        public static final FoodProperties CHOCOLATE_ICE_CREAM = new FoodProperties.Builder().nutrition(6).saturationMod(0.5f)
                .effect(() -> new MobEffectInstance(ModEffects.RADIANT.get(), 6000, 0),1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 1),1.0f).build();
        public static final FoodProperties BUDDING_GREEN_BLOSSOM = new FoodProperties.Builder().nutrition(2).fast().saturationMod(0.3f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1.0f).build();
        public static final FoodProperties LAVENDER_DUMPLING = new FoodProperties.Builder().nutrition(5).saturationMod(0.45f).build();
        public static final FoodProperties GRILLED_BROWN_MUSHROOM = new FoodProperties.Builder().nutrition(5).saturationMod(0.4f).build();
        public static final FoodProperties COLA = new FoodProperties.Builder().nutrition(3).alwaysEat().saturationMod(0.3f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0), 1.0f).build();

    }
}