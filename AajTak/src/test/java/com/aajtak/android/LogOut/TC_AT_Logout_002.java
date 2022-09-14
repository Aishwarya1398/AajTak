package com.aajtak.android.LogOut;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is Logout Module From Aaj Tak Application
 * Description : Verify that the user is able to view an confirmation message when user taps on logout option
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Logout_002 extends Aajtak_app_Util{
	
	@Test(description="Description :Verify that the user is able to view an confirmation message",priority = 2)
	public void AT_Logout_002() throws InterruptedException {
		
		//Launching the app
        launchApp();
        
        //Complete onboard set up
        compelteOnboarding();
        
        //Calling logiviaemail method from Baseutil where this will perform login action via email
		loginViaEmail();
		
		//Clicking on hambergur menu
		waitTillElementPresent(homescreen.getHamburgerIcon(), 20);
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Menu");
		
		//Scrolling till the logout element in Hambergur menu
		scrollToElement(logout.getLogout());
		
		//Validating logout option is available or not
		isElementExist(logout.getLogout());
		
		//Clicking on logout option in hambergur menu
		clickBtn(logout.getLogout());
		
		//Validating the confirmation message
		isElementExist(logout.getAletrtMessageOnOnLogout());
		
		//verifyin cancel button
		isElementExist(logout.getCancel());
		
		//verifiying logout button
		isElementExist(logout.getLogoutOnAlertPopUp());
	
	}

}
