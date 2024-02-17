package dev.efekos.morecakes.registry;

import dev.efekos.morecakes.MoreCakes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MoreCakesItems {
    private static <T extends Item> T register(String id,T item){
        return Registry.register(Registries.ITEM,new Identifier(MoreCakes.MOD_ID,id),item);
    }
}
