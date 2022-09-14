package com.aajtak.android.Hamburger_Login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Login Module From Aaj Tak Application
 * Description :  Verify that user is able to login via gmail
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HamburgerLogin_001 extends Aajtak_app_Util {

	@Test(description="Description : Verify that user is able to login via gmail",priority = 1)
	public void  AT_hamburgerLogin_001()  throws InterruptedException
	{
		//Laucnhing the app
		launchApp();

		//Complete on board set up
		compelteOnboarding();

		//Clicking on hambergur menu icon in homescreen
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");

		//CLicking on login or register option in hambergur menu
		clickBtn(hamburgerMenu.getLoginOrRegister());

		//Adding email id for username text field
		loginOrRegister.getEmailOrPhone().sendKeys("testingindiatoday@gmail.com");

		//Adding Password in password text field
		loginOrRegister.getPassword().sendKeys("test@123");

		//Clicking on login option
		clickBtn(loginOrRegister.getLogin());

		//Validating the toast message after successfull login
		String mesg = loginOrRegister.getToastMsg().getText();
		verifyTwoText(mesg,"लॉग इन सफल रहा");
	}
}