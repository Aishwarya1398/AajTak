package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 20 May 2021
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights. Verify that the user is able
 * to view the count of the card on the top right corner
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_008 extends Aajtak_app_Util {

	@Test(priority = 8, description = "Description: Verify that the user is able to view the count of the card on the top right corner")
	public void AT_DailyCapsule_008() throws InterruptedException {
		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);

		// Validate if user is able to count of the card on the top right corner
		clickBtn(homescreen.getDailycapBannerMessage());
		isElementExist(dailyHighlights.getDailyhighlights());
		isElementExist(dailyHighlights.getNewswarpCount());
	}
}
