package com.aajtak.android.AppMessage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is App message Module From Aaj Tak Application
 * Description : Verify user is able to view Daily capsule message
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_AppMsg_001 extends Aajtak_app_Util{
	
	@Test(description="Daily Capsule message",priority = 1)
	public void AT_AppMsg_001() throws InterruptedException {
		
		//Launching the app
		launchApp();
		
		//Complete onboard set up
		compelteOnboarding();
		
		//Verifying the daily capsule message
		isElementExist(homescreen.getDailycapBannerMessage());
	}

}
