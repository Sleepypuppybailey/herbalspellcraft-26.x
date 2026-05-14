package net.sleepypuppybailey.herbalspellcraft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.sleepypuppybailey.herbalspellcraft.HerbalSpellCraft;
import net.sleepypuppybailey.herbalspellcraft.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, HerbalSpellCraft.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.GARNET_BLOCK.get())
                .add(ModBlocks.RAW_GARNET_BLOCK.get())
                .add(ModBlocks.GARNET_ORE.get())
                .add(ModBlocks.GARNET_DEEPSLATE_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GARNET_BLOCK.get())
                .add(ModBlocks.RAW_GARNET_BLOCK.get())
                .add(ModBlocks.GARNET_ORE.get())
                .add(ModBlocks.GARNET_DEEPSLATE_ORE.get());
    }
}
