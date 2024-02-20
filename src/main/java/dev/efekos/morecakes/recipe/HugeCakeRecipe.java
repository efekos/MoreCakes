package dev.efekos.morecakes.recipe;

import dev.efekos.morecakes.item.Combination;
import dev.efekos.morecakes.item.Layer;
import dev.efekos.morecakes.registry.MoreCakesBlocks;
import dev.efekos.morecakes.registry.MoreCakesItems;
import dev.efekos.morecakes.registry.MoreCakesRecipes;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.world.World;

public class HugeCakeRecipe extends SpecialCraftingRecipe {
    public HugeCakeRecipe(CraftingRecipeCategory category) {
        super(category);
    }

    public static final Ingredient CAKES = Ingredient.ofItems(MoreCakesBlocks.CHOCOLATE_CAKE.asItem(),
            MoreCakesBlocks.CHOCOLATE_CAKE_SWEETBERRY.asItem(),MoreCakesBlocks.CHOCOLATE_CAKE_GLOWBERRY.asItem(),MoreCakesBlocks.CAKE_CHOCOLATE_BLUE_BERRY.asItem(),
            MoreCakesBlocks.GLOW_BERRY_CAKE.asItem(),MoreCakesBlocks.SWEET_BERRY_CAKE.asItem(),MoreCakesBlocks.CAKE_BLUE_BERRY.asItem(), Items.CAKE,
            MoreCakesBlocks.SWEET_BERRY_CAKE,MoreCakesBlocks.GLOW_BERRY_CAKE);

    @Override
    public boolean matches(RecipeInputInventory inventory, World world) {
        boolean left;
        boolean mid;
        boolean right;

        left = CAKES.test(inventory.getStack(0))&&CAKES.test(inventory.getStack(3))&&CAKES.test(inventory.getStack(6));
        mid = CAKES.test(inventory.getStack(1))&&CAKES.test(inventory.getStack(4))&&CAKES.test(inventory.getStack(7));
        right = CAKES.test(inventory.getStack(2))&&CAKES.test(inventory.getStack(5))&&CAKES.test(inventory.getStack(8));

        return (left&&!mid&&!right) || (!left&&mid&&!right) || (!left&&!mid&&right);
    }

    @Override
    public ItemStack getResult(DynamicRegistryManager registryManager) {
        return MoreCakesItems.HUGE_CAKE.getDefaultStack();
    }

    @Override
    public ItemStack craft(RecipeInputInventory inventory, DynamicRegistryManager registryManager) {

        int type;

        boolean left;
        boolean mid;
        boolean right;

        left = CAKES.test(inventory.getStack(0))&&CAKES.test(inventory.getStack(3))&&CAKES.test(inventory.getStack(6));
        mid = CAKES.test(inventory.getStack(1))&&CAKES.test(inventory.getStack(4))&&CAKES.test(inventory.getStack(7));
        right = CAKES.test(inventory.getStack(2))&&CAKES.test(inventory.getStack(5))&&CAKES.test(inventory.getStack(8));

        ItemStack layer1;
        ItemStack layer2;
        ItemStack layer3;
        if(left) {
            layer1 = inventory.getStack(6);
            layer2 = inventory.getStack(3);
            layer3 = inventory.getStack(0);
        }
        else if(mid) {
            layer1 = inventory.getStack(7);
            layer2 = inventory.getStack(4);
            layer3 = inventory.getStack(1);
        }
        else if(right) {
            layer1 = inventory.getStack(8);
            layer2 = inventory.getStack(5);
            layer3 = inventory.getStack(2);
        } else {
            layer1 = ItemStack.EMPTY;
            layer2 = ItemStack.EMPTY;
            layer3 = ItemStack.EMPTY;
        }

        Combination combination = new Combination(cakeItemToLayer(layer1),cakeItemToLayer(layer2),cakeItemToLayer(layer3));
        type = Combination.reverseCombination(combination);

        ItemStack stack = MoreCakesItems.HUGE_CAKE.getDefaultStack();
        NbtCompound nbt = stack.getNbt();
        nbt.putInt("Type",type);
        stack.setNbt(nbt);
        return stack;
    }

    private Layer cakeItemToLayer(ItemStack item){
        if(!CAKES.test(item)) return new Layer("v","n");
        else {
            if(item.isOf(MoreCakesBlocks.CHOCOLATE_CAKE.asItem())) return new Layer("c","n");
            if(item.isOf(MoreCakesBlocks.CAKE_CHOCOLATE_BLUE_BERRY.asItem())) return new Layer("c","b");
            if(item.isOf(MoreCakesBlocks.CHOCOLATE_CAKE_SWEETBERRY.asItem())) return new Layer("c","s");
            if(item.isOf(MoreCakesBlocks.CHOCOLATE_CAKE_GLOWBERRY.asItem())) return new Layer("c","g");
            if(item.isOf(Items.CAKE)) return new Layer("v","n");
            if(item.isOf(MoreCakesBlocks.CAKE_BLUE_BERRY.asItem())) return new Layer("v","b");
            if(item.isOf(MoreCakesBlocks.CHOCOLATE_CAKE_SWEETBERRY.asItem())) return new Layer("v","s");
            if(item.isOf(MoreCakesBlocks.CHOCOLATE_CAKE_GLOWBERRY.asItem())) return new Layer("v","g");
            else return new Layer("v","n");
        }
    }

    @Override
    public boolean fits(int width, int height) {
        return width*height >= 3;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return SERIALIZER;
    }

   public static final RecipeSerializer<HugeCakeRecipe> SERIALIZER = new SpecialRecipeSerializer<>(HugeCakeRecipe::new);
}
