package net.sleepypuppybailey.herbalspellcraft.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.sleepypuppybailey.herbalspellcraft.HerbalSpellCraft;
import net.sleepypuppybailey.herbalspellcraft.block.ModBlocks;
import net.sleepypuppybailey.herbalspellcraft.item.ModItems;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, HerbalSpellCraft.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        //ITEMS
        //Garnet
        itemModels.generateFlatItem(ModItems.GARNET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_GARNET.get(), ModelTemplates.FLAT_ITEM);
        //Aquamarine
        itemModels.generateFlatItem(ModItems.RAW_AQUAMARINE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.AQUAMARINE.get(), ModelTemplates.FLAT_ITEM);
        //MossAventurine
        itemModels.generateFlatItem(ModItems.RAW_MOSSAVENTURINE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MOSSAVENTURINE.get(), ModelTemplates.FLAT_ITEM);
        //Topaz
        itemModels.generateFlatItem(ModItems.TOPAZ.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_TOPAZ.get(), ModelTemplates.FLAT_ITEM);


        //BLOCKS
        blockModels.createTrivialCube(ModBlocks.GARNET_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAW_GARNET_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.GARNET_ORE.get());
        blockModels.createTrivialCube(ModBlocks.GARNET_DEEPSLATE_ORE.get());
        //AquaMarine
        blockModels.createTrivialCube(ModBlocks.AQUAMARINE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAW_AQUAMARINE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.AQUAMARINE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.AQUAMARINE_DEEPSLATE_ORE.get());
        //Moss Aventurine
        blockModels.createTrivialCube(ModBlocks.RAW_MOSSAVENTURINE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.MOSSAVENTURINE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.MOSSAVENTURINE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.MOSSAVENTURINE_DEEPSLATE_ORE.get());
        //Topaz
        blockModels.createTrivialCube(ModBlocks.TOPAZ_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAW_TOPAZ_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.TOPAZ_ORE.get());
        blockModels.createTrivialCube(ModBlocks.TOPAZ_DEEPSLATE_ORE.get());
    }
}
