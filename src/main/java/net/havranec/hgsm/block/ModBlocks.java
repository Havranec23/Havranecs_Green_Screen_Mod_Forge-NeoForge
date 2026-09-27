package net.havranec.hgsm.block;

import net.havranec.hgsm.HavranecsGreenScreenMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    // DeferredRegister
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(HavranecsGreenScreenMod.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HavranecsGreenScreenMod.MODID);

    // BLOCKS
    public static final Supplier<Block> GREEN_SCREEN = registerBlock("green_screen",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3f, 1.0f)
                    .sound(SoundType.WOOL)
                    .emissiveRendering((state, world, pos) -> true)
            )
    );

    public static final Supplier<Block> BLUE_SCREEN = registerBlock("blue_screen",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3f, 1.0f)
                    .sound(SoundType.WOOL)
                    .emissiveRendering((state, world, pos) -> true)
            )
    );

    public static final Supplier<Block> WHITE_SCREEN = registerBlock("white_screen",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3f, 1.0f)
                    .sound(SoundType.WOOL)
                    .emissiveRendering((state, world, pos) -> true)
            )
    );

    public static final Supplier<Block> BLACK_SCREEN = registerBlock("black_screen",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3f, 1.0f)
                    .sound(SoundType.WOOL)
                    .emissiveRendering((state, world, pos) -> true)
            )
    );

    public static final Supplier<Block> RED_SCREEN = registerBlock("red_screen",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3f, 1.0f)
                    .sound(SoundType.WOOL)
                    .emissiveRendering((state, world, pos) -> true)
            )
    );

    public static final Supplier<Block> YELLOW_SCREEN = registerBlock("yellow_screen",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3f, 1.0f)
                    .sound(SoundType.WOOL)
                    .emissiveRendering((state, world, pos) -> true)
            )
    );

    public static final Supplier<Block> MAGENTA_SCREEN = registerBlock("magenta_screen",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3f, 1.0f)
                    .sound(SoundType.WOOL)
                    .emissiveRendering((state, world, pos) -> true)
            )
    );

    // REGISTRATION METHODS
    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> blockSupplier) {
        Supplier<T> registeredBlock = BLOCKS.register(name, blockSupplier);
        registerBlockItem(name, registeredBlock);
        return registeredBlock;
    }

    private static <T extends Block> void registerBlockItem(String name, Supplier<T> blockSupplier) {
        ITEMS.register(name, () -> new BlockItem(blockSupplier.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        HavranecsGreenScreenMod.LOGGER.info("Registration of chroma blocks");
    }
}