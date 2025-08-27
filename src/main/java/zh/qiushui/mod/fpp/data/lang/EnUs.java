package zh.qiushui.mod.fpp.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import zh.qiushui.mod.fpp.FloatablePressurePlates;

public class EnUs extends LanguageProvider {
    public EnUs(PackOutput output) {
        super(output, FloatablePressurePlates.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add("itemGroup.fpp.main", "Floatable Pressure Plates");
    }
}
