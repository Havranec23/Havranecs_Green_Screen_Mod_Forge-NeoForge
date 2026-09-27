package net.havranec.hgsm.item;

import net.havranec.hgsm.HavranecsGreenScreenMod;
import net.havranec.hgsm.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItemGroups {
    // DeferredRegister
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HavranecsGreenScreenMod.MODID);

    public static final Supplier<CreativeModeTab> CHROMA_BLOCKS = CREATIVE_MODE_TABS.register("chroma_blocks",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.GREEN_SCREEN.get()))
                    .title(Component.translatable("itemGroup." + HavranecsGreenScreenMod.MODID + ".chroma_blocks"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModBlocks.GREEN_SCREEN.get());
                        output.accept(ModBlocks.BLUE_SCREEN.get());
                        output.accept(ModBlocks.WHITE_SCREEN.get());
                        output.accept(ModBlocks.BLACK_SCREEN.get());
                        output.accept(ModBlocks.RED_SCREEN.get());
                        output.accept(ModBlocks.YELLOW_SCREEN.get());
                        output.accept(ModBlocks.MAGENTA_SCREEN.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
        HavranecsGreenScreenMod.LOGGER.info("Registration of Creative Tab: Chroma Blocks");
    }
}