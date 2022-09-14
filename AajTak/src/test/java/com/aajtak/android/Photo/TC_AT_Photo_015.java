package com.aajtak.android.Photo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Photo_015 extends Aajtak_app_Util {

	/* Test case- 310 */

	@Test(description = "Verify that the next gallery loads after the end of first gallery")
	public void AT_Photo_015() throws Exception {
		/* Launch The APP */
		 launchApp();
		Aajtak_app_Util.compelteOnboarding();
		// reOpenApp();

		/* wait for home screen to load & tap on photo section */
		waituntilnewElementtobeClickable(photoList.getPhotoSectionFromHorizontalMenu(), 10);
		clickBtn(photoList.getPhotoSectionFromHorizontalMenu());

		/* Tap on Photo Gallery */
		clickBtn(photoList.getVerifyPhotoTitle());
		clickBtn(photoDetail.getTikeSamajAgaya());

		/* SlideShow through Photo Gallery */
		clickBtn(photoDetail.getSlideShowIcon(), "Slide Show Icon(Play) ");
		
		/* full slide show */
		waitTillElementPresent(photoDetail.getNextGalleryPlayButton(), 120);
		

		/* Validate */
		boolean check= isElementExist(photoDetail.getNextGalleryPlayButton(),"Next Gallery Tab");
		Assert.assertEquals(true, check);
		
		/* Close App */
		aDriver.closeApp();

	}
}