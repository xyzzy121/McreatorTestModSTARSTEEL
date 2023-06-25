
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcreatortestmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.mcreatortestmod.fluid.HoneyFluid;
import net.mcreator.mcreatortestmod.fluid.GlitchFluidFluid;
import net.mcreator.mcreatortestmod.McreatorTestModMod;

public class McreatorTestModModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, McreatorTestModMod.MODID);
	public static final RegistryObject<FlowingFluid> HONEY = REGISTRY.register("honey", () -> new HoneyFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_HONEY = REGISTRY.register("flowing_honey", () -> new HoneyFluid.Flowing());
	public static final RegistryObject<FlowingFluid> GLITCH_FLUID = REGISTRY.register("glitch_fluid", () -> new GlitchFluidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_GLITCH_FLUID = REGISTRY.register("flowing_glitch_fluid", () -> new GlitchFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(HONEY.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HONEY.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(GLITCH_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GLITCH_FLUID.get(), RenderType.translucent());
		}
	}
}
