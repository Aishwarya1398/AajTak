package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//496
public class TC_AT_WhatsStick_015  extends Aajtak_app_Util{

	@Test(description="Verify that user is navigated to the sticker detail screen when user taps on a whatsapp sticker packets under \"Anya stickers\"")
	public void AT_WhatsStick_015
	() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*Scroll to WhatsApp Stickers*/
		scrollToElement(homescreen.getWhatsAppstickerText());
		/*click on whatsApp Sticker packet*/
		clickBtn(homescreen.getWhatsAppstickerText());
		/*scroll to anya sticker*/
		scrollToElement(whatsAppStickers.getAnyaSticker());
		/*click on to WhatsApp Stickers*/
		clickBtn(whatsAppStickers.getWhatsAppStickPacket());
		/*validation :WhatsApp Stickers heading*/
		isElementExist(whatsAppStickers.getstickerHeading(),"Sticker Heading");


	}

	}
