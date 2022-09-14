package com.aajtak.android.Photo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Photo_013 extends Aajtak_app_Util {

	/* Test case- 309 */

	@Test(description = "Verify for the slide show")
	public void AT_Photo_013() throws Exception {
		/* Launch The APP */
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
		clickBtn(photoDetail.getSlideShowIcon(), "Slide Show Icon");
		
		/* full slide show */
		waitTillElementPresent(photoDetail.getNextGalleryPlayButton(), 120);
		clickBtn(photoDetail.getCloseGallery(),"Close Gallery Button");
		

		/* Validate */
		isElementExist(photoList.getSubCategoriesOfPhotolistSection(), "Photo Section");
		
		/* Close The APP */
		aDriver.closeApp();

	}
}