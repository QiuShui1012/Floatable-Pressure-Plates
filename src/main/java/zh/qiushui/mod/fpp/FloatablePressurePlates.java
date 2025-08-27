package zh.qiushui.mod.fpp;

import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import zh.qiushui.mod.fpp.data.FloatableDataProvider;
import zh.qiushui.mod.fpp.data.FloatableRecipeProvider;
import zh.qiushui.mod.fpp.data.LangHandler;
import zh.qiushui.mod.fpp.init.ModBlocks;
import zh.qiushui.mod.fpp.init.ModItemGroups;

@Mod(FloatablePressurePlates.MOD_ID)
public class FloatablePressurePlates {
    public static final String MOD_ID = "fpp";

    @SuppressWarnings("removal")
    public FloatablePressurePlates() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(modEventBus);
        ModItemGroups.register(modEventBus);

        modEventBus.addListener(FloatablePressurePlates::onGatherData);
    }

    public static void onGatherData(GatherDataEvent event) {
        FloatableDataProvider.provide(event);
        FloatableRecipeProvider.provide(event);
        LangHandler.provide(event);
    }
}
