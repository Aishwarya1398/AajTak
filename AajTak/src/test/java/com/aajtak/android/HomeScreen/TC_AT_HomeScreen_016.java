package com.aajtak.android.HomeScreen;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 8 June 2021
 * 
 * Description: Verify that user is able to tap on already added 'Offline Story'
 * icon and view message stating the content is already been added
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_016 extends Aajtak_app_Util {

	@Test(priority = 16, description = "Description: Verify that user is able to tap on already added 'Offline Story' icon and view message stating the content is already been added")
	public void AT_Home_016() throws InterruptedException {

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
		scrollToElement(homescreen.getOfflineIcon());
		clickBtn(homescreen.getOfflineIcon(), "Save icon");

		// Click on save icon
		clickBtn(homescreen.getOfflineIcon(), "Save icon");
	}
}