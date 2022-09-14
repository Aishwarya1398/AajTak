	package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//486
public class TC_AT_WhatsStick_004  extends Aajtak_app_Util{

	@Test(description="Verify that user is navigated to the particular whatsapp sticker screen when user taps on the sticker thumbnail")
	public void AT_WhatsStick_004() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*Scroll to WhatsApp Stickers*/	
		scrollToElement(homescreen.getWhatsAppstickerText());
		/*
		 * scrollToElement(homescreen.getWhatsAppstickerFrame());
		 * scrollToElementWithWait(homescreen.getWhatsappStickerHeader());
		 */		/* Select packet name*/
		String actual = homescreen.getWhatsAppstickerText().getText();
		/* click on packet Image*/
		clickBtn(homescreen.getWhatsAppstickerImage());
		/*validation:select particular packet name and verify actual and expected*/
		String expected =whatsAppStickers.getstickerHeading().getText();
		verifyTwoText(actual, expected);
		
	}

}
