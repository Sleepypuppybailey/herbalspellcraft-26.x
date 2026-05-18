package net.sleepypuppybailey.herbalspellcraft.creativemodetab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sleepypuppybailey.herbalspellcraft.HerbalSpellCraft;
import net.sleepypuppybailey.herbalspellcraft.block.ModBlocks;
import net.sleepypuppybailey.herbalspellcraft.item.ModItems;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HerbalSpellCraft.MOD_ID);

    public static final Supplier<CreativeModeTab> HERBALSPELLCRAFT_ITEMS_TAB = CREATIVE_MODE_TABS.register("herbalspellcraft_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GARNET.get()))
                    .title(Component.translatable("creativetab.herbalspellcraft.herbalspellcraft_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Items
                        output.accept(ModItems.RAW_GARNET);
                        output.accept(ModItems.GARNET);
                        output.accept(ModItems.RAW_AQUAMARINE);
                        output.accept(ModItems.AQUAMARINE);
                        output.accept(ModItems.MOSSAVENTURINE);
                        output.accept(ModItems.RAW_MOSSAVENTURINE);
                        output.accept(ModItems.RAW_TOPAZ);
                        output.accept(ModItems.TOPAZ);

                        //Blocks
                        output.accept(ModBlocks.GARNET_BLOCK);
                        output.accept(ModBlocks.RAW_GARNET_BLOCK);
                        output.accept(ModBlocks.RAW_AQUAMARINE_BLOCK);
                        output.accept(ModBlocks.AQUAMARINE_BLOCK);
                        output.accept(ModBlocks.MOSSAVENTURINE_BLOCK);
                        output.accept(ModBlocks.RAW_MOSSAVENTURINE_BLOCK);
                        output.accept(ModBlocks.TOPAZ_BLOCK);
                        output.accept(ModBlocks.RAW_TOPAZ_BLOCK);

                        //Ores
                        output.accept(ModBlocks.GARNET_ORE);
                        output.accept(ModBlocks.GARNET_DEEPSLATE_ORE);
                        output.accept(ModBlocks.AQUAMARINE_ORE);
                        output.accept(ModBlocks.AQUAMARINE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.MOSSAVENTURINE_ORE);
                        output.accept(ModBlocks.MOSSAVENTURINE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.TOPAZ_ORE);
                        output.accept(ModBlocks.TOPAZ_DEEPSLATE_ORE);

                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
