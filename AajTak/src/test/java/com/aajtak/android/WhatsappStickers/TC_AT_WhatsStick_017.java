package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//487
public class TC_AT_WhatsStick_017  extends Aajtak_app_Util{

	@Test(description="Verify that user is able to view the thumbnail for the featured stickers")
	public void AT_WhatsStick_017() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/* scroll to whatsapp sticker*/
		scrollToElement(homescreen.getWhatsAppstickerText());
		/*validation:thumbnail for the featured stickers*/
		isElementExist(homescreen.getWhatsAppstickerText());
		isElementExist(homescreen.getWhatsAppstickerImage(),"thumbnail");
		

	}

	}
