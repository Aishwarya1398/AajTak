package com.aajtak.android.HomeScreen;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 8 June 2021
 * 
 * Description: Verify that user is able to tap 'Offline Story' icon below any
 * story
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_009 extends Aajtak_app_Util {

	@Test(priority = 9, description = "Description: Verify that user is able to tap 'Offline Story' icon below any story")
	public void AT_Home_009() throws InterruptedException {

		// Launch the app
		launchApp();

		// Complete Onboarding set up
		//compelteOnboarding();
		compelteOnboardingCopy();
		// Wait till homescreen is loaded
		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		// Scroll to badi khabrien section
		scrollToElement(homescreen.getBadiKahbreinSection());

		// Scroll to any story in badi khabrein
		scrollToElement(homescreen.getOtherStoryTitle());

		// Tap on save button
		clickBtn(homescreen.getOfflineIcon(), "Save icon");

		// Get text of the toast message
		String mesg1 = homescreen.getToastmsg().getText();

		// Validate the toast message
		verifyTwoText(mesg1, "सेव किया गया :)");
	}
}