
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcreatortestmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.mcreatortestmod.McreatorTestModMod;

public class McreatorTestModModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, McreatorTestModMod.MODID);
	public static final RegistryObject<PaintingVariant> I_ASSURE_YOU = REGISTRY.register("i_assure_you", () -> new PaintingVariant(53, 37));
}
