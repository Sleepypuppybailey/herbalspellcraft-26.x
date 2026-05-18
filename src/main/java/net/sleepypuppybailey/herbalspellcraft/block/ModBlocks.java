package net.sleepypuppybailey.herbalspellcraft.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sleepypuppybailey.herbalspellcraft.HerbalSpellCraft;
import net.sleepypuppybailey.herbalspellcraft.item.ModItems;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(HerbalSpellCraft.MOD_ID);
    //Block
    public static final DeferredBlock<Block> GARNET_BLOCK = registerBlock("garnet_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> RAW_GARNET_BLOCK = registerBlock("raw_garnet_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
public static final DeferredBlock<Block> RAW_AQUAMARINE_BLOCK = registerBlock("raw_aquamarine_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> RAW_MOSSAVENTURINE_BLOCK = registerBlock("raw_mossaventurine_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> MOSSAVENTURINE_BLOCK = registerBlock("mossaventurine_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> RAW_TOPAZ_BLOCK = registerBlock("raw_topaz_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));


    //Ore
    public static final DeferredBlock<Block> GARNET_ORE = registerBlock("garnet_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 4), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> GARNET_DEEPSLATE_ORE= registerBlock("garnet_deepslate_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 5), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> AQUAMARINE_DEEPSLATE_ORE= registerBlock("aquamarine_deepslate_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 5), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> AQUAMARINE_ORE = registerBlock("aquamarine_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 4), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MOSSAVENTURINE_ORE = registerBlock("mossaventurine_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 4), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MOSSAVENTURINE_DEEPSLATE_ORE = registerBlock("mossaventurine_deepslate_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 4), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> TOPAZ_ORE= registerBlock("topaz_ore",
                properties -> new DropExperienceBlock(UniformInt.of(2, 4), properties.strength(3f)
                        .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final  DeferredBlock<Block> TOPAZ_DEEPSLATE_ORE = registerBlock("topaz_deepslate_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 5), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));





    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
