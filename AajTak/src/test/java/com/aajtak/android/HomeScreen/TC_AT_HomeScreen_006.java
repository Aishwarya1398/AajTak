package com.aajtak.android.HomeScreen;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 9 June 2021
 * 
 * Description: Verify that by tapping on the close button of the 'Comment'
 * screen, user is navigated to 'Home' screen
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_006 extends Aajtak_app_Util {

	@Test(priority = 6, description = "Description: Verify that by tapping on the close button of the 'Comment' screen, user is navigated to 'Home' screen")
	public void AT_Home_006() throws InterruptedException {

		// Launch the app
		launchApp();

		// Complete Onboarding set up
		//compelteOnboarding();
		compelteOnboardingCopy();
		// wait till homescreen is loaded
		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		// Scroll to Badi Khabrein section
		scrollToElement(homescreen.getBadiKahbreinSection());

		// Scroll to a story in top stories
		scrollToElement(homescreen.getOtherStoryTitle());

		// Tap on comment icon
		clickBtn(homescreen.getCommentIcon(), "Comment Icon");

		// Tap on close button
		clickBtn(comments.getCloseCommentsScreen(), "Comment Close Button");

		// Validate if user is in homescreen
		isElementExist(homescreen.getAajTakHomeLogo(), "AajTak Home");
	}

}