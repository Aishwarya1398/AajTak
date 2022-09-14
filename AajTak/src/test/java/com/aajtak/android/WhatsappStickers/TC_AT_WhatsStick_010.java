package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//493
public class TC_AT_WhatsStick_010  extends Aajtak_app_Util{

	@Test(description="Verify by tapping on cancel button")
	public void AT_WhatsStick_010() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*Scroll to WhatsApp Stickers*/
		scrollToElement(homescreen.getWhatsAppstickerText());
		/* click on whatsApp sticker*/
		clickBtn(homescreen.getWhatsAppstickerText());
		/* wait till shareOnwhatsApp is present*/
		waitTillElementPresent(whatsAppStickers.getshareOnWhatsApp(),10);
		/* click on shareOnwhatsApp*/
		clickBtn(whatsAppStickers.getshareOnWhatsApp(),"ShareOnWhatsApp");
		/* wait till downloading sticker is present*/
		waitTillElementPresent(whatsAppStickers.getDownloadingStickers(), 5);
		/* wait till downloading sticker is disappear*/
		waitTillElementDisapper(whatsAppStickers.getDownloadingStickers());
		/* wait till popup menu is present*/
		waitTillElementPresent(whatsAppStickers.getStickerPopUpMessage(),5);
		/* validation:Click on cancel*/
		clickBtn(whatsAppStickers.getCancel(),"cancel");
	}

}
