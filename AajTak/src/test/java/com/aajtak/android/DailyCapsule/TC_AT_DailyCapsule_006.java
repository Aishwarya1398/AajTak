package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 20 May 2021
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights. Verify that when user selects
 * always show this for Daily Capsule widget is always shown
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_006 extends Aajtak_app_Util {
	@Test(priority = 6, description = "Description: Verify that when user selects always show this for Daily Capsule widget is always shown")
	public void AT_DailyCapsule_006() throws InterruptedException {
		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);

		// Tap on dop down arrow
		clickBtn(homescreen.getBannerDownArrow(), "Daily Capsule Drop Down Button");

		// Click on always show
		clickBtn(homescreen.getAlwaysShow());

		// Validation if the banner is always shown if user selects always show option
		isElementExist(homescreen.getDailycapBannerMessage());
	}
}