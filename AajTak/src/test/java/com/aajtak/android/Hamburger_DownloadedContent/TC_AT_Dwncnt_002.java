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
 * Description :  Verify the downloaded content screen has three tab
 */
public class TC_AT_Dwncnt_002 extends Aajtak_app_Util {
	@Test(description = "Verify the downloaded content screen has three tab",priority = 2)
	public void AT_Dwncnt_002() throws Exception {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//It will wait till Hamburger Menu icon is present on Homescreen
		waitTillElementPresent(homescreen.getHamburgerIcon(),20);
		
		//Click on Hamburger Menu icon
		clickBtn(homescreen.getHamburgerIcon(),"Hamburger Menu");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//It will verify that Story section is present or not in downloaded content page
		isElementExist(downloadedContent.getStorySection());
		
		//It will verify that Photo section is present or not in downloaded content page
		isElementExist(downloadedContent.getTasvireSection());
		
		//It will verify that Video section is present or not in downloaded content page
		isElementExist(downloadedContent.getVideoSection());
	}

}
