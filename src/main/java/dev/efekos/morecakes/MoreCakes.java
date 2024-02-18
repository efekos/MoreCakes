package dev.efekos.morecakes;

import dev.efekos.morecakes.registry.MoreCakesBlocks;
import dev.efekos.morecakes.registry.MoreCakesItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class MoreCakes implements ModInitializer {
    public static final String MOD_ID = "morecakes";

    public static final RegistryKey<PlacedFeature> BLUE_BERRY_BUSH_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID,"blue_berry_bush"));

    @Override
    public void onInitialize() {
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN), GenerationStep.Feature.TOP_LAYER_MODIFICATION,BLUE_BERRY_BUSH_KEY);

        MoreCakesBlocks.GLOW_BERRY_CAKE.getHardness();
        MoreCakesItems.CHOCOLATE_BUCKET.canBeNested();

    }
}
