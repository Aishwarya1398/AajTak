package com.aajtak.android.BottomNavigationBar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
/**
 *  
 * @author Janardhan P
 * App version v9.37(417)
 * This is BottomNavigationBar Section From Aaj Tak Application
 * Description : "Verify that BNB activity kill when user access the hamburger menu-Bottom navigation activity should get killed and HamburgerMenu should be displayed"
 * 
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_BNB_018 extends Aajtak_app_Util{

	 					/* Test case--418 */
	@Test(description="Verify that BNB activity kill when user access the hamburger menu-Bottom navigation activity should get killed and HamburgerMenu should be displayed")
	public void AT_BNB_018() throws Exception {
		
		/* Launch the App */
		//launchApp();
		//Aajtak_app_Util.compelteOnboarding();
		reOpenApp();
		
		/* Wait till BottomNavigationIcon ready to be clicked & then Tap on it */
		waitTillElementPresent(bottomNavigationBar.getBottomNavigateRoundCube(), 10);
		clickBtn(bottomNavigationBar.getBottomNavigateRoundCube(),"BottomNavigationBar");
		
		/* Tap on Hamburger Menu */
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Menu");
		
		/* Validate if navigated to hamburger page & Downloaded Content Present */
		isElementExist(hamburgerMenu.getDownloadInHamburgerMenu(),  "Downloaded Content");
		
		/* Close The App */
	    aDriver.closeApp();
		
		
	}
}
