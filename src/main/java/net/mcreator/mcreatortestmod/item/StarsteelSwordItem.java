
package net.mcreator.mcreatortestmod.item;

<<<<<<< Updated upstream
=======
import net.minecraft.world.level.block.Blocks;
>>>>>>> Stashed changes
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mcreatortestmod.init.McreatorTestModModTabs;
import net.mcreator.mcreatortestmod.init.McreatorTestModModItems;

public class StarsteelSwordItem extends SwordItem {
	public StarsteelSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
<<<<<<< Updated upstream
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 4f;
=======
				return 100f;
			}

			public float getAttackDamageBonus() {
				return 98f;
>>>>>>> Stashed changes
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
<<<<<<< Updated upstream
				return Ingredient.of(new ItemStack(McreatorTestModModItems.STARSTEEL_DUST.get()));
			}
		}, 3, -3f, new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST));
=======
				return Ingredient.of(new ItemStack(McreatorTestModModItems.STARSTEEL_DUST.get()), new ItemStack(Blocks.DIRT));
			}
		}, 3, -3f, new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST).fireResistant());
>>>>>>> Stashed changes
	}
}
