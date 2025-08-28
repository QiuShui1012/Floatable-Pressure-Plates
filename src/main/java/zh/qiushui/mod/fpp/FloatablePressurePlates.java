package zh.qiushui.mod.fpp;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import zh.qiushui.mod.fpp.data.FloatableDataProvider;
import zh.qiushui.mod.fpp.data.FloatableRecipeProvider;
import zh.qiushui.mod.fpp.data.FloatableTagProvider;
import zh.qiushui.mod.fpp.data.lang.LangHandler;
import zh.qiushui.mod.fpp.data.loot.FloatableLootTableProvider;
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

    public static ResourceLocation of(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static void onGatherData(GatherDataEvent event) {
        FloatableDataProvider.provide(event, event.getGenerator(), event.getExistingFileHelper());
        FloatableLootTableProvider.provide(event, event.getGenerator());
        FloatableRecipeProvider.provide(event, event.getGenerator());
        FloatableTagProvider.provide(event, event.getGenerator(), event.getExistingFileHelper());
        LangHandler.provide(event, event.getGenerator());
    }
}
