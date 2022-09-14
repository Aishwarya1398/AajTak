package com.aajtak.android.HomeScreenSection;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is HomeScreen Section Module From Aaj Tak Application
 * Description : Verify that the user is able to view hamburger menu icon
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeSec_011 extends Aajtak_app_Util {
	
	@Test(description = "Description : Verify that the user is able to view hamburger menu icon",priority = 11)
	public void AT_HomeSec_011() throws InterruptedException {

		//Launhing the app
		launchApp();
		
		//complete onboard set up
		compelteOnboarding();
		
		//Verifying the hambergur menu is present
		isElementExist(homescreen.getHamburgerIcon(), "Hamburger Menu");
		
		//Clicking on hambergur mrnu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Menu");
		
		//validating hambergur menu page by verifying login or register option
		isElementExist(hamburgerMenu.getLoginOrRegister());
	}

}
