package com.aajtak.android.Photo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Photo_011 extends Aajtak_app_Util {

	/* Test case- 304 */

	@Test(description = "Verify that the description of photo change when the user swipes through the photo")
	public void AT_Photo_011() throws Exception {
		/* Lunch The APP */
		 launchApp();
		Aajtak_app_Util.compelteOnboarding();
		// reOpenApp();

		/* wait for home screen to load & tap on photo section */
		waituntilnewElementtobeClickable(photoList.getPhotoSectionFromHorizontalMenu(), 10);
		clickBtn(photoList.getPhotoSectionFromHorizontalMenu());

		/* Tap on Photo Gallery */
		clickBtn(photoDetail.getPhotoGalleryScreen());
		clickBtn(photoDetail.getTikeSamajAgaya());
		String description = photoDetail.getphotoDescription().getText();

		/* swipe through Photo Gallery */
		swipeRight();
		swipeRight();
		String description1 = photoDetail.getphotoDescription().getText();

		/* Validate */
		Assert.assertNotEquals(description, description1);
		
		/* Close The APP */
		aDriver.closeApp();

	}
}
