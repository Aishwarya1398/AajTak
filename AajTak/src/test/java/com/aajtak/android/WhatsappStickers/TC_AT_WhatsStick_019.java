package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//488
public class TC_AT_WhatsStick_019  extends Aajtak_app_Util{

	@Test(description="Verify that user is able to view the \" View all\" button under each sticker category")
	public void AT_WhatsStick_019() throws InterruptedException 
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
				break;
			}

			else {
				/*false:swipe right*/
				scroll(1024, 1214, 254,1161);
				continue;
			}
		}

		/*validation:able to view "View All Button" */
		isElementExist(whatsAppStickers.getViewAll());

	}
}
