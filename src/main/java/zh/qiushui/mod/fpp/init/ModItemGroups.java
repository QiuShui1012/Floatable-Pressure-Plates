package zh.qiushui.mod.fpp.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import zh.qiushui.mod.fpp.FloatablePressurePlates;

@SuppressWarnings("unused")
public class ModItemGroups {
    public static final DeferredRegister<CreativeModeTab> ITEM_GROUPS = DeferredRegister.create(
        Registries.CREATIVE_MODE_TAB,
        FloatablePressurePlates.MOD_ID
    );

    public static final RegistryObject<CreativeModeTab> MAIN = ITEM_GROUPS.register(
        "main", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable("itemGroup.fpp.main"))
            .icon(() -> ModBlocks.FLOATABLE_OAK_PRESSURE_PLATE_ITEM.get().asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModBlocks.FLOATABLE_OAK_PRESSURE_PLATE_ITEM.get());
                output.accept(ModBlocks.FLOATABLE_SPRUCE_PRESSURE_PLATE_ITEM.get());
                output.accept(ModBlocks.FLOATABLE_BIRCH_PRESSURE_PLATE_ITEM.get());
                output.accept(ModBlocks.FLOATABLE_JUNGLE_PRESSURE_PLATE_ITEM.get());
                output.accept(ModBlocks.FLOATABLE_ACACIA_PRESSURE_PLATE_ITEM.get());
                output.accept(ModBlocks.FLOATABLE_CHERRY_PRESSURE_PLATE_ITEM.get());
                output.accept(ModBlocks.FLOATABLE_DARK_OAK_PRESSURE_PLATE_ITEM.get());
                output.accept(ModBlocks.FLOATABLE_MANGROVE_PRESSURE_PLATE_ITEM.get());
                output.accept(ModBlocks.FLOATABLE_BAMBOO_PRESSURE_PLATE_ITEM.get());
                output.accept(ModBlocks.FLOATABLE_CRIMSON_PRESSURE_PLATE_ITEM.get());
                output.accept(ModBlocks.FLOATABLE_WARPED_PRESSURE_PLATE_ITEM.get());
                output.accept(ModBlocks.FLOATABLE_STONE_PRESSURE_PLATE_ITEM.get());
                output.accept(ModBlocks.FLOATABLE_POLISHED_BLACKSTONE_PRESSURE_PLATE_ITEM.get());
                output.accept(ModBlocks.FLOATABLE_HEAVY_WEIGHTED_PRESSURE_PLATE_ITEM.get());
                output.accept(ModBlocks.FLOATABLE_LIGHT_WEIGHTED_PRESSURE_PLATE_ITEM.get());
            })
            .build()
    );

    public static void register(IEventBus bus) {
        ITEM_GROUPS.register(bus);
    }
}
