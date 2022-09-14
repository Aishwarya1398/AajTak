package com.aajtak.android.Photo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Photo_007 extends Aajtak_app_Util {
	
	                /* Test case- 302 */

	@Test(description = "Verify that the user is able to see all sub-categories")
	public void AT_Photo_007() throws Exception {
		/* Launch The APP */
		 launchApp();
		Aajtak_app_Util.compelteOnboarding();
		//reOpenApp();
		
		/* wait for home screen to load & tap on photo section */
		waituntilnewElementtobeClickable(photoList.getPhotoSectionFromHorizontalMenu(), 10);
		clickBtn(photoList.getPhotoSectionFromHorizontalMenu());
		
		/* Validation */
		 isElementExist(photoList.getSubCategoriesOfPhotolistSection());
		 isElementExist(photoList.getFirstSubCategory());
		 isElementExist(photoList.getSecondSubCategory());
		 isElementExist(photoList.getThirdSubCategory());
		 isElementExist(photoList.getFourthSubCategory());
		 isElementExist(photoList.getFifthSubCategory());
		
			/* Close The App */
		 aDriver.closeApp();
	}

}