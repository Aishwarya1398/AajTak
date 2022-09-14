package com.aajtak.android.Hamburger_HamburgerMenu;


import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 12 June 2021 This is Hamburger_HamburgerMenu Module of AajTak Application.
 * 
 * Description:  Verify that the user is able to collapse the Anya Categories.
 * @author Archana George
 * @version 9.37(417)
 */

public class TC_AT_Hamburger_018 extends Aajtak_app_Util {

	@Test(description = "Verify that the user is able to collapse the Anya Categories", priority = 18)
	public void AT_Hamburger_018() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//It will scroll till Anya Category In Hamburger Menu
		scrollToElement(hamburgerMenu.getAnyaCategory());
		
		//It will verify that Anya Category is present or not in Hamburger Menu
		isElementExist(hamburgerMenu.getAnyaCategory());
		
		//Click On Anya Category in Hamburger Menu
		clickBtn(hamburgerMenu.getAnyaCategory());
		
		//It will verify that JobAndEducation option is present or not in Anya Category
		Boolean check = isElementDisplayed(hamburgerMenu.getJobAndEducationInAnyaCategory());
		
		//It will validate that Home option is not present
		Assert.assertEquals(false, check);
	}

}