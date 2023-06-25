
package net.mcreator.mcreatortestmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.mcreatortestmod.itemgroup.TestItemGroup;
import net.mcreator.mcreatortestmod.McreatorTestModModElements;

@McreatorTestModModElements.ModElement.Tag
public class CmhreimaginedItem extends McreatorTestModModElements.ModElement {
	@ObjectHolder("mcreator_test_mod:cmhreimagined")
	public static final Item block = null;

	public CmhreimaginedItem(McreatorTestModModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, McreatorTestModModElements.sounds.get(new ResourceLocation("mcreator_test_mod:cmh_reimagined")),
					new Item.Properties().group(TestItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("cmhreimagined");
		}
	}
}
