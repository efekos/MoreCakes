package dev.efekos.morecakes.registry;

import dev.efekos.morecakes.MoreCakes;
import dev.efekos.morecakes.block.BlueBerryBushBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CakeBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MoreCakesBlocks {
    public static <T extends Block> T register(String id, T block,boolean registerItem){
        System.out.println("Registering block: "+id);
        Registry.register(Registries.BLOCK,new Identifier(MoreCakes.MOD_ID,id),block);

        if(registerItem){
            BlockItem item = new BlockItem(block,new Item.Settings());
            Registry.register(Registries.ITEM,new Identifier(MoreCakes.MOD_ID,id),item);
        }

        return block;
    }

    public static <T extends Block> T register(String id, T block){
        return register(id,block,true);
    }


    public static final CakeBlock SWEET_BERRY_CAKE = register("cake_sweetberry",new CakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final CakeBlock GLOW_BERRY_CAKE = register("cake_glowberry",new CakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final CakeBlock CHOCOLATE_CAKE = register("cake_chocolate",new CakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final CakeBlock CHOCOLATE_CAKE_SWEETBERRY = register("cake_chocolate_sweetberry",new CakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final CakeBlock CHOCOLATE_CAKE_GLOWBERRY = register("cake_chocolate_glowberry",new CakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final CakeBlock CAKE_BLUE_BERRY = register("cake_blue_berry",new CakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final CakeBlock CAKE_CHOCOLATE_BLUE_BERRY = register("cake_chocolate_blue_berry",new CakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final BlueBerryBushBlock BLUE_BERRY_BUSH = register("blue_berry_bush",new BlueBerryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)),false);
}
