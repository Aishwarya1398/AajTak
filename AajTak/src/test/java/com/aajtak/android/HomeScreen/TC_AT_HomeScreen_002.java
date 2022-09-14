package com.aajtak.android.HomeScreen;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 8 June 2021
 * 
 * Description: This is Homescreen module of AajTak Application. Verify that
 * 'Badi Khabarae' is the first section under 'Home' tab.
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_002 extends Aajtak_app_Util {

	@Test(priority = 2, description = "Description: Verify that 'Badi Khabarae' is the first section under 'Home' tab")
	public void AT_Home_002() throws InterruptedException {

		// launch the App
		launchApp();

		// Complete the Onboarding set up
		//compelteOnboarding();
		compelteOnboardingCopy();
		// Wait till homescreen is loaded
		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		// Scroll till Top stories section
		scrollToElement(homescreen.getBadiKahbreinSection());

		// Validate if the badikhabrien section is present
		isElementExist(homescreen.getBadiKahbreinSection());
	}
}