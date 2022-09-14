package com.aajtak.android.BottomNavigationBar;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 *  
 * @author Janardhan P
 * App version v9.37(417)
 * This is  BottomNavigationBar Section From Aaj Tak Application
 * Description :  "Verify that user is able to see bottom navigation bar in the bottom of the screen"
 * 
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_BNB_001 extends Aajtak_app_Util {
	
	                /* Test case- 401 */

	@Test(description = "Verify that user is able to see bottom navigation bar in the bottom of the screen")
	public void AT_BNB_001() throws Exception {
		/* Launch The App */
		launchApp();
		Aajtak_app_Util.compelteOnboarding();
		
		/* Check if Bottom Naviagtion Bar Cube Present */
		isElementExist(bottomNavigationBar.getBottomNavigateRoundCube(), "BottomNavigationBar");
		
		/* Check if Badi Kabrein Present */
		isElementExist(bottomNavigationBar.getBadiKhabrein(), "Badi Khabrien�");
		
		/* Check if Live Tv Present */
		isElementExist(bottomNavigationBar.getLiveTv(), "Live Tv");
		
		/* Close the App */
		aDriver.closeApp();
	
	}

}
