package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_017 extends Aajtak_app_Util {
	@Test(priority = 17, description = "Description: Verify that once user swipes the home screen from top to bottom on home screen, home screen gets refreshed")
	public void AT_Home_017() throws InterruptedException {

		launchApp();

		compelteOnboardingCopy();

		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);

		verifyPullToRefreshText1();
	}
}