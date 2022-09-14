package com.aajtak.android.NewsList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date :  01 June 2021 
 * 
 * Description: Verify that user is navigated to Newslist
 * screen when user taps on 'Cancel' or any where on the screen
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_013 extends Aajtak_app_Util {

	@Test(priority = 13, description = "Description: Verify that user is navigated to Newslist screen when user taps on 'Cancel' or any where on the screen")
	public void AT_Newslist_013() throws InterruptedException {
		
		// launch app
		launchApp();
		
		// complete onboarding set up
		compelteOnboarding();
		
		// Tap on Manoranjan Tab
		clickBtn(homescreen.getManoranjanTab());
		
		// Wait till the screen loads
		waitTillElementPresent(newsList.getshareIcon(), 15);
		
		// Tap on share icon
		clickBtn(newsList.getshareIcon(), "Share icon");
		
		// Wait till the share sheet loads
		waitTillElementPresent(share.getShareCancel(), 15);
		
		// Tap on device back button
		clickDeviceBackButton(1);
		
		// Validate that user is in newslist screen
		isElementExist(newsList.getnewslistfirsttitle());
	}

}
