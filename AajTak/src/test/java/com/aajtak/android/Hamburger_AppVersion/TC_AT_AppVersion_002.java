package com.aajtak.android.Hamburger_AppVersion;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 11 June 2021
 * 
 * Description:Verify that user is able to go back to 'Home' screen by tapping
 * on back button from the Settings screen where App version is present
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_AppVersion_002 extends Aajtak_app_Util {

	@Test(description = "Verify that user is able to go back to 'Home' screen by tapping on back button", priority = 2)
	public void AT_AppVersion_002() throws InterruptedException {

		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Tap on Hamburger Menu
		clickBtn(hamburgerMenu.getHamburgerIcon(), "Hamburger Menu");

		// Scroll to Anya Category in Hamburger Menu
		scrollToElement(hamburgerMenu.getAnyaCategory());

		// Validate if anya categoty is present
		isElementExist(hamburgerMenu.getAnyaCategory());

		// Scroll to settings in Anya Category
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());

		// Click on Settings
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());

		// Scroll to App version
		scrollToElement(settings.getAppVersion());

		// Validate the App version is present
		isElementExist(settings.getAppVersion());

		// Tap on the back arrow at the toolbar
		clickBtn(settings.getBackArrowButton(), "Back Arrow");

		// Validate if user is navigated to the Hamburger Menu
		isElementExist(hamburgerMenu.getLoginOrRegister());

		// Validate the close icon is present
		isElementExist(hamburgerMenu.getCloseHamburgerMenu(), "Close Button");

		// Tap on close button in the Hamburger Menu
		clickBtn(hamburgerMenu.getCloseHamburgerMenu(), "Close Button");

		// Validate if user is in Homescreen
		isElementExist(hamburgerMenu.getHamburgerIcon(), "Hamburger Icon");
	}
}
