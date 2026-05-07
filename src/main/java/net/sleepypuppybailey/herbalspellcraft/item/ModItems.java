package net.sleepypuppybailey.herbalspellcraft.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sleepypuppybailey.herbalspellcraft.HerbalSpellCraft;

public class ModItems {
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HerbalSpellCraft.MOD_ID);

        public static final DeferredItem<Item> GARNET = ITEMS.registerSimpleItem("garnet");
        public static final DeferredItem<Item> RAW_GARNET = ITEMS.registerSimpleItem("raw_garnet");



        public static void register (IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
}
