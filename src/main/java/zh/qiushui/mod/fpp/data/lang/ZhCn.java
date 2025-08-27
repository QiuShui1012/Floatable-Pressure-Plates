package zh.qiushui.mod.fpp.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import zh.qiushui.mod.fpp.FloatablePressurePlates;

public class ZhCn extends LanguageProvider {
    public ZhCn(PackOutput output) {
        super(output, FloatablePressurePlates.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        this.add("itemGroup.fpp.main", "浮空压力板");
    }
}
