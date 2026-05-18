package net.sleepypuppybailey.herbalspellcraft.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sleepypuppybailey.herbalspellcraft.block.ModBlocks;
import net.sleepypuppybailey.herbalspellcraft.item.ModItems;

import java.util.Set;

public class ModBlockLootTableprovider extends BlockLootSubProvider {
    public ModBlockLootTableprovider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.GARNET_BLOCK.get());
        dropSelf(ModBlocks.RAW_GARNET_BLOCK.get());
        dropSelf(ModBlocks.AQUAMARINE_BLOCK.get());
        dropSelf(ModBlocks.RAW_AQUAMARINE_BLOCK.get());
        dropSelf(ModBlocks.MOSSAVENTURINE_BLOCK.get());
        dropSelf(ModBlocks.RAW_MOSSAVENTURINE_BLOCK.get());
        dropSelf(ModBlocks.RAW_TOPAZ_BLOCK.get());
        dropSelf(ModBlocks.TOPAZ_BLOCK.get());

        add(ModBlocks.GARNET_ORE.get(), createOreDrop(ModBlocks.GARNET_ORE.get(), ModItems.RAW_GARNET.get() ));
        add(ModBlocks.GARNET_DEEPSLATE_ORE.get(), createOreDrop(ModBlocks.GARNET_DEEPSLATE_ORE.get(), ModItems.RAW_GARNET.get() ));
        add(ModBlocks.AQUAMARINE_ORE.get(), createOreDrop(ModBlocks.AQUAMARINE_ORE.get(), ModItems.RAW_AQUAMARINE.get() ));
        add(ModBlocks.AQUAMARINE_DEEPSLATE_ORE.get(), createOreDrop(ModBlocks.AQUAMARINE_DEEPSLATE_ORE.get(), ModItems.RAW_AQUAMARINE.get() ));
        add(ModBlocks.MOSSAVENTURINE_ORE.get(), createOreDrop(ModBlocks.MOSSAVENTURINE_ORE.get(), ModItems.RAW_MOSSAVENTURINE.get() ));
        add(ModBlocks.MOSSAVENTURINE_DEEPSLATE_ORE.get(), createOreDrop(ModBlocks.MOSSAVENTURINE_DEEPSLATE_ORE.get(), ModItems.RAW_MOSSAVENTURINE.get() ));
        add(ModBlocks.TOPAZ_ORE.get(), createOreDrop(ModBlocks.TOPAZ_ORE.get(), ModItems.RAW_TOPAZ.get() ));
        add(ModBlocks.TOPAZ_DEEPSLATE_ORE.get(), createOreDrop(ModBlocks.TOPAZ_DEEPSLATE_ORE.get(), ModItems.RAW_TOPAZ.get() ));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
