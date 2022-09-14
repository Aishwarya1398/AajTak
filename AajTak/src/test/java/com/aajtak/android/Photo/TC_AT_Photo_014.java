package com.aajtak.android.Photo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Photo_014 extends Aajtak_app_Util {

	/* Test case- 306 */

	@Test(description = "Verify for the pause button")
	public void AT_Photo_014() throws Exception {
		
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

		/* SlideShow through Photo Gallery */
		clickBtn(photoDetail.getSlideShowIcon(), "Play Slide Show");
		clickBtn(photoDetail.getSlideShowIcon(), "Pause Slide Show");

		/* Validate */
		boolean check = isElementExist(photoDetail.getSlideShowIcon(), "Pause Slide Show");
		Assert.assertEquals(true, check);

		/* close the App */
		aDriver.closeApp();

	}
}