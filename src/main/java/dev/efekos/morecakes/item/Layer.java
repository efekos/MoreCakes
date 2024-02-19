package dev.efekos.morecakes.item;

import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public record Layer(String base, String flavor) {
    Text toText(){
        return Text.translatable("item.morecakes.huge_cake."+base).formatted(Formatting.GRAY).append(Text.literal(" - ").formatted(Formatting.GRAY))
                .append(Text.translatable("item.morecakes.huge_cake."+flavor).formatted(Formatting.GRAY));
    }
}
