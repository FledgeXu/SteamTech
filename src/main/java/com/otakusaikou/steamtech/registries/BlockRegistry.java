package com.otakusaikou.steamtech.registries;

import com.otakusaikou.steamtech.blocks.CopperOreBlock;
import com.otakusaikou.steamtech.utils.ModContants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ModContants.MOD_ID);
    public static final RegistryObject<CopperOreBlock> copperOre = BLOCKS.register("copper_ore", () -> new CopperOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(5).harvestLevel(2)));
}
