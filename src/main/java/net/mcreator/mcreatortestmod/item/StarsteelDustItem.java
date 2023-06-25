
package net.mcreator.mcreatortestmod.item;

<<<<<<< Updated upstream
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.mcreatortestmod.init.McreatorTestModModTabs;

public class StarsteelDustItem extends Item {
	public StarsteelDustItem() {
		super(new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST).stacksTo(64).rarity(Rarity.COMMON));
=======
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.mcreatortestmod.init.McreatorTestModModTabs;
import net.mcreator.mcreatortestmod.init.McreatorTestModModItems;

public class StarsteelDustItem extends Item {
	public StarsteelDustItem() {
		super(new Item.Properties().tab(McreatorTestModModTabs.TAB_TEST).stacksTo(64).fireResistant().rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(999).saturationMod(10f).alwaysEat().meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(McreatorTestModModItems.STARSTEEL_DUST.get());
		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
>>>>>>> Stashed changes
	}
}
