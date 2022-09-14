package com.aajtak.android.HomeScreen;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_3Copy extends Aajtak_app_Util {

	@Test(priority = 3, description = "Description: Verify that each story has Comments icon, Bookmark icon, Offline Story icon and Share icon")
	public void AT_Home_003() throws InterruptedException {

		// Launch the app
		launchApp();

		// Complete Onboarding set up
		compelteOnboardingCopy();

		// wait till homescreen is loaded
		waitTillElementPresent(homescreen.getlargephotooffirststory(), 20);

		// Click on story
		clickBtn(homescreen.getlargephotooffirststory());
		
		//Click on More option
		clickBtn(storyDetail.getmoreOptions());

		// Validate if the story has Comments icon, Bookmark icon, Offline Story icon
		// and Share icon
		isElementExist(homescreen.getCommentIcon(), "Comment icon");
		isElementExist(homescreen.getBookmarkIcon(), "Book mark icon");
		isElementExist(homescreen.getOfflineIcon(), "Save icon");
		isElementExist(homescreen.getShareIcon(), "Share icon");
	}
}