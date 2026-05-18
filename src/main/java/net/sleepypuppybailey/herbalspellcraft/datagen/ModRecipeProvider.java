package net.sleepypuppybailey.herbalspellcraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.sleepypuppybailey.herbalspellcraft.HerbalSpellCraft;
import net.sleepypuppybailey.herbalspellcraft.block.ModBlocks;
import net.sleepypuppybailey.herbalspellcraft.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "HerbalSpellCraft Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GARNET_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GARNET.get())
                .unlockedBy(getHasName(ModItems.GARNET.get()), has(ModItems.GARNET))
                .group("garnet")
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_GARNET_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_GARNET.get())
                .unlockedBy(getHasName(ModItems.RAW_GARNET.get()), has(ModItems.RAW_GARNET))
                .group("rawgarnet")
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AQUAMARINE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AQUAMARINE.get())
                .unlockedBy(getHasName(ModItems.AQUAMARINE.get()), has(ModItems.AQUAMARINE))
                .group("aquamarine")
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_AQUAMARINE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_AQUAMARINE.get())
                .unlockedBy(getHasName(ModItems.RAW_AQUAMARINE.get()), has(ModItems.RAW_AQUAMARINE))
                .group("rawaquamarine")
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_MOSSAVENTURINE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_MOSSAVENTURINE.get())
                .unlockedBy(getHasName(ModItems.RAW_MOSSAVENTURINE.get()), has(ModItems.RAW_MOSSAVENTURINE))
                .group("rawmossaventurine")
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSAVENTURINE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.MOSSAVENTURINE.get())
                .unlockedBy(getHasName(ModItems.MOSSAVENTURINE.get()), has(ModItems.MOSSAVENTURINE))
                .group("mossaventurine")
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOPAZ_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TOPAZ.get())
                .unlockedBy(getHasName(ModItems.TOPAZ.get()), has(ModItems.TOPAZ))
                .group("topaz")
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_TOPAZ_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_TOPAZ.get())
                .unlockedBy(getHasName(ModItems.RAW_TOPAZ.get()), has(ModItems.RAW_TOPAZ))
                .group("rawtopaz")
                .save(output);



        //Shapeless
        shapeless(RecipeCategory.MISC, ModItems.GARNET.get(), 9)
                .requires(ModBlocks.GARNET_BLOCK)
                .unlockedBy(getHasName(ModBlocks.GARNET_BLOCK.get()), has(ModBlocks.GARNET_BLOCK))
                .group("garnet")
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.AQUAMARINE.get(), 9)
                .requires(ModBlocks.AQUAMARINE_BLOCK)
                .unlockedBy(getHasName(ModBlocks.AQUAMARINE_BLOCK.get()), has(ModBlocks.AQUAMARINE_BLOCK))
                .group("aquamarine")
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.MOSSAVENTURINE.get(), 9)
                .requires(ModBlocks.MOSSAVENTURINE_BLOCK)
                .unlockedBy(getHasName(ModBlocks.MOSSAVENTURINE_BLOCK.get()), has(ModBlocks.MOSSAVENTURINE_BLOCK))
                .group("mossaventurine")
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.TOPAZ.get(), 9)
                .requires(ModBlocks.TOPAZ_BLOCK)
                .unlockedBy(getHasName(ModBlocks.TOPAZ_BLOCK.get()), has(ModBlocks.TOPAZ_BLOCK))
                .group("topaz")
                .save(output);




        List<ItemLike> GARNET_SMELTABLES = List.of(ModItems.RAW_GARNET, ModBlocks.GARNET_ORE,
                ModBlocks.GARNET_DEEPSLATE_ORE);

        oreSmelting(GARNET_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.GARNET.get(), 0.25f, 200, "garnet");
        oreBlasting(GARNET_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.GARNET.get(), 0.25f, 100, "garnet");

        List<ItemLike> AQUAMARINE_SMELTABLES = List.of(ModItems.RAW_AQUAMARINE, ModBlocks.AQUAMARINE_ORE, ModBlocks.AQUAMARINE_DEEPSLATE_ORE);

        oreSmelting(AQUAMARINE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.AQUAMARINE.get(), 0.25f, 200, "aquamarine");
        oreBlasting(AQUAMARINE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.AQUAMARINE.get(), 0.25f, 100, "aquamarine");

        List<ItemLike> MOSSAVENTURINE_SMELTABLES = List.of(ModItems.RAW_MOSSAVENTURINE, ModBlocks.MOSSAVENTURINE_ORE, ModBlocks.MOSSAVENTURINE_DEEPSLATE_ORE);

        oreSmelting(MOSSAVENTURINE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.MOSSAVENTURINE.get(), 0.25f, 200, "mossaventurine");
        oreBlasting(MOSSAVENTURINE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.MOSSAVENTURINE.get(), 0.25f, 100, "mossaventurine");

        List<ItemLike> TOPAZ_SMELTABLE = List.of(ModItems.RAW_MOSSAVENTURINE, ModBlocks.TOPAZ_ORE, ModBlocks.TOPAZ_DEEPSLATE_ORE);

        oreSmelting(TOPAZ_SMELTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TOPAZ.get(),0.25f, 200,"topaz");
        oreBlasting(TOPAZ_SMELTABLE, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TOPAZ.get(), 0.25f, 100, "topaz");

    }

    @Override
    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.Factory<T> factory, List<ItemLike> smeltables,
                                                                RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result,
                                                                float experience, int cookingTime, String group, String fromDesc) {
        for(ItemLike itemlike : smeltables) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), craftingCategory, cookingCategory, result, experience, cookingTime, factory).group(group).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(output, HerbalSpellCraft.MOD_ID + ":" + getItemName(result) + fromDesc + "_" + getItemName(itemlike));
        }
    }
}
