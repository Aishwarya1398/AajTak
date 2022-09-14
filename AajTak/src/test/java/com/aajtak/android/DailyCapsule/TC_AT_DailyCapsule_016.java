package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 24 May 2021
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights. Verify that the
 * user should be able to view the close button on the top left corner
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_016 extends Aajtak_app_Util {

	@Test(priority = 16, description = "Description: Verify that the user should be able to view the close button on the top left corner")
	public void AT_DailyCapsule_016() throws InterruptedException {

		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);

		// Tap on daily capsule banner
		clickBtn(homescreen.getDailycapBannerMessage());

		// Validating if close icon is present
		isElementExist(dailyHighlights.getCloseBtn(), "Newspwrap Close Button");
	}
}