package dev.efekos.morecakes.registry;

import dev.efekos.morecakes.MoreCakes;
import dev.efekos.morecakes.recipe.HugeCakeRecipe;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MoreCakesRecipes {
    public static void run(){
        Registry.register(Registries.RECIPE_SERIALIZER,new Identifier(MoreCakes.MOD_ID,"crafting_special_huge_cake"),HugeCakeRecipe.SERIALIZER);
    }
}
