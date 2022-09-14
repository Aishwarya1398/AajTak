package com.aajtak.android.Hamburger_SevaKiSharthe;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 14 June 2021
 * 
 * Description: Verify that user is navigated to 'Settings' screen by tapping on
 * back button from 'Seva Ki Sarthae' screen
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_SevaKiSharthein_002 extends Aajtak_app_Util {

	@Test(priority = 2, description = "Verify that user is navigated to 'Settings' screen by tapping on back button from 'Seva Ki Sarthae' screen")
	public void AT_SeKiSa_002() throws InterruptedException {
		// Launch app
		launchApp();

		// Complete Onboarding
		compelteOnboarding();

		// Tap on Hamburger Menu
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");

		// Scroll to Settings
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());

		// Tap on settings
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());

		// Scroll to terms and conditions
		scrollToElement(settings.getSevaKiSharte());

		// Tap on terms and conditions
		clickBtn(settings.getSevaKiSharte());

		// Tap on back arrow in the tool bar
		clickBtn(termsAndConditions.getBackArrowButton());

		// Validate that user navigates back to settings screen
		isElementExist(settings.getSettingsPageTitle());
	}
}