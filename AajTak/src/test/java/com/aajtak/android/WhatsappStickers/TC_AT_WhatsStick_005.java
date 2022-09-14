package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//490
public class TC_AT_WhatsStick_005  extends Aajtak_app_Util{

	@Test(description="Verify that the particular featured stickers are displayed in the sticker detail screen")
	public void AT_WhatsStick_005() throws InterruptedException 
	{
		launchApp();
		compelteOnboarding();
		/*Scroll to WhatsApp Stickers*/
		/*Scroll to WhatsApp Stickers*/	
		scrollToElement(homescreen.getWhatsAppstickerText());
		/* Select packet name*/
		String actual = homescreen.getWhatsAppstickerText().getText();
		/* click on packet text*/
		clickBtn(homescreen.getWhatsAppstickerText());
		/*validation:select particular packet name and verify actual and expected*/
		String expected =whatsAppStickers.getstickerHeading().getText();
		verifyTwoText(actual, expected);
		}

}
