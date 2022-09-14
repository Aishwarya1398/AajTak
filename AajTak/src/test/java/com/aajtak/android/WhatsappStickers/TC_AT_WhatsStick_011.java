package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidElement;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//501
public class TC_AT_WhatsStick_011  extends Aajtak_app_Util{

	@Test(description="Verify that the \"Stickers are added\" successfully message appears when user taps on add button")
	public void AT_WhatsStick_011() throws InterruptedException 
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
		/*click on add */
		clickBtn(whatsAppStickers.getAdd(),"add");
		String msg = homescreen.getToastmsg().getText();
		System.out.println(msg);
	}
}
