package com.aajtak.android.Hamburger_OfflinePade;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is offline pade Section From Aaj Tak Application
 * Description :  Verify that 2G is disabled, 3G/4G & WiFi is enabled by default once user taps 'Offline Padae'
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_OfflinePade_001 extends Aajtak_app_Util {
	
	@Test(description = "Description: Verify that 2G is disabled, 3G/4G & WiFi is enabled by default once user taps 'Offline Padae'", priority = 1)
	public void AT_OfflinePade_001() throws InterruptedException {
		
		//Launching the app
		launchApp();
		
		//Complete on baord set up
		compelteOnboarding();
		
		//Clicking on hambergur menu icon in homescreen
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//Scrolling till settings element in hambergur menu
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Clicking settings in hambergur menu
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Verifying the offline pade option in settings screen or not
		isElementExist(settings.getOfflinePade());
		
		//Clicking on offline pade option
		clickBtn(settings.getOfflinePade());
		
		//Validating 2g is disabled and 3g / wifi option are enabled or not
		isElementExist(offlinePade.getTwo_G_ToggleOff());
		isElementExist(offlinePade.getThree_G_ToggleOn());
		isElementExist(offlinePade.getWifiToggleOn());
	}


}
