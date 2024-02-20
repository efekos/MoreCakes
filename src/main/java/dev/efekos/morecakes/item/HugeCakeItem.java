package dev.efekos.morecakes.item;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HugeCakeItem extends BlockItem {
    public HugeCakeItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public String getTranslationKey() {
        return "item.morecakes.huge_cake";
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return "item.morecakes.huge_cake";
    }
}
