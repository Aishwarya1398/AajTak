package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//500
public class TC_AT_WhatsStick_009  extends Aajtak_app_Util{

	@Test(description="Verify that user is able to view a popup message \"Would you like to ads the stickers to whatsapp?\" when user taps on share on whatsapp")
	public void AT_WhatsStick_009() throws InterruptedException 
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
		/* validation:popup menu is present*/
		isElementExist(whatsAppStickers.getStickerPopUpMessage(),"\"Would you like to ads the stickers to whatsapp?");
	}

}
