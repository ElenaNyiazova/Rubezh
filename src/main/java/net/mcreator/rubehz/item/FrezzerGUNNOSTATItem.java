
package net.mcreator.rubehz.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.rubehz.procedures.FrezzerGUNYESSTATProcedure;

public class FrezzerGUNNOSTATItem extends Item {
	public FrezzerGUNNOSTATItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			FrezzerGUNYESSTATProcedure.execute(entity);
	}
}
