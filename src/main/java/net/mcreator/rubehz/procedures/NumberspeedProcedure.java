package net.mcreator.rubehz.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.rubehz.network.RubehzModVariables;

public class NumberspeedProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u0441\u043A\u043E\u0440\u043E\u0441\u0442\u044C:" + (entity.getCapability(RubehzModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RubehzModVariables.PlayerVariables())).speed;
	}
}
