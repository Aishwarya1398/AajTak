package com.aajtak.android.DailyCapsule;

/**
 * Date : 24 May 2021 
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able to view news in short in the daily highlights.
 * Verify that when user selects never show this Daily Capsule widget is never shown
 * 
 * @author Archana George
 * @version 9.37(417)
 */

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.junit.Assert;
import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_021 extends Aajtak_app_Util {
	@Test(priority = 21, description = "Description: Verify that when user selects never show this Daily Capsule widget is never shown")
	public void AT_DailyCapsule_021() throws InterruptedException, NoSuchElementException {

		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getBannerDownArrow(), 60);

		// Tap on daily capsule down arrow
		clickBtn(homescreen.getBannerDownArrow(), "Daily capsule banner down arrow");

		// Tap on never show this option
		clickBtn(homescreen.getNeverShow(), "Never show this");

		// Validate whether the daily capsule banner is displayed after the user disable
		// the widget
		boolean check = isElementDisplayed(homescreen.getBannerDownArrow());
		Assert.assertEquals(false, check);
	}

}
