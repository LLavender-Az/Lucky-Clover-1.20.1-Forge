package net.lavender.lavendersdelight.datagen;

import net.lavender.lavendersdelight.LavendersDelight;
import net.lavender.lavendersdelight.datagen.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, LavendersDelight.MOD_ID);
    }

    @Override
    protected void start() {

   //     add("peach_from_birch_leaves", new AddItemModifier(new LootItemCondition[] {
   //             LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.BIRCH_LEAVES).build(),
   //             LootItemRandomChanceCondition.randomChance(0.18f).build()}, FoodInit.PEACH.get()));

   //     add("pinecone_from_spruce_leaves", new AddItemModifier(new LootItemCondition[] {
   //             LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SPRUCE_LEAVES).build(),
   //             LootItemRandomChanceCondition.randomChance(0.18f).build()}, ItemInit.PINECONE.get()));

   //     add("lemon_from_mangrove_leaves", new AddItemModifier(new LootItemCondition[] {
   //             LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.MANGROVE_LEAVES).build(),
   //             LootItemRandomChanceCondition.randomChance(0.18f).build()}, FoodInit.LEMON.get()));

   //     add("cherry_from_cherry_leaves", new AddItemModifier(new LootItemCondition[] {
   //             LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.CHERRY_LEAVES).build(),
   //            LootItemRandomChanceCondition.randomChance(0.18f).build()}, FoodInit.CHERRY.get()));

   //     add("large_amethyst_from_amethyst", new AddItemModifier(new LootItemCondition[] {
   //             LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.AMETHYST_CLUSTER).build(),
   //          LootItemRandomChanceCondition.randomChance(0.08f).build()}, ItemInit.LARGE_AMETHYST_CHUNK.get()));




        //add("peach_from_plains_village", new AddItemModifier(new LootItemCondition[] {
       //         new LootTableIdCondition.Builder(new ResourceLocation("chests/plains_village")).build()}, FoodInit.PEACH.get()));

       // add("poppy_seeds_from_plains_village", new AddItemModifier(new LootItemCondition[] {
       //         new LootTableIdCondition.Builder(new ResourceLocation("chests/plains_village")).build()}, FoodInit.POPPY_SEEDS.get()));

       // add("mint_from_plains_village", new AddItemModifier(new LootItemCondition[] {
       //         new LootTableIdCondition.Builder(new ResourceLocation("chests/plains_village")).build()}, FoodInit.MINT.get()));

       // add("mint_from_taiga_village", new AddItemModifier(new LootItemCondition[] {
       //         new LootTableIdCondition.Builder(new ResourceLocation("chests/taiga_village")).build() }, FoodInit.MINT.get()));



    }
}