package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 24 May 2021
 * 
 * This is Daily Capsule module of AajTak Application. User is able to view news
 * in short in the daily highlights.Verify that the user is able
 * to view the Daily capsule news in detail
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_015 extends Aajtak_app_Util {

	@Test(priority = 15, description = "Description: Verify that the user is able to view the Daily capsule news in detail")
	public void AT_DailyCapsule_015() throws InterruptedException {
		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);

		// Click on daily capsule banner
		clickBtn(homescreen.getDailycapBannerMessage());

		// Wait till the newswrap card loads and get the title of the story
		waitTillElementPresent(dailyHighlights.getNewswarptitle(), 20);
		String expectedTitle = dailyHighlights.getNewswarptitle().getText();

		// Tap on newswrap title
		clickBtn(dailyHighlights.getNewswarptitle());

		// Tap on Okay button in walkthrough screen
		clickBtn(storyDetail.getTikeSamajAgaya());

		// Wait till the story screen is loaded and get the title of the story in the
		// detail screen
		waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 120);
		String actualTitle = storyDetail.getTitleOfAnyStory().getText();

		// Validating the title of the story
		verifyStoryTitles(actualTitle, expectedTitle);
	}
}