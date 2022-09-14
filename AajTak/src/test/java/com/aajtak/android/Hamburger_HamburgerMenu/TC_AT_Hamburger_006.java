package com.aajtak.android.Hamburger_HamburgerMenu;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 9 June 2021 This is Hamburger_HamburgerMenu Module of AajTak Application.
 * 
 * Description:  Verify the user is able to view 'Notification Hub' icon on the menu.
 * @author Archana George
 * @version 9.37(417)
 */

public class TC_AT_Hamburger_006 extends Aajtak_app_Util {


	@Test(description = "Verify the user is able to view 'Notification Hub' icon on the menu", priority = 6)
	public void AT_Hamburger_006() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(hamburgerMenu.getHamburgerIcon(), "Hamburger Icon");
		
		//It will verify that Notification hub is present or not
		isElementExist(hamburgerMenu.getNotificationInHamburgerMenu(), " Notification Hub Icon");
	}

}