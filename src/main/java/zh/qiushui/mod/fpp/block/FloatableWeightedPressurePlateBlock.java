package zh.qiushui.mod.fpp.block;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.WeightedPressurePlateBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.registries.ForgeRegistries;
import zh.qiushui.mod.fpp.FloatablePressurePlates;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class FloatableWeightedPressurePlateBlock extends WeightedPressurePlateBlock {
    private String descriptionId;

    public FloatableWeightedPressurePlateBlock(int maxWeight, Properties properties, BlockSetType type) {
        super(maxWeight, properties, type);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        return true;
    }

    @Override
    public String getDescriptionId() {
        if (this.descriptionId == null) {
            this.descriptionId = Util.makeDescriptionId(
                "block",
                ResourceLocation.withDefaultNamespace(
                    Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(this)).getPath()
                        .replace("floatable_", "")
                )
            );
        }

        return this.descriptionId;
    }
}
