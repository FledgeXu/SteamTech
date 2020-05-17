package com.otakusaikou.steamtech.registries;

import com.otakusaikou.steamtech.utils.ModContants;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ModContants.MOD_ID);
}
