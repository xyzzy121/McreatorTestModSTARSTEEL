
package net.mcreator.mcreatortestmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.mcreatortestmod.init.McreatorTestModModTabs;

public class StarsteelDustItem extends Item {
	public StarsteelDustItem() {
		super(new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST).stacksTo(64).rarity(Rarity.COMMON));
	}
}
