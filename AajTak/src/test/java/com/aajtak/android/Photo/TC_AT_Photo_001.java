package com.aajtak.android.Photo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Photo_001 extends Aajtak_app_Util {

	/* Test case- 294 */

	@Test(description = "Verify the user is able to navigate to photo list screen from the Horizontal tab")
	public void AT_Photo_001() throws Exception {

		/* Launch the App */
		 launchApp();
		Aajtak_app_Util.compelteOnboarding();

		/* Is Photo Section dispalyed & Tap on it */
		Boolean check1 = isElementExist(photoList.getPhotoSectionFromHorizontalMenu());
		clickBtn(photoList.getPhotoSectionFromHorizontalMenu());

		/* Is Photo Page dispalyed,photo count & photo gallery screen */
		Boolean check = isElementDisplayed(photoList.getPhotoSectionFromHorizontalMenu());
		isElementExist(photoList.getphotoCount(),"Photo count");
		isElementExist(photoDetail.getPhotoGalleryScreen(), "Photo Gallery Screen");
		
		/* validate */
		Assert.assertEquals(check1, check);
		
		/* Close The App */
		aDriver.closeApp();
		
		
	}

}

