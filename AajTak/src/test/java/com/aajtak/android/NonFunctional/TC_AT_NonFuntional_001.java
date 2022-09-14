package com.aajtak.android.NonFunctional;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import junit.framework.Assert;
/**
 * Date : 2 June 2021 
 * 
 * Description: Verify app installation is successful 
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NonFuntional_001 extends Aajtak_app_Util {

	@Test(description = "Description: Verify app installation is successful", priority = 1)
	public void AT_NonFunctional_001() throws Exception {
		//Remove existing app
        uninstallApp();
		
        //Install the App
		installProdApp();
		
		//Validate if app is installed
		boolean status = aDriver.isAppInstalled(properties.getProperty("appPackage"));
		Assert.assertEquals(true, status);
		
	}

}
