package com.aajtak.android.NewsList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 28 May 2021
 * 
 * Description: Verify that each story has Comments icon, Bookmark icon, Offline
 * Story icon and Share icon.
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_002 extends Aajtak_app_Util {

	@Test(priority = 2, description = "Description: Verify that each story has Comments icon, Bookmark icon, Offline Story icon and Share icon")
	public void AT_Newslist_002() throws InterruptedException {
		// launch app
		launchApp();
		// complete onboarding set up
		compelteOnboarding();
		// Tap on Manoranjan Tab
		clickBtn(homescreen.getManoranjanTab());

		// Wait till the screen loads
		waitTillElementPresent(newsList.getnewslistfirsttitle(), 60);

		// Validate if user is able to view Comments icon, Bookmark icon, Offline Story
		// icon and Share icon
		isElementExist(newsList.getcommenticon(), "Comment icon");
		isElementExist(newsList.getbookmarkIcon(), "Bookmark icon");
		isElementExist(newsList.getdownloadIcon(), "Download icon");
		isElementExist(newsList.getshareIcon(), "Share icon");

	}

}
