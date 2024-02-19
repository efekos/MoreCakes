package dev.efekos.morecakes.registry;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;

public class MoreCakesGroups {

    public static final ItemGroup CAKES = new ItemGroup.Builder(ItemGroup.Row.BOTTOM,1)
            .icon(Items.CAKE::getDefaultStack)
            .displayName(Text.translatable("itemGroup.cakes"))
            .entries((displayContext, entries) -> {
                entries.add(Items.CAKE, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
                entries.add(MoreCakesBlocks.SWEET_BERRY_CAKE, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
                entries.add(MoreCakesBlocks.CAKE_BLUE_BERRY, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
                entries.add(MoreCakesBlocks.GLOW_BERRY_CAKE, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
                entries.add(MoreCakesBlocks.CHOCOLATE_CAKE, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
                entries.add(MoreCakesBlocks.CHOCOLATE_CAKE_SWEETBERRY, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
                entries.add(MoreCakesBlocks.CAKE_CHOCOLATE_BLUE_BERRY, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
                entries.add(MoreCakesBlocks.CHOCOLATE_CAKE_GLOWBERRY, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);

                for (int i = 0; i < 512; i++) {
                    ItemStack stack = MoreCakesItems.HUGE_CAKE.getDefaultStack();
                    NbtCompound nbt = stack.getNbt();
                    nbt.putInt("Type",i);
                    stack.setNbt(nbt);
                    entries.add(stack);
                }

                entries.add(MoreCakesItems.COCOA_BEANS_BUCKET, ItemGroup.StackVisibility.SEARCH_TAB_ONLY);
                entries.add(MoreCakesItems.COCOA_BUCKET,ItemGroup.StackVisibility.SEARCH_TAB_ONLY);
                entries.add(MoreCakesItems.CHOCOLATE_BUCKET,ItemGroup.StackVisibility.SEARCH_TAB_ONLY);
            })
            .build();
}
