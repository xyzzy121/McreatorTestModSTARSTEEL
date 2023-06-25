
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcreatortestmod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class McreatorTestModModTabs {
	public static CreativeModeTab TAB_TEST;

	public static void load() {
		TAB_TEST = new CreativeModeTab("tabtest") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(McreatorTestModModItems.STARSTEEL_DUST.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
