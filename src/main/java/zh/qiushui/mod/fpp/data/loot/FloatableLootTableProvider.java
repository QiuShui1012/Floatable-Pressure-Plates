package zh.qiushui.mod.fpp.data.loot;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;

@MethodsReturnNonnullByDefault
public class FloatableLootTableProvider extends LootTableProvider {
    public FloatableLootTableProvider(PackOutput output) {
        super(output, Set.of(), List.of(new SubProviderEntry(FloatableBlockLoot::new, LootContextParamSets.BLOCK)));
    }

    public static void provide(GatherDataEvent event, DataGenerator generator) {
        generator.addProvider(event.includeServer(), (Factory<FloatableLootTableProvider>) FloatableLootTableProvider::new);
    }
}
