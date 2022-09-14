package com.aajtak.android.HomeScreenSection;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is HomeScreen Section Module From Aaj Tak Application
 * Description : Verify that the user is able to view the photo story
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeSec_004 extends Aajtak_app_Util{
	
	@Test(description="Description : Verify that the user is able to view the photo story",priority = 4)
	public void AT_HomeSec_004() throws InterruptedException {

		//Launching the app
		launchApp();
		
		//Complete on board set up
		compelteOnboarding();
		
		//Scrolling till story element in home screen
		scrollToElement(homescreen.getStoryInHomeScreen());
		
		//Verifying the story in home screen
		isElementExist(homescreen.getStoryInHomeScreen());

	}

}
