
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcreatortestmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.mcreatortestmod.world.features.ores.StarsteelOreFeature;
import net.mcreator.mcreatortestmod.world.features.ores.BloodstoneOreFeature;
import net.mcreator.mcreatortestmod.McreatorTestModMod;

@Mod.EventBusSubscriber
public class McreatorTestModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, McreatorTestModMod.MODID);
	public static final RegistryObject<Feature<?>> STARSTEEL_ORE = REGISTRY.register("starsteel_ore", StarsteelOreFeature::feature);
	public static final RegistryObject<Feature<?>> BLOODSTONE_ORE = REGISTRY.register("bloodstone_ore", BloodstoneOreFeature::feature);
}
