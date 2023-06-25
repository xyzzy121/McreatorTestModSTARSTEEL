
package net.mcreator.mcreatortestmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.mcreatortestmod.item.StarsteelDustItem;
import net.mcreator.mcreatortestmod.McreatorTestModModElements;

@McreatorTestModModElements.ModElement.Tag
public class TestItemGroup extends McreatorTestModModElements.ModElement {
	public TestItemGroup(McreatorTestModModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtest") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(StarsteelDustItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
