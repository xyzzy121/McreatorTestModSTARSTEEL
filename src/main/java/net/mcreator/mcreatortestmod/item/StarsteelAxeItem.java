
package net.mcreator.mcreatortestmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.mcreatortestmod.itemgroup.TestItemGroup;
import net.mcreator.mcreatortestmod.McreatorTestModModElements;

@McreatorTestModModElements.ModElement.Tag
public class StarsteelAxeItem extends McreatorTestModModElements.ModElement {
	@ObjectHolder("mcreator_test_mod:starsteel_axe")
	public static final Item block = null;

	public StarsteelAxeItem(McreatorTestModModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(StarsteelDustItem.block));
			}
		}, 1, -3f, new Item.Properties().group(TestItemGroup.tab)) {
		}.setRegistryName("starsteel_axe"));
	}
}
