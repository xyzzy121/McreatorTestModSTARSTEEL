
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcreatortestmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mcreatortestmod.item.StarsteelSwordItem;
import net.mcreator.mcreatortestmod.item.StarsteelShovelItem;
import net.mcreator.mcreatortestmod.item.StarsteelPickaxeItem;
import net.mcreator.mcreatortestmod.item.StarsteelHoeItem;
import net.mcreator.mcreatortestmod.item.StarsteelDustItem;
import net.mcreator.mcreatortestmod.item.StarsteelAxeItem;
import net.mcreator.mcreatortestmod.item.StarsteelArmorItem;
<<<<<<< Updated upstream
import net.mcreator.mcreatortestmod.item.CmhreimaginedItem;
=======
import net.mcreator.mcreatortestmod.item.HoneyItem;
import net.mcreator.mcreatortestmod.item.CmhreimaginedItem;
import net.mcreator.mcreatortestmod.item.BloodstoneSwordItem;
import net.mcreator.mcreatortestmod.item.BloodstoneShovelItem;
import net.mcreator.mcreatortestmod.item.BloodstonePickaxeItem;
import net.mcreator.mcreatortestmod.item.BloodstoneIngotItem;
import net.mcreator.mcreatortestmod.item.BloodstoneHoeItem;
import net.mcreator.mcreatortestmod.item.BloodstoneAxeItem;
import net.mcreator.mcreatortestmod.item.BloodstoneArmorItem;
>>>>>>> Stashed changes
import net.mcreator.mcreatortestmod.McreatorTestModMod;

public class McreatorTestModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McreatorTestModMod.MODID);
	public static final RegistryObject<Item> CMHREIMAGINED = REGISTRY.register("cmhreimagined", () -> new CmhreimaginedItem());
<<<<<<< Updated upstream
	public static final RegistryObject<Item> STARSTEEL_DUST = REGISTRY.register("starsteel_dust", () -> new StarsteelDustItem());
	public static final RegistryObject<Item> STARSTEEL_ORE = block(McreatorTestModModBlocks.STARSTEEL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STARSTEEL_BLOCK = block(McreatorTestModModBlocks.STARSTEEL_BLOCK, McreatorTestModModTabs.TAB_TEST);
=======
	public static final RegistryObject<Item> HONEY_BUCKET = REGISTRY.register("honey_bucket", () -> new HoneyItem());
	public static final RegistryObject<Item> STARSTEEL_BLOCK = block(McreatorTestModModBlocks.STARSTEEL_BLOCK, McreatorTestModModTabs.TAB_TEST);
	public static final RegistryObject<Item> STARSTEEL_ORE = block(McreatorTestModModBlocks.STARSTEEL_ORE, McreatorTestModModTabs.TAB_TEST);
	public static final RegistryObject<Item> STARSTEEL_DUST = REGISTRY.register("starsteel_dust", () -> new StarsteelDustItem());
	public static final RegistryObject<Item> STARSTEEL_ARMOR_HELMET = REGISTRY.register("starsteel_armor_helmet", () -> new StarsteelArmorItem.Helmet());
	public static final RegistryObject<Item> STARSTEEL_ARMOR_CHESTPLATE = REGISTRY.register("starsteel_armor_chestplate", () -> new StarsteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STARSTEEL_ARMOR_LEGGINGS = REGISTRY.register("starsteel_armor_leggings", () -> new StarsteelArmorItem.Leggings());
	public static final RegistryObject<Item> STARSTEEL_ARMOR_BOOTS = REGISTRY.register("starsteel_armor_boots", () -> new StarsteelArmorItem.Boots());
>>>>>>> Stashed changes
	public static final RegistryObject<Item> STARSTEEL_PICKAXE = REGISTRY.register("starsteel_pickaxe", () -> new StarsteelPickaxeItem());
	public static final RegistryObject<Item> STARSTEEL_AXE = REGISTRY.register("starsteel_axe", () -> new StarsteelAxeItem());
	public static final RegistryObject<Item> STARSTEEL_SWORD = REGISTRY.register("starsteel_sword", () -> new StarsteelSwordItem());
	public static final RegistryObject<Item> STARSTEEL_SHOVEL = REGISTRY.register("starsteel_shovel", () -> new StarsteelShovelItem());
	public static final RegistryObject<Item> STARSTEEL_HOE = REGISTRY.register("starsteel_hoe", () -> new StarsteelHoeItem());
<<<<<<< Updated upstream
	public static final RegistryObject<Item> STARSTEEL_ARMOR_HELMET = REGISTRY.register("starsteel_armor_helmet", () -> new StarsteelArmorItem.Helmet());
	public static final RegistryObject<Item> STARSTEEL_ARMOR_CHESTPLATE = REGISTRY.register("starsteel_armor_chestplate", () -> new StarsteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STARSTEEL_ARMOR_LEGGINGS = REGISTRY.register("starsteel_armor_leggings", () -> new StarsteelArmorItem.Leggings());
	public static final RegistryObject<Item> STARSTEEL_ARMOR_BOOTS = REGISTRY.register("starsteel_armor_boots", () -> new StarsteelArmorItem.Boots());
=======
	public static final RegistryObject<Item> BLOODSTONE_BLOCK = block(McreatorTestModModBlocks.BLOODSTONE_BLOCK, McreatorTestModModTabs.TAB_TEST);
	public static final RegistryObject<Item> BLOODSTONE_ORE = block(McreatorTestModModBlocks.BLOODSTONE_ORE, McreatorTestModModTabs.TAB_TEST);
	public static final RegistryObject<Item> BLOODSTONE_INGOT = REGISTRY.register("bloodstone_ingot", () -> new BloodstoneIngotItem());
	public static final RegistryObject<Item> BLOODSTONE_ARMOR_HELMET = REGISTRY.register("bloodstone_armor_helmet", () -> new BloodstoneArmorItem.Helmet());
	public static final RegistryObject<Item> BLOODSTONE_ARMOR_CHESTPLATE = REGISTRY.register("bloodstone_armor_chestplate", () -> new BloodstoneArmorItem.Chestplate());
	public static final RegistryObject<Item> BLOODSTONE_ARMOR_LEGGINGS = REGISTRY.register("bloodstone_armor_leggings", () -> new BloodstoneArmorItem.Leggings());
	public static final RegistryObject<Item> BLOODSTONE_ARMOR_BOOTS = REGISTRY.register("bloodstone_armor_boots", () -> new BloodstoneArmorItem.Boots());
	public static final RegistryObject<Item> BLOODSTONE_PICKAXE = REGISTRY.register("bloodstone_pickaxe", () -> new BloodstonePickaxeItem());
	public static final RegistryObject<Item> BLOODSTONE_AXE = REGISTRY.register("bloodstone_axe", () -> new BloodstoneAxeItem());
	public static final RegistryObject<Item> BLOODSTONE_SWORD = REGISTRY.register("bloodstone_sword", () -> new BloodstoneSwordItem());
	public static final RegistryObject<Item> BLOODSTONE_SHOVEL = REGISTRY.register("bloodstone_shovel", () -> new BloodstoneShovelItem());
	public static final RegistryObject<Item> BLOODSTONE_HOE = REGISTRY.register("bloodstone_hoe", () -> new BloodstoneHoeItem());
>>>>>>> Stashed changes

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
