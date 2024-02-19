package dev.efekos.morecakes.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HugeCakeItem extends Item {
    public HugeCakeItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getDefaultStack() {
        return putDefaultNbt(new ItemStack(this));
    }

    private static ItemStack putDefaultNbt(ItemStack itemStack) {
        NbtCompound compound = itemStack.getOrCreateNbt();

        compound.putInt("Type", 0);
        itemStack.setNbt(compound);

        return itemStack;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        int type = stack.getNbt().getInt("Type");
        Combination combination = Combination.findCombination(type);

        tooltip.add(combination.layer1().toText());
        tooltip.add(combination.layer2().toText());
        tooltip.add(combination.layer3().toText());
    }
}
