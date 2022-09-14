package com.aajtak.android.Hamburger_PrivacyPolicy;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Privacy policy module From Aaj Tak Application
 * Description :Verify that user is navigated to 'Settings' screen by tapping on back button from 'Privacy Policy' screen
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_PrivacyPolicy_002 extends Aajtak_app_Util{

	@Test(priority = 2, description ="Description : Verify that user is navigated to 'Settings' screen by tapping on back button from 'Privacy Policy' screen")
	public void AT_PrivacyPolicy_002() throws InterruptedException {
		//Launching the app
		launchApp();

		//Complete on board set up
		compelteOnboarding();

		//Clicking on hambergur menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");

		//Scrolling till settings element in hambergur menu
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());

		//Clicking on settings option in hambergur menu
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());

		//Scrolling till privacy policy element 
		scrollToElement(settings.getPrivacyPolicy());

		//Clicking on privacy policy option
		clickBtn(settings.getPrivacyPolicy());

		//Valiidating the static text from privacy policy page
		isElementExist(privacyPolicy.getPrivacyPOlicyObejectiveAndScope());

		//Clicking on device back button
		clickDeviceBackButton(1);

		//Validating the privacy policy element in settings page
		isElementExist(settings.getPrivacyPolicy());
	}

}
