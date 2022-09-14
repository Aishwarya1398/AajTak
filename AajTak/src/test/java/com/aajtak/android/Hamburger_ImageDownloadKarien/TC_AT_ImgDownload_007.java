package com.aajtak.android.Hamburger_ImageDownloadKarien;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Hamburger_ImageDownloadKarien Module From AajTak Application
 * Description :  Verify that when user taps on back button control navigated to the 'Settings' screen
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_ImgDownload_007 extends Aajtak_app_Util {
	
	@Test(description = "Verify that when user taps on back button control navigated to the 'Settings' screen",priority = 3)
	public void AT_ImgDwnload_007() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//It will scroll till to settings option.
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Click on settings option
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Click on Image Download Karen option
		clickBtn(settings.getImageDownloadKaren());
		
		//Click on Back arrow to navigate back
		clickBtn(imageDownloadKaren.getBackArrowButton(), "Back Arrow Button");
		
		//It will verify that settings page title is present or not
		isElementExist(settings.getSettingsPageTitle());
	
	}


}
