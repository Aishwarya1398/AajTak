package com.aajtak.android.BottomNavigationBar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 *  
 * @author Janardhan P
 * App version v9.37(417)
 * This is BottomNavigationBar Section From Aaj Tak Application
 * Description : "Access the navigation back button in Podcast screen user should navigate to previous screen" 
 * 
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_BNB_005 extends Aajtak_app_Util {

								// 405
	@Test(description = "Access the navigation back button in Podcast screen user should navigate to previous screen")
	public void AT_BNB_005() throws Exception {
		
		/* Launch The App */
		//launchApp();
		//Aajtak_app_Util.compelteOnboarding();
		reOpenApp();
		
		//Wait till BottomNavigationIcon ready to be clicked
		waitTillElementPresent(bottomNavigationBar.getBottomNavigateRoundCube(), 20);
		clickBtn(bottomNavigationBar.getBottomNavigateRoundCube(),"BottomNavigationBar Icon");
		
		/* Wait till Second Option Available and then click on it */
		waitTillElementPresent(bottomNavigationBar.getBottomCircleSecondOption(), 60);
		clickBtn(bottomNavigationBar.getBottomCircleSecondOption(), "Podcast");
		
		/* Go to previous page */
		clickDeviceBackButton(1);
		
		//wait until Mini Sticky Player clickable & then close the player
		waitTillElementPresent(podcast.getCloseIconInStickyPlayer(), 10);
		clickBtn(podcast.getCloseIconInStickyPlayer(),"Close MiniPodcast Icon");
		
		/* Is DailycapBannerMessage present */
		isElementExist(homescreen.getDailycapBannerMessage());
		
		/* Close The App */
		aDriver.closeApp();
							
		
	}
}
