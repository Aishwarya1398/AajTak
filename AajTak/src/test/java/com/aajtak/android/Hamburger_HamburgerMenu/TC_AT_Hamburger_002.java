package com.aajtak.android.Hamburger_HamburgerMenu;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 9 June 2021 This is Hamburger_Feedback Module of AajTak Application.
 * 
 * Description:  Verify the user is able to view Hamburger menu, while clicking on Hamburger icon.
 * @author Archana George
 * @version 9.37(417)
 */

public class TC_AT_Hamburger_002 extends Aajtak_app_Util {


	@Test(description = "Verify the user is able to view Hamburger menu, while clicking on Hamburger icon", priority = 2)
	public void AT_Hamburger_002() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//It will verify that Downloaded content is present or not
		isElementExist(hamburgerMenu.getDownloadInHamburgerMenu(), " Downloaded Content Icon");
		
		//It will verify that Bookmark Icon is present or not
		isElementExist(hamburgerMenu.getBookmarkInHamburgerMenu(), " Bookmark Icon");
		
		//It will verify that Notification hub is present or not
		isElementExist(hamburgerMenu.getNotificationInHamburgerMenu(), "Notification Hub Icon ");
	}


}