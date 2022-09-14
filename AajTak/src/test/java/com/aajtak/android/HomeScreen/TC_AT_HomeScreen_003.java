package com.aajtak.android.HomeScreen;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 8 June 2021
 * 
 * Description: This is Homescreen module of AajTak Application. Description:
 * Verify that each story has Comments icon, Bookmark icon, Offline Story icon
 * and Share icon.
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_003 extends Aajtak_app_Util {

	@Test(priority = 3, description = "Description: Verify that each story has Comments icon, Bookmark icon, Offline Story icon and Share icon")
	public void AT_Home_003() throws InterruptedException {

		// Launch the app
		launchApp();

		// Complete Onboarding set up
		//compelteOnboarding();
		compelteOnboardingCopy();
		// wait till homescreen is loaded
		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		// Scroll till Top stories section
		scrollToElement(homescreen.getBadiKahbreinSection());

		// Scroll till a story
		scrollToElement(homescreen.getOtherStoryTitle());

		// Validate if the story has Comments icon, Bookmark icon, Offline Story icon
		// and Share icon
		isElementExist(homescreen.getCommentIcon(), "Comment icon");
		isElementExist(homescreen.getBookmarkIcon(), "Book mark icon");
		isElementExist(homescreen.getOfflineIcon(), "Save icon");
		isElementExist(homescreen.getShareIcon(), "Share icon");
	}
}