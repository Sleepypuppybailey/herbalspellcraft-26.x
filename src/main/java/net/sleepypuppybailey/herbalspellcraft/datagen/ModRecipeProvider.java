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
                .group("azurite")
                .save(output);








        shapeless(RecipeCategory.MISC, ModItems.GARNET.get(), 9)
                .requires(ModBlocks.GARNET_BLOCK)
                .unlockedBy(getHasName(ModBlocks.GARNET_BLOCK.get()), has(ModBlocks.GARNET_BLOCK))
                .group("azurite")
                .save(output);


        List<ItemLike> AZURITE_SMELTABLES = List.of(ModItems.RAW_GARNET, ModBlocks.GARNET_ORE,
                ModBlocks.GARNET_DEEPSLATE_ORE);

        oreSmelting(AZURITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.GARNET.get(), 0.25f, 200, "azurite");
        oreBlasting(AZURITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.GARNET.get(), 0.25f, 100, "azurite");


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
