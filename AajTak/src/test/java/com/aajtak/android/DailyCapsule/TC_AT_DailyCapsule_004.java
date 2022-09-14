package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 20 May 2021
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights.Verify that the user can Tap on
 * drop-down in widget
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_004 extends Aajtak_app_Util {

	@Test(priority = 4, description = "Description: Verify that the user can Tap on drop-down in widget")
	public void AT_DailyCapsule_004() throws InterruptedException {
		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);

		// Tap on drop down arrow in daily capsule
		clickBtn(homescreen.getBannerDownArrow(), "Daily Capsule Drop Down Button");

		// Verify is user is able to view widget settings options
		isElementExist(homescreen.getDownArrowSheet(), "Daily Capsule widget Settings");
	}
}