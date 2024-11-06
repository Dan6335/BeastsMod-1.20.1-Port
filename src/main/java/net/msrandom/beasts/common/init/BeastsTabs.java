package net.msrandom.beasts.common.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.msrandom.beasts.common.BeastsMod;

import java.util.function.Supplier;

public class BeastsTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BeastsMod.MODID);

    public static final Supplier<CreativeModeTab> BEASTS_MAIN = CREATIVE_TABS.register("beasts_main",
            () -> CreativeModeTab.builder()
                    .title(Component.literal("Beasts Main Tab"))
                    .icon(() -> new ItemStack(BeastsItems.ICON.get()))
                    .displayItems((parameters, populator) -> {
                        BeastsItems.ITEMS.getEntries().stream()
                                .map(RegistryObject::get)
                                .forEach(populator::accept);

                        BeastsBlocks.BLOCKS.getEntries().stream()
                                .map(RegistryObject::get)
                                .forEach(populator::accept);
                    }).build());
}