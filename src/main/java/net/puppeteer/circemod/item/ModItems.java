package net.puppeteer.circemod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.puppeteer.circemod.CirceMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CirceMod.MOD_ID);
//Register your custom item
    public static final DeferredItem<Item> MOLY = ITEMS.registerItem("moly",
        Item::new, new Item.Properties());
    public static final DeferredItem<Item> MOLY_ROOT = ITEMS.registerItem("moly_root",
            Item::new, new Item.Properties());


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
