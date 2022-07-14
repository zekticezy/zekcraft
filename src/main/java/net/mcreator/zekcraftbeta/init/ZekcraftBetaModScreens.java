
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraftbeta.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.zekcraftbeta.client.gui.CreditsScreen;
import net.mcreator.zekcraftbeta.client.gui.ComputerScreenScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ZekcraftBetaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ZekcraftBetaModMenus.CREDITS, CreditsScreen::new);
			MenuScreens.register(ZekcraftBetaModMenus.COMPUTER_SCREEN, ComputerScreenScreen::new);
		});
	}
}
