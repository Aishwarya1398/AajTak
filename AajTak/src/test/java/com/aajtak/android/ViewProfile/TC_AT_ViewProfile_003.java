package com.aajtak.android.ViewProfile;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 18 June 2021 
 * 
 * Description: Verify that the user is able to navigate to Saved Content
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_ViewProfile_003 extends Aajtak_app_Util {
	@Test(description = "Description: Verify that the user is able to navigate to Saved Content")
	public void AT_ViewProfile_003() throws InterruptedException {
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

		// Tap on downloaded content icon
		clickBtn(viewProfile.getMyDownloadContentIcon(),"मेरे डाउनलोडेड कंटेंट ");

		// Verify that user is in downloaded content page
		verifyTwoText(downloadedContent.getDownloadPageTitle().getText(), "डाउनलोडेड कंटेंट");

		// Validate that the downloaded page is present and the sections such as story,
		// photo, video is present
		isElementExist(downloadedContent.getStorySection());
		isElementExist(downloadedContent.getTasvireSection());
		isElementExist(downloadedContent.getVideoSection());
	}
}
