package com.aajtak.android.Hamburger_OfflinePade;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_OfflinePade_005 extends Aajtak_app_Util{
	
	@Test(description = "Description: Verify that when user taps on back button control navigated to the 'Settings' screen", priority = 5)
	public void AT_OfflinePade_005() throws InterruptedException {
		//Launching the app
				launchApp();

				//Complete on baord set up
				compelteOnboarding();

				//Clicking on hambergur menu icon in homescreen
				clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");

				//Scrolling till settings element in hambergur menu
				scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());

				//Clicking settings in hambergur menu
				clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());

				//Verifying the offline pade option in settings screen or not
				isElementExist(settings.getOfflinePade());

				//Clicking on offline pade option
				clickBtn(settings.getOfflinePade());
				
				//Clicking on back arrow button
				clickBtn(offlinePade.getBackArrowButton(), "Back Arrow Button");
		isElementExist(settings.getSettingsPageTitle());
	}
}
