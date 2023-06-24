
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcreatortestmod.init;

<<<<<<< Updated upstream
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
=======
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
>>>>>>> Stashed changes

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

<<<<<<< Updated upstream
import net.mcreator.mcreatortestmod.McreatorTestModMod;

public class McreatorTestModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, McreatorTestModMod.MODID);
	public static final RegistryObject<SoundEvent> ADDICT = REGISTRY.register("addict", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mcreator_test_mod", "addict")));
	public static final RegistryObject<SoundEvent> CMH_REIMAGINED = REGISTRY.register("cmh_reimagined", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mcreator_test_mod", "cmh_reimagined")));
=======
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class McreatorTestModModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("mcreator_test_mod", "addict"), new SoundEvent(new ResourceLocation("mcreator_test_mod", "addict")));
		REGISTRY.put(new ResourceLocation("mcreator_test_mod", "cmh_reimagined"),
				new SoundEvent(new ResourceLocation("mcreator_test_mod", "cmh_reimagined")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
>>>>>>> Stashed changes
}
