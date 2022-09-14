package com.aajtak.android.BottomNavigationBar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 *  
 * @author Janardhan P
 * App version v9.37(417)
 * This is BottomNavigationBar Section From Aaj Tak Application
 * Description : "Access the daily highlight under bottom navigation bar-should be navigate to daily highlight screen "
 * 
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_BNB_009 extends Aajtak_app_Util {
	
					/*Test case--409 */

					@Test(description = "Access the daily highlight under bottom navigation bar-should be navigate to daily highlight screen ")
					public void AT_BNB_009() throws InterruptedException {
						
						/* Launch the App */
						// launchApp();
						// Aajtak_app_Util.compelteOnboarding();
						reOpenApp();
						
						/* Wait till BottomNavigationIcon ready to be clicked & then Tap on it */
						waitTillElementPresent(bottomNavigationBar.getBottomNavigateRoundCube(), 10);
						clickBtn(bottomNavigationBar.getBottomNavigateRoundCube(), "BottomNavigationBar");

						/* Tap on Daily Highlights and navigate to DailyHight page */
						clickBtn(bottomNavigationBar.getBottomCircleFirstOption(), "Daily Highlights");
						
						/* Check if Daily Highlights Page opened or not */
						isElementExist(dailyHighlights.getNewswarptitle(), "Daily Highlights Title");

						/* Close the App */
						aDriver.closeApp();
		
	}

}
