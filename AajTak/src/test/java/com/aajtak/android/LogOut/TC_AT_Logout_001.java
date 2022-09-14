package com.aajtak.android.LogOut;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is Logout Module From Aaj Tak Application
 * Description : Verify that the user is able to view Logout option in the Hamburger menu
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Logout_001 extends Aajtak_app_Util{
	
	@Test(description="Description :Verify that the user is able to view Logout option in the Hamburger menu",priority = 1)
	public void AT_Logout_001() throws Exception {
		
		//Launching the app
        launchApp();
        
        //Complete onboard set up
        compelteOnboarding();
        
        //Calling logiviaemail method from Baseutil where this will perform login action via email
		loginViaEmail();
		
		waitTillElementPresent(homescreen.getHamburgerIcon(), 20);
		
		//Clicking on hambergur menu
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");
		
		//Scrolling till the logout element in Hambergur menu
		scrollToElement(logout.getLogout());
		
		//Validating logout option is available or not
		isElementExist(logout.getLogout());
	}


}
