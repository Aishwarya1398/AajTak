package com.aajtak.android.Photo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Photo_019 extends Aajtak_app_Util {
	
	                /* Test case- 312 */

	@Test(description = "Verify that the user is able to zoom in and out the photo.")
	public void AT_Photo_019() throws Exception {
		/* Launch The APP */
		 launchApp();
		Aajtak_app_Util.compelteOnboarding();
		//reOpenApp();
		
		/* wait for home screen to load & tap on photo section */
		waituntilnewElementtobeClickable(photoList.getPhotoSectionFromHorizontalMenu(), 10);
		clickBtn(photoList.getPhotoSectionFromHorizontalMenu());
		
		/* Tap on Photo Gallery */ 
		clickBtn(photoDetail.getPhotoGalleryScreen());
		clickBtn(photoDetail.getTikeSamajAgaya());
		
		/* Validate */
		isElementExist(photoDetail.getphotoTitle());
		isElementExist(photoDetail.getphotoDescription());
		
		/* Close The APP */
		aDriver.closeApp();
		
	
		 		// completed
					
	}

}