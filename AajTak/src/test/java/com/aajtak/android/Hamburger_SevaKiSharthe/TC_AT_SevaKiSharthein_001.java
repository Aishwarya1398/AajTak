package com.aajtak.android.Hamburger_SevaKiSharthe;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 14 June 2021
 * 
 * Description: Verify that user is able to navigate to 'Seva Ki Sarthae' screen
 * by tapping on 'Seva Ki Sarthae' from 'Settings'
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_SevaKiSharthein_001 extends Aajtak_app_Util {
	// 81
	
	@Test(description = "Verify that user is able to navigate to 'Seva Ki Sarthae' screen by tapping on 'Seva Ki Sarthae' from 'Settings'", priority = 1)
	public void AT_SeKiSa_001() throws InterruptedException {
		// Launch app
		launchApp();

		// Complete Onboarding
		compelteOnboarding();

		// Tap on Hamburger Menu
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");

		// Scroll to Settings
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());

		// Tap on settings
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());

		// Scroll to terms and conditions
		scrollToElement(settings.getSevaKiSharte());

		// Tap on terms and conditions
		clickBtn(settings.getSevaKiSharte());

		// Validate the terms and conditions page
		isElementExist(termsAndConditions.getTermsAndConditons());
	}
}