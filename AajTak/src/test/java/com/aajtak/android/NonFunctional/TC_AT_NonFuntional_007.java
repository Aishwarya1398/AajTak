package com.aajtak.android.NonFunctional;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
import com.aventstack.extentreports.configuration.Config;

/**
 * Date : 2 June 2021
 * 
 * Description: Verify that the application should not appear after
 * uninstallation.
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NonFuntional_007 extends Aajtak_app_Util {
	@Test(priority = 7, description = "Description: Verify that the application should not appear after uninstallation.")
	public void AT_NonFunctional_007() throws Exception {
		// Validate if app is installed
		Boolean check = isAppinstalled();
		/*
		 * Thread.sleep(5000); boolean status =
		 * isElementDisplayed(shuruKarienOnboarding.getAppIcon());
		 */
		unnistallReport(check, "App icon removed after uninstall", "App icon not removed after uninstall");
		
		//Install the App for other tests
		installProdApp();
		
	}

}
