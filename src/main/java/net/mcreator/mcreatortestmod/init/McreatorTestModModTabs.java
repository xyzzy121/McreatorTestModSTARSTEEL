
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
<<<<<<< Updated upstream
				return new ItemStack(McreatorTestModModItems.CMHREIMAGINED.get());
=======
				return new ItemStack(McreatorTestModModItems.STARSTEEL_DUST.get());
>>>>>>> Stashed changes
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
