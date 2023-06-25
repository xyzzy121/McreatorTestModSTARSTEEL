
package net.mcreator.mcreatortestmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.mcreatortestmod.init.McreatorTestModModTabs;
import net.mcreator.mcreatortestmod.init.McreatorTestModModFluids;

public class GlitchFluidItem extends BucketItem {
	public GlitchFluidItem() {
		super(McreatorTestModModFluids.GLITCH_FLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC).tab(McreatorTestModModTabs.TAB_TEST));
	}
}
