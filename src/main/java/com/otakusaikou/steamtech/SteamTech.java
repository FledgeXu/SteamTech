package com.otakusaikou.steamtech;

import com.otakusaikou.steamtech.registries.BlockRegistry;
import com.otakusaikou.steamtech.registries.ItemRegistry;
import com.otakusaikou.steamtech.utils.ModContants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModContants.MOD_ID)
public class SteamTech {
    public SteamTech() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
