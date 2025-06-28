package net.mcreator.rubehz.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.rubehz.world.inventory.BjMenu;
import net.mcreator.rubehz.procedures.NumberwillpowerProcedure;
import net.mcreator.rubehz.procedures.NumbersurvivabilityProcedure;
import net.mcreator.rubehz.procedures.NumberspeedProcedure;
import net.mcreator.rubehz.procedures.NumberskillpointsProcedure;
import net.mcreator.rubehz.procedures.NumberliteracyProcedure;
import net.mcreator.rubehz.procedures.NumberintelektProcedure;
import net.mcreator.rubehz.procedures.NumbercilaProcedure;
import net.mcreator.rubehz.procedures.NumberagilityProcedure;
import net.mcreator.rubehz.network.BjButtonMessage;
import net.mcreator.rubehz.RubehzMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BjScreen extends AbstractContainerScreen<BjMenu> {
	private final static HashMap<String, Object> guistate = BjMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_empty2;
	Button button_empty3;
	Button button_empty4;
	Button button_empty5;
	Button button_empty6;

	public BjScreen(BjMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 210;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("rubehz:textures/screens/interface_level.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				NumbercilaProcedure.execute(entity), 23, 12, -12829636, false);
		guiGraphics.drawString(this.font,

				NumberintelektProcedure.execute(entity), 23, 36, -12829636, false);
		guiGraphics.drawString(this.font,

				NumberskillpointsProcedure.execute(entity), 113, 7, -12829636, false);
		guiGraphics.drawString(this.font,

				NumberspeedProcedure.execute(entity), 23, 58, -12829636, false);
		guiGraphics.drawString(this.font,

				NumberliteracyProcedure.execute(entity), 23, 81, -12829636, false);
		guiGraphics.drawString(this.font,

				NumbersurvivabilityProcedure.execute(entity), 23, 104, -12829636, false);
		guiGraphics.drawString(this.font,

				NumberwillpowerProcedure.execute(entity), 23, 128, -12829636, false);
		guiGraphics.drawString(this.font,

				NumberagilityProcedure.execute(entity), 23, 151, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.rubehz.interface_level.button_empty"), e -> {
			if (true) {
				RubehzMod.PACKET_HANDLER.sendToServer(new BjButtonMessage(0, x, y, z));
				BjButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 3, 18, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.rubehz.interface_level.button_empty1"), e -> {
			if (true) {
				RubehzMod.PACKET_HANDLER.sendToServer(new BjButtonMessage(1, x, y, z));
				BjButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 26, 18, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_empty2 = Button.builder(Component.translatable("gui.rubehz.interface_level.button_empty2"), e -> {
			if (true) {
				RubehzMod.PACKET_HANDLER.sendToServer(new BjButtonMessage(2, x, y, z));
				BjButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 49, 18, 20).build();
		guistate.put("button:button_empty2", button_empty2);
		this.addRenderableWidget(button_empty2);
		button_empty3 = Button.builder(Component.translatable("gui.rubehz.interface_level.button_empty3"), e -> {
			if (true) {
				RubehzMod.PACKET_HANDLER.sendToServer(new BjButtonMessage(3, x, y, z));
				BjButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 72, 18, 20).build();
		guistate.put("button:button_empty3", button_empty3);
		this.addRenderableWidget(button_empty3);
		button_empty4 = Button.builder(Component.translatable("gui.rubehz.interface_level.button_empty4"), e -> {
			if (true) {
				RubehzMod.PACKET_HANDLER.sendToServer(new BjButtonMessage(4, x, y, z));
				BjButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 95, 18, 20).build();
		guistate.put("button:button_empty4", button_empty4);
		this.addRenderableWidget(button_empty4);
		button_empty5 = Button.builder(Component.translatable("gui.rubehz.interface_level.button_empty5"), e -> {
			if (true) {
				RubehzMod.PACKET_HANDLER.sendToServer(new BjButtonMessage(5, x, y, z));
				BjButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 119, 18, 20).build();
		guistate.put("button:button_empty5", button_empty5);
		this.addRenderableWidget(button_empty5);
		button_empty6 = Button.builder(Component.translatable("gui.rubehz.interface_level.button_empty6"), e -> {
			if (true) {
				RubehzMod.PACKET_HANDLER.sendToServer(new BjButtonMessage(6, x, y, z));
				BjButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 142, 18, 20).build();
		guistate.put("button:button_empty6", button_empty6);
		this.addRenderableWidget(button_empty6);
	}
}
