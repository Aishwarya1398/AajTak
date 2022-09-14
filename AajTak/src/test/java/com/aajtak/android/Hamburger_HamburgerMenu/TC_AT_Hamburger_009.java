package com.aajtak.android.Hamburger_HamburgerMenu;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 9 June 2021 This is Hamburger_HamburgerMenu Module of AajTak Application.
 * 
 * Description:  Verify user is navigated to 'Notification Hub' screen.
 * @author Archana George
 * @version 9.37(417)
 */

public class TC_AT_Hamburger_009 extends Aajtak_app_Util {

	@Test(description = "Description : Verify user is navigated to 'Notification Hub' screen", priority = 10)
	public void AT_Hamburger_009() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(hamburgerMenu.getHamburgerIcon(), "Hamburger Icon");
		
		//Click on Notification Hub in Hamburger Menu
		clickBtn(hamburgerMenu.getNotificationInHamburgerMenu());
		
		//It will verify that whether the header of Notification Hub page is present or not
		isElementDisplayed(notificationHub.getTitleInNotificationHub());
	}

}