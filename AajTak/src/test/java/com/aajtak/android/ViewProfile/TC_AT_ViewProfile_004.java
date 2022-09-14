package com.aajtak.android.ViewProfile;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 18 June 2021
 * 
 * Description: Verify that the user is able to navigate to the bookmarked
 * contents page
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_ViewProfile_004 extends Aajtak_app_Util {

	@Test(description = "Description: Verify that the user is able to navigate to the bookmarked contents page")
	public void AT_ViewProfile_004() throws InterruptedException {
		// Launch App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Login via email
		loginViaEmail();

		waitTillElementPresent(hamburgerMenu.getHamburgerIcon(), 20);
		// Tap on Hamburger menu
		clickBtn(hamburgerMenu.getHamburgerIcon());

		// Tap on view profile link
		clickBtn(viewProfile.getViewProfile());

		// Tap on My bookmarks
		clickBtn(viewProfile.getMyBookmarkContentIcon(),"मेरे बुकमार्क ");

		// Validate the title of the bookmarks screen
		verifyTwoText(bookmarkContent.getBookmarkPageTitle().getText(), "बुकमार्क कंटेंट");

		// Validate the content of the bookmark screen
		isElementExist(bookmarkContent.getStorySection());
		isElementExist(bookmarkContent.getTasvireSection());
		isElementExist(bookmarkContent.getVideoSection());
	}
}
