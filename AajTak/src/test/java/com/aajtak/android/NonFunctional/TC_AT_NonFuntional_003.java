package com.aajtak.android.NonFunctional;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 2 June 2021
 * 
 * Description: Verify the user is able to view the app icon in the device
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NonFuntional_003 extends Aajtak_app_Util {

	@Test(priority = 3, description = "Description: Verify the user is able to view the app icon in the device")
	public void AT_NonFunctional_003() throws Exception {

		// launch the app
		launchApp();

		// Keep app in background
		aDriver.closeApp();

		// Verify if user is able to view the app icon
		boolean status = isElementDisplayed(shuruKarienOnboarding.getAppIcon());
		report(status, "App icon is present", "App icon is not present");

	}

}
