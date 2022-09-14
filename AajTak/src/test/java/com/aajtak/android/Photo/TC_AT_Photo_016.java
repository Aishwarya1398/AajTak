package com.aajtak.android.Photo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Photo_016 extends Aajtak_app_Util {

	/* Test case- 311 */

	@Test(description = "Verify that the date displayed If the photo gallery is published before 24 hours")
	public void AT_Photo_016() throws Exception {
		/* Lunch The APP */
		 launchApp();
		Aajtak_app_Util.compelteOnboarding();
		// reOpenApp();

		/* wait for home screen to load & tap on photo section */
		waituntilnewElementtobeClickable(photoList.getPhotoSectionFromHorizontalMenu(), 10);
		clickBtn(photoList.getPhotoSectionFromHorizontalMenu());


		/* Validate */
		boolean check= isElementExist(photoList.getPhotoGalleryDate(),"Photo Gallery Published Date");
		Assert.assertEquals(true, check);
		
		/* Close App */
		aDriver.closeApp();

	}
}