package com.aajtak.android.HomeScreen;

import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidElement;

/**
 * Date : 8 June 2021
 * 
 * Description: Verify that once user taps on 'Share' icon of any story & taps
 * on 'Anya', it gives more options to share the story
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_012 extends Aajtak_app_Util {
	@Test(priority = 12, description = "Description: Verify that once user taps on 'Share' icon of any story & taps on 'Anya', it gives more options to share the story")
	public void AT_Home_012() throws InterruptedException {

		// Launch the app
		launchApp();

		// Complete Onboarding set up
		//	compelteOnboarding();
		compelteOnboardingCopy();
		// wait till homescreen is loaded
		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		// Scroll to badi khabrien section
		scrollToElement(homescreen.getBadiKahbreinSection());

		// Scroll to any story in badi khabrein
		scrollToElement(homescreen.getOtherStoryTitle());

		// Click on share icon
		clickBtn(share.getShareIcon(), "Share icon");

		// Wait till share sheet is present
		waitTillElementPresent(share.getOtherShare(), 30);

		// Click on anya share
		clickBtn(share.getOtherShare());

		// Validate the anya share options
		isElementExist(share.getAnyaShareText());
		List<AndroidElement> optionText = share.getAnyaShareOptions();
		for (AndroidElement allText : optionText) {

			isElementExist(allText);
		}
	}

}