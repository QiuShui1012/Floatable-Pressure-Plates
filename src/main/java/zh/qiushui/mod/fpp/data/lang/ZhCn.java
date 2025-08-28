package zh.qiushui.mod.fpp.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import zh.qiushui.mod.fpp.FloatablePressurePlates;
import zh.qiushui.mod.fpp.init.ModBlocks;

public class ZhCn extends LanguageProvider {
    public ZhCn(PackOutput output) {
        super(output, FloatablePressurePlates.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        this.add("itemGroup.fpp.main", "可浮空压力板");
        this.addBlock(ModBlocks.FLOATABLE_ACACIA_PRESSURE_PLATE, "可浮空金合欢木压力板");
        this.addBlock(ModBlocks.FLOATABLE_BAMBOO_PRESSURE_PLATE, "可浮空竹压力板");
        this.addBlock(ModBlocks.FLOATABLE_BIRCH_PRESSURE_PLATE, "可浮空白桦木压力板");
        this.addBlock(ModBlocks.FLOATABLE_CHERRY_PRESSURE_PLATE, "可浮空樱花木压力板");
        this.addBlock(ModBlocks.FLOATABLE_CRIMSON_PRESSURE_PLATE, "可浮空绯红木压力板");
        this.addBlock(ModBlocks.FLOATABLE_DARK_OAK_PRESSURE_PLATE, "可浮空深色橡木压力板");
        this.addBlock(ModBlocks.FLOATABLE_HEAVY_WEIGHTED_PRESSURE_PLATE, "可浮空重质测重压力板");
        this.addBlock(ModBlocks.FLOATABLE_JUNGLE_PRESSURE_PLATE, "可浮空丛林木压力板");
        this.addBlock(ModBlocks.FLOATABLE_LIGHT_WEIGHTED_PRESSURE_PLATE, "可浮空轻质测重压力板");
        this.addBlock(ModBlocks.FLOATABLE_MANGROVE_PRESSURE_PLATE, "可浮空红树木压力板");
        this.addBlock(ModBlocks.FLOATABLE_OAK_PRESSURE_PLATE, "可浮空橡木压力板");
        this.addBlock(ModBlocks.FLOATABLE_POLISHED_BLACKSTONE_PRESSURE_PLATE, "可浮空磨制黑石压力板");
        this.addBlock(ModBlocks.FLOATABLE_SPRUCE_PRESSURE_PLATE, "可浮空云杉木压力板");
        this.addBlock(ModBlocks.FLOATABLE_STONE_PRESSURE_PLATE, "可浮空石头压力板");
        this.addBlock(ModBlocks.FLOATABLE_WARPED_PRESSURE_PLATE, "可浮空诡异木压力板");
    }
}
