package com.aajtak.android.ViewProfile;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 18 June 2021
 * 
 * Description: This is View Profile module of AajTak Application.Verify that user is able to navigate to View Profile screen after user login.
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_ViewProfile_001 extends Aajtak_app_Util {
	
	@Test(description = "Description: Verify that user is able to navigate to View Profile screen")
	public void AT_ViewProfile_001() throws InterruptedException {
		
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
		
		//Validate that user is naviagted to view profile page
		isElementExist(viewProfile.getProfileImage());
		isElementExist(viewProfile.getUserName());
		isElementExist(viewProfile.getUserPlace());
		isElementExist(viewProfile.getMyBookmark());
		isElementExist(viewProfile.getMyDownloadContent());
	}
}



