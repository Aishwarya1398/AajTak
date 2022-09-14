package com.aajtak.android.OtherAppsFromIndiaToday;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * 
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is OtherAppsFromIndiaToday Module From Aaj Tak Application
 * Description : Verify that user is able to view name and rating of app appear below the logo
 */


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_OtherApps_003 extends Aajtak_app_Util{
	
	@Test(description="Description : Verify that name and rating of app appear below the logo",priority = 3)
	public void AT_OtherApps_003() throws InterruptedException {
		
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
		
        //Verifying India Toady App is present
		isElementExist(otherAppsFromIndiaToday.getIndiaTodayApp());
		
		//Verifying India Today App Rating
		isElementExist(otherAppsFromIndiaToday.getIndiaTodayAppRating());
		
        //Verifying Business today app is present
		isElementExist(otherAppsFromIndiaToday.getBusinessTodayApp());
		
		//Verifying Business Today App Rating
		isElementExist(otherAppsFromIndiaToday.getBusinessTodayAppRating());
		
        // Verifying The lallantop app is present
		isElementExist(otherAppsFromIndiaToday.getTheLallantopApp());
		
		//Verifying The Lallantop App Rating
		isElementExist(otherAppsFromIndiaToday.getTheLallantopAppRating());

	}

}
