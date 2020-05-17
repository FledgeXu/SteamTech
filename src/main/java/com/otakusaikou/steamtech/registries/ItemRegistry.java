package com.otakusaikou.steamtech.registries;

import com.otakusaikou.steamtech.groups.ModGroup;
import com.otakusaikou.steamtech.items.CopperIngot;
import com.otakusaikou.steamtech.utils.ModContants;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    private static final Item.Properties DEFAULT_PROPERTIES = new Item.Properties().group(ModGroup.DEFAULT_GROUP);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ModContants.MOD_ID);
    public static final RegistryObject<CopperIngot> copperIngot = ITEMS.register("copper_ingot", () -> new CopperIngot(DEFAULT_PROPERTIES));

    //BlockItem
    public static final RegistryObject<BlockItem> copperOre = ITEMS.register("copper_ore", () -> new BlockItem(BlockRegistry.copperOre.get(), DEFAULT_PROPERTIES));
}
