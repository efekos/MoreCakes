package dev.efekos.morecakes.mixin;

import dev.efekos.morecakes.MoreCakes;
import net.minecraft.client.item.ModelPredicateProvider;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(ModelPredicateProviderRegistry.class)
public abstract class ModelPredicateProviderRegistryMixin {

    @Shadow @Final private static Map<Identifier, ModelPredicateProvider> GLOBAL;

    @Inject(method = "registerCustomModelData",at = @At("TAIL"))
    private static void registerCustomModelDAta(ModelPredicateProvider provider, CallbackInfo ci){
        GLOBAL.put(new Identifier(MoreCakes.MOD_ID, "type"), new ModelPredicateProvider() {
            @Override
            public float call(ItemStack stack, @Nullable ClientWorld world, @Nullable LivingEntity entity, int seed) {
                return stack.hasNbt()? stack.getNbt().getInt("Type"):0f;
            }
        });
    }
}
