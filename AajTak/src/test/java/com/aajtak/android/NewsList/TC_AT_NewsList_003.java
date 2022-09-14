package com.aajtak.android.NewsList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 28 May 2021
 * 
 * Description: Verify that user is able to tap 'Offline Story' icon below any
 * story.
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_003 extends Aajtak_app_Util {

	@Test(priority = 3, description = "Description: Verify that user is able to tap 'Offline Story' icon below any story")
	public void AT_Newslist_003() throws InterruptedException {

		// launch app
		launchApp();

		// complete onboarding set up
		compelteOnboarding();

		// Tap on Manoranjan Tab
		clickBtn(homescreen.getManoranjanTab());

		// Wait till the screen loads
		waitTillElementPresent(newsList.getdownloadIcon(), 60);

		// Click on save icon
		clickBtn(newsList.getdownloadIcon(), "Save icon");
		String mesg = newsList.getToastMsg().getText();

		// Validate the toast message
		verifyTwoText(mesg, "सेव किया गया :)");
	}

}