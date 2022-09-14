package com.aajtak.android.NewsList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 28 May 2021
 * 
 * Description: Verify that user is able to remove the added 'Bookmark' by
 * tapping on the 'Bookmark' icon of bookmarked story
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_009 extends Aajtak_app_Util {

	@Test(priority = 9, description = "Description: Verify that user is able to remove the added 'Bookmark' by tapping on the 'Bookmark' icon of bookmarked story")
	public void AT_Newslist_009() throws InterruptedException {

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
		minWait();

		// Click on bookmark icon again
		clickBtn(newsList.getbookmarkIcon(), "Bookmark icon");

		// Validate the toast message
		String mesg = newsList.getToastMsg().getText();
		verifyTwoText(mesg, "बुकमार्क हटाया गया");

	}

}
