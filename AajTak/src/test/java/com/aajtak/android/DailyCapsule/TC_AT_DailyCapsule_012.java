package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 24 May 2021
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights.Verify that the user is able to
 * view the walkthrough screen while tapping on the news card
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_012 extends Aajtak_app_Util {

	@Test(priority = 12, description = "Description: Verify that the user is able to view the walkthrough screen while tapping on the news card.")
	public void AT_DailyCapsule_012() throws InterruptedException {

		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);

		// Tap on daily capsule banner
		clickBtn(homescreen.getDailycapBannerMessage());

		// Tap on daily highlights news title
		clickBtn(dailyHighlights.getNewswarptitle());

		// Validating if user is able to view the walkthrough screen when user taps on
		// story for the first time
		waitTillElementPresent(storyDetail.getTikeSamajAgaya(), 20);
		isElementExist(storyDetail.getTikeSamajAgaya());
	}
}