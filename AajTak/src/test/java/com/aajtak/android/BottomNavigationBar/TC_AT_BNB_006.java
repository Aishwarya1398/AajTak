package com.aajtak.android.BottomNavigationBar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 *  
 * @author Janardhan P
 * App version v9.37(417)
 * This is BottomNavigationBar Section From Aaj Tak Application
 * Description : "Access the Settings under bottom navigation bar user should be navigate to Setting screen"
 * 
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_BNB_006 extends Aajtak_app_Util {
							/* Test case--406-407 */
	@Test(description = "Access the Settings under bottom navigation bar user should be navigate to Setting screen")
	public void AT_BNB_006() throws Exception {
		
		/* Launch the App */
		// launchApp();
		// Aajtak_app_Util.compelteOnboarding();
		reOpenApp();
		
		/* Wait till BottomNavigationIcon ready to be clicked and then Click on it */
		waitTillElementPresent(bottomNavigationBar.getBottomNavigateRoundCube(), 10);
		clickBtn(bottomNavigationBar.getBottomNavigateRoundCube(),"BottomNavigationBar");
		
		/*click on Settings and navigate to Settings page */
		clickBtn(bottomNavigationBar.getBottomCircleThirdOption(), "Settings");
		
		/* check if Setting Page is Present */
		isElementExist(settings.getSettingsVerificationTitle(), "Settings¸");
		
		/* Close The App */
		aDriver.closeApp();
							
	

	}
}
