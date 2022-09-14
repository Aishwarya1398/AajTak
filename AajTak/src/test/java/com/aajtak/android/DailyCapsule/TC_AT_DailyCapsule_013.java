package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 24 May 2021
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights. Verify that user is navigated
 * to News Detail screen when user taps on "Teak hae Samaj Aagaya"
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_013 extends Aajtak_app_Util {

	@Test(priority = 13, description = "Description: Verify that user is navigated to News Detail screen when user taps on Teak hae Samaj Aagaya")
	public void AT_DailyCapsule_013() throws InterruptedException {
		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);

		// Click on daily capsule banner
		clickBtn(homescreen.getDailycapBannerMessage());

		// Wait till the newsrap card loads
		waitTillElementPresent(dailyHighlights.getNewswarptitle(), 20);

		// Tap on newswrap title
		clickBtn(dailyHighlights.getNewswarptitle());

		// Tap on Okay button in walkthrough screen
		clickBtn(storyDetail.getTikeSamajAgaya());

		// Wait till the story screen is loaded
		waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 120);

		// Validate that user is navigated to News Detail screen when user taps on Teak
		// hae Samaj Aagaya
		isElementExist(storyDetail.getTitleOfAnyStory());
	}
}