package com.aajtak.android.HomeScreen;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 8 June 2021
 * 
 * Description: This is Homescreen module of AajTak Application. VVerify that user is able to view the offlined story is available in 'Downloaded Content' tab.
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_015 extends Aajtak_app_Util {
	@Test(priority = 15, description = "Description: Verify that user is able to view the offlined story is available in 'Downloaded Content' tab")
	public void AT_Home_015() throws InterruptedException {

		// Launch the app
		launchApp();

		// Complete Onboarding set up
		//compelteOnboarding();
		compelteOnboardingCopy();
		// wait till homescreen is loaded
		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		// Scroll to Badi Khabrein section
		scrollToElement(homescreen.getBadiKahbreinSection());

		// Scroll to a story in top stories
		scrollToElement(homescreen.getOtherStoryTitle());

		// Click on save icon
		clickBtn(homescreen.getOfflineIcon(), "Save icon");

		// Tap on hamburger Menu
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Menu");

		// Tap on downloaded content
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");

		// Validate that the downloaded story is present
		isElementExist(downloadedContent.getVerifyStoryTitle());
	}
}