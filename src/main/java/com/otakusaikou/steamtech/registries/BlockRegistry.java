package com.otakusaikou.steamtech.registries;

import com.otakusaikou.steamtech.utils.ModContants;
import net.minecraft.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ModContants.MOD_ID);
}
