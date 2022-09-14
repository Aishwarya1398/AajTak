package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//498
public class TC_AT_WhatsStick_018  extends Aajtak_app_Util{

	@Test(description="Verify that user is navigated to the particular whatsapp sticker detail screen when user taps on the sticker thumbnail")
	public void AT_WhatsStick_018() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*Scroll to WhatsApp Stickers*/
		scrollToElement(homescreen.getWhatsAppstickerFrame());
		/*scroll sticker packet and click on sticker*/
		for(int i=0;i<1;i++)
		{
			scroll(1024, 1214, 254,1161);
			clickBtn(homescreen.getWhatsAppstickerText());
		}
		/*validation:particular sticker heading get displayed*/
		isElementExist(whatsAppStickers.getstickerHeading());
	}

	}
