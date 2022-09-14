package com.aajtak.android.Hamburger_HamburgerMenu;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 9 June 2021 This is Hamburger_HamburgerMenu Module of AajTak Application.
 * 
 * Description:  Verify that the user should be able to view hamburger menu icon.
 * @author Archana George
 * @version 9.37(417)
 */

public class TC_AT_Hamburger_001 extends Aajtak_app_Util {

	@Test(description = "Verify that the user should be able to view hamburger menu icon", priority = 1)
	public void AT_Hamburger_001() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//It will verify that Hamburger Menu Icon is present or not on Home screen page
		isElementExist(homescreen.getHamburgerIcon(), "Hamburger Icon");
	}

}