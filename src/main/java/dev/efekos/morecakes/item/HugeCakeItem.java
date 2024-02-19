package dev.efekos.morecakes.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

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
}
