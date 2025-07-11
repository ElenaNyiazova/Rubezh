
package net.mcreator.rubehz.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.rubehz.world.inventory.BjMenu;
import net.mcreator.rubehz.procedures.WillpowerProcedure;
import net.mcreator.rubehz.procedures.SurvProcedure;
import net.mcreator.rubehz.procedures.SpeedProcedure;
import net.mcreator.rubehz.procedures.LiterProcedure;
import net.mcreator.rubehz.procedures.CupitintelektProcedure;
import net.mcreator.rubehz.procedures.CilaProcedure;
import net.mcreator.rubehz.procedures.AgilityProcedure;
import net.mcreator.rubehz.RubehzMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BjButtonMessage {
	private final int buttonID, x, y, z;

	public BjButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BjButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BjButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BjButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = BjMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CilaProcedure.execute(entity);
		}
		if (buttonID == 1) {

			CupitintelektProcedure.execute(entity);
		}
		if (buttonID == 2) {

			SpeedProcedure.execute(entity);
		}
		if (buttonID == 3) {

			LiterProcedure.execute(entity);
		}
		if (buttonID == 4) {

			SurvProcedure.execute(entity);
		}
		if (buttonID == 5) {

			WillpowerProcedure.execute(entity);
		}
		if (buttonID == 6) {

			AgilityProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RubehzMod.addNetworkMessage(BjButtonMessage.class, BjButtonMessage::buffer, BjButtonMessage::new, BjButtonMessage::handler);
	}
}
