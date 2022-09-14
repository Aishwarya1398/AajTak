package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//485
public class TC_AT_WhatsStick_003  extends Aajtak_app_Util{

	@Test(description="Verify that the \"Aur stickers\" is displayed as the last sticker packet in the carousel")
	public void AT_WhatsStick_003() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*Scroll to WhatsApp Stickers*/
		scrollToElement(homescreen.getWhatsappStickerHeader());
		/*validation:"Aur stickers" is displayed as the last*/
		for(int i=0;i<3;i++)
		{
			if(isElementDisplayed(homescreen.getWhatsAppOtherStickers()))
			{
				/*if Aur stickers is present print text and exit*/
				isElementExist(homescreen.getWhatsAppOtherStickers());
				break;
			}
			else {
				/*else Aur stickers is not present then swipe right*/
				isElementExist(homescreen.getWhatsAppstickerText());
				scroll(1024, 1214, 254,1161);
				continue;
			}
		}

}

}
