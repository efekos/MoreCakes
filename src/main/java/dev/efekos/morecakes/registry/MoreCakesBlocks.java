package dev.efekos.morecakes.registry;

import dev.efekos.morecakes.MoreCakes;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CakeBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class MoreCakesBlocks {
    public static final Map<Block, BlockItem> blockItems = new HashMap<>();

    public static BlockItem itemOf(Block block){
        return blockItems.get(block);
    }

    public static <T extends Block> T register(String id, T block){
        Registry.register(Registries.BLOCK,new Identifier(MoreCakes.MOD_ID,id),block);
        BlockItem item = new BlockItem(block,new Item.Settings());

        Registry.register(Registries.ITEM,new Identifier(MoreCakes.MOD_ID,id),item);

        blockItems.put(block,item);
        return block;
    }

    public static final CakeBlock SWEET_BERRY_CAKE = register("cake_sweetberry",new CakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final CakeBlock GLOW_BERRY_CAKE = register("cake_glowberry",new CakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final CakeBlock CHOCOLATE_CAKE = register("cake_chocolate",new CakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final CakeBlock CHOCOLATE_CAKE_SWEETBERRY = register("cake_chocolate_sweetberry",new CakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
}
