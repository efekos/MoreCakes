package dev.efekos.morecakes.client;

import dev.efekos.morecakes.registry.MoreCakesBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MoreCakesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(MoreCakesBlocks.BLUE_BERRY_BUSH, RenderLayer.getCutout());
    }
}
