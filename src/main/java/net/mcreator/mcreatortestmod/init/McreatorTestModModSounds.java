
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcreatortestmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mcreatortestmod.McreatorTestModMod;

public class McreatorTestModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, McreatorTestModMod.MODID);
	public static final RegistryObject<SoundEvent> ADDICT = REGISTRY.register("addict", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "addict")));
	public static final RegistryObject<SoundEvent> CMH_REIMAGINED = REGISTRY.register("cmh_reimagined", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "cmh_reimagined")));
}
