
package net.mcreator.mcreatortestmod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.mcreatortestmod.init.McreatorTestModModItems;
import net.mcreator.mcreatortestmod.init.McreatorTestModModFluids;
import net.mcreator.mcreatortestmod.init.McreatorTestModModFluidTypes;
import net.mcreator.mcreatortestmod.init.McreatorTestModModBlocks;

public abstract class GlitchFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> McreatorTestModModFluidTypes.GLITCH_FLUID_TYPE.get(), () -> McreatorTestModModFluids.GLITCH_FLUID.get(),
			() -> McreatorTestModModFluids.FLOWING_GLITCH_FLUID.get()).explosionResistance(100f).slopeFindDistance(3).bucket(() -> McreatorTestModModItems.GLITCH_FLUID_BUCKET.get())
			.block(() -> (LiquidBlock) McreatorTestModModBlocks.GLITCH_FLUID.get());

	private GlitchFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends GlitchFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends GlitchFluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
