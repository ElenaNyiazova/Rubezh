
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubehz.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.rubehz.world.inventory.BjMenu;
import net.mcreator.rubehz.RubehzMod;

public class RubehzModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, RubehzMod.MODID);
	public static final RegistryObject<MenuType<BjMenu>> INTERFACE_LEVEL = REGISTRY.register("interface_level", () -> IForgeMenuType.create(BjMenu::new));
}
