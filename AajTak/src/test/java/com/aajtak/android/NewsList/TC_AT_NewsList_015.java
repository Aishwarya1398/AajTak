package com.aajtak.android.NewsList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 01 June 2021
 * 
 * Description: Verify that once user swipes the Newslist screen from top to
 * bottom on home screen, Newslist screen gets refreshed
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_015 extends Aajtak_app_Util {
	@Test(priority = 17, description = "Description: Verify that once user swipes the Newslist screen from top to bottom on home screen, Newslist screen gets refreshed")
	public void AT_Newslist_017() throws InterruptedException {

		// launch app
		launchApp();

		// complete onboarding set up
		compelteOnboarding();

		// Tap on Manoranjan Tab
		clickBtn(homescreen.getManoranjanTab());

		// Wait till the screen loads
		waitTillElementPresent(newsList.getnewslistfirsttitle(), 5);

		// Pull down and refresh the screen to capture the message
		verifyPullToRefreshText();
	}

}
