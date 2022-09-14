package com.aajtak.android.OtherAppsFromIndiaToday;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is OtherAppsFromIndiaToday Module From Aaj Tak Application
 * Description : Verify that all other apps from India Today are listed
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_OtherApps_002 extends Aajtak_app_Util{
	
	@Test(description="Description : Verify that all other apps from India Today are listed ",priority = 2)
	public void AT_OtherApps_002() throws InterruptedException {
        
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
		
		//Verifying India Today app is present
		isElementExist(otherAppsFromIndiaToday.getIndiaTodayApp());
		
		//Verifying Business Today App is present
		isElementExist(otherAppsFromIndiaToday.getBusinessTodayApp());
		
		//Verifying The lallantop app is present
		isElementExist(otherAppsFromIndiaToday.getTheLallantopApp());

	}

}
