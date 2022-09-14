package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 24 May 2021
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights.Verify that user is able to
 * swipe through newspresso card by swiping up
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_019 extends Aajtak_app_Util {

	@Test(priority = 19, description = "Description: Verify that user is able to swipe through newspresso card by swiping up ")
	public void AT_DailyCapsule_019() throws InterruptedException {

		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);

		// Click on daily capsule banner
		clickBtn(homescreen.getDailycapBannerMessage(), "Daily Capsule Banner");

		// Get count of the first card
		String firstcard = dailyHighlights.getNewswarpCount().getText();

		// Scroll Up
		scrollUp();
		minWait();

		// Get count of the next card
		String secondcard = dailyHighlights.getNewswarpCount().getText();

		// Verify that user is navigated to the next card by swiping up
		verifyTwodifferentString(firstcard, secondcard);
	}
}