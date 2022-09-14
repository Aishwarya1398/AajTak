package com.aajtak.android.ViewProfile;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 18 June 2021 
 * 
 * Description: Verify that the user is able to view his/her name,profile picture and location in the view profile page after user login.
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_ViewProfile_002 extends Aajtak_app_Util {
	
	
	@Test(priority = 4, description = "Description: Verify that the user is able to view his/her name,profile picture and location")
	public void AT_ViewProfile_002() throws InterruptedException {

		//Launch App
		launchApp();
		
		//Complete Onboarding set up
		compelteOnboarding();
		
		//Login via email
		loginViaEmail();
		
		waitTillElementPresent(hamburgerMenu.getHamburgerIcon(), 20);
		//Tap on Hamburger menu
		clickBtn(hamburgerMenu.getHamburgerIcon());
		
		//Tap on view profile link
		clickBtn(viewProfile.getViewProfile());
		
		//Validate if the  Profile image,Username, Place is displayed
		isElementExist(viewProfile.getProfileImage());
		isElementExist(viewProfile.getUserName());
		isElementExist(viewProfile.getUserPlace());
	}
}



