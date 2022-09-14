package com.aajtak.android.Hamburger_HamburgerMenu;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 12 June 2021 This is Hamburger_HamburgerMenu Module of AajTak Application.
 * 
 * Description:  Verify that the user is able to navigate to Settings from 'Hamburger Menu'.
 * @author Archana George
 * @version 9.37(417)
 */

public class TC_AT_Hamburger_019 extends Aajtak_app_Util {

	@Test(description = "Verify that the user is able to navigate to Settings from 'Hamburger Menu'", priority = 11)
	public void AT_Hamburger_019() throws InterruptedException {

		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//It will scroll till to Anya Category 
		scrollToElement(hamburgerMenu.getAnyaCategory());
		
		//It will verify that Anya Category is present or not in Hamburger Menu
		isElementExist(hamburgerMenu.getAnyaCategory());
		
		//It will scroll till setting in Anya Category
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Click on Settings in Anya Category
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//It will verify that Settings is present or not
		isElementExist(hamburgerMenu.getSettingsInAnyaCategorys());
	}


}