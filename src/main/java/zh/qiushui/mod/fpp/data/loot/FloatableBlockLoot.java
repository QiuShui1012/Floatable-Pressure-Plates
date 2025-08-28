package zh.qiushui.mod.fpp.data.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import zh.qiushui.mod.fpp.init.ModBlocks;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Set;
import java.util.function.BiConsumer;

@ParametersAreNonnullByDefault
public class FloatableBlockLoot extends BlockLootSubProvider {
    protected FloatableBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
    }

    @Override
    public void generate(BiConsumer<ResourceLocation, LootTable.Builder> writer) {
        this.dropSelf(writer, ModBlocks.FLOATABLE_ACACIA_PRESSURE_PLATE.get());
        this.dropSelf(writer, ModBlocks.FLOATABLE_BAMBOO_PRESSURE_PLATE.get());
        this.dropSelf(writer, ModBlocks.FLOATABLE_BIRCH_PRESSURE_PLATE.get());
        this.dropSelf(writer, ModBlocks.FLOATABLE_CHERRY_PRESSURE_PLATE.get());
        this.dropSelf(writer, ModBlocks.FLOATABLE_CRIMSON_PRESSURE_PLATE.get());
        this.dropSelf(writer, ModBlocks.FLOATABLE_DARK_OAK_PRESSURE_PLATE.get());
        this.dropSelf(writer, ModBlocks.FLOATABLE_HEAVY_WEIGHTED_PRESSURE_PLATE.get());
        this.dropSelf(writer, ModBlocks.FLOATABLE_JUNGLE_PRESSURE_PLATE.get());
        this.dropSelf(writer, ModBlocks.FLOATABLE_LIGHT_WEIGHTED_PRESSURE_PLATE.get());
        this.dropSelf(writer, ModBlocks.FLOATABLE_MANGROVE_PRESSURE_PLATE.get());
        this.dropSelf(writer, ModBlocks.FLOATABLE_OAK_PRESSURE_PLATE.get());
        this.dropSelf(writer, ModBlocks.FLOATABLE_POLISHED_BLACKSTONE_PRESSURE_PLATE.get());
        this.dropSelf(writer, ModBlocks.FLOATABLE_STONE_PRESSURE_PLATE.get());
        this.dropSelf(writer, ModBlocks.FLOATABLE_SPRUCE_PRESSURE_PLATE.get());
        this.dropSelf(writer, ModBlocks.FLOATABLE_WARPED_PRESSURE_PLATE.get());
    }

    private void dropSelf(BiConsumer<ResourceLocation, LootTable.Builder> writer, Block block) {
        writer.accept(block.getLootTable(), this.createSingleItemTable(block));
    }
}
