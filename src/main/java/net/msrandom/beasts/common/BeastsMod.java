package net.msrandom.beasts.common;

import com.mojang.logging.LogUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.msrandom.beasts.common.init.BeastsBlocks;
import net.msrandom.beasts.common.init.BeastsEntities;
import net.msrandom.beasts.common.init.BeastsItems;
import net.msrandom.beasts.common.init.BeastsTabs;
import org.slf4j.Logger;

import java.util.function.Supplier;

@Mod(BeastsMod.MODID)
public class BeastsMod {
    public static final String MODID = "beasts";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BeastsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        BeastsItems.ITEMS.register(modEventBus);
        BeastsEntities.ENTITIES.register(modEventBus);
        BeastsBlocks.BLOCKS.register(modEventBus);
        BeastsTabs.CREATIVE_TABS.register(modEventBus);
    }
}