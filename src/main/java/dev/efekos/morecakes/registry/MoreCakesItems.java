package dev.efekos.morecakes.registry;

import dev.efekos.morecakes.MoreCakes;
import dev.efekos.morecakes.item.HugeCakeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class MoreCakesItems {
    private static <T extends Item> T register(String id,T item){
        System.out.println("Registering item: "+id);
        return Registry.register(Registries.ITEM,new Identifier(MoreCakes.MOD_ID,id),item);
    }

    public static final Item COCOA_BEANS_BUCKET = register("cocoa_beans_bucket",new Item(new FabricItemSettings().maxCount(1).recipeRemainder(Items.BUCKET).rarity(Rarity.COMMON)));
    public static final Item COCOA_BUCKET = register("cocoa_bucket",new Item(new FabricItemSettings().maxCount(1).recipeRemainder(Items.BUCKET).rarity(Rarity.COMMON)));
    public static final Item CHOCOLATE_BUCKET = register("chocolate_bucket",new Item(new FabricItemSettings().maxCount(1).recipeRemainder(Items.BUCKET).rarity(Rarity.COMMON)));
    public static final HugeCakeItem HUGE_CAKE = register("huge_cake",new HugeCakeItem(new FabricItemSettings().maxCount(1)));
    public static final AliasedBlockItem BLUE_BERRIES = register("blue_berries",new AliasedBlockItem(MoreCakesBlocks.BLUE_BERRY_BUSH,new FabricItemSettings()));
}
