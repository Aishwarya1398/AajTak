package com.aajtak.android.Onboarding;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 15 May 2021
 * 
 * Description: Verify that the user is able to go to Set Preferences screen
 * 
 * @author Janardhan
 * @version 9.37(417)
 *
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Onboarding_004 extends Aajtak_app_Util {

	@Test(priority = 4, description = "Description: Verify that the user is able to go to Set Preferences screen")
	public void AT_Onboarding_004() throws InterruptedException {

		// Launch app
		launchApp();

		// Tap on shuru karien button
		clickBtn(shuruKarienOnboarding.getShuruKarein());
//		clickBtn(shuruKarienOnboarding.getAageBado());
		isElementExist(notificatonPayeOnboarding.getNotificationPayeTxt());

		// Swipe right from notification paye screen
		swipeRight();

		// Verify next screen is present
		isElementExist(autoplay.getAutoPlayTxt());

		// Swipe right twice to set preference screen
		swipeRight();
		swipeRight();

		// Validate if the Set preferences screen is present
		isElementExist(pasandidaSetKareinOnboarding.getPasandidaSetTxt());
	}
}