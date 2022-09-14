package com.aajtak.android.NewsList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 01 June 2021
 * 
 * Description: Verify that once the user taps on 'Cancel' from the sharing
 * options, user navigates to Newslist screen
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_011 extends Aajtak_app_Util {

	@Test(priority = 11, description = "Description: Verify that once the user taps on 'Cancel' from the sharing options, user navigates to Newslist screen")
	public void AT_Newslist_011() throws InterruptedException {

		// launch app
		launchApp();

		// complete onboarding set up
		compelteOnboarding();

		// Tap on Manoranjan Tab
		clickBtn(homescreen.getManoranjanTab());

		// Wait till the screen loads
		waitTillElementPresent(newsList.getshareIcon(), 15);

		// Tap on share icon
		clickBtn(newsList.getshareIcon(), "Share icon");

		// Wait till the share sheet loads
		waitTillElementPresent(share.getShareCancel(), 15);

		// Verify if the cancel share option is present
		isElementExist(share.getShareCancel());

		// Tap on cancel share
		clickBtn(share.getShareCancel());

		// Validate if use is navigated to newslist screen
		isElementExist(newsList.getshareIcon(), "Share icon");
	}

}
