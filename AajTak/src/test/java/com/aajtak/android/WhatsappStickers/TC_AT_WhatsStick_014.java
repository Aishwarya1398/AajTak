package com.aajtak.android.WhatsappStickers;

import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidElement;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//495
public class TC_AT_WhatsStick_014  extends Aajtak_app_Util{

	@Test(description="Verify that the other featured stickers are displayed after the ad under Anya stickers")
	public void AT_WhatsStick_014() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*Scroll to WhatsApp Stickers*/
		scrollToElement(homescreen.getWhatsAppstickerText());
		/*click on whatsApp sticker*/
		clickBtn(homescreen.getWhatsAppstickerText());
		/*Scroll to anya Stickers*/
		scrollToElement(whatsAppStickers.getWhatsAppStickPacket());
		scrollUp();
		/*Verify that the other featured stickers are displayed*/
		List<AndroidElement> featuredSticker = whatsAppStickers.getWhatsAppStickAllPackets();
		for(AndroidElement fstickers:featuredSticker)
			{
		
			isElementExist(fstickers);
		}

	}

	}
