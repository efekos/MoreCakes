package dev.efekos.morecakes;

import dev.efekos.morecakes.registry.MoreCakesBlocks;
import net.fabricmc.api.ModInitializer;

public class MoreCakes implements ModInitializer {
    public static final String MOD_ID = "morecakes";

    @Override
    public void onInitialize() {

        MoreCakesBlocks.GLOW_BERRY_CAKE.getHardness();
    }
}
