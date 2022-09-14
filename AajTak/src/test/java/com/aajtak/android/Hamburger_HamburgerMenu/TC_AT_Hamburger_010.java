package com.aajtak.android.Hamburger_HamburgerMenu;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 12 June 2021 This is Hamburger_HamburgerMenu Module of AajTak Application.
 * 
 * Description: Verify the user is able to view 'Top Categories' and 'Anya Categories'.
 * @author Archana George
 * @version 9.37(417)
 */

public class TC_AT_Hamburger_010 extends Aajtak_app_Util {

	@Test(description = "Verify the user is able to view 'Top Categories' and 'Anya Categories'", priority = 13)
	public void AT_Hamburger_010() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//It will verify that Top Category is present or not 
		isElementExist(hamburgerMenu.getTopCategory());
		
		//CLick on Top Category which is present in hamburger menu
		clickBtn(hamburgerMenu.getTopCategory());
		
		//It will verify that anya Category is present or not
		isElementExist(hamburgerMenu.getAnyaCategory());
	}

}