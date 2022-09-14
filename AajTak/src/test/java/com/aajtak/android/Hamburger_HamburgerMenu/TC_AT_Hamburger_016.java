package com.aajtak.android.Hamburger_HamburgerMenu;


import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 12 June 2021 This is Hamburger_HamburgerMenu Module of AajTak Application.
 * 
 * Description:  Verify that the user is able to collapse the Top Categories.
 * @author Archana George
 * @version 9.37(417)
 */

public class TC_AT_Hamburger_016 extends Aajtak_app_Util {

	@Test(description = "Verify that the user is able to collapse the Top Categories", priority = 16)
	public void AT_Hamburger_016() throws Exception {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//It will verify that Top Category is present or not in Hamburger menu
		isElementExist(hamburgerMenu.getTopCategory());
		
		//Click on Top Category in Hamburger Menu
		clickBtn(hamburgerMenu.getTopCategory());
		
		//It will verify that Home option is present or not in Top Category
		Boolean check = isElementDisplayed(hamburgerMenu.getHomeInTopCategory());
		
		//It will validate that Home option is not present
		Assert.assertEquals(false, check);
	}

}