package com.aajtak.android.Hamburger_Login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Login Module From Aaj Tak Application
 * Description : Verify that user is able to logout
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HamburgerLogin_006 extends Aajtak_app_Util{


	@Test(description="Description : Verify that user is able to logout",priority = 3)
	public void  AT_hamburgerLogin_006()  throws InterruptedException
	{
		//Launching the app
		launchApp();

		//Complete on board set up
		Aajtak_app_Util.compelteOnboarding();

		//Calling login via email method from app util class where in it logins with email and pw
		loginViaEmail();

		//Waiting till hambergur menu icon present for 20 secs
		waitTillElementPresent(homescreen.getHamburgerIcon(),20);

		//if the hambergur menu icon is present then clicking on icon
		if(isElementExist(homescreen.getHamburgerIcon(),"Hamburger Icon"))
		{
			clickBtn(homescreen.getHamburgerIcon(),"Hamburger Icon");
		}

		//Scrolling till logout option is present
		scrollToElement(hamburgerMenu.getLogout());

		//Clicking on logout option in hambergur menu
		clickBtn(hamburgerMenu.getLogout());

		//Clicking logout option in alert pop up
		clickBtn(logout.getLogoutOnAlertPopUp());

		//Validating the toast message after logout 
		String msg = logout.getToastMsg().getText();
		verifyTwoText(msg,"आप सफलतापूर्वक लॉग आउट हो गए हैं");
	}

}
