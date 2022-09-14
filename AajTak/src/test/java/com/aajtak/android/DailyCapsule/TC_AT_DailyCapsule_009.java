package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 20 May 2021
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights. Verify that the user should be
 * able to view the share icon in the newspresso card
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_009 extends Aajtak_app_Util {

	@Test(priority = 9, description = "Description: Verify that the user should be able to view the share icon in the newspresso card")
	public void AT_DailyCapsule_009() throws InterruptedException {
		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);

		// Click on daily capsule banner
		clickBtn(homescreen.getDailycapBannerMessage());

		// Validate if share icon is present in newspresso card
		isElementExist(homescreen.getShareIcon(), "Share icon");
	}
}