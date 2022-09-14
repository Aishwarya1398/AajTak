package com.aajtak.android.Photo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Photo_005 extends Aajtak_app_Util {

	/* Test case- 297 */

	@Test(description = "Verify the user is able to bookmark the photos on the screen")
	public void AT_Photo_005() throws Exception {
		/* Launch The APP */
		 launchApp();
		Aajtak_app_Util.compelteOnboarding();
		// reOpenApp();

		/* wait for home screen to load & tap on photo section */
		waituntilnewElementtobeClickable(photoList.getPhotoSectionFromHorizontalMenu(), 10);
		clickBtn(photoList.getPhotoSectionFromHorizontalMenu());

		/* wait for Photo Section to Load & Tap on BookMark Icon */
		waitTillElementPresent(photoList.getDownloadIcon(), 15);
		clickBtn(photoList.getBookmarkIcon(), "Bookmark icon");

		/* Capture Toast Message */
		String mesg = newsList.getToastMsg().getText();

		/* Validate */
		verifyTwoText(mesg, "बुकमार्क किया गया :)");

		/* Close The App */
		aDriver.closeApp();

		

	}

}