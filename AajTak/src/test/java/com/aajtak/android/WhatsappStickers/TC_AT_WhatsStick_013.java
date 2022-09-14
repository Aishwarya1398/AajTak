package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//494
public class TC_AT_WhatsStick_013  extends Aajtak_app_Util{

	@Test(description="Verify that an ad is displayed after the featured stickers")
	public void AT_WhatsStick_013() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*Scroll to WhatsApp Stickers*/
		scrollToElement(homescreen.getWhatsAppstickerText());
		/* tap on sticker packet*/
		clickBtn(homescreen.getWhatsAppstickerText());
		/*scroll to ads*/
		scrollToElement(whatsAppStickers.getAds());
		/*Validation:ads is displayed*/
		isElementExist(whatsAppStickers.getAds(),"ads");

	}

	}
