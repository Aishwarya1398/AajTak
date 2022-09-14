package com.aajtak.android.ViewProfile;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 18 June 2021
 * 
 * Description: Verify that the user is able to navigate to Edit Profile page
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_ViewProfile_005 extends Aajtak_app_Util {

	@Test(priority = 7, description = "Description: Verify that the user is able to navigate to Edit Profile page")
	public void AT_ViewProfile_005() throws InterruptedException {
		// Launch App
		launchApp();

		// Complete Onboarding set up
		compelteOnboarding();

		// Login via email
		loginViaEmail();

		waitTillElementPresent(hamburgerMenu.getHamburgerIcon(), 20);
		// Tap on Hamburger menu
		clickBtn(hamburgerMenu.getHamburgerIcon());

		// Tap on view profile link
		clickBtn(viewProfile.getViewProfile());

		// Tap on Edit profile icon
		clickBtn(viewProfile.getEditProfile());

		// Validate that the user is navigated to Edit Profile screen
		clickBtn(editProfile.getEditProfileTitle());
	}
}
