package com.aajtak.android.Hamburger_Login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Login Module From Aaj Tak Application
 * Description : Verify that the user is able to navigate to the Forgot password page
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HamburgerLogin_004 extends Aajtak_app_Util {

	@Test(description = "Description : Verify that the user is able to navigate to the Forgot password page",priority = 2)
	public void AT_HamburgerLogin_004() throws InterruptedException {

		//Launching the app
		launchApp();

		//Complete on board set up
		compelteOnboarding();

		//CLicking on hambergur menu icon in homescreen
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");

		//Clicking on login or register option in hambergur menu
		clickBtn(hamburgerMenu.getLoginOrRegister());

		//clicking on forgot password option in login screen
		clickBtn(loginOrRegister.getForgotPassword());

		//Validating the forgot password page element in forgot password page
		isElementExist(forgotPassword.getforgotPasswordTitle());
	}

}