
package net.mcreator.mcreatortestmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mcreatortestmod.init.McreatorTestModModTabs;
import net.mcreator.mcreatortestmod.init.McreatorTestModModItems;

public class StarsteelPickaxeItem extends PickaxeItem {
	public StarsteelPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(McreatorTestModModItems.STARSTEEL_DUST.get()));
			}
		}, 1, -3f, new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST));
	}
}
