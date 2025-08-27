package zh.qiushui.mod.fpp.data;

import net.minecraft.data.DataProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import zh.qiushui.mod.fpp.data.lang.EnUd;
import zh.qiushui.mod.fpp.data.lang.EnUs;
import zh.qiushui.mod.fpp.data.lang.ZhCn;

public class LangHandler {
    public static void provide(GatherDataEvent event) {
        event.getGenerator().addProvider(true, (DataProvider.Factory<EnUs>) EnUs::new);
        event.getGenerator().addProvider(true, (DataProvider.Factory<EnUd>) EnUd::new);
        event.getGenerator().addProvider(true, (DataProvider.Factory<ZhCn>) ZhCn::new);
    }
}
