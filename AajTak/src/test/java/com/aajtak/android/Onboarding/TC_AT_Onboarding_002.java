package com.aajtak.android.Onboarding;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 15 May 2021
 * 
 * Description: Verify that the user get navigated to Settings screen when user
 * taps on Anya settings link
 * 
 * @author Janardhan
 * @version 9.37(417)
 *
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Onboarding_002 extends Aajtak_app_Util {

	@Test(priority = 2, description = "Description: Verify that the user get navigated to Settings screen when user taps on Anya settings link")
	public void AT_Onboarding_002() {

		// Launch the app
		launchApp();

		// Tap on shurukarien button
		clickBtn(shuruKarienOnboarding.getShuruKarein());
//		clickBtn(shuruKarienOnboarding.getAageBado());

		// Verify the next screen
		isElementExist(notificatonPayeOnboarding.getNotificationPayeTxt());

		// Tap on anya settings
		clickBtn(notificatonPayeOnboarding.getAnyaSetting());

		// Validate the options present in anya settings screen
		isElementExist(settings.getNotification());
		isElementExist(settings.getOfflinePade());
		isElementExist(settings.getImageDownloadKaren());
		isElementExist(settings.getVideoAutoPlay());
		isElementExist(settings.getCustomizeSection());
		isElementExist(settings.getWidgetSettings());
		isElementExist(settings.getAppMemoryClearKaren());

	}
}