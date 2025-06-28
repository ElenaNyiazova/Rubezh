package net.mcreator.rubehz.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.rubehz.network.RubehzModVariables;

public class NumbercilaProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u0441\u0438\u043B\u0430:" + (entity.getCapability(RubehzModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RubehzModVariables.PlayerVariables())).strength;
	}
}
