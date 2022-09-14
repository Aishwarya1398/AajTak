package com.aajtak.android.Onboarding;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 15 May 2021
 * 
 * Description: Verify that the user get navigated to the next screen when
 * clicking 'Shuru Kare' button
 * 
 * @author Janardhan
 * @version 9.37(417)
 *
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Onboarding_001 extends Aajtak_app_Util {

	@Test(priority = 1, description = "Description: Verify that the user get navigated to the next screen when clicking 'Shuru Kare' button")
	public void AT_Onboarding_001() throws InterruptedException {

		// launch app
		launchApp();

		// Wait till the onboarding screen is displayed
		waitTillElementPresent(shuruKarienOnboarding.getShuruKarein(), 20);
//		waitTillElementPresent(shuruKarienOnboarding.getAageBado(), 20);
		
		// Tap on shuru karien button
		clickBtn(shuruKarienOnboarding.getShuruKarein());
//		clickBtn(shuruKarienOnboarding.getAageBado());

		// Validate the next screen is Notification Paye screen
		isElementExist(notificatonPayeOnboarding.getNotificationPayeTxt());
	}
}
