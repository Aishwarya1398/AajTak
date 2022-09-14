package com.aajtak.android.BottomNavigationBar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 *  
 * @author Janardhan P
 * App version v9.37(417)
 * This is BottomNavigationBar Section From Aaj Tak Application
 * Description : "Access the Podcast icon under bottom navigation bar user should be navigate to Podcast screen"
 * 
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_BNB_003 extends Aajtak_app_Util {

						/* Test case--403 */

	@Test(description = "Access the Podcast icon under bottom navigation bar user should be navigate to Podcast screen")
	public void AT_BNB_003() throws Exception {

		/* Launch The App */
		//launchApp(); 
		// Aajtak_app_Util.compelteOnboarding();
		reOpenApp();
		
		/* Wait till BottomNavigationIcon ready to be clicked and Click on it */
		waitTillElementPresent(bottomNavigationBar.getBottomNavigateRoundCube(), 10);
		clickBtn(bottomNavigationBar.getBottomNavigateRoundCube(), "BottomNavigationBar Icon");
		
		/* Select Podcast Option */ 
		isElementExist(bottomNavigationBar.getBottomCircleSecondOption(), "Podcast");
		clickBtn(bottomNavigationBar.getBottomCircleSecondOption(), "Podcast");
		
		/* Navigate to Podcast Page */
		isElementExist(podcast.getFirstPodcastAudio(), " First Podcast Audio");
		
		/* Close The App */
		aDriver.closeApp();

				

	}
}
