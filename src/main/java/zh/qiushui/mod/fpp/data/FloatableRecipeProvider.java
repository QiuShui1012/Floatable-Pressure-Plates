package zh.qiushui.mod.fpp.data;

import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.BasePressurePlateBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import zh.qiushui.mod.fpp.FloatablePressurePlates;
import zh.qiushui.mod.fpp.init.ModBlocks;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

@ParametersAreNonnullByDefault
public class FloatableRecipeProvider extends RecipeProvider {
    public FloatableRecipeProvider(PackOutput output) {
        super(output);
    }

    public static void provide(GatherDataEvent event) {
        event.getGenerator().addProvider(true, (DataProvider.Factory<FloatableRecipeProvider>) FloatableRecipeProvider::new);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> provider) {
        for (Supplier<BasePressurePlateBlock> blockGetter : ModBlocks.PRESSURE_PLATES) {
            Block block = blockGetter.get();
            ResourceLocation originalId = ResourceLocation.withDefaultNamespace(
                Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath().replace("floatable_", "")
            );
            Block original = Objects.requireNonNull(ForgeRegistries.BLOCKS.getValue(originalId));
            ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, block)
                .requires(original)
                .unlockedBy(getHasName(original), has(original))
                .save(provider);
            ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, original)
                .requires(block)
                .unlockedBy(getHasName(original), has(original))
                .save(provider, FloatablePressurePlates.of(originalId.toString().replace(':', '_')));
        }
    }
}
