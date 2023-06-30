
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcreatortestmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mcreatortestmod.McreatorTestModMod;

public class McreatorTestModModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, McreatorTestModMod.MODID);
	public static final RegistryObject<Potion> LEVITATION = REGISTRY.register("levitation", () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 3600, 0, false, true)));
	public static final RegistryObject<Potion> AMBROSIA = REGISTRY.register("ambrosia",
			() -> new Potion(new MobEffectInstance(MobEffects.HEAL, 9999, 255, false, false), new MobEffectInstance(MobEffects.REGENERATION, 9999, 255, false, false), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 9999, 255, false, false),
					new MobEffectInstance(MobEffects.WATER_BREATHING, 9999, 255, false, false), new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 9999, 255, false, false), new MobEffectInstance(MobEffects.HEALTH_BOOST, 9999, 255, false, false),
					new MobEffectInstance(MobEffects.SATURATION, 3600, 255, false, false), new MobEffectInstance(MobEffects.LUCK, 3600, 5, false, false), new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 255, false, false),
					new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3600, 3, false, false), new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0, false, false)));
}
