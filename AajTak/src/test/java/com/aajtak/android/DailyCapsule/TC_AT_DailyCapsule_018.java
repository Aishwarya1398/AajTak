package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 24 May 2021
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights.Verify that user is able to
 * swipe through newspress card by tapping on the arrow
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_018 extends Aajtak_app_Util {
	@Test(priority = 18, description = "Description: Verify that user is able to swipe through newspresso card by tapping on the arrow")
	public void AT_DailyCapsule_018() throws InterruptedException {

		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);

		// Click on dialy capsule banner
		clickBtn(homescreen.getDailycapBannerMessage(), "Daily Capsule Banner");

		// Wait till the Daily highlights card is loaded
		waitTillElementPresent(dailyHighlights.getNewswarpCount(), 20);

		// Get the count of the card
		String firstcard = dailyHighlights.getNewswarpCount().getText();

		// Tap on swipe up button
		clickBtn(dailyHighlights.getSwipeUpBtn(), "Swipe Up Button");

		// Wait till the next card count is displayed
		waitTillElementPresent(dailyHighlights.getNewswarpCount(), 20);

		// Get the count of the card
		String secondcard = dailyHighlights.getNewswarpCount().getText();

		// Validate that the user is navigated to the next card by tapping on the swipe
		// up button
		verifyTwodifferentString(firstcard, secondcard);
	}
}