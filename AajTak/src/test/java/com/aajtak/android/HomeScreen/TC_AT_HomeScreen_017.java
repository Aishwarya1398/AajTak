package com.aajtak.android.HomeScreen;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 8 June 2021
 * 
 * Description: Verify that once user swipes the home screen from top to bottom
 * on home screen, home screen gets refreshed
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_017 extends Aajtak_app_Util {
	@Test(priority = 17, description = "Description: Verify that once user swipes the home screen from top to bottom on home screen, home screen gets refreshed")
	public void AT_Home_017() throws InterruptedException {

		// Launch the app
		launchApp();

		// Complete Onboarding set up
		//compelteOnboarding();
		compelteOnboardingCopy();
		// wait till homescreen is loaded
		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		// scrollToElement(homescreen.getBadiKahbreinSection());
		// scrollToElement(homescreen.getOtherStoryTitle());
		verifyPullToRefreshText1();
	}
}