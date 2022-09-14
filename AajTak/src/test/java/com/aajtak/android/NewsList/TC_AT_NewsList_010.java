package com.aajtak.android.NewsList;

import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidElement;

/**
 * Date : 28 May 2021
 * 
 * Description: Verify that user is able to share story by tapping on the
 * 'Share' icon available at end of any story
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_010 extends Aajtak_app_Util {
	@Test(priority = 10, description = "Description: Verify that user is able to share story by tapping on the 'Share' icon available at end of any story")
	public void AT_Newslist_010() throws InterruptedException {

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

		// Wait till share options load
		waitTillElementPresent(share.getShareCancel(), 15);

		// Validate the share options present
		List<AndroidElement> optionText = share.getShareOptionHighlights();
		for (AndroidElement allText : optionText) {

			isElementExist(allText);
		}
	}

}
