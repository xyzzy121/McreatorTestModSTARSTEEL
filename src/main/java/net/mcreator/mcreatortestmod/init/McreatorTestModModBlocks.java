
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
import net.mcreator.mcreatortestmod.McreatorTestModMod;

public class McreatorTestModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McreatorTestModMod.MODID);
	public static final RegistryObject<Block> STARSTEEL_ORE = REGISTRY.register("starsteel_ore", () -> new StarsteelOreBlock());
	public static final RegistryObject<Block> STARSTEEL_BLOCK = REGISTRY.register("starsteel_block", () -> new StarsteelBlockBlock());
	public static final RegistryObject<Block> THE_UNDERSPAWN_PORTAL = REGISTRY.register("the_underspawn_portal", () -> new TheUnderspawnPortalBlock());
}
