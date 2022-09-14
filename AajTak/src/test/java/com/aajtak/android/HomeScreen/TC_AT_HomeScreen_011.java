package com.aajtak.android.HomeScreen;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 8 June 2021
 * 
 * Description: Verify that once the user taps on 'Cancel' from the sharing
 * options, user navigates to 'Home' screen
 * 
 * @author Archana George
 * @version 9.37(417)
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_011 extends Aajtak_app_Util {
	@Test(priority = 11, description = "Description: Verify that once the user taps on 'Cancel' from the sharing options, user navigates to 'Home' screen")
	public void AT_Home_011() throws InterruptedException {

		// Launch the app
		launchApp();

		// Complete Onboarding set up
		//compelteOnboarding();
		compelteOnboardingCopy();
		// wait till homescreen is loaded
		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		// Scroll to badi khabrien section
		scrollToElement(homescreen.getBadiKahbreinSection());

		// Scroll to any story in badi khabrein
		scrollToElement(homescreen.getOtherStoryTitle());

		// Click on share icon
		clickBtn(share.getShareIcon(), "Share icon");

		// Wait till share sheet is present
		waitTillElementPresent(share.getShareCancel(), 30);

		// Click on cancel button
		clickBtn(share.getShareCancel());

		// Validate that user navigates to 'Home' screen
		isElementExist(homescreen.getShareIcon(), "Share icon");
	}

}