package com.aajtak.android.NewsList;

import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidElement;

/**
 * Date : 01 June 2021
 * 
 * Description: Verify that user is able to view more options to share the story
 * when user taps on'Anya'share option
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_012 extends Aajtak_app_Util {

	@Test(priority = 12, description = "Description: Verify that user is able to view more options to share the story when user taps on'Anya'share option")
	public void AT_Newslist_012() throws InterruptedException {

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

		// Wait till share sheet loads
		waitTillElementPresent(share.getOtherShare(), 15);

		// Tap on anya share option
		clickBtn(share.getOtherShare());

		// Verify if user is able to view anya share text
		isElementExist(share.getAnyaShareText());

		// Validate the other share options
		List<AndroidElement> optionText = share.getAnyaShareOptions();
		for (AndroidElement allText : optionText) {

			isElementExist(allText);
		}

	}

}
