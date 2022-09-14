package com.aajtak.android.NonFunctional;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 2 June 2021
 * 
 * Description: Verify that user is able to uninstall the app
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NonFuntional_006 extends Aajtak_app_Util {
	@Test(priority = 6, description = "Description: Verify that user is able to uninstall the app")
	public void AT_NonFunctional_006() throws Exception {

		// Uninstall the app
		uninstallApp();
		Thread.sleep(3000);

		// Validate that the app is not present
		boolean status = aDriver.isAppInstalled(properties.getProperty("appPackage"));
		unnistallReport(status, "App uninstall - Successfull", "App uninstall - unsuccessfull");
	}

}
