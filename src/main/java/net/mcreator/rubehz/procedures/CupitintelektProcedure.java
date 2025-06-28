package net.mcreator.rubehz.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.rubehz.network.RubehzModVariables;

public class CupitintelektProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(RubehzModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RubehzModVariables.PlayerVariables())).skill_points > 0) {
			{
				double _setval = (entity.getCapability(RubehzModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RubehzModVariables.PlayerVariables())).intelligence + 1;
				entity.getCapability(RubehzModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.intelligence = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(RubehzModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RubehzModVariables.PlayerVariables())).skill_points - 1;
				entity.getCapability(RubehzModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.skill_points = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
