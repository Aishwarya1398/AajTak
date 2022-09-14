package com.aajtak.android.Hamburger_DownloadedContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Hamburger_AppMemoryClearKaren Module From AajTak Application
 * 
 * Description : Verify that user is navigated to previous screen by tapping on back button from Downloaded contents
 */
public class TC_AT_Dwncnt_031 extends Aajtak_app_Util {
	@Test(description = "Verify that user is navigated to previous screen by tapping on back button from Downloaded contents",priority = 24)
	public void AT_Dwncnt_031() throws InterruptedException {
		
		//It will launch the application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Hamburger Menu icon
		clickBtn(hamburgerMenu.getHamburgerIcon(), "Hamburger Menu");
		
		//It will verify that whether the downloaded content is present or not in hamburger menu
		isElementExist(hamburgerMenu.getDownloadInHamburgerMenu(), " Downloaded Content ");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), " Downloaded Content ");
		
		//It will verify that whether the title of downloaded content page is present or not
		isElementExist(downloadedContent.getDownloadPageTitle());
		
		//Click on back button 
		clickDeviceBackButton(1);
		
		//It will verify that it is navigated to Hamburger menu Page
		isElementExist(homescreen.getHamburgerIcon());

	}

}
