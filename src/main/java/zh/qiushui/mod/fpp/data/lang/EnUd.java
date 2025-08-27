package zh.qiushui.mod.fpp.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import zh.qiushui.mod.fpp.FloatablePressurePlates;

public class EnUd extends LanguageProvider {
    public EnUd(PackOutput output) {
        super(output, FloatablePressurePlates.MOD_ID, "en_ud");
    }

    @Override
    protected void addTranslations() {
        this.add("itemGroup.fpp.main", "sǝʇɐꞁԀ ǝɹnssǝɹԀ ǝꞁqɐʇɐoꞁℲ");
    }
}
