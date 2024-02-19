package dev.efekos.morecakes.registry;

import net.minecraft.state.property.IntProperty;

public class MoreCakesBlockProperties {
    public static final IntProperty HUGE_CAKE_BITES = IntProperty.of("bites",0,17);
    public static final IntProperty HUGE_CAKE_TYPE = IntProperty.of("type",0,511);
}
