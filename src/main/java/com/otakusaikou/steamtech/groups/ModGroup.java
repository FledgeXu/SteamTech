package com.otakusaikou.steamtech.groups;

import com.otakusaikou.steamtech.registries.ItemRegistry;
import com.otakusaikou.steamtech.utils.ModContants;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModGroup {
    public static final ItemGroup DEFAULT_GROUP = new ItemGroup(ModContants.MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemRegistry.copperIngot.get());
        }
    };
}
