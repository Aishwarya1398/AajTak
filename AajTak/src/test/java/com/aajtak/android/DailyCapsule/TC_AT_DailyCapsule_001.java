package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 20 May 2021
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights. Verify the user is able to
 * view “Missed the daily capsule. Tap to see it again.” message in the daily
 * capsule banner.
 *
 * @author Archana George
 * @version 9.37(417)
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_001 extends Aajtak_app_Util {

	@Test(priority = 1, description = "Description: Verify the user is able to view “Missed the daily capsule. Tap to see it again.” message")
	public void AT_DailyCapsule_001() throws InterruptedException {
		// launch the app
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Validate if user is able to view the daily capsule message
		isElementExist(homescreen.getDailycapBannerMessage());
	}
}