
package net.mcreator.mcreatortestmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mcreatortestmod.init.McreatorTestModModTabs;

public class WoeToThePeopleOfOrderStereoItem extends RecordItem {
	public WoeToThePeopleOfOrderStereoItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mcreator_test_mod:woetothepeopleoforder_stereo")), new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST).stacksTo(1).rarity(Rarity.RARE), 9533);
	}
}
