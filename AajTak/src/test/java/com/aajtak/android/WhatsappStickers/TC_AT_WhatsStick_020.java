package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//489
public class TC_AT_WhatsStick_020  extends Aajtak_app_Util{

	@Test(description="Verify that user is navigated to stickers detail screen when user taps on \"view all\" button")
	public void AT_WhatsStick_020() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*Scroll to WhatsApp Stickers*/
		scrollToElement(homescreen.getWhatsAppstickerFrame());
		/* swipe right till other stickers getting display*/
		for(int i=0;i<5;i++)
		{
			if(isElementDisplayed(homescreen.getWhatsAppOtherStickers()))
			{
				/* true*/
				clickBtn(homescreen.getWhatsAppOtherStickers(),"Anya Stickers");
				/*scroll to viewAll*/
				scrollToElement(whatsAppStickers.getViewAll());
				/*click on viewAll*/		
				clickBtn(whatsAppStickers.getViewAll(),"view All");
				break;
			}

			else {
				/*false:swipe right*/
				scroll(1024, 1214, 254,1161);
				continue;
			}
		}

		/*validation */
		isElementExist(whatsAppStickers.getstickerHeading());

	}

	}
