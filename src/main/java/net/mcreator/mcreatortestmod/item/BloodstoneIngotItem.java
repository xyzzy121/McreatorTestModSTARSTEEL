
package net.mcreator.mcreatortestmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.mcreatortestmod.init.McreatorTestModModTabs;

public class BloodstoneIngotItem extends Item {
	public BloodstoneIngotItem() {
		super(new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST).stacksTo(64).rarity(Rarity.EPIC));
	}
}
