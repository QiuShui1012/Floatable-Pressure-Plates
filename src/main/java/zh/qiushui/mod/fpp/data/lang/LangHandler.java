package zh.qiushui.mod.fpp.data.lang;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.data.event.GatherDataEvent;

public class LangHandler {
    public static void provide(GatherDataEvent event, DataGenerator generator) {
        generator.addProvider(event.includeClient(), (DataProvider.Factory<EnUs>) EnUs::new);
        generator.addProvider(event.includeClient(), (DataProvider.Factory<EnUd>) EnUd::new);
        generator.addProvider(event.includeClient(), (DataProvider.Factory<ZhCn>) ZhCn::new);
    }
}
