package dev.efekos.morecakes.registry;

import dev.efekos.morecakes.block.HugeCakeBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;

import java.util.Arrays;

public class MoreCakesGroups {

    public static final ItemGroup CAKES = new ItemGroup.Builder(ItemGroup.Row.BOTTOM,1)
            .icon(Items.CAKE::getDefaultStack)
            .displayName(Text.translatable("itemGroup.cakes"))
            .entries((displayContext, entries) -> {
                entries.add(Items.CAKE, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
                entries.add(MoreCakesBlocks.SWEET_BERRY_CAKE, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
                entries.add(MoreCakesBlocks.CAKE_BLUE_BERRY, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
                entries.add(MoreCakesBlocks.GLOW_BERRY_CAKE, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
                entries.add(MoreCakesBlocks.CHOCOLATE_CAKE, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
                entries.add(MoreCakesBlocks.CHOCOLATE_CAKE_SWEETBERRY, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
                entries.add(MoreCakesBlocks.CAKE_CHOCOLATE_BLUE_BERRY, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);
                entries.add(MoreCakesBlocks.CHOCOLATE_CAKE_GLOWBERRY, ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS);

                huge_cakes:{
                    for (HugeCakeBlock block : Arrays.asList(
                            MoreCakesBlocks.HUGE_CAKE_CN_CN_CN, MoreCakesBlocks.HUGE_CAKE_CN_CN_CB, MoreCakesBlocks.HUGE_CAKE_CN_CN_CS, MoreCakesBlocks.HUGE_CAKE_CN_CN_CG,
                            MoreCakesBlocks.HUGE_CAKE_CN_CN_VN, MoreCakesBlocks.HUGE_CAKE_CN_CN_VB, MoreCakesBlocks.HUGE_CAKE_CN_CN_VS, MoreCakesBlocks.HUGE_CAKE_CN_CN_VG,
                            MoreCakesBlocks.HUGE_CAKE_CN_CB_CN, MoreCakesBlocks.HUGE_CAKE_CN_CB_CB, MoreCakesBlocks.HUGE_CAKE_CN_CB_CS, MoreCakesBlocks.HUGE_CAKE_CN_CB_CG,
                            MoreCakesBlocks.HUGE_CAKE_CN_CB_VN, MoreCakesBlocks.HUGE_CAKE_CN_CB_VB, MoreCakesBlocks.HUGE_CAKE_CN_CB_VS, MoreCakesBlocks.HUGE_CAKE_CN_CB_VG,
                            MoreCakesBlocks.HUGE_CAKE_CN_CS_CN, MoreCakesBlocks.HUGE_CAKE_CN_CS_CB, MoreCakesBlocks.HUGE_CAKE_CN_CS_CS, MoreCakesBlocks.HUGE_CAKE_CN_CS_CG,
                            MoreCakesBlocks.HUGE_CAKE_CN_CS_VN, MoreCakesBlocks.HUGE_CAKE_CN_CS_VB, MoreCakesBlocks.HUGE_CAKE_CN_CS_VS, MoreCakesBlocks.HUGE_CAKE_CN_CS_VG,
                            MoreCakesBlocks.HUGE_CAKE_CN_CG_CN, MoreCakesBlocks.HUGE_CAKE_CN_CG_CB, MoreCakesBlocks.HUGE_CAKE_CN_CG_CS, MoreCakesBlocks.HUGE_CAKE_CN_CG_CG,
                            MoreCakesBlocks.HUGE_CAKE_CN_CG_VN, MoreCakesBlocks.HUGE_CAKE_CN_CG_VB, MoreCakesBlocks.HUGE_CAKE_CN_CG_VS, MoreCakesBlocks.HUGE_CAKE_CN_CG_VG,
                            MoreCakesBlocks.HUGE_CAKE_CN_VN_CN, MoreCakesBlocks.HUGE_CAKE_CN_VN_CB, MoreCakesBlocks.HUGE_CAKE_CN_VN_CS, MoreCakesBlocks.HUGE_CAKE_CN_VN_CG,
                            MoreCakesBlocks.HUGE_CAKE_CN_VN_VN, MoreCakesBlocks.HUGE_CAKE_CN_VN_VB, MoreCakesBlocks.HUGE_CAKE_CN_VN_VS, MoreCakesBlocks.HUGE_CAKE_CN_VN_VG,
                            MoreCakesBlocks.HUGE_CAKE_CN_VB_CN, MoreCakesBlocks.HUGE_CAKE_CN_VB_CB, MoreCakesBlocks.HUGE_CAKE_CN_VB_CS, MoreCakesBlocks.HUGE_CAKE_CN_VB_CG,
                            MoreCakesBlocks.HUGE_CAKE_CN_VB_VN, MoreCakesBlocks.HUGE_CAKE_CN_VB_VB, MoreCakesBlocks.HUGE_CAKE_CN_VB_VS, MoreCakesBlocks.HUGE_CAKE_CN_VB_VG,
                            MoreCakesBlocks.HUGE_CAKE_CN_VS_CN, MoreCakesBlocks.HUGE_CAKE_CN_VS_CB, MoreCakesBlocks.HUGE_CAKE_CN_VS_CS, MoreCakesBlocks.HUGE_CAKE_CN_VS_CG,
                            MoreCakesBlocks.HUGE_CAKE_CN_VS_VN, MoreCakesBlocks.HUGE_CAKE_CN_VS_VB, MoreCakesBlocks.HUGE_CAKE_CN_VS_VS, MoreCakesBlocks.HUGE_CAKE_CN_VS_VG,
                            MoreCakesBlocks.HUGE_CAKE_CN_VG_CN, MoreCakesBlocks.HUGE_CAKE_CN_VG_CB, MoreCakesBlocks.HUGE_CAKE_CN_VG_CS, MoreCakesBlocks.HUGE_CAKE_CN_VG_CG,
                            MoreCakesBlocks.HUGE_CAKE_CN_VG_VN, MoreCakesBlocks.HUGE_CAKE_CN_VG_VB, MoreCakesBlocks.HUGE_CAKE_CN_VG_VS, MoreCakesBlocks.HUGE_CAKE_CN_VG_VG,
                            MoreCakesBlocks.HUGE_CAKE_CB_CN_CN, MoreCakesBlocks.HUGE_CAKE_CB_CN_CB, MoreCakesBlocks.HUGE_CAKE_CB_CN_CS, MoreCakesBlocks.HUGE_CAKE_CB_CN_CG,
                            MoreCakesBlocks.HUGE_CAKE_CB_CN_VN, MoreCakesBlocks.HUGE_CAKE_CB_CN_VB, MoreCakesBlocks.HUGE_CAKE_CB_CN_VS, MoreCakesBlocks.HUGE_CAKE_CB_CN_VG,
                            MoreCakesBlocks.HUGE_CAKE_CB_CB_CN, MoreCakesBlocks.HUGE_CAKE_CB_CB_CB, MoreCakesBlocks.HUGE_CAKE_CB_CB_CS, MoreCakesBlocks.HUGE_CAKE_CB_CB_CG,
                            MoreCakesBlocks.HUGE_CAKE_CB_CB_VN, MoreCakesBlocks.HUGE_CAKE_CB_CB_VB, MoreCakesBlocks.HUGE_CAKE_CB_CB_VS, MoreCakesBlocks.HUGE_CAKE_CB_CB_VG,
                            MoreCakesBlocks.HUGE_CAKE_CB_CS_CN, MoreCakesBlocks.HUGE_CAKE_CB_CS_CB, MoreCakesBlocks.HUGE_CAKE_CB_CS_CS, MoreCakesBlocks.HUGE_CAKE_CB_CS_CG,
                            MoreCakesBlocks.HUGE_CAKE_CB_CS_VN, MoreCakesBlocks.HUGE_CAKE_CB_CS_VB, MoreCakesBlocks.HUGE_CAKE_CB_CS_VS, MoreCakesBlocks.HUGE_CAKE_CB_CS_VG,
                            MoreCakesBlocks.HUGE_CAKE_CB_CG_CN, MoreCakesBlocks.HUGE_CAKE_CB_CG_CB, MoreCakesBlocks.HUGE_CAKE_CB_CG_CS, MoreCakesBlocks.HUGE_CAKE_CB_CG_CG,
                            MoreCakesBlocks.HUGE_CAKE_CB_CG_VN, MoreCakesBlocks.HUGE_CAKE_CB_CG_VB, MoreCakesBlocks.HUGE_CAKE_CB_CG_VS, MoreCakesBlocks.HUGE_CAKE_CB_CG_VG,
                            MoreCakesBlocks.HUGE_CAKE_CB_VN_CN, MoreCakesBlocks.HUGE_CAKE_CB_VN_CB, MoreCakesBlocks.HUGE_CAKE_CB_VN_CS, MoreCakesBlocks.HUGE_CAKE_CB_VN_CG,
                            MoreCakesBlocks.HUGE_CAKE_CB_VN_VN, MoreCakesBlocks.HUGE_CAKE_CB_VN_VB, MoreCakesBlocks.HUGE_CAKE_CB_VN_VS, MoreCakesBlocks.HUGE_CAKE_CB_VN_VG,
                            MoreCakesBlocks.HUGE_CAKE_CB_VB_CN, MoreCakesBlocks.HUGE_CAKE_CB_VB_CB, MoreCakesBlocks.HUGE_CAKE_CB_VB_CS, MoreCakesBlocks.HUGE_CAKE_CB_VB_CG,
                            MoreCakesBlocks.HUGE_CAKE_CB_VB_VN, MoreCakesBlocks.HUGE_CAKE_CB_VB_VB, MoreCakesBlocks.HUGE_CAKE_CB_VB_VS, MoreCakesBlocks.HUGE_CAKE_CB_VB_VG,
                            MoreCakesBlocks.HUGE_CAKE_CB_VS_CN, MoreCakesBlocks.HUGE_CAKE_CB_VS_CB, MoreCakesBlocks.HUGE_CAKE_CB_VS_CS, MoreCakesBlocks.HUGE_CAKE_CB_VS_CG,
                            MoreCakesBlocks.HUGE_CAKE_CB_VS_VN, MoreCakesBlocks.HUGE_CAKE_CB_VS_VB, MoreCakesBlocks.HUGE_CAKE_CB_VS_VS, MoreCakesBlocks.HUGE_CAKE_CB_VS_VG,
                            MoreCakesBlocks.HUGE_CAKE_CB_VG_CN, MoreCakesBlocks.HUGE_CAKE_CB_VG_CB, MoreCakesBlocks.HUGE_CAKE_CB_VG_CS, MoreCakesBlocks.HUGE_CAKE_CB_VG_CG,
                            MoreCakesBlocks.HUGE_CAKE_CB_VG_VN, MoreCakesBlocks.HUGE_CAKE_CB_VG_VB, MoreCakesBlocks.HUGE_CAKE_CB_VG_VS, MoreCakesBlocks.HUGE_CAKE_CB_VG_VG,
                            MoreCakesBlocks.HUGE_CAKE_CS_CN_CN, MoreCakesBlocks.HUGE_CAKE_CS_CN_CB, MoreCakesBlocks.HUGE_CAKE_CS_CN_CS, MoreCakesBlocks.HUGE_CAKE_CS_CN_CG,
                            MoreCakesBlocks.HUGE_CAKE_CS_CN_VN, MoreCakesBlocks.HUGE_CAKE_CS_CN_VB, MoreCakesBlocks.HUGE_CAKE_CS_CN_VS, MoreCakesBlocks.HUGE_CAKE_CS_CN_VG,
                            MoreCakesBlocks.HUGE_CAKE_CS_CB_CN, MoreCakesBlocks.HUGE_CAKE_CS_CB_CB, MoreCakesBlocks.HUGE_CAKE_CS_CB_CS, MoreCakesBlocks.HUGE_CAKE_CS_CB_CG,
                            MoreCakesBlocks.HUGE_CAKE_CS_CB_VN, MoreCakesBlocks.HUGE_CAKE_CS_CB_VB, MoreCakesBlocks.HUGE_CAKE_CS_CB_VS, MoreCakesBlocks.HUGE_CAKE_CS_CB_VG,
                            MoreCakesBlocks.HUGE_CAKE_CS_CS_CN, MoreCakesBlocks.HUGE_CAKE_CS_CS_CB, MoreCakesBlocks.HUGE_CAKE_CS_CS_CS, MoreCakesBlocks.HUGE_CAKE_CS_CS_CG,
                            MoreCakesBlocks.HUGE_CAKE_CS_CS_VN, MoreCakesBlocks.HUGE_CAKE_CS_CS_VB, MoreCakesBlocks.HUGE_CAKE_CS_CS_VS, MoreCakesBlocks.HUGE_CAKE_CS_CS_VG,
                            MoreCakesBlocks.HUGE_CAKE_CS_CG_CN, MoreCakesBlocks.HUGE_CAKE_CS_CG_CB, MoreCakesBlocks.HUGE_CAKE_CS_CG_CS, MoreCakesBlocks.HUGE_CAKE_CS_CG_CG,
                            MoreCakesBlocks.HUGE_CAKE_CS_CG_VN, MoreCakesBlocks.HUGE_CAKE_CS_CG_VB, MoreCakesBlocks.HUGE_CAKE_CS_CG_VS, MoreCakesBlocks.HUGE_CAKE_CS_CG_VG,
                            MoreCakesBlocks.HUGE_CAKE_CS_VN_CN, MoreCakesBlocks.HUGE_CAKE_CS_VN_CB, MoreCakesBlocks.HUGE_CAKE_CS_VN_CS, MoreCakesBlocks.HUGE_CAKE_CS_VN_CG,
                            MoreCakesBlocks.HUGE_CAKE_CS_VN_VN, MoreCakesBlocks.HUGE_CAKE_CS_VN_VB, MoreCakesBlocks.HUGE_CAKE_CS_VN_VS, MoreCakesBlocks.HUGE_CAKE_CS_VN_VG,
                            MoreCakesBlocks.HUGE_CAKE_CS_VB_CN, MoreCakesBlocks.HUGE_CAKE_CS_VB_CB, MoreCakesBlocks.HUGE_CAKE_CS_VB_CS, MoreCakesBlocks.HUGE_CAKE_CS_VB_CG,
                            MoreCakesBlocks.HUGE_CAKE_CS_VB_VN, MoreCakesBlocks.HUGE_CAKE_CS_VB_VB, MoreCakesBlocks.HUGE_CAKE_CS_VB_VS, MoreCakesBlocks.HUGE_CAKE_CS_VB_VG,
                            MoreCakesBlocks.HUGE_CAKE_CS_VS_CN, MoreCakesBlocks.HUGE_CAKE_CS_VS_CB, MoreCakesBlocks.HUGE_CAKE_CS_VS_CS, MoreCakesBlocks.HUGE_CAKE_CS_VS_CG,
                            MoreCakesBlocks.HUGE_CAKE_CS_VS_VN, MoreCakesBlocks.HUGE_CAKE_CS_VS_VB, MoreCakesBlocks.HUGE_CAKE_CS_VS_VS, MoreCakesBlocks.HUGE_CAKE_CS_VS_VG,
                            MoreCakesBlocks.HUGE_CAKE_CS_VG_CN, MoreCakesBlocks.HUGE_CAKE_CS_VG_CB, MoreCakesBlocks.HUGE_CAKE_CS_VG_CS, MoreCakesBlocks.HUGE_CAKE_CS_VG_CG,
                            MoreCakesBlocks.HUGE_CAKE_CS_VG_VN, MoreCakesBlocks.HUGE_CAKE_CS_VG_VB, MoreCakesBlocks.HUGE_CAKE_CS_VG_VS, MoreCakesBlocks.HUGE_CAKE_CS_VG_VG,
                            MoreCakesBlocks.HUGE_CAKE_CG_CN_CN, MoreCakesBlocks.HUGE_CAKE_CG_CN_CB, MoreCakesBlocks.HUGE_CAKE_CG_CN_CS, MoreCakesBlocks.HUGE_CAKE_CG_CN_CG,
                            MoreCakesBlocks.HUGE_CAKE_CG_CN_VN, MoreCakesBlocks.HUGE_CAKE_CG_CN_VB, MoreCakesBlocks.HUGE_CAKE_CG_CN_VS, MoreCakesBlocks.HUGE_CAKE_CG_CN_VG,
                            MoreCakesBlocks.HUGE_CAKE_CG_CB_CN, MoreCakesBlocks.HUGE_CAKE_CG_CB_CB, MoreCakesBlocks.HUGE_CAKE_CG_CB_CS, MoreCakesBlocks.HUGE_CAKE_CG_CB_CG,
                            MoreCakesBlocks.HUGE_CAKE_CG_CB_VN, MoreCakesBlocks.HUGE_CAKE_CG_CB_VB, MoreCakesBlocks.HUGE_CAKE_CG_CB_VS, MoreCakesBlocks.HUGE_CAKE_CG_CB_VG,
                            MoreCakesBlocks.HUGE_CAKE_CG_CS_CN, MoreCakesBlocks.HUGE_CAKE_CG_CS_CB, MoreCakesBlocks.HUGE_CAKE_CG_CS_CS, MoreCakesBlocks.HUGE_CAKE_CG_CS_CG,
                            MoreCakesBlocks.HUGE_CAKE_CG_CS_VN, MoreCakesBlocks.HUGE_CAKE_CG_CS_VB, MoreCakesBlocks.HUGE_CAKE_CG_CS_VS, MoreCakesBlocks.HUGE_CAKE_CG_CS_VG,
                            MoreCakesBlocks.HUGE_CAKE_CG_CG_CN, MoreCakesBlocks.HUGE_CAKE_CG_CG_CB, MoreCakesBlocks.HUGE_CAKE_CG_CG_CS, MoreCakesBlocks.HUGE_CAKE_CG_CG_CG,
                            MoreCakesBlocks.HUGE_CAKE_CG_CG_VN, MoreCakesBlocks.HUGE_CAKE_CG_CG_VB, MoreCakesBlocks.HUGE_CAKE_CG_CG_VS, MoreCakesBlocks.HUGE_CAKE_CG_CG_VG,
                            MoreCakesBlocks.HUGE_CAKE_CG_VN_CN, MoreCakesBlocks.HUGE_CAKE_CG_VN_CB, MoreCakesBlocks.HUGE_CAKE_CG_VN_CS, MoreCakesBlocks.HUGE_CAKE_CG_VN_CG,
                            MoreCakesBlocks.HUGE_CAKE_CG_VN_VN, MoreCakesBlocks.HUGE_CAKE_CG_VN_VB, MoreCakesBlocks.HUGE_CAKE_CG_VN_VS, MoreCakesBlocks.HUGE_CAKE_CG_VN_VG,
                            MoreCakesBlocks.HUGE_CAKE_CG_VB_CN, MoreCakesBlocks.HUGE_CAKE_CG_VB_CB, MoreCakesBlocks.HUGE_CAKE_CG_VB_CS, MoreCakesBlocks.HUGE_CAKE_CG_VB_CG,
                            MoreCakesBlocks.HUGE_CAKE_CG_VB_VN, MoreCakesBlocks.HUGE_CAKE_CG_VB_VB, MoreCakesBlocks.HUGE_CAKE_CG_VB_VS, MoreCakesBlocks.HUGE_CAKE_CG_VB_VG,
                            MoreCakesBlocks.HUGE_CAKE_CG_VS_CN, MoreCakesBlocks.HUGE_CAKE_CG_VS_CB, MoreCakesBlocks.HUGE_CAKE_CG_VS_CS, MoreCakesBlocks.HUGE_CAKE_CG_VS_CG,
                            MoreCakesBlocks.HUGE_CAKE_CG_VS_VN, MoreCakesBlocks.HUGE_CAKE_CG_VS_VB, MoreCakesBlocks.HUGE_CAKE_CG_VS_VS, MoreCakesBlocks.HUGE_CAKE_CG_VS_VG,
                            MoreCakesBlocks.HUGE_CAKE_CG_VG_CN, MoreCakesBlocks.HUGE_CAKE_CG_VG_CB, MoreCakesBlocks.HUGE_CAKE_CG_VG_CS, MoreCakesBlocks.HUGE_CAKE_CG_VG_CG,
                            MoreCakesBlocks.HUGE_CAKE_CG_VG_VN, MoreCakesBlocks.HUGE_CAKE_CG_VG_VB, MoreCakesBlocks.HUGE_CAKE_CG_VG_VS, MoreCakesBlocks.HUGE_CAKE_CG_VG_VG,
                            MoreCakesBlocks.HUGE_CAKE_VN_CN_CN, MoreCakesBlocks.HUGE_CAKE_VN_CN_CB, MoreCakesBlocks.HUGE_CAKE_VN_CN_CS, MoreCakesBlocks.HUGE_CAKE_VN_CN_CG,
                            MoreCakesBlocks.HUGE_CAKE_VN_CN_VN, MoreCakesBlocks.HUGE_CAKE_VN_CN_VB, MoreCakesBlocks.HUGE_CAKE_VN_CN_VS, MoreCakesBlocks.HUGE_CAKE_VN_CN_VG,
                            MoreCakesBlocks.HUGE_CAKE_VN_CB_CN, MoreCakesBlocks.HUGE_CAKE_VN_CB_CB, MoreCakesBlocks.HUGE_CAKE_VN_CB_CS, MoreCakesBlocks.HUGE_CAKE_VN_CB_CG,
                            MoreCakesBlocks.HUGE_CAKE_VN_CB_VN, MoreCakesBlocks.HUGE_CAKE_VN_CB_VB, MoreCakesBlocks.HUGE_CAKE_VN_CB_VS, MoreCakesBlocks.HUGE_CAKE_VN_CB_VG,
                            MoreCakesBlocks.HUGE_CAKE_VN_CS_CN, MoreCakesBlocks.HUGE_CAKE_VN_CS_CB, MoreCakesBlocks.HUGE_CAKE_VN_CS_CS, MoreCakesBlocks.HUGE_CAKE_VN_CS_CG,
                            MoreCakesBlocks.HUGE_CAKE_VN_CS_VN, MoreCakesBlocks.HUGE_CAKE_VN_CS_VB, MoreCakesBlocks.HUGE_CAKE_VN_CS_VS, MoreCakesBlocks.HUGE_CAKE_VN_CS_VG,
                            MoreCakesBlocks.HUGE_CAKE_VN_CG_CN, MoreCakesBlocks.HUGE_CAKE_VN_CG_CB, MoreCakesBlocks.HUGE_CAKE_VN_CG_CS, MoreCakesBlocks.HUGE_CAKE_VN_CG_CG,
                            MoreCakesBlocks.HUGE_CAKE_VN_CG_VN, MoreCakesBlocks.HUGE_CAKE_VN_CG_VB, MoreCakesBlocks.HUGE_CAKE_VN_CG_VS, MoreCakesBlocks.HUGE_CAKE_VN_CG_VG,
                            MoreCakesBlocks.HUGE_CAKE_VN_VN_CN, MoreCakesBlocks.HUGE_CAKE_VN_VN_CB, MoreCakesBlocks.HUGE_CAKE_VN_VN_CS, MoreCakesBlocks.HUGE_CAKE_VN_VN_CG,
                            MoreCakesBlocks.HUGE_CAKE_VN_VN_VN, MoreCakesBlocks.HUGE_CAKE_VN_VN_VB, MoreCakesBlocks.HUGE_CAKE_VN_VN_VS, MoreCakesBlocks.HUGE_CAKE_VN_VN_VG,
                            MoreCakesBlocks.HUGE_CAKE_VN_VB_CN, MoreCakesBlocks.HUGE_CAKE_VN_VB_CB, MoreCakesBlocks.HUGE_CAKE_VN_VB_CS, MoreCakesBlocks.HUGE_CAKE_VN_VB_CG,
                            MoreCakesBlocks.HUGE_CAKE_VN_VB_VN, MoreCakesBlocks.HUGE_CAKE_VN_VB_VB, MoreCakesBlocks.HUGE_CAKE_VN_VB_VS, MoreCakesBlocks.HUGE_CAKE_VN_VB_VG,
                            MoreCakesBlocks.HUGE_CAKE_VN_VS_CN, MoreCakesBlocks.HUGE_CAKE_VN_VS_CB, MoreCakesBlocks.HUGE_CAKE_VN_VS_CS, MoreCakesBlocks.HUGE_CAKE_VN_VS_CG,
                            MoreCakesBlocks.HUGE_CAKE_VN_VS_VN, MoreCakesBlocks.HUGE_CAKE_VN_VS_VB, MoreCakesBlocks.HUGE_CAKE_VN_VS_VS, MoreCakesBlocks.HUGE_CAKE_VN_VS_VG,
                            MoreCakesBlocks.HUGE_CAKE_VN_VG_CN, MoreCakesBlocks.HUGE_CAKE_VN_VG_CB, MoreCakesBlocks.HUGE_CAKE_VN_VG_CS, MoreCakesBlocks.HUGE_CAKE_VN_VG_CG,
                            MoreCakesBlocks.HUGE_CAKE_VN_VG_VN, MoreCakesBlocks.HUGE_CAKE_VN_VG_VB, MoreCakesBlocks.HUGE_CAKE_VN_VG_VS, MoreCakesBlocks.HUGE_CAKE_VN_VG_VG,
                            MoreCakesBlocks.HUGE_CAKE_VB_CN_CN, MoreCakesBlocks.HUGE_CAKE_VB_CN_CB, MoreCakesBlocks.HUGE_CAKE_VB_CN_CS, MoreCakesBlocks.HUGE_CAKE_VB_CN_CG,
                            MoreCakesBlocks.HUGE_CAKE_VB_CN_VN, MoreCakesBlocks.HUGE_CAKE_VB_CN_VB, MoreCakesBlocks.HUGE_CAKE_VB_CN_VS, MoreCakesBlocks.HUGE_CAKE_VB_CN_VG,
                            MoreCakesBlocks.HUGE_CAKE_VB_CB_CN, MoreCakesBlocks.HUGE_CAKE_VB_CB_CB, MoreCakesBlocks.HUGE_CAKE_VB_CB_CS, MoreCakesBlocks.HUGE_CAKE_VB_CB_CG,
                            MoreCakesBlocks.HUGE_CAKE_VB_CB_VN, MoreCakesBlocks.HUGE_CAKE_VB_CB_VB, MoreCakesBlocks.HUGE_CAKE_VB_CB_VS, MoreCakesBlocks.HUGE_CAKE_VB_CB_VG,
                            MoreCakesBlocks.HUGE_CAKE_VB_CS_CN, MoreCakesBlocks.HUGE_CAKE_VB_CS_CB, MoreCakesBlocks.HUGE_CAKE_VB_CS_CS, MoreCakesBlocks.HUGE_CAKE_VB_CS_CG,
                            MoreCakesBlocks.HUGE_CAKE_VB_CS_VN, MoreCakesBlocks.HUGE_CAKE_VB_CS_VB, MoreCakesBlocks.HUGE_CAKE_VB_CS_VS, MoreCakesBlocks.HUGE_CAKE_VB_CS_VG,
                            MoreCakesBlocks.HUGE_CAKE_VB_CG_CN, MoreCakesBlocks.HUGE_CAKE_VB_CG_CB, MoreCakesBlocks.HUGE_CAKE_VB_CG_CS, MoreCakesBlocks.HUGE_CAKE_VB_CG_CG,
                            MoreCakesBlocks.HUGE_CAKE_VB_CG_VN, MoreCakesBlocks.HUGE_CAKE_VB_CG_VB, MoreCakesBlocks.HUGE_CAKE_VB_CG_VS, MoreCakesBlocks.HUGE_CAKE_VB_CG_VG,
                            MoreCakesBlocks.HUGE_CAKE_VB_VN_CN, MoreCakesBlocks.HUGE_CAKE_VB_VN_CB, MoreCakesBlocks.HUGE_CAKE_VB_VN_CS, MoreCakesBlocks.HUGE_CAKE_VB_VN_CG,
                            MoreCakesBlocks.HUGE_CAKE_VB_VN_VN, MoreCakesBlocks.HUGE_CAKE_VB_VN_VB, MoreCakesBlocks.HUGE_CAKE_VB_VN_VS, MoreCakesBlocks.HUGE_CAKE_VB_VN_VG,
                            MoreCakesBlocks.HUGE_CAKE_VB_VB_CN, MoreCakesBlocks.HUGE_CAKE_VB_VB_CB, MoreCakesBlocks.HUGE_CAKE_VB_VB_CS, MoreCakesBlocks.HUGE_CAKE_VB_VB_CG,
                            MoreCakesBlocks.HUGE_CAKE_VB_VB_VN, MoreCakesBlocks.HUGE_CAKE_VB_VB_VB, MoreCakesBlocks.HUGE_CAKE_VB_VB_VS, MoreCakesBlocks.HUGE_CAKE_VB_VB_VG,
                            MoreCakesBlocks.HUGE_CAKE_VB_VS_CN, MoreCakesBlocks.HUGE_CAKE_VB_VS_CB, MoreCakesBlocks.HUGE_CAKE_VB_VS_CS, MoreCakesBlocks.HUGE_CAKE_VB_VS_CG,
                            MoreCakesBlocks.HUGE_CAKE_VB_VS_VN, MoreCakesBlocks.HUGE_CAKE_VB_VS_VB, MoreCakesBlocks.HUGE_CAKE_VB_VS_VS, MoreCakesBlocks.HUGE_CAKE_VB_VS_VG,
                            MoreCakesBlocks.HUGE_CAKE_VB_VG_CN, MoreCakesBlocks.HUGE_CAKE_VB_VG_CB, MoreCakesBlocks.HUGE_CAKE_VB_VG_CS, MoreCakesBlocks.HUGE_CAKE_VB_VG_CG,
                            MoreCakesBlocks.HUGE_CAKE_VB_VG_VN, MoreCakesBlocks.HUGE_CAKE_VB_VG_VB, MoreCakesBlocks.HUGE_CAKE_VB_VG_VS, MoreCakesBlocks.HUGE_CAKE_VB_VG_VG,
                            MoreCakesBlocks.HUGE_CAKE_VS_CN_CN, MoreCakesBlocks.HUGE_CAKE_VS_CN_CB, MoreCakesBlocks.HUGE_CAKE_VS_CN_CS, MoreCakesBlocks.HUGE_CAKE_VS_CN_CG,
                            MoreCakesBlocks.HUGE_CAKE_VS_CN_VN, MoreCakesBlocks.HUGE_CAKE_VS_CN_VB, MoreCakesBlocks.HUGE_CAKE_VS_CN_VS, MoreCakesBlocks.HUGE_CAKE_VS_CN_VG,
                            MoreCakesBlocks.HUGE_CAKE_VS_CB_CN, MoreCakesBlocks.HUGE_CAKE_VS_CB_CB, MoreCakesBlocks.HUGE_CAKE_VS_CB_CS, MoreCakesBlocks.HUGE_CAKE_VS_CB_CG,
                            MoreCakesBlocks.HUGE_CAKE_VS_CB_VN, MoreCakesBlocks.HUGE_CAKE_VS_CB_VB, MoreCakesBlocks.HUGE_CAKE_VS_CB_VS, MoreCakesBlocks.HUGE_CAKE_VS_CB_VG,
                            MoreCakesBlocks.HUGE_CAKE_VS_CS_CN, MoreCakesBlocks.HUGE_CAKE_VS_CS_CB, MoreCakesBlocks.HUGE_CAKE_VS_CS_CS, MoreCakesBlocks.HUGE_CAKE_VS_CS_CG,
                            MoreCakesBlocks.HUGE_CAKE_VS_CS_VN, MoreCakesBlocks.HUGE_CAKE_VS_CS_VB, MoreCakesBlocks.HUGE_CAKE_VS_CS_VS, MoreCakesBlocks.HUGE_CAKE_VS_CS_VG,
                            MoreCakesBlocks.HUGE_CAKE_VS_CG_CN, MoreCakesBlocks.HUGE_CAKE_VS_CG_CB, MoreCakesBlocks.HUGE_CAKE_VS_CG_CS, MoreCakesBlocks.HUGE_CAKE_VS_CG_CG,
                            MoreCakesBlocks.HUGE_CAKE_VS_CG_VN, MoreCakesBlocks.HUGE_CAKE_VS_CG_VB, MoreCakesBlocks.HUGE_CAKE_VS_CG_VS, MoreCakesBlocks.HUGE_CAKE_VS_CG_VG,
                            MoreCakesBlocks.HUGE_CAKE_VS_VN_CN, MoreCakesBlocks.HUGE_CAKE_VS_VN_CB, MoreCakesBlocks.HUGE_CAKE_VS_VN_CS, MoreCakesBlocks.HUGE_CAKE_VS_VN_CG,
                            MoreCakesBlocks.HUGE_CAKE_VS_VN_VN, MoreCakesBlocks.HUGE_CAKE_VS_VN_VB, MoreCakesBlocks.HUGE_CAKE_VS_VN_VS, MoreCakesBlocks.HUGE_CAKE_VS_VN_VG,
                            MoreCakesBlocks.HUGE_CAKE_VS_VB_CN, MoreCakesBlocks.HUGE_CAKE_VS_VB_CB, MoreCakesBlocks.HUGE_CAKE_VS_VB_CS, MoreCakesBlocks.HUGE_CAKE_VS_VB_CG,
                            MoreCakesBlocks.HUGE_CAKE_VS_VB_VN, MoreCakesBlocks.HUGE_CAKE_VS_VB_VB, MoreCakesBlocks.HUGE_CAKE_VS_VB_VS, MoreCakesBlocks.HUGE_CAKE_VS_VB_VG,
                            MoreCakesBlocks.HUGE_CAKE_VS_VS_CN, MoreCakesBlocks.HUGE_CAKE_VS_VS_CB, MoreCakesBlocks.HUGE_CAKE_VS_VS_CS, MoreCakesBlocks.HUGE_CAKE_VS_VS_CG,
                            MoreCakesBlocks.HUGE_CAKE_VS_VS_VN, MoreCakesBlocks.HUGE_CAKE_VS_VS_VB, MoreCakesBlocks.HUGE_CAKE_VS_VS_VS, MoreCakesBlocks.HUGE_CAKE_VS_VS_VG,
                            MoreCakesBlocks.HUGE_CAKE_VS_VG_CN, MoreCakesBlocks.HUGE_CAKE_VS_VG_CB, MoreCakesBlocks.HUGE_CAKE_VS_VG_CS, MoreCakesBlocks.HUGE_CAKE_VS_VG_CG,
                            MoreCakesBlocks.HUGE_CAKE_VS_VG_VN, MoreCakesBlocks.HUGE_CAKE_VS_VG_VB, MoreCakesBlocks.HUGE_CAKE_VS_VG_VS, MoreCakesBlocks.HUGE_CAKE_VS_VG_VG,
                            MoreCakesBlocks.HUGE_CAKE_VG_CN_CN, MoreCakesBlocks.HUGE_CAKE_VG_CN_CB, MoreCakesBlocks.HUGE_CAKE_VG_CN_CS, MoreCakesBlocks.HUGE_CAKE_VG_CN_CG,
                            MoreCakesBlocks.HUGE_CAKE_VG_CN_VN, MoreCakesBlocks.HUGE_CAKE_VG_CN_VB, MoreCakesBlocks.HUGE_CAKE_VG_CN_VS, MoreCakesBlocks.HUGE_CAKE_VG_CN_VG,
                            MoreCakesBlocks.HUGE_CAKE_VG_CB_CN, MoreCakesBlocks.HUGE_CAKE_VG_CB_CB, MoreCakesBlocks.HUGE_CAKE_VG_CB_CS, MoreCakesBlocks.HUGE_CAKE_VG_CB_CG,
                            MoreCakesBlocks.HUGE_CAKE_VG_CB_VN, MoreCakesBlocks.HUGE_CAKE_VG_CB_VB, MoreCakesBlocks.HUGE_CAKE_VG_CB_VS, MoreCakesBlocks.HUGE_CAKE_VG_CB_VG,
                            MoreCakesBlocks.HUGE_CAKE_VG_CS_CN, MoreCakesBlocks.HUGE_CAKE_VG_CS_CB, MoreCakesBlocks.HUGE_CAKE_VG_CS_CS, MoreCakesBlocks.HUGE_CAKE_VG_CS_CG,
                            MoreCakesBlocks.HUGE_CAKE_VG_CS_VN, MoreCakesBlocks.HUGE_CAKE_VG_CS_VB, MoreCakesBlocks.HUGE_CAKE_VG_CS_VS, MoreCakesBlocks.HUGE_CAKE_VG_CS_VG,
                            MoreCakesBlocks.HUGE_CAKE_VG_CG_CN, MoreCakesBlocks.HUGE_CAKE_VG_CG_CB, MoreCakesBlocks.HUGE_CAKE_VG_CG_CS, MoreCakesBlocks.HUGE_CAKE_VG_CG_CG,
                            MoreCakesBlocks.HUGE_CAKE_VG_CG_VN, MoreCakesBlocks.HUGE_CAKE_VG_CG_VB, MoreCakesBlocks.HUGE_CAKE_VG_CG_VS, MoreCakesBlocks.HUGE_CAKE_VG_CG_VG,
                            MoreCakesBlocks.HUGE_CAKE_VG_VN_CN, MoreCakesBlocks.HUGE_CAKE_VG_VN_CB, MoreCakesBlocks.HUGE_CAKE_VG_VN_CS, MoreCakesBlocks.HUGE_CAKE_VG_VN_CG,
                            MoreCakesBlocks.HUGE_CAKE_VG_VN_VN, MoreCakesBlocks.HUGE_CAKE_VG_VN_VB, MoreCakesBlocks.HUGE_CAKE_VG_VN_VS, MoreCakesBlocks.HUGE_CAKE_VG_VN_VG,
                            MoreCakesBlocks.HUGE_CAKE_VG_VB_CN, MoreCakesBlocks.HUGE_CAKE_VG_VB_CB, MoreCakesBlocks.HUGE_CAKE_VG_VB_CS, MoreCakesBlocks.HUGE_CAKE_VG_VB_CG,
                            MoreCakesBlocks.HUGE_CAKE_VG_VB_VN, MoreCakesBlocks.HUGE_CAKE_VG_VB_VB, MoreCakesBlocks.HUGE_CAKE_VG_VB_VS, MoreCakesBlocks.HUGE_CAKE_VG_VB_VG,
                            MoreCakesBlocks.HUGE_CAKE_VG_VS_CN, MoreCakesBlocks.HUGE_CAKE_VG_VS_CB, MoreCakesBlocks.HUGE_CAKE_VG_VS_CS, MoreCakesBlocks.HUGE_CAKE_VG_VS_CG,
                            MoreCakesBlocks.HUGE_CAKE_VG_VS_VN, MoreCakesBlocks.HUGE_CAKE_VG_VS_VB, MoreCakesBlocks.HUGE_CAKE_VG_VS_VS, MoreCakesBlocks.HUGE_CAKE_VG_VS_VG,
                            MoreCakesBlocks.HUGE_CAKE_VG_VG_CN, MoreCakesBlocks.HUGE_CAKE_VG_VG_CB, MoreCakesBlocks.HUGE_CAKE_VG_VG_CS, MoreCakesBlocks.HUGE_CAKE_VG_VG_CG,
                            MoreCakesBlocks.HUGE_CAKE_VG_VG_VN, MoreCakesBlocks.HUGE_CAKE_VG_VG_VB, MoreCakesBlocks.HUGE_CAKE_VG_VG_VS, MoreCakesBlocks.HUGE_CAKE_VG_VG_VG)) {
                        entries.add(block);
                    }
                }

                entries.add(MoreCakesItems.COCOA_BEANS_BUCKET, ItemGroup.StackVisibility.SEARCH_TAB_ONLY);
                entries.add(MoreCakesItems.COCOA_BUCKET,ItemGroup.StackVisibility.SEARCH_TAB_ONLY);
                entries.add(MoreCakesItems.CHOCOLATE_BUCKET,ItemGroup.StackVisibility.SEARCH_TAB_ONLY);
            })
            .build();
}
