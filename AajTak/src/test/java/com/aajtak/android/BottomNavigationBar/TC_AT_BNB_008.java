package com.aajtak.android.BottomNavigationBar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 *  
 * @author Janardhan P
 * App version v9.37(417)
 * This is BottomNavigationBar Section From Aaj Tak Application
 * Description : "Access the navigation back button in Settings screen should navigate to previous screen"
 * 
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_BNB_008 extends Aajtak_app_Util {
					/* Test case-408 */

	@Test(description = "Access the navigation back button in Settings screen should navigate to previous screen")
	public void AT_BNB_008() throws Exception {
		
		/* Launch the App */
		// launchApp();
		// Aajtak_app_Util.compelteOnboarding();
		reOpenApp();
		 
		//Wait till BottomNavigationIcon ready to be clicked & then Tap
		waitTillElementPresent(bottomNavigationBar.getBottomNavigateRoundCube(), 10);
		clickBtn(bottomNavigationBar.getBottomNavigateRoundCube(), "BottomNavigationBar");
		
		/* Select Settings & Tap & Navigate to settings Page  */
		clickBtn(bottomNavigationBar.getBottomCircleThirdOption(), "Settings");
		
		/* Check if Settings Page opened or not */
		isElementExist(settings.getSettingsVerificationTitle(), "Settings");
		
		/* Back to previous page */
		clickDeviceBackButton(1);
		
		/* Is Element Badi Khabrein Present */
		isElementExist(bottomNavigationBar.getBadiKhabrein(), "BadiKhabrein");
		
		/* Close the App */
		aDriver.closeApp();
		
	}
}
