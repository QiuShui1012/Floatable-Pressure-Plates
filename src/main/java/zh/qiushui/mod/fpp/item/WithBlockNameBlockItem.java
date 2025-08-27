package zh.qiushui.mod.fpp.item;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.level.block.Block;

@MethodsReturnNonnullByDefault
public class WithBlockNameBlockItem extends net.minecraft.world.item.BlockItem {
    public WithBlockNameBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    public String getDescriptionId() {
        return this.getBlock().getDescriptionId();
    }
}
