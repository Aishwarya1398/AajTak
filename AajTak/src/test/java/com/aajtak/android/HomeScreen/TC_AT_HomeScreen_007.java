package com.aajtak.android.HomeScreen;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 8 June 2021
 * 
 * Description: Verify that user is able to tap 'Bookmark' icon below any story
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_007 extends Aajtak_app_Util {

	@Test(priority = 7, description = "Description: Verify that user is able to tap 'Bookmark' icon below any story")
	public void AT_Home_007() throws InterruptedException {

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

		// Get the toast message
		String mesg = homescreen.getToastmsg().getText();

		// Validate the toast message
		verifyTwoText(mesg, "बुकमार्क किया गया :)");

	}
}