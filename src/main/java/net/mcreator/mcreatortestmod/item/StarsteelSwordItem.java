
package net.mcreator.mcreatortestmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.mcreatortestmod.itemgroup.TestItemGroup;
import net.mcreator.mcreatortestmod.McreatorTestModModElements;

@McreatorTestModModElements.ModElement.Tag
public class StarsteelSwordItem extends McreatorTestModModElements.ModElement {
	@ObjectHolder("mcreator_test_mod:starsteel_sword")
	public static final Item block = null;

	public StarsteelSwordItem(McreatorTestModModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 4f;
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
		}, 3, -3f, new Item.Properties().group(TestItemGroup.tab)) {
		}.setRegistryName("starsteel_sword"));
	}
}
