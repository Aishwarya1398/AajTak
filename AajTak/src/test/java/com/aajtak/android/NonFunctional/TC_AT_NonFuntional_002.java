package com.aajtak.android.NonFunctional;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 2 June 2021
 * 
 * Description: Verify that the user is able to view splash screen
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NonFuntional_002 extends Aajtak_app_Util {

	@Test(priority = 2, description = "Description: Verify that the user is able to view splash screen")
	public void AT_NonFunctional_002() throws Exception {
		Thread.sleep(2000);
		launchApp();
		// boolean status = isElementExist(splashScreen.getSplashImage(),
		// "SplashScreen");
		// Verify the splash screen is present
		boolean status = verifySplashScreen();
		report(status, "Splash Screen is Present", "Splash Screen is not displayed ");
	}

}
