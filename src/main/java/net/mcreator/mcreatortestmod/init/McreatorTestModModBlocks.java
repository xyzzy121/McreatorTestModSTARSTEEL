
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcreatortestmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mcreatortestmod.block.StarsteelOreBlock;
import net.mcreator.mcreatortestmod.block.StarsteelBlockBlock;
import net.mcreator.mcreatortestmod.block.HoneyBlock;
import net.mcreator.mcreatortestmod.block.BloodstoneOreBlock;
import net.mcreator.mcreatortestmod.block.BloodstoneBlockBlock;
import net.mcreator.mcreatortestmod.McreatorTestModMod;

public class McreatorTestModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McreatorTestModMod.MODID);
	public static final RegistryObject<Block> HONEY = REGISTRY.register("honey", () -> new HoneyBlock());
	public static final RegistryObject<Block> STARSTEEL_BLOCK = REGISTRY.register("starsteel_block", () -> new StarsteelBlockBlock());
	public static final RegistryObject<Block> STARSTEEL_ORE = REGISTRY.register("starsteel_ore", () -> new StarsteelOreBlock());
	public static final RegistryObject<Block> BLOODSTONE_BLOCK = REGISTRY.register("bloodstone_block", () -> new BloodstoneBlockBlock());
	public static final RegistryObject<Block> BLOODSTONE_ORE = REGISTRY.register("bloodstone_ore", () -> new BloodstoneOreBlock());
}
