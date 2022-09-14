package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//483
public class TC_AT_WhatsStick_001  extends Aajtak_app_Util{

	@Test(description="Verify that user is able to swipe through the sticker packets")
	public void AT_WhatsStick_001() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*Scroll to WhatsApp Stickers*/
		scrollToElement(homescreen.getWhatsappStickerHeader());
		
		/*validation:swipe through the sticker packets*/
		for(int i=0;i<3;i++)
		{
			isElementExist(homescreen.getWhatsAppstickerText());
			scroll(1024, 1214, 254,1161);
		}

	}


}
