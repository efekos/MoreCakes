package dev.efekos.morecakes.item;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HugeCakeItem extends BlockItem {

    private final String base1;
    private final String base2;
    private final String base3;
    private final String flavor1;
    private final String flavor2;
    private final String flavor3;

    public HugeCakeItem(Block block, Settings settings, String base1, String base2, String base3, String flavor1, String flavor2, String flavor3) {
        super(block, settings);
        this.base1 = base1;
        this.base2 = base2;
        this.base3 = base3;
        this.flavor1 = flavor1;
        this.flavor2 = flavor2;
        this.flavor3 = flavor3;
    }

    @Override
    public String getTranslationKey() {
        return "item.morecakes.huge_cake";
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return "item.morecakes.huge_cake";
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(!context.isAdvanced())return;

        tooltip.add(Text.translatable("item.morecakes.huge_cake."+base1).formatted(Formatting.GRAY).append(Text.literal(" - ")).append(Text.translatable("item.morecakes.huge_cake."+flavor1)));
        tooltip.add(Text.translatable("item.morecakes.huge_cake."+base2).formatted(Formatting.GRAY).append(Text.literal(" - ")).append(Text.translatable("item.morecakes.huge_cake."+flavor2)));
        tooltip.add(Text.translatable("item.morecakes.huge_cake."+base3).formatted(Formatting.GRAY).append(Text.literal(" - ")).append(Text.translatable("item.morecakes.huge_cake."+flavor3)));
    }
}
