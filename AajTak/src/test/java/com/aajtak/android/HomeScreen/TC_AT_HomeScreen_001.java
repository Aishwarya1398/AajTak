package com.aajtak.android.HomeScreen;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
/**
 * Date : 8 June 2021 
 * 
 * Description:  Verify once user launch the app,'Home' tab is selected by default.
 * 
 * @author Archana George
 * @version 9.37(417)
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_001 extends Aajtak_app_Util {

	@Test(priority = 1, description = "Description: Verify once user launch the app,'Home' tab is selected by default")
	public void AT_Home_001() throws InterruptedException {
		
		//Launch the App
		launchApp();
		
		//Complete the onboarding setup
		//compelteOnboarding();
		compelteOnboardingCopy();
		//Wait till homescreen loads
		waitTillElementPresent(homescreen.getHomeTab(),20);
		
		//Validate if homescreen is selected by default
		boolean check = homescreen.getHomeTab().isSelected();
		assertTrue(check, "Home Screen is selected");
		report(check, "HomeScreen is selected by default", "HomeScreen is not selected");
	}
}