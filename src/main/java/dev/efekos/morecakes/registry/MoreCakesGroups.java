package dev.efekos.morecakes.registry;

import dev.efekos.morecakes.MoreCakes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MoreCakesGroups {
    private static ItemGroup register(String id,ItemGroup group){
        return Registry.register(Registries.ITEM_GROUP,new Identifier(MoreCakes.MOD_ID,id),group);
    }

    public static final ItemGroup CAKES = register("cakes",new ItemGroup.Builder(ItemGroup.Row.BOTTOM,1)
            .icon(() -> Items.CAKE.getDefaultStack())
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
                entries.add(MoreCakesItems.COCOA_BEANS_BUCKET, ItemGroup.StackVisibility.SEARCH_TAB_ONLY);
                entries.add(MoreCakesItems.COCOA_BUCKET,ItemGroup.StackVisibility.SEARCH_TAB_ONLY);
                entries.add(MoreCakesItems.CHOCOLATE_BUCKET,ItemGroup.StackVisibility.SEARCH_TAB_ONLY);
            })
            .build()
    );
}
