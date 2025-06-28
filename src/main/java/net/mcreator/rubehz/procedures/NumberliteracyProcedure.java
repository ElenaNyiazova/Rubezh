package net.mcreator.rubehz.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.rubehz.network.RubehzModVariables;

public class NumberliteracyProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u043D\u0430\u0447\u0438\u0442\u0430\u043D\u043E\u0441\u0442\u044C:" + (entity.getCapability(RubehzModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RubehzModVariables.PlayerVariables())).literacy;
	}
}
