package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//499
public class TC_AT_WhatsStick_008  extends Aajtak_app_Util{

	@Test(description="Verify that when user taps on share on whatsapp buton , the stickers are downloaded into the device whatsapp")
	public void AT_WhatsStick_008() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*Scroll to WhatsApp Stickers*/
		scrollToElement(homescreen.getWhatsappStickerHeader());
		scrollToElement(homescreen.getWhatsAppstickerText());
		/*click on whatsApp sticker*/
		clickBtn(homescreen.getWhatsAppstickerText());
		/*click on shareOnWhatsApp*/
		waitTillElementPresent(whatsAppStickers.getshareOnWhatsApp(),20);
		clickBtn(whatsAppStickers.getshareOnWhatsApp(),"ShareOnWhatsApp");
		/*wait till downloading is present*/
		waitTillElementPresent(whatsAppStickers.getDownloadingStickers(), 5);
		/*validation*/
		isElementExist(whatsAppStickers.getDownloadingStickers(), "Downloading");

	}

}
