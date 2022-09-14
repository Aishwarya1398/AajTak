package com.aajtak.android.Hamburger_AppVersion;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
/**
 * Date : 11 June 2021 
 * Description: Verify that user is able to view the 'App Version' by tapping on 'Settings' icon. Settings screen is present in the Hamburger Menu.
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_AppVersion_001 extends Aajtak_app_Util {
	
	@Test(description="Verify that user is able to view the 'App Version' by tapping on 'Settings' icon",priority = 1)
	public void AT_AppVersion_001() throws InterruptedException {
		
		//Launch the App
		launchApp();
		
		//Complete Onboarding set up
		compelteOnboarding();
		
		//Tap on Hamburger Menu
		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
		
		//Scroll to Anya Category in Hamburger Menu
		scrollToElement(hamburgerMenu.getAnyaCategory());
		
		//Validate if anya categoty is present
		isElementExist(hamburgerMenu.getAnyaCategory());
		
		//Scroll to settings in Anya Category
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Click on Settings
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Scroll to App version
		scrollToElement(settings.getAppVersion());
		
		//Validate the App version is present
		isElementExist(settings.getAppVersion());
	}
}