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
        itemModels.generateFlatItem(ModItems.GARNET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_GARNET.get(), ModelTemplates.FLAT_ITEM);

        //BLOCKS
        blockModels.createTrivialCube(ModBlocks.GARNET_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAW_GARNET_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.GARNET_ORE.get());
        blockModels.createTrivialCube(ModBlocks.GARNET_DEEPSLATE_ORE.get());
    }
}
