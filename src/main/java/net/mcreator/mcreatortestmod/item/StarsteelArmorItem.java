
package net.mcreator.mcreatortestmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.mcreatortestmod.itemgroup.TestItemGroup;
import net.mcreator.mcreatortestmod.McreatorTestModModElements;

@McreatorTestModModElements.ModElement.Tag
public class StarsteelArmorItem extends McreatorTestModModElements.ModElement {
	@ObjectHolder("mcreator_test_mod:starsteel_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("mcreator_test_mod:starsteel_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("mcreator_test_mod:starsteel_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("mcreator_test_mod:starsteel_armor_boots")
	public static final Item boots = null;

	public StarsteelArmorItem(McreatorTestModModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 100;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{100, 100, 100, 100}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 100;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_generic"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(StarsteelDustItem.block), new ItemStack(Blocks.DIRT));
			}

			@OnlyIn(Dist.CLIENT)
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
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(TestItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "mcreator_test_mod:textures/models/armor/starsteel_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("starsteel_armor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(TestItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "mcreator_test_mod:textures/models/armor/starsteel_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("starsteel_armor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(TestItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "mcreator_test_mod:textures/models/armor/starsteel_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("starsteel_armor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(TestItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "mcreator_test_mod:textures/models/armor/starsteel_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("starsteel_armor_boots"));
	}

}
