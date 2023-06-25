
package net.mcreator.mcreatortestmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.mcreatortestmod.init.McreatorTestModModFluids;

public class HoneyBlock extends LiquidBlock {
	public HoneyBlock() {
		super(() -> McreatorTestModModFluids.HONEY.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).lightLevel(s -> 1).noCollission().noLootTable());
	}
}
