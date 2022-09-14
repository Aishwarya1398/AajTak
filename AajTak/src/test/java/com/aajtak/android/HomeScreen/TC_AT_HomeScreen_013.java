package com.aajtak.android.HomeScreen;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 8 June 2021
 * 
 * Description: Verify that once user taps on Anya, it gives more options to
 * share the story & if tapped 'Cancel' or any where on the screen, user
 * navigates to 'Home' screen
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_013 extends Aajtak_app_Util {

	@Test(priority = 13, description = "Description: Verify that when user taps on 'Cancel' or any where on the screen in the anya share sheet, user navigates to 'Home' screen")
	public void AT_Home_013() throws InterruptedException {

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

		// Click on share icon
		clickBtn(share.getShareIcon(), "Share icon");

		// Wait till share sheet is present
		waitTillElementPresent(share.getOtherShare(), 30);

		// Click on anya share
		clickBtn(share.getOtherShare());

		// Tap on device back button
		clickDeviceBackButton(1);

		// Validate that user is in homescreen
		isElementExist(homescreen.getAajTakHomeLogo(), "AajTak Home");

	}
}