package zh.qiushui.mod.fpp.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.BasePressurePlateBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import zh.qiushui.mod.fpp.FloatablePressurePlates;
import zh.qiushui.mod.fpp.block.FloatablePressurePlateBlock;
import zh.qiushui.mod.fpp.block.FloatableWeightedPressurePlateBlock;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

@SuppressWarnings("unused")
public class ModBlocks {
    public static final List<Supplier<BasePressurePlateBlock>> PRESSURE_PLATES = new ArrayList<>();
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
        ForgeRegistries.BLOCKS,
        FloatablePressurePlates.MOD_ID
    );
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
        ForgeRegistries.ITEMS,
        FloatablePressurePlates.MOD_ID
    );

    public static final RegistryObject<FloatablePressurePlateBlock> FLOATABLE_STONE_PRESSURE_PLATE = registerNormal(
        "floatable_stone_pressure_plate",
        PressurePlateBlock.Sensitivity.MOBS,
        properties -> properties
            .mapColor(MapColor.STONE)
            .forceSolidOn()
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .noCollission()
            .strength(0.5F),
        BlockSetType.STONE
    );
    public static final RegistryObject<BlockItem> FLOATABLE_STONE_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_STONE_PRESSURE_PLATE
    );
    public static final RegistryObject<FloatablePressurePlateBlock> FLOATABLE_OAK_PRESSURE_PLATE = registerNormal(
        "floatable_oak_pressure_plate",
        PressurePlateBlock.Sensitivity.EVERYTHING,
        properties -> properties
            .mapColor(Blocks.OAK_PLANKS.defaultMapColor())
            .forceSolidOn()
            .instrument(NoteBlockInstrument.BASS)
            .noCollission()
            .strength(0.5F)
            .ignitedByLava(),
        BlockSetType.OAK
    );
    public static final RegistryObject<BlockItem> FLOATABLE_OAK_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_OAK_PRESSURE_PLATE
    );
    public static final RegistryObject<FloatablePressurePlateBlock> FLOATABLE_SPRUCE_PRESSURE_PLATE = registerNormal(
        "floatable_spruce_pressure_plate",
        PressurePlateBlock.Sensitivity.EVERYTHING,
        properties -> properties
            .mapColor(Blocks.SPRUCE_PLANKS.defaultMapColor())
            .forceSolidOn()
            .instrument(NoteBlockInstrument.BASS)
            .noCollission()
            .strength(0.5F)
            .ignitedByLava(),
        BlockSetType.SPRUCE
    );
    public static final RegistryObject<BlockItem> FLOATABLE_SPRUCE_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_SPRUCE_PRESSURE_PLATE
    );
    public static final RegistryObject<FloatablePressurePlateBlock> FLOATABLE_BIRCH_PRESSURE_PLATE = registerNormal(
        "floatable_birch_pressure_plate",
        PressurePlateBlock.Sensitivity.EVERYTHING,
        properties -> properties
            .mapColor(Blocks.BIRCH_PLANKS.defaultMapColor())
            .forceSolidOn()
            .instrument(NoteBlockInstrument.BASS)
            .noCollission()
            .strength(0.5F)
            .ignitedByLava(),
        BlockSetType.BIRCH
    );
    public static final RegistryObject<BlockItem> FLOATABLE_BIRCH_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_BIRCH_PRESSURE_PLATE
    );
    public static final RegistryObject<FloatablePressurePlateBlock> FLOATABLE_JUNGLE_PRESSURE_PLATE = registerNormal(
        "floatable_jungle_pressure_plate",
        PressurePlateBlock.Sensitivity.EVERYTHING,
        properties -> properties
            .mapColor(Blocks.JUNGLE_PLANKS.defaultMapColor())
            .forceSolidOn()
            .instrument(NoteBlockInstrument.BASS)
            .noCollission()
            .strength(0.5F)
            .ignitedByLava(),
        BlockSetType.JUNGLE
    );
    public static final RegistryObject<BlockItem> FLOATABLE_JUNGLE_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_JUNGLE_PRESSURE_PLATE
    );
    public static final RegistryObject<FloatablePressurePlateBlock> FLOATABLE_ACACIA_PRESSURE_PLATE = registerNormal(
        "floatable_acacia_pressure_plate",
        PressurePlateBlock.Sensitivity.EVERYTHING,
        properties -> properties
            .mapColor(Blocks.ACACIA_PLANKS.defaultMapColor())
            .forceSolidOn()
            .instrument(NoteBlockInstrument.BASS)
            .noCollission()
            .strength(0.5F)
            .ignitedByLava(),
        BlockSetType.ACACIA
    );
    public static final RegistryObject<BlockItem> FLOATABLE_ACACIA_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_ACACIA_PRESSURE_PLATE
    );
    public static final RegistryObject<FloatablePressurePlateBlock> FLOATABLE_CHERRY_PRESSURE_PLATE = registerNormal(
        "floatable_cherry_pressure_plate",
        PressurePlateBlock.Sensitivity.EVERYTHING,
        properties -> properties
            .mapColor(Blocks.CHERRY_PLANKS.defaultMapColor())
            .forceSolidOn()
            .instrument(NoteBlockInstrument.BASS)
            .noCollission()
            .strength(0.5F)
            .ignitedByLava(),
        BlockSetType.CHERRY
    );
    public static final RegistryObject<BlockItem> FLOATABLE_CHERRY_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_CHERRY_PRESSURE_PLATE
    );
    public static final RegistryObject<FloatablePressurePlateBlock> FLOATABLE_DARK_OAK_PRESSURE_PLATE = registerNormal(
        "floatable_dark_oak_pressure_plate",
        PressurePlateBlock.Sensitivity.EVERYTHING,
        properties -> properties
            .mapColor(Blocks.DARK_OAK_PLANKS.defaultMapColor())
            .forceSolidOn()
            .instrument(NoteBlockInstrument.BASS)
            .noCollission()
            .strength(0.5F)
            .ignitedByLava(),
        BlockSetType.DARK_OAK
    );
    public static final RegistryObject<BlockItem> FLOATABLE_DARK_OAK_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_DARK_OAK_PRESSURE_PLATE
    );
    public static final RegistryObject<FloatablePressurePlateBlock> FLOATABLE_MANGROVE_PRESSURE_PLATE = registerNormal(
        "floatable_mangrove_pressure_plate",
        PressurePlateBlock.Sensitivity.EVERYTHING,
        properties -> properties
            .mapColor(Blocks.MANGROVE_PLANKS.defaultMapColor())
            .forceSolidOn()
            .instrument(NoteBlockInstrument.BASS)
            .noCollission()
            .strength(0.5F)
            .ignitedByLava(),
        BlockSetType.MANGROVE
    );
    public static final RegistryObject<BlockItem> FLOATABLE_MANGROVE_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_MANGROVE_PRESSURE_PLATE
    );
    public static final RegistryObject<FloatablePressurePlateBlock> FLOATABLE_BAMBOO_PRESSURE_PLATE = registerNormal(
        "floatable_bamboo_pressure_plate",
        PressurePlateBlock.Sensitivity.EVERYTHING,
        properties -> properties
            .mapColor(Blocks.BAMBOO_PLANKS.defaultMapColor())
            .forceSolidOn()
            .instrument(NoteBlockInstrument.BASS)
            .noCollission()
            .strength(0.5F)
            .ignitedByLava(),
        BlockSetType.BAMBOO
    );
    public static final RegistryObject<BlockItem> FLOATABLE_BAMBOO_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_BAMBOO_PRESSURE_PLATE
    );
    public static final RegistryObject<FloatablePressurePlateBlock> FLOATABLE_CRIMSON_PRESSURE_PLATE = registerNormal(
        "floatable_crimson_pressure_plate",
        PressurePlateBlock.Sensitivity.EVERYTHING,
        properties -> properties
            .mapColor(Blocks.CRIMSON_PLANKS.defaultMapColor())
            .forceSolidOn()
            .instrument(NoteBlockInstrument.BASS)
            .noCollission()
            .strength(0.5F),
        BlockSetType.CRIMSON
    );
    public static final RegistryObject<BlockItem> FLOATABLE_CRIMSON_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_CRIMSON_PRESSURE_PLATE
    );
    public static final RegistryObject<FloatablePressurePlateBlock> FLOATABLE_WARPED_PRESSURE_PLATE = registerNormal(
        "floatable_warped_pressure_plate",
        PressurePlateBlock.Sensitivity.EVERYTHING,
        properties -> properties
            .mapColor(Blocks.WARPED_PLANKS.defaultMapColor())
            .forceSolidOn()
            .instrument(NoteBlockInstrument.BASS)
            .noCollission()
            .strength(0.5F),
        BlockSetType.WARPED
    );
    public static final RegistryObject<BlockItem> FLOATABLE_WARPED_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_WARPED_PRESSURE_PLATE
    );
    public static final RegistryObject<FloatableWeightedPressurePlateBlock> FLOATABLE_LIGHT_WEIGHTED_PRESSURE_PLATE = registerWeighted(
        "floatable_light_weighted_pressure_plate",
        15,
        properties -> properties
            .mapColor(MapColor.GOLD)
            .forceSolidOn()
            .requiresCorrectToolForDrops()
            .noCollission()
            .strength(0.5F),
        BlockSetType.GOLD
    );
    public static final RegistryObject<BlockItem> FLOATABLE_LIGHT_WEIGHTED_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_LIGHT_WEIGHTED_PRESSURE_PLATE
    );
    public static final RegistryObject<FloatableWeightedPressurePlateBlock> FLOATABLE_HEAVY_WEIGHTED_PRESSURE_PLATE = registerWeighted(
        "floatable_heavy_weighted_pressure_plate",
        150,
        properties -> properties
            .mapColor(MapColor.METAL)
            .forceSolidOn()
            .requiresCorrectToolForDrops()
            .noCollission()
            .strength(0.5F),
        BlockSetType.IRON
    );
    public static final RegistryObject<BlockItem> FLOATABLE_HEAVY_WEIGHTED_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_HEAVY_WEIGHTED_PRESSURE_PLATE
    );
    public static final RegistryObject<FloatablePressurePlateBlock> FLOATABLE_POLISHED_BLACKSTONE_PRESSURE_PLATE = registerNormal(
        "floatable_polished_blackstone_pressure_plate",
        PressurePlateBlock.Sensitivity.MOBS,
        properties -> properties
            .mapColor(MapColor.COLOR_BLACK)
            .forceSolidOn()
            .instrument(NoteBlockInstrument.BASEDRUM)
            .requiresCorrectToolForDrops()
            .noCollission()
            .strength(0.5F),
        BlockSetType.POLISHED_BLACKSTONE
    );
    public static final RegistryObject<BlockItem> FLOATABLE_POLISHED_BLACKSTONE_PRESSURE_PLATE_ITEM = registerBlockItem(
        FLOATABLE_POLISHED_BLACKSTONE_PRESSURE_PLATE
    );

    private static RegistryObject<FloatablePressurePlateBlock> registerNormal(
        String name,
        PressurePlateBlock.Sensitivity sensitivity,
        UnaryOperator<BlockBehaviour.Properties> properties,
        BlockSetType type
    ) {
        RegistryObject<FloatablePressurePlateBlock> blockObj = BLOCKS.register(
            name, () -> new FloatablePressurePlateBlock(
                sensitivity,
                properties.apply(BlockBehaviour.Properties.of()),
                type
            )
        );
        PRESSURE_PLATES.add(blockObj::get);
        return blockObj;
    }

    private static RegistryObject<FloatableWeightedPressurePlateBlock> registerWeighted(
        String name,
        int weight,
        UnaryOperator<BlockBehaviour.Properties> properties,
        BlockSetType type
    ) {
        RegistryObject<FloatableWeightedPressurePlateBlock> blockObj = BLOCKS.register(
            name, () -> new FloatableWeightedPressurePlateBlock(
                weight,
                properties.apply(BlockBehaviour.Properties.of()),
                type
            )
        );
        PRESSURE_PLATES.add(blockObj::get);
        return blockObj;
    }

    private static RegistryObject<BlockItem> registerBlockItem(RegistryObject<? extends Block> block) {
        return ITEMS.register(
            Objects.requireNonNull(block.getId()).getPath(),
            () -> new BlockItem(block.get(), new Item.Properties())
        );
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
