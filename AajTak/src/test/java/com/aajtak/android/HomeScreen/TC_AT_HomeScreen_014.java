package com.aajtak.android.HomeScreen;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 8 June 2021
 * 
 * Description: Verify that user is able to view the bookmarked story is
 * available in 'Bookmark'tab
 * 
 * @author Archana George
 * @version 9.37(417)
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_014 extends Aajtak_app_Util {

	@Test(priority = 14, description = "Description: Verify that user is able to view the bookmarked story is available in 'Bookmark'tab")
	public void AT_Home_014() throws InterruptedException {

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

		// Click on bookmark icon
		clickBtn(homescreen.getBookmarkIcon(), "Bookmark Icon");

		// Tap on hamburger Menu
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Menu");

		// Tap on Bookmarkcontent
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmarks");

		// Validate that the bookmarked story is present
		isElementExist(bookmarkContent.getVerifyStoryTitle());
	}
}