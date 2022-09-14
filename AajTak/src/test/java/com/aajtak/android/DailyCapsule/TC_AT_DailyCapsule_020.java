package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 24 May 2021
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights. Verify that user is able to
 * swipe through newspresso card by swiping down
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_020 extends Aajtak_app_Util {
	@Test(priority = 20, description = "Description: Verify that user is able to swipe through newspresso card by swiping down")
	public void AT_DailyCapsule_020() throws InterruptedException {

		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);

		// Tap on daily capsule banner
		clickBtn(homescreen.getDailyCapsuleBanner(), "Daily Capsule Banner");

		// Tap on swipe up button
		clickBtn(dailyHighlights.getSwipeUpBtn(), "Swipe Up Button");

		// Get the text of the card
		String secondcard = dailyHighlights.getNewswarpCount().getText();

		// Scroll down
		scrollDown();
		minWait();

		// Get the count of the card
		String firstcard = dailyHighlights.getNewswarpCount().getText();

		// Verify that count of the cards and validate if the user is navigated to the
		// previous card by swiping down
		verifyTwodifferentString(secondcard, firstcard);
	}
}