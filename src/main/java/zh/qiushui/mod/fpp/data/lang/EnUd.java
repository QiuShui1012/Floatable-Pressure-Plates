package zh.qiushui.mod.fpp.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import zh.qiushui.mod.fpp.FloatablePressurePlates;
import zh.qiushui.mod.fpp.init.ModBlocks;

public class EnUd extends LanguageProvider {
    public EnUd(PackOutput output) {
        super(output, FloatablePressurePlates.MOD_ID, "en_ud");
    }

    @Override
    protected void addTranslations() {
        this.add("itemGroup.fpp.main", "sǝʇɐꞁԀ ǝɹnssǝɹԀ ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_ACACIA_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ ɐᴉɔɐɔⱯ ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_BAMBOO_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ ooqɯɐᗺ ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_BIRCH_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ ɥɔɹᴉᗺ ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_CHERRY_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ ʎɹɹǝɥƆ ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_CRIMSON_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ uosɯᴉɹƆ ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_DARK_OAK_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ ʞɐO ʞɹɐᗡ ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_HEAVY_WEIGHTED_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ pǝʇɥᵷᴉǝM ʎʌɐǝH ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_JUNGLE_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ ǝꞁᵷunՐ ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_LIGHT_WEIGHTED_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ pǝʇɥᵷᴉǝM ʇɥᵷᴉꞀ ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_MANGROVE_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ ǝʌoɹᵷuɐW ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_OAK_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ ʞɐO ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_POLISHED_BLACKSTONE_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ ǝuoʇsʞɔɐꞁᗺ pǝɥsᴉꞁoԀ ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_SPRUCE_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ ǝɔnɹdS ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_STONE_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ ǝuoʇS ǝꞁqɐʇɐoꞁℲ");
        this.addBlock(ModBlocks.FLOATABLE_WARPED_PRESSURE_PLATE, "ǝʇɐꞁԀ ǝɹnssǝɹԀ pǝdɹɐM ǝꞁqɐʇɐoꞁℲ");
    }
}
