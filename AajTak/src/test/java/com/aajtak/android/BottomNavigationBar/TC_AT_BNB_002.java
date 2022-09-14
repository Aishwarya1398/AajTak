package com.aajtak.android.BottomNavigationBar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 *  
 * @author Janardhan P
 * App version v9.37(417)
 * This is BottomNavigationBar Section From Aaj Tak Application
 * Description : "Access the Bottom naviation bar - Three option should be displayed"
 * 
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_BNB_002 extends Aajtak_app_Util {
	
						/* Test case--402 */

	@Test(description = "Access the Bottom naviation bar - Three option should be displayed")
	public void AT_BNB_002() throws Exception {
		
		/* Launch The App */
		// launchApp();
		// Aajtak_app_Util.compelteOnboarding();
		reOpenApp();
		
		/* Wait till BottomNavigationIcon ready to be clicked and then Click on it */
		waitTillElementPresent(bottomNavigationBar.getBottomNavigateRoundCube(), 20);
		clickBtn(bottomNavigationBar.getBottomNavigateRoundCube(),"Bottom Navigation Bar");
		
		/* Is Element Present inside Bottom Navigation Bar(Daily Highlights,Podcast,Settings) */	
		isElementExist(bottomNavigationBar.getBottomCircleFirstOption(), "Daily Highlights");
		isElementExist(bottomNavigationBar.getBottomCircleSecondOption(), "Podcast");
		isElementExist(bottomNavigationBar.getBottomCircleThirdOption(), "Settings");
	
		/*Close the App */
		aDriver.closeApp();
							
	}

}
