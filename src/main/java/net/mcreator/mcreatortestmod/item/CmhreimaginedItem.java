
package net.mcreator.mcreatortestmod.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mcreatortestmod.init.McreatorTestModModSounds;

public class CmhreimaginedItem extends RecordItem {
	public CmhreimaginedItem() {
		super(0, McreatorTestModModSounds.REGISTRY.get(new ResourceLocation("mcreator_test_mod:cmh_reimagined")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
