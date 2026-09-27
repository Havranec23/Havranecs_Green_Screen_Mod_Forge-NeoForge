package net.havranec.hgsm;

import net.havranec.hgsm.block.ModBlocks;
import net.havranec.hgsm.item.ModItemGroups;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(HavranecsGreenScreenMod.MODID)
public class HavranecsGreenScreenMod {
    public static final String MODID = "hgsm";
    public static final Logger LOGGER = LogManager.getLogger();

    public HavranecsGreenScreenMod(IEventBus modEventBus) {
        // Initialization
        ModBlocks.register(modEventBus);
        ModItemGroups.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Initializing HavranecsGreenScreenMod (NeoForge)");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Server is starting!");
    }
}