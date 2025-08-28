package zh.qiushui.mod.fpp.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.Nullable;
import zh.qiushui.mod.fpp.FloatablePressurePlates;
import zh.qiushui.mod.fpp.init.ModBlocks;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;

@ParametersAreNonnullByDefault
public class FloatableTagProvider {
    public static void provide(GatherDataEvent event, DataGenerator generator, ExistingFileHelper helper) {
        CompletableFuture<HolderLookup.Provider> registries = event.getLookupProvider();
        CompletableFuture<TagsProvider.TagLookup<Block>> blockTagLookup = generator.addProvider(
            event.includeServer(),
            (DataProvider.Factory<Blocks>) output -> new Blocks(output, registries, helper)
        ).contentsGetter();
        generator.addProvider(event.includeServer(), (DataProvider.Factory<Items>) output -> new Items(
            output,
            registries,
            blockTagLookup,
            helper
        ));
    }

    private static class Blocks extends BlockTagsProvider {
        public Blocks(
            PackOutput output,
            CompletableFuture<HolderLookup.Provider> registries,
            @Nullable ExistingFileHelper helper
        ) {
            super(output, registries, FloatablePressurePlates.MOD_ID, helper);
        }

        @Override
        protected void addTags(HolderLookup.Provider registries) {
            this.tag(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.FLOATABLE_LIGHT_WEIGHTED_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_HEAVY_WEIGHTED_PRESSURE_PLATE.get());
            this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.FLOATABLE_ACACIA_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_CHERRY_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_BAMBOO_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_BIRCH_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_DARK_OAK_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_JUNGLE_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_MANGROVE_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_OAK_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_SPRUCE_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_CRIMSON_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_WARPED_PRESSURE_PLATE.get());
            this.tag(BlockTags.STONE_PRESSURE_PLATES)
                .add(ModBlocks.FLOATABLE_STONE_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_POLISHED_BLACKSTONE_PRESSURE_PLATE.get());
            this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.FLOATABLE_STONE_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_POLISHED_BLACKSTONE_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_LIGHT_WEIGHTED_PRESSURE_PLATE.get())
                .add(ModBlocks.FLOATABLE_HEAVY_WEIGHTED_PRESSURE_PLATE.get());
        }
    }

    private static class Items extends ItemTagsProvider {
        public Items(
            PackOutput output,
            CompletableFuture<HolderLookup.Provider> registries,
            CompletableFuture<TagLookup<Block>> blockTagLookup,
            @Nullable ExistingFileHelper helper
        ) {
            super(output, registries, blockTagLookup, FloatablePressurePlates.MOD_ID, helper);
        }

        @Override
        protected void addTags(HolderLookup.Provider registries) {
            this.tag(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.FLOATABLE_ACACIA_PRESSURE_PLATE_ITEM.get())
                .add(ModBlocks.FLOATABLE_CHERRY_PRESSURE_PLATE_ITEM.get())
                .add(ModBlocks.FLOATABLE_BAMBOO_PRESSURE_PLATE_ITEM.get())
                .add(ModBlocks.FLOATABLE_BIRCH_PRESSURE_PLATE_ITEM.get())
                .add(ModBlocks.FLOATABLE_DARK_OAK_PRESSURE_PLATE_ITEM.get())
                .add(ModBlocks.FLOATABLE_JUNGLE_PRESSURE_PLATE_ITEM.get())
                .add(ModBlocks.FLOATABLE_MANGROVE_PRESSURE_PLATE_ITEM.get())
                .add(ModBlocks.FLOATABLE_OAK_PRESSURE_PLATE_ITEM.get())
                .add(ModBlocks.FLOATABLE_SPRUCE_PRESSURE_PLATE_ITEM.get())
                .add(ModBlocks.FLOATABLE_CRIMSON_PRESSURE_PLATE_ITEM.get())
                .add(ModBlocks.FLOATABLE_WARPED_PRESSURE_PLATE_ITEM.get());
        }
    }
}
