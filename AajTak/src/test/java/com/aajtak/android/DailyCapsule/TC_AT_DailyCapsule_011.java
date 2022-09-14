package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 27 May 2021
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights. Verify that the the share
 * sheet closes when user taps on cancel button
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_011 extends Aajtak_app_Util {

	@Test(priority = 11, description = "Description: Verify that the the share sheet closes when user taps on cancel button")
	public void AT_DailyCapsule_011() throws InterruptedException {

		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);

		// Click on daily capsule banner
		clickBtn(homescreen.getDailycapBannerMessage());

		// Validate if share icon is present
		isElementExist(homescreen.getShareIcon(), "Share icon");

		// Click on share icon
		clickBtn(homescreen.getShareIcon(), "Share icon");

		// Wait till share options are present
		waitTillElementPresent(share.getShareCancel(), 15);

		// Click on cancel share
		clickBtn(share.getShareCancel());

		// Validate if share sheet is closed and user is in Daily highlights screen
		isElementExist(dailyHighlights.getNewswarptitle());
	}

}