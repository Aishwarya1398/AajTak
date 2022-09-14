package com.aajtak.android.DailyCapsule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 20 May 2021
 * 
 * Description: This is Daily Capsule module of AajTak Application. User is able
 * to view news in short in the daily highlights. Verify that user is able to
 * view weather in the daily capsule banner
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_DailyCapsule_002 extends Aajtak_app_Util {

	@Test(priority = 2, description = "Description: Verify the user is able to view weather")
	public void AT_DailyCapsule_002() throws InterruptedException {
		// Launch the App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Wait till Homescreen loads
		waitTillElementPresent(homescreen.getDailycapBannerMessage(), 30);

		// Verify if user is able to view temperature
		isElementExist(homescreen.getTemperature());

		// Verify if user is able to view temerature
		String weather = homescreen.getTemperature().getText();

		// Validate if the temperature is displayed in °C
		verifyTextContains(weather, "°C");
	}
}