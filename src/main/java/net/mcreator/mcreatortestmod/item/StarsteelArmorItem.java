
package net.mcreator.mcreatortestmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mcreatortestmod.init.McreatorTestModModTabs;
import net.mcreator.mcreatortestmod.init.McreatorTestModModItems;

public abstract class StarsteelArmorItem extends ArmorItem {
	public StarsteelArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 100;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{100, 100, 100, 100}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 100;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_generic"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(McreatorTestModModItems.STARSTEEL_DUST.get()), new ItemStack(Blocks.DIRT));
			}

			@Override
			public String getName() {
				return "starsteel_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends StarsteelArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mcreator_test_mod:textures/models/armor/starsteel_layer_1.png";
		}
	}

	public static class Chestplate extends StarsteelArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mcreator_test_mod:textures/models/armor/starsteel_layer_1.png";
		}
	}

	public static class Leggings extends StarsteelArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mcreator_test_mod:textures/models/armor/starsteel_layer_2.png";
		}
	}

	public static class Boots extends StarsteelArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mcreator_test_mod:textures/models/armor/starsteel_layer_1.png";
		}
	}
}
