
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcreatortestmod.init;

<<<<<<< Updated upstream
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class McreatorTestModModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(McreatorTestModModBlocks.STARSTEEL_ORE.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(McreatorTestModModItems.CMHREIMAGINED.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(McreatorTestModModItems.STARSTEEL_PICKAXE.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("mcreator_test_mod", "test"),
				builder -> builder.title(Component.translatable("item_group.mcreator_test_mod.test")).icon(() -> new ItemStack(McreatorTestModModItems.CMHREIMAGINED.get())).displayItems((parameters, tabData) -> {
					tabData.accept(McreatorTestModModItems.STARSTEEL_DUST.get());
					tabData.accept(McreatorTestModModBlocks.STARSTEEL_BLOCK.get().asItem());
					tabData.accept(McreatorTestModModItems.STARSTEEL_AXE.get());
					tabData.accept(McreatorTestModModItems.STARSTEEL_SWORD.get());
					tabData.accept(McreatorTestModModItems.STARSTEEL_SHOVEL.get());
					tabData.accept(McreatorTestModModItems.STARSTEEL_HOE.get());
					tabData.accept(McreatorTestModModItems.STARSTEEL_ARMOR_HELMET.get());
					tabData.accept(McreatorTestModModItems.STARSTEEL_ARMOR_CHESTPLATE.get());
					tabData.accept(McreatorTestModModItems.STARSTEEL_ARMOR_LEGGINGS.get());
					tabData.accept(McreatorTestModModItems.STARSTEEL_ARMOR_BOOTS.get());
				})

		);
=======
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class McreatorTestModModTabs {
	public static CreativeModeTab TAB_TEST;

	public static void load() {
		TAB_TEST = new CreativeModeTab("tabtest") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(McreatorTestModModItems.CMHREIMAGINED.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
>>>>>>> Stashed changes
	}
}
