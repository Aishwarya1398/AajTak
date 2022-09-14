package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//497
public class TC_AT_WhatsStick_016  extends Aajtak_app_Util{

	@Test(description="Verfify that user is navigated to Stickers listing when user taps on Anya stickers from the homescreen")
	public void AT_WhatsStick_016() throws InterruptedException 
	
	{
		launchApp();
		compelteOnboarding();
		/*Scroll to WhatsApp Stickers*/
		scrollToElement(homescreen.getWhatsAppstickerFrame());
		/*swipe through the sticker packets and click on anya Stickers*/
		for(int i=0;i<5;i++)
		{
			if(isElementDisplayed(homescreen.getWhatsAppOtherStickers()))
			{
				clickBtn(homescreen.getWhatsAppOtherStickers(),"Anya Stickers");
				break;
			}

			else {
				/*swipe right*/
				scroll(1024, 1214, 254,1161);
				continue;
			}
		}

		/*validation */
		isElementExist(whatsAppStickers.getstickerHeading(),"Features");

	}
}


