package net.mcreator.rubehz.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.rubehz.network.RubehzModVariables;

public class NumberintelektProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u0438\u043D\u0442\u0435\u043B\u0435\u043A\u0442:" + (entity.getCapability(RubehzModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RubehzModVariables.PlayerVariables())).intelligence;
	}
}
