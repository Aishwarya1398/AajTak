package com.aajtak.android.WhatsappStickers;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

//502
public class TC_AT_WhatsStick_012  extends Aajtak_app_Util{

	@Test(description="Verify that Already added text is shown for the stickers that are added to the whatsapp")
	public void AT_WhatsStick_012() throws InterruptedException 
	{
		reOpenApp();
		/*Scroll to WhatsApp Stickers*/
		scrollToElement(homescreen.getWhatsAppstickerText());
		/* click on whatsApp sticker*/
		clickBtn(homescreen.getWhatsAppstickerText());
		/*validation*/
		isElementExist(whatsAppStickers.getAlreadyadded(),"Already Added");


	}

	}
