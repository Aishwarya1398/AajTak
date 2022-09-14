package com.aajtak.android.BottomNavigationBar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 *  
 * @author Janardhan P
 * App version v9.37(417)
 * This is BottomNavigationBar Section From Aaj Tak Application
 * Description : "Access the navigation close button in daily highlight-User should navigate to previous screen"
 * 
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_BNB_011 extends Aajtak_app_Util {
	/* Test case --411 */
	@Test(description = "Access the navigation close button in daily highlight-User should navigate to previous screen")
	public void AT_BNB_011() throws Exception {

		/* Launch the App */
		// launchApp();
		// Aajtak_app_Util.compelteOnboarding();
		reOpenApp();
		
		// Wait till BottomNavigationIcon ready to be clicked & then Tap
		waitTillElementPresent(bottomNavigationBar.getBottomNavigateRoundCube(), 10);
		clickBtn(bottomNavigationBar.getBottomNavigateRoundCube(),"BottomNavigationBar");
		
		// Tap on Daily Highlights and navigate to DailyHight page
		clickBtn(bottomNavigationBar.getBottomCircleFirstOption(),"DailyHighlights");
		
		//close DailyHighlights page
		clickBtn(dailyHighlights.getCloseBtn(),"DailyHighlightsCloseButton");
		
		//validate if navigated back
		isElementExist(bottomNavigationBar.getBadiKhabrein(),"Badi Khabrein");

		/* Wait till BottomNavigationIcon ready to be clicked & then Tap on it */
		waitTillElementPresent(bottomNavigationBar.getBottomNavigateRoundCube(), 10);
		clickBtn(bottomNavigationBar.getBottomNavigateRoundCube(), "BottomNavigationBar");

		/* Tap on Daily Highlights and navigate to DailyHight page */
		clickBtn(bottomNavigationBar.getBottomCircleFirstOption(), "DailyHighlights");

		/* close DailyHighlights page */
		clickBtn(dailyHighlights.getCloseBtn(), "DailyHighlightsCloseButton");

		/* validate if navigated back */
		isElementExist(bottomNavigationBar.getBadiKhabrein(), "Badi Khabrein");

		/* Close the App */
		aDriver.closeApp();

	}
}
