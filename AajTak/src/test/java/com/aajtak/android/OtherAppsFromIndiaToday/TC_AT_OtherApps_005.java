package com.aajtak.android.OtherAppsFromIndiaToday;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is OtherAppsFromIndiaToday Module From Aaj Tak Application
 * Descritpion : Verify that when user Taps on back button, user is taken back to hamburger menu
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_OtherApps_005 extends Aajtak_app_Util{
	
	@Test(description="Description : Verify that when user Taps on back button, user is taken back to hamburger menu",priority = 5)
	public void AT_OtherApps_005() throws InterruptedException {
		//Launching the app
        launchApp();
        
        //Complete onboard set up
		compelteOnboarding();
		
		//Waiting till the hambergur menu icon loads
		waitTillElementPresent(homescreen.getHamburgerIcon(), 60);
		
		//Clicking on the hambergur menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");
		
		//scrolling till other apps from india today option
		scrollToElement(otherAppsFromIndiaToday.getOtherAppsFromIndiaToday());
		
		//Validating whether the otherAppsFromIndiaToday option is present or  not
		isElementExist(otherAppsFromIndiaToday.getOtherAppsFromIndiaToday());
		
		//clicking on otherAppsFromIndiaToday option
		clickBtn(otherAppsFromIndiaToday.getOtherAppsFromIndiaToday());
		
		//Clicking on device back button
		clickDeviceBackButton(1);
		
		//Validating whether the otherAppsFromIndiaToday option is present
		isElementExist(otherAppsFromIndiaToday.getOtherAppsFromIndiaToday());
	}

}
