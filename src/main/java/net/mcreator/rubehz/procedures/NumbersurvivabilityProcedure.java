package net.mcreator.rubehz.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.rubehz.network.RubehzModVariables;

public class NumbersurvivabilityProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u0436\u0438\u0432\u0443\u0447\u0435\u0441\u0442\u044C:" + (entity.getCapability(RubehzModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RubehzModVariables.PlayerVariables())).survivability;
	}
}
