package zh.qiushui.mod.fpp.data;

import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.BasePressurePlateBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.WeightedPressurePlateBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import zh.qiushui.mod.fpp.FloatablePressurePlates;
import zh.qiushui.mod.fpp.block.FloatablePressurePlateBlock;
import zh.qiushui.mod.fpp.init.ModBlocks;

import java.util.Objects;
import java.util.function.Supplier;

public class FloatableDataProvider {
    public static void provide(GatherDataEvent event) {
        ExistingFileHelper helper = event.getExistingFileHelper();
        event.getGenerator().addProvider(true, (DataProvider.Factory<Blocks>) output -> new Blocks(output, helper));
        event.getGenerator().addProvider(true, (DataProvider.Factory<Items>) output -> new Items(output, helper));
    }

    private static class Blocks extends BlockStateProvider {
        public Blocks(PackOutput output, ExistingFileHelper helper) {
            super(output, FloatablePressurePlates.MOD_ID, helper);
        }

        @Override
        protected void registerStatesAndModels() {
            for (Supplier<BasePressurePlateBlock> blockGetter : ModBlocks.PRESSURE_PLATES) {
                Block block = blockGetter.get();
                String blockId = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();
                String originalId = "block/" + blockId.replace("floatable_", "");
                if (block instanceof FloatablePressurePlateBlock) {
                    this.getVariantBuilder(block)
                        .partialState().with(PressurePlateBlock.POWERED, true).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(PressurePlateBlock.POWERED, false).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId))
                        ));
                } else {
                    this.getVariantBuilder(block)
                        .partialState().with(WeightedPressurePlateBlock.POWER, 0).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 1).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 2).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 3).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 4).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 5).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 6).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 7).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 8).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 9).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 10).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 11).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 12).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 13).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 14).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ))
                        .partialState().with(WeightedPressurePlateBlock.POWER, 15).addModels(new ConfiguredModel(
                            new ModelFile.UncheckedModelFile(ResourceLocation.withDefaultNamespace(originalId + "_down"))
                        ));
                }
            }
        }
    }

    private static class Items extends ItemModelProvider {
        public Items(PackOutput output, ExistingFileHelper helper) {
            super(output, FloatablePressurePlates.MOD_ID, helper);
        }

        @Override
        protected void registerModels() {
            for (Supplier<BasePressurePlateBlock> blockGetter : ModBlocks.PRESSURE_PLATES) {
                Block block = blockGetter.get();
                String blockId = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();
                String originalId = blockId.replace("floatable_", "");
                this.withExistingParent(blockId, originalId);
            }
        }
    }
}
