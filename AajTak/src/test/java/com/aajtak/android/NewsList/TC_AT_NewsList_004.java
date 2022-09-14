package com.aajtak.android.NewsList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 28 May 2021
 * 
 * Description: Verify that user is able to tap 'Bookmark' icon below any story
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_004 extends Aajtak_app_Util {

	@Test(priority = 4, description = "Description: Verify that user is able to tap 'Bookmark' icon below any story")
	public void AT_Newslist_004() throws InterruptedException {

		// launch app
		launchApp();

		// complete onboarding set up
		compelteOnboarding();

		// Tap on Manoranjan Tab
		clickBtn(homescreen.getManoranjanTab());

		// Wait till the screen loads
		waitTillElementPresent(newsList.getbookmarkIcon(), 15);

		// Click on bookmark icon
		clickBtn(newsList.getbookmarkIcon(), "Bookmark icon");
		String mesg = newsList.getToastMsg().getText();

		// Validate the toast message
		verifyTwoText(mesg, "बुकमार्क किया गया :)");
	}

}