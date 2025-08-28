package zh.qiushui.mod.fpp.data.lang;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import zh.qiushui.mod.fpp.FloatablePressurePlates;
import zh.qiushui.mod.fpp.init.ModBlocks;

public class EnUs extends LanguageProvider {
    public EnUs(PackOutput output) {
        super(output, FloatablePressurePlates.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add("itemGroup.fpp.main", "Floatable Pressure Plates");
        this.addBlock(ModBlocks.FLOATABLE_ACACIA_PRESSURE_PLATE, "Floatable Acacia Pressure Plate");
        this.addBlock(ModBlocks.FLOATABLE_BAMBOO_PRESSURE_PLATE, "Floatable Bamboo Pressure Plate");
        this.addBlock(ModBlocks.FLOATABLE_BIRCH_PRESSURE_PLATE, "Floatable Birch Pressure Plate");
        this.addBlock(ModBlocks.FLOATABLE_CHERRY_PRESSURE_PLATE, "Floatable Cherry Pressure Plate");
        this.addBlock(ModBlocks.FLOATABLE_CRIMSON_PRESSURE_PLATE, "Floatable Crimson Pressure Plate");
        this.addBlock(ModBlocks.FLOATABLE_DARK_OAK_PRESSURE_PLATE, "Floatable Dark Oak Pressure Plate");
        this.addBlock(ModBlocks.FLOATABLE_HEAVY_WEIGHTED_PRESSURE_PLATE, "Floatable Heavy Weighted Pressure Plate");
        this.addBlock(ModBlocks.FLOATABLE_JUNGLE_PRESSURE_PLATE, "Floatable Jungle Pressure Plate");
        this.addBlock(ModBlocks.FLOATABLE_LIGHT_WEIGHTED_PRESSURE_PLATE, "Floatable Light Weighted Pressure Plate");
        this.addBlock(ModBlocks.FLOATABLE_MANGROVE_PRESSURE_PLATE, "Floatable Mangrove Pressure Plate");
        this.addBlock(ModBlocks.FLOATABLE_OAK_PRESSURE_PLATE, "Floatable Oak Pressure Plate");
        this.addBlock(ModBlocks.FLOATABLE_POLISHED_BLACKSTONE_PRESSURE_PLATE, "Floatable Polished Blackstone Pressure Plate");
        this.addBlock(ModBlocks.FLOATABLE_SPRUCE_PRESSURE_PLATE, "Floatable Spruce Pressure Plate");
        this.addBlock(ModBlocks.FLOATABLE_STONE_PRESSURE_PLATE, "Floatable Stone Pressure Plate");
        this.addBlock(ModBlocks.FLOATABLE_WARPED_PRESSURE_PLATE, "Floatable Warped Pressure Plate");
    }
}