package dev.efekos.morecakes.client;

import dev.efekos.morecakes.MoreCakes;
import dev.efekos.morecakes.registry.MoreCakesBlocks;
import dev.efekos.morecakes.registry.MoreCakesItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.util.Identifier;

public class MoreCakesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(MoreCakesBlocks.BLUE_BERRY_BUSH, RenderLayer.getCutout());

        ModelPredicateProviderRegistry.register(MoreCakesItems.HUGE_CAKE,new Identifier(MoreCakes.MOD_ID,"type"),(stack, world, entity, seed) -> {
            NbtCompound nbt = stack.getOrCreateNbt();
            if(nbt.contains("Type", NbtElement.INT_TYPE)) return nbt.getInt("Type");
            else return 0;
        });
    }
}
