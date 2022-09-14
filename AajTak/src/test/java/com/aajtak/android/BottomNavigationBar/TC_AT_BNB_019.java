package com.aajtak.android.BottomNavigationBar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 *  
 * @author Janardhan P
 * App version v9.37(417)
 * This is BottomNavigationBar Section From Aaj Tak Application
 * Description : "Verify that BNB activity kill when user tap on close button-Bottom navigation acitivty should get killed and home screen should be displayed"
 * 
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_BNB_019 extends Aajtak_app_Util{

	 					/* Test case--419 */
	@Test(description="Verify that BNB activity kill when user tap on close button-Bottom navigation acitivty should get killed and home screen should be displayed")
	public void AT_BNB_019() throws Exception {
		
		/* Launch the App */
		//launchApp();
		//Aajtak_app_Util.compelteOnboarding();
		reOpenApp();
		
		/* Wait till BottomNavigationIcon ready to be clicked & then Tap on it */
		waitTillElementPresent(bottomNavigationBar.getBottomNavigateRoundCube(), 10);
		clickBtn(bottomNavigationBar.getBottomNavigateRoundCube(),"BottomNavigationBar");
		
		/* Close Bottom Navigation Bar */
		clickBtn(bottomNavigationBar.getNavigationBarCloseButton(),"BottomNavBarCloseButton");
		
		/* Validate if Bottom navigation bar closed */
		isElementExist(bottomNavigationBar.getBadiKhabrein(),  "Badi Khabrein");
		
		/* Close The App */
		aDriver.closeApp();
	
		
	}
}
