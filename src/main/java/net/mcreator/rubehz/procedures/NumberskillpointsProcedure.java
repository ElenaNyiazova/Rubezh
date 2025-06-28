package net.mcreator.rubehz.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.rubehz.network.RubehzModVariables;

public class NumberskillpointsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u043E\u0447\u043A\u0438 \u0443\u043B\u0443\u0447\u0448\u0435\u043D\u0438\u044F" + (entity.getCapability(RubehzModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RubehzModVariables.PlayerVariables())).skill_points;
	}
}
