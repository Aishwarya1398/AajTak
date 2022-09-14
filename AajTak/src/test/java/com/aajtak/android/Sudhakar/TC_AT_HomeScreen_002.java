package com.aajtak.android.Sudhakar;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_002 extends Aajtak_app_Util {

	@Test(priority = 2)
	public void AT_Home_002() throws InterruptedException {

		
		launchApp();

		compelteOnboardingCopy();
		
		waitTillElementPresent(homescreen.getFirstNews(), 20);
		Reporter.log("Got the first news");


		// Validate if the badikhabrien section is present
		isElementExist(homescreen.getFirstNews());
	}
}