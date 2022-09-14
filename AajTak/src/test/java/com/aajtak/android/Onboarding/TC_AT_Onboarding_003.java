package com.aajtak.android.Onboarding;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 15 May 2021
 * 
 * Description: Verify that the user get navigated to next screen by swiping
 * horizontally
 * 
 * @author Janardhan
 * @version 9.37(417)
 *
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Onboarding_003 extends Aajtak_app_Util {

	@Test(priority = 3, description = "Description: Verify that the user get navigated to next screen by swiping horizontally")
	public void AT_Onboarding_003() throws InterruptedException {

		// Launch the app
		launchApp();

		// Tap on shuru karien button
		clickBtn(shuruKarienOnboarding.getShuruKarein());
//		clickBtn(shuruKarienOnboarding.getAageBado());

		// Verify the next screen
		isElementExist(notificatonPayeOnboarding.getNotificationPayeTxt());

		// Swipe right
		swipeRight();

		// Validate the next screen is autoplay settings screen in onboarding
		isElementExist(autoplay.getAutoPlayTxt());
	}

}