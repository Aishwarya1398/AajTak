package com.aajtak.android.Photo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Photo_004 extends Aajtak_app_Util {
	
	                /* Test case- 308 */

	@Test(description = "Verify the user is able to share the photos on the screen")
	public void AT_Photo_004() throws Exception {
		
		/* Launch The APP */
		 launchApp();
		Aajtak_app_Util.compelteOnboarding();
		//reOpenApp();
		
		/* wait for home screen to load & tap on photo section */
		waituntilnewElementtobeClickable(photoList.getPhotoSectionFromHorizontalMenu(), 10);
		clickBtn(photoList.getPhotoSectionFromHorizontalMenu());
		
		/* wait for Photo Section to Load & Tap on Share Icon */
		waitTillElementPresent(photoList.getDownloadIcon(), 15);
		clickBtn(photoList.getShareIcon(), "Share icon");
		
		/* Validate if FAcebook,twitter,whatsapp present on clicking Share Icon */
		isElementExist(share.getFaceBookShare(), "Facebook");
		isElementExist(share.getTwitterShare(), "Twitter");
		isElementExist(share.getWhatsAppShare(), "Whatsapp");
		
		/* close the app */
		aDriver.closeApp();
		          
	}

}