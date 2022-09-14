package com.aajtak.android.Photo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Photo_002 extends Aajtak_app_Util {
	
	                /* Test case- 295 */

	@Test(description = "Verify the user is able to navigate to photo list screen from the Hamburger menu")
	public void AT_Photo_002() throws Exception {
		/* Launch The APP */
		
		 launchApp();
		Aajtak_app_Util.compelteOnboarding();
		//reOpenApp();
		
		/* wait for HomeScreen to load & Tap on Hamburger */
		waitTillElementPresent(homescreen.getHamburgerIcon(), 10);
		isElementExist(homescreen.getHamburgerIcon(), "Hambergur Menu");
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");
		
		/* get PhotoList text and then Tap on it */
		String hamburgerSection = photoList.getPhotoListFromHambergurMenu().getText();
		clickBtn(photoList.getPhotoListFromHambergurMenu(), "Photolist section");
		
		/* Is Element photo section, Photo count, photo gallery exist */
		String horizontalSection = photoList.getPhotoSectionFromHorizontalMenu().getText();
		isElementExist(photoList.getPhotoSectionFromHorizontalMenu());
		isElementExist(photoList.getphotoCount(),"Photo count");
		isElementExist(photoDetail.getPhotoGalleryScreen(), "Photo Gallery Screen");
		
		/* Validate */
		verifyTwoText(hamburgerSection , horizontalSection);
		
		/* Close The App */
		aDriver.closeApp();
	
	}

}

