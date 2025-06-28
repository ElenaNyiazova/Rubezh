
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubehz.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.rubehz.item.KatanaTESTItem;
import net.mcreator.rubehz.item.FrezzerGUNNOSTATItem;
import net.mcreator.rubehz.item.FrezzerGUNItem;
import net.mcreator.rubehz.item.FireGUNGUNItem;
import net.mcreator.rubehz.RubehzMod;

public class RubehzModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RubehzMod.MODID);
	public static final RegistryObject<Item> KATANA_TEST = REGISTRY.register("katana_test", () -> new KatanaTESTItem());
	public static final RegistryObject<Item> FREZZER_GUN = REGISTRY.register("frezzer_gun", () -> new FrezzerGUNItem());
	public static final RegistryObject<Item> FREZZER_GUNNOSTAT = REGISTRY.register("frezzer_gunnostat", () -> new FrezzerGUNNOSTATItem());
	public static final RegistryObject<Item> FIRE_GUNGUN = REGISTRY.register("fire_gungun", () -> new FireGUNGUNItem());
	// Start of user code block custom items
	// End of user code block custom items
}
