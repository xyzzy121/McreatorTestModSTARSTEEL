
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
	public static final RegistryObject<SoundEvent> WORLD_I_NEVER_KNEW = REGISTRY.register("world_i_never_knew", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "world_i_never_knew")));
	public static final RegistryObject<SoundEvent> ZOMBIFIED = REGISTRY.register("zombified", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "zombified")));
	public static final RegistryObject<SoundEvent> WOE_TO_THE_PEOPLE_OF_ORDER_MONO = REGISTRY.register("woe_to_the_people_of_order_mono", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "woe_to_the_people_of_order_mono")));
	public static final RegistryObject<SoundEvent> WOETOTHEPEOPLEOFORDER_STEREO = REGISTRY.register("woetothepeopleoforder_stereo", () -> new SoundEvent(new ResourceLocation("mcreator_test_mod", "woetothepeopleoforder_stereo")));
}
