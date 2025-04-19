package net.puppeteer.circemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.puppeteer.circemod.CirceMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CirceMod.MOD_ID);

    public static final Supplier<CreativeModeTab> CIRCE_ITEMS_TAB = CREATIVE_MODE_TAB.register("circe_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOLY.get()))
                    .title(Component.translatable("creativetab.circemod.circe_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MOLY);
                        output.accept(ModItems.MOLY_ROOT);

                        output.accept(ModItems.CIRCE_STAFF);

                    }).build());

//    public static final Supplier<CreativeModeTab> CIRCE_MOD_TAB = CREATIVE_MODE_TAB.register("circe_mod_tab",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOLY.get()))
//                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(CirceMod.MOD_ID, "circe_items_tab")) puts this after circe items tab
//                    .title(Component.translatable("creativetab.circemod.circe_mod"))
//                    .displayItems((itemDisplayParameters, output) -> {
//                        output.accept(ModItems.MOLY);
//                        output.accept(ModItems.MOLY_ROOT);
//                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
