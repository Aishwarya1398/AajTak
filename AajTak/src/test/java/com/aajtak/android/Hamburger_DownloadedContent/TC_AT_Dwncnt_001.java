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
 * Description : Verify that the user is able to navigate to Downloaded Contents from the Hamburger Menu
 */
public class TC_AT_Dwncnt_001 extends Aajtak_app_Util {
	@Test(description = "Verify that the user is able to navigate to Downloaded Contents from the Hamburger Menu",priority = 1)
	public void AT_Dwncnt_001() throws Exception {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Menu");
		
		//It will verify that Downloaded content is present or not in Hamburger Menu
		isElementExist(hamburgerMenu.getDownloadInHamburgerMenu(), " Downloaded Content ");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), " Downloaded Content ");
		
		//It will verify that content message is displayed or not on downloaded content page
		isElementExist(downloadedContent.getContentMessage());
	}

}
