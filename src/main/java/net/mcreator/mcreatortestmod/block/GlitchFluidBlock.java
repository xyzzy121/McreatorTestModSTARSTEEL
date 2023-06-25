
package net.mcreator.mcreatortestmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.mcreatortestmod.init.McreatorTestModModFluids;

public class GlitchFluidBlock extends LiquidBlock {
	public GlitchFluidBlock() {
		super(() -> McreatorTestModModFluids.GLITCH_FLUID.get(),
				BlockBehaviour.Properties.of(Material.WATER).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 5).noCollission().noLootTable());
	}
}
