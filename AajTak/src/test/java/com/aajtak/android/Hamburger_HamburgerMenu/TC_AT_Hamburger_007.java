package com.aajtak.android.Hamburger_HamburgerMenu;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 9 June 2021 This is Hamburger_HamburgerMenu Module of AajTak Application.
 * 
 * Description:  Verify user is able to view downloaded content page.
 * @author Archana George
 * @version 9.37(417)
 */

public class TC_AT_Hamburger_007 extends Aajtak_app_Util {


	@Test(description = "Verify user is able to view downloaded content page", priority = 7)
	public void AT_Hamburger_007() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(hamburgerMenu.getHamburgerIcon(), "Hamburger Icon");
		
		//Click on Downloaded content in Hamburger Menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), " Downloaded Content Icon");

		//It will verify that whether the header of download page is present or not
		verifyTwoText(downloadedContent.getDownloadPageTitle().getText(), "डाउनलोडेड कंटेंट");
		
		//It will verify that Story section is present or not in Downloaded content page
		isElementExist(downloadedContent.getStorySection(), "Story section");
		
		//It will verify that Photo section is present or not in Downloaded content page
		isElementExist(downloadedContent.getTasvireSection(), "Tasvire section");
		
		//It will verify that Video section is present or not in Downloaded content page
		isElementExist(downloadedContent.getVideoSection(), "Video section");
	}


}