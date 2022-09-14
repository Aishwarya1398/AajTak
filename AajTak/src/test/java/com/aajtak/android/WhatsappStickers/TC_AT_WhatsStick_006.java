package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//491
public class TC_AT_WhatsStick_006  extends Aajtak_app_Util{

	@Test(description="Verify that the share icon is displayed at the top of the whatsapp stickers detail screen.")
	public void AT_WhatsStick_006() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*Scroll to WhatsApp Stickers*/
		scrollToElement(homescreen.getWhatsAppstickerText());
		/* click on sticker packet*/
		clickBtn(homescreen.getWhatsAppstickerText());
		/*Validation:Share Icon is display*/
		isElementExist(whatsAppStickers.getShareIcon(),"Share Icon");
	}

}
