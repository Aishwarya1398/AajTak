package com.aajtak.android.NonFunctional;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
/**
 * Date : 2 June 2021 
 * 
 * Description: Verify the user is able to launch the application
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NonFuntional_004 extends Aajtak_app_Util {

	@Test(priority = 4, description = "Description: Verify the user is able to launch the application")
	public void AT_NonFunctional_004() throws Exception {
		
		//Launch the app
		launchApp();
		
		//Wait till the first onloadring screen is present
		waitTillElementPresent(shuruKarienOnboarding.getAppLogo(), 10);
		
		//Validate if user is able toview the first onboarding screen with Aajtak logo
		boolean status = isElementDisplayed(shuruKarienOnboarding.getAppLogo());
		report(status, "App launched", "App is not launched");

	}

}

