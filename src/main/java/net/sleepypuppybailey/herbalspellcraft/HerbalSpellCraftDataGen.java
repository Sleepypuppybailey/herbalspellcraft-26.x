package net.sleepypuppybailey.herbalspellcraft;


import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.sleepypuppybailey.herbalspellcraft.datagen.ModModelProvider;

@EventBusSubscriber(modid = HerbalSpellCraft.MOD_ID)
public class HerbalSpellCraftDataGen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();

        generator.addProvider(true, new ModModelProvider(packOutput));
        }
}
