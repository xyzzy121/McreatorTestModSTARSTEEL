
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

public abstract class HoneyFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> McreatorTestModModFluidTypes.HONEY_TYPE.get(), () -> McreatorTestModModFluids.HONEY.get(), () -> McreatorTestModModFluids.FLOWING_HONEY.get())
			.explosionResistance(100f).tickRate(25).bucket(() -> McreatorTestModModItems.HONEY_BUCKET.get()).block(() -> (LiquidBlock) McreatorTestModModBlocks.HONEY.get());

	private HoneyFluid() {
		super(PROPERTIES);
	}

	public static class Source extends HoneyFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends HoneyFluid {
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
