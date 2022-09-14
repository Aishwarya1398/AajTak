package com.aajtak.android.Hamburger_OfflinePade;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is offline pade Section From Aaj Tak Application
 * Description :  Verify that if user is able to enable only Wi-Fi under 'Offline Padae'
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_OfflinePade_002 extends Aajtak_app_Util {

	@Test(description = "Description: Verify that if user is able to enable only Wi-Fi under 'Offline Padae' ", priority = 2)
	public void AT_OfflinePade_002() throws InterruptedException {
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

		//Validating 2g option is disabled or not
		isElementExist(offlinePade.getTwo_G_ToggleOff(), "2G Button");

		//Clicking on 3g option to disable
		clickBtn(offlinePade.getThree_G_ToggleOn(), "3G Button");

		//Validating 3g option s disabled or not
		isElementExist(offlinePade.getThree_G_ToggleOff(), "3G Button");

		//verifying only wifi option is enabled or not
		isElementExist(offlinePade.getWifiToggleOn(), "Wifi Button");

	}


}
