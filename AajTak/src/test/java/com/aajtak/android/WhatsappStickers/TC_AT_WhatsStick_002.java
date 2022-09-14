package com.aajtak.android.WhatsappStickers;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//484
public class TC_AT_WhatsStick_002  extends Aajtak_app_Util{

	@Test(description="Verify that the number of  sticker packets is equal to the number of dots in the carousel")
	public void AT_WhatsStick_002() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*Scroll to WhatsApp Stickers*/
		scrollToElement(homescreen.getWhatsAppstickerText());
		/* Count  sticker packets and  increment the imageCount number */
		int imagecount=1;
		for(int i=0;i<3;i++)
		{
			if(isElementDisplayed(homescreen.getWhatsAppOtherStickers()))
			{
				break;
			}
			else {
				isElementExist(homescreen.getWhatsAppstickerText());
				scroll(1024, 1214, 254,1161);
				imagecount++;
				continue;
			}
		}
		/* imageCount number */
		int dotCount = homescreen.getDot().size();
		dotCount++;
		/* validation */
		assertEquals(imagecount, dotCount);
	}
}
