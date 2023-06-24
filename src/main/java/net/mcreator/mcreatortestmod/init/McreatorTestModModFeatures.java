
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcreatortestmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.mcreatortestmod.McreatorTestModMod;

@Mod.EventBusSubscriber
public class McreatorTestModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, McreatorTestModMod.MODID);
	public static final RegistryObject<Feature<?>> STARSTEEL_ORE = REGISTRY.register("starsteel_ore", StarsteelOreFeature::new);
}
