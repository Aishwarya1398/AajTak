package com.aajtak.android.Hamburger_OfflinePade;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;


/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is offline pade Section From Aaj Tak Application
 * Description : Verify that if user is able to enable only 2G under 'Offline Padae'
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_OfflinePade_004  extends Aajtak_app_Util{

	@Test(description = "Description: Verify that if user is able to enable only 2G under 'Offline Padae'", priority = 4)
	public void AT_OfflinePade_004() throws InterruptedException {
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

		//clicking on wifi toggle button to disable the wifi option
		clickBtn(offlinePade.getWifiToggleOn());

		//clicking on 3g/4g toggle button to disable the 3g/4g option
		clickBtn(offlinePade.getThree_G_ToggleOn());

		//clicking on 2g toggle button to enable the 2g option
		clickBtn(offlinePade.getTwo_G_ToggleOff());

		//verifying 2g option is enabled or not
		isElementExist(offlinePade.getTwo_G_ToggleOn());

		//verifying 3g/4g option is disabled or not
		isElementExist(offlinePade.getThree_G_ToggleOff());

		//verifying wifi option is disabled or not
		isElementExist(offlinePade.getWifiToggleOff());

	}


}
