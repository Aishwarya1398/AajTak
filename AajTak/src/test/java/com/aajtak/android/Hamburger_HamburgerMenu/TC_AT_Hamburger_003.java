package com.aajtak.android.Hamburger_HamburgerMenu;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 9 June 2021 This is Hamburger_Feedback Module of AajTak Application.
 * 
 * Description:  Verify the user is able to close the 'Hamburger Menu' by tapping on 'Close Button'.
 * @author Archana George
 * @version 9.37(417)
 */

public class TC_AT_Hamburger_003 extends Aajtak_app_Util {


	@Test(description = "Verify the user is able to close the 'Hamburger Menu' by tapping on 'Close Button'", priority = 3)
	public void AT_Hamburger_003() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It will launch application
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//Click on close icon of hamburger menu
		clickBtn(hamburgerMenu.getCloseHamburgerMenu(), " Close Hamburger Icon");
		
		//It will verify that Hamburger Menu Icon is present or not on Home screen page
		isElementExist(hamburgerMenu.getHamburgerIcon(), " Hamburger Icon");
	}

}