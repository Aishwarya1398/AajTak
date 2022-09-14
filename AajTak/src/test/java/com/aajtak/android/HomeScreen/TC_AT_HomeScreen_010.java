package com.aajtak.android.HomeScreen;

import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidElement;

/**
 * Date : 8 June 2021
 * 
 * Description: Verify that user is able to share story by tapping on the
 * 'Share' icon available at end of any story
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_010 extends Aajtak_app_Util {
	@Test(priority = 10, description = "Description: Verify that user is able to share story by tapping on the 'Share' icon available at end of any story")
	public void AT_Home_010() throws InterruptedException {

		// Launch the app
		launchApp();

		// Complete Onboarding set up
		//compelteOnboarding();
		compelteOnboardingCopy();
		// wait till homescreen is loaded
		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		// Scroll to badi khabrien section
		scrollToElement(homescreen.getBadiKahbreinSection());

		// Scroll to any story in badi khabrein
		scrollToElement(homescreen.getOtherStoryTitle());

		// Verify that share option is present
		isElementExist(homescreen.getShareIcon(), "Share icon");

		// Tap on share icon
		clickBtn(homescreen.getShareIcon(), "Share icon");

		// Wait till share sheet is loaded
		waitTillElementPresent(share.getOtherShare(), 30);

		// Validate the anya share option is present
		List<AndroidElement> optionText = share.getShareOptionHighlights();
		for (AndroidElement allText : optionText) {

			isElementExist(allText);
		}
	}
}