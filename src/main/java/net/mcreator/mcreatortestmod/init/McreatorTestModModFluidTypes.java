
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcreatortestmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.mcreatortestmod.fluid.types.HoneyFluidType;
import net.mcreator.mcreatortestmod.McreatorTestModMod;

public class McreatorTestModModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, McreatorTestModMod.MODID);
	public static final RegistryObject<FluidType> HONEY_TYPE = REGISTRY.register("honey", () -> new HoneyFluidType());
}
